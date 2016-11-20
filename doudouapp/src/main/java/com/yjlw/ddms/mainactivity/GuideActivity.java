package com.yjlw.ddms.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;

import com.yjlw.ddms.R;
import com.yjlw.ddms.utils.SharedPreferencesUtils;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;



/**
 * 新手引导页
 */
public class GuideActivity extends AppCompatActivity {

    @ViewInject(R.id.vp_guide)
    private ViewPager vpGuide;
    @ViewInject(R.id.ll_point_group)
    private LinearLayout llPointGroup;//引导原点的父控件
    @ViewInject(R.id.view_red_Point)
    private View viewRedPoint;
    @ViewInject(R.id.btn_start)
    private Button btnStart;
    //初始化图片资源
    private static final int[] myImageIds = new int[]{R.mipmap.guide_1_bg, R.mipmap.guide_2_bg, R
            .mipmap.guide_3_bg,R.mipmap.guide_4_bg,R.mipmap.guide_5_bg};
    private ArrayList<ImageView> mimageViewList;
    private int mPointWidth;//两圆点之间的距离

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        x.view().inject(this);
        initViews();
        vpGuide.setAdapter(new GuideAdapter());
        vpGuide.setOnPageChangeListener(new GuidePageListener());
    }

    /**
     * ViewPager的滑动监听器
     */
    private class GuidePageListener implements ViewPager.OnPageChangeListener {
        /**
         * 滑动
         *
         * @param position             位置
         * @param positionOffset       百分比
         * @param positionOffsetPixels 移动距离
         */

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            float len = mPointWidth * positionOffset + position * mPointWidth;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewRedPoint
                    .getLayoutParams();//获取当前红点的布局参数
            layoutParams.leftMargin = (int) len;//设置左边距

            viewRedPoint.setLayoutParams(layoutParams);//重新设置布局参数
        }

        //某个页面被选中
        @Override
        public void onPageSelected(int position) {
            //显示开始体验的按钮
            if (position == myImageIds.length - 1) {
                btnStart.setVisibility(View.VISIBLE);
            } else {
                btnStart.setVisibility(View.INVISIBLE);
            }
        }

        //状态发生变化
        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    /**
     * 初始化界面
     */
    private void initViews() {
        mimageViewList = new ArrayList<>();
        //初始化
        for (int i = 0; i < myImageIds.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(myImageIds[i]);//设置背景
            mimageViewList.add(imageView);//添加到集合
        }
        //初始化引导页的小圆点
        for (int i = 0; i < myImageIds.length; i++) {
            View point = new View(this);
            point.setBackgroundResource(R.drawable.shape_point_gray);//默认圆点
            LayoutParams params = new LayoutParams(10, 10);
            if (i > 0) {
                params.leftMargin = 10;//设置圆点间隔
            }
            point.setLayoutParams(params);
            llPointGroup.addView(point);//添加到集合
        }
        //measure(测量大小) layout(位置) ondraw(画)

        //拿到视图树,对layout结束事件进行监听
        llPointGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver
                .OnGlobalLayoutListener() {
            //当layout结束的时候会回调此方法
            @Override
            public void onGlobalLayout() {
                //Log.i("Log", "layout结束");
                llPointGroup.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                //llPointGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                //获取圆点之间的距离
                mPointWidth = llPointGroup.getChildAt(1).getLeft() - llPointGroup.getChildAt(0)
                        .getLeft();
                //  Log.i("Log", width + "");
            }
        });
    }

    //开始体验

    @Event(value = R.id.btn_start,type = View.OnClickListener.class)
    private void startMainActivity(View view) {
        SharedPreferencesUtils.saveBoolean(this,"is_user_guide_show",true);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


    /**
     * 自定义适配器
     */
    private class GuideAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return myImageIds.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(mimageViewList.get(position));
            return mimageViewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
