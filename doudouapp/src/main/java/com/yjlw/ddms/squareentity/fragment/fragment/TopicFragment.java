package com.yjlw.ddms.squareentity.fragment.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.fragment.FirstFragment;
import com.yjlw.ddms.squareentity.fragment.adapter.MyViewPagerAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.Result;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Description：话题Fragment<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 1:59
 *
 * @author 李磊
 * @version : 1.0
 */

public class TopicFragment extends Fragment {

    private View view;
    private ListView mLv;
    private LinearLayout mLl;
    private ViewPager mVp;
    private int index = 1;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
                mVp.setCurrentItem(++index);
            }
            super.handleMessage(msg);
        }
    };
    private boolean isTaskRun;
    private Result.ResultBean resultBean;
    private List<TopicViewPagerFragment> tempDs;
    private Timer htimer;
    private TimerTask htimerTask;
    private Result result1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        bundle.getString("tabName");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.squareen_fragment, null);
        mLv = (ListView) view.findViewById(R.id.lv_id);

        View inflate=inflater.inflate(R.layout.squareen_topic_image_viewpager, null);
        mLl = (LinearLayout) inflate.findViewById(R.id.ll_container_id);
        mVp = (ViewPager) inflate.findViewById(R.id.vp_id);

        mLv.addHeaderView(inflate);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        //准备数据源


        //数据下载
        DownloadData();

        //关于ViewPager的操作
        aboutViewPager();

        // 3、关于小圆点的操作
        aboutLittleDots();

        super.onActivityCreated(savedInstanceState);
    }

    // 3、关于小圆点的操作
    private void aboutLittleDots() {
        // 分析：
        // 1）小圆点的个数与ViewPager中数据源中Fragment的个数是一样的
        // 2）在占位的容器控件中，动态添加ImageView。
        // 3）联动效果的添加：
        // a)小圆点决定ViewPager当前页面的状态
        // b)ViewPager决定小圆点的状态

        MyOnClickListener listener = new MyOnClickListener();

        for (int i = 0; i < tempDs.size(); i++) {// 每循环一次，构建一个ImageView的实例，添加到占位的容器控件中
            ImageView iv = new ImageView(getActivity());
            iv.setImageResource(R.drawable.dot_selector);

            // 给ImageView添加标签
            iv.setTag(i);
            // 给小圆点添加监听器
            iv.setOnClickListener(listener);

            // ImageView控件上显示的图片，动态由Enabled属性值，根据选择器，来动态加载图片
            iv.setEnabled(true);

            mLl.addView(iv);
        }

        // 默认第一个小圆点是选中的状态
        mLl.getChildAt(0).setEnabled(false);
    }

    //关于ViewPager的操作
    private void aboutViewPager() {

        //数据源
        tempDs = new LinkedList<>();

        //获取的实体类中的集合
        List<Result.ResultBean.AdBean> ad = result1.getResult().getAd();
        for(int i=0;i<ad.size();i++){
            TopicViewPagerFragment viewPager=new TopicViewPagerFragment();
            Bundle args=new Bundle();
            args.putString("img",ad.get(i).getImg());
            args.putString("url",ad.get(i).getUrl());
            viewPager.setArguments(args);
            tempDs.add(viewPager);
        }
        //适配器
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(getFragmentManager(),tempDs);
        //绑定适配器
        mVp.setAdapter(adapter);
        // 给ViewPger添加监听器，决定小圆点的状态
        mVp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                index = position;
                position = position % tempDs.size();
                // ViewPager决定小圆点的状态
                for (int i = 0; i < tempDs.size(); i++) {// 状态复原
                    mLl.getChildAt(i).setEnabled(true);

                }

                // 将position位置处的小圆点enable属性值设置为false
                mLl.getChildAt(position).setEnabled(false);
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                  /* state: 0空闲，1是滑行中，2加载完毕 */

                if (state == 0 && !isTaskRun) {
                    startTask();
                } else if (state == 1 && isTaskRun) {
                    stopTask();
                } else if (state == 2) {
                }
                super.onPageScrollStateChanged(state);
            }
        });

    }
    // OnClickListener点击事件监听器
    private final class MyOnClickListener implements View.OnClickListener {

        /*
         * (non-Javadoc)
         *
         * @see android.view.View.OnClickListener#onClick(android.view.View)
         */
        @Override
        public void onClick(View v) {
            // 小圆点决定ViewPager当前页面的状态
            mVp.setCurrentItem((Integer) v.getTag());
        }

    }

    /**
     * 停止定时任务
     */
    private void stopTask() {
        isTaskRun = false;
        htimer.cancel();
    }

    private void startTask() {
        isTaskRun = true;
        htimer = new Timer();
        htimerTask = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        };
        htimer.schedule(htimerTask, 2 * 1000, 2 * 1000);// 这里设置自动切换的时间，单位是毫秒，2*1000表示2秒，
    }

    //数据下载
    private void DownloadData() {
        String thirdPage = Constant.THIRD_PAGE;
        RequestParams params = new RequestParams(thirdPage);
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("download",result);

                parserThirdPager(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    //Gson解析数据
    private void parserThirdPager(String result) {

        Gson gson=new Gson();
        result1 = gson.fromJson(result, Result.class);
        String img = result1.getResult().getAd().get(0).getImg();
        Log.i("img",img);

    }

    /**
     * 重新获得焦点
     */
    public void onResume() {
        super.onResume();
        startTask();
    }

    /**
     * 失去焦点
     */
    @Override
    public void onPause() {
        super.onPause();
        stopTask();
    }
}
