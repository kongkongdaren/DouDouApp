package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.VideoPagerAdapter;
import com.yjlw.ddms.fristentity.entity.VideoData;
import com.yjlw.ddms.fristentity.fragment.VideoPagerFragment;
import com.yjlw.ddms.homeentity.views.HomeTitleItemView;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：看视频详细页面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月24  16:26
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class LookVideoActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_video_back)
    private ImageView ivVideoBack;
    @ViewInject(R.id.et_search)
    private EditText etSearch;
    @ViewInject(R.id.iv_all)
    private ImageView ivAll;
    private ViewPager vpVideo;
    @ViewInject(R.id.ll_container_video_id)
    private LinearLayout llContainer;
    //下面有问题
    @ViewInject(R.id.lv_video)
    private ListView lvVideo;

    private List<VideoPagerFragment> videoPager;
    private int index ;
    private Handler handler;
    private View hotView;
    private ImageView ivHot;
    private ImageView ivHotCircle;
    private TextView hotUser,hotName,hotContent,hotTime,hotZan,hotComment;
    private HomeTitleItemView htivVideo;
    private View viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lookvideo_activity);
        x.view().inject(this);

        hotView = View.inflate(this, R.layout.hot_video, null);
        viewPager = View.inflate(this, R.layout.hot_viewpager, null);
        lvVideo.addHeaderView(viewPager);
        lvVideo.addHeaderView(hotView);
        ivVideoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        initView();
        downLoadVedioData();

    }
//界面实例的获取
    private void initView() {
       vpVideo= (ViewPager) viewPager.findViewById(R.id.vp_video_id);
        llContainer= (LinearLayout) viewPager.findViewById(R.id.ll_container_video_id);
        htivVideo = (HomeTitleItemView) hotView.findViewById(R.id.httv_hot);
        ivHot = (ImageView) hotView.findViewById(R.id.iv_hot_photo);
        ivHotCircle = (ImageView) hotView.findViewById(R.id.iv_hot_circle);
        hotUser= (TextView) hotView.findViewById(R.id.tv_hot_user);
        hotName= (TextView) hotView.findViewById(R.id.tv_hot_title);
        hotContent= (TextView) hotView.findViewById(R.id.tv_hot_content);
        hotTime= (TextView) hotView.findViewById(R.id.tv_hot_time);
        hotZan= (TextView) hotView.findViewById(R.id.tv_zan);
        hotComment= (TextView) hotView.findViewById(R.id.tv_hot_comment);
    }

    /**
     * 下载看视频数据
     */
    private void downLoadVedioData() {
        String videoUrl = Constant.SECOND_PAGE_VIDEO;
        RequestParams params=new RequestParams(videoUrl);
        params.addBodyParameter("sign", "df04ef8cf3aab201ce09175f64129ac4");
        params.addBodyParameter("uid", "10282642");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/Video/index/");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>(){
            @Override
            public void onSuccess(String result) {
                Log.i("Log","视频"+result);
                parseVideoData(result);
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
//解析数据
    private void parseVideoData(String result) {
        Gson gson=new Gson();
        VideoData videoData = gson.fromJson(result, VideoData.class);
        List<VideoData.ResultBean.AdBean> videoAd = videoData.getResult().getAd();
        List<VideoData.ResultBean.HotrankBean> hotRank = videoData.getResult().getHotrank();
        aboutViewPager(videoAd);
        //关于小圆点的操作
        aboutLittleDots();
        // 使用Handler技术实现广告图片的循环播放
        circleShowPic();
        aboutHeadView(hotRank);
    }

    private void aboutHeadView(List<VideoData.ResultBean.HotrankBean> hotRank) {
        htivVideo.setIvResource(R.mipmap.ic_main_logo);
        htivVideo.setTitle("热门排行总榜");
        Picasso.with(this).load(hotRank.get(0).getInfo().getCover()).placeholder(R.mipmap.default_high).into(ivHot);
        Picasso.with(this).load(hotRank.get(0).getInfo().getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(ivHotCircle);
        hotUser.setText(hotRank.get(0).getInfo().getUserInfo().getUserName());
        hotName.setText(hotRank.get(0).getInfo().getTitle());
        hotContent.setText(hotRank.get(0).getInfo().getIntro());
        hotTime.setText(hotRank.get(0).getInfo().getCreateTime());
        hotZan.setText(hotRank.get(0).getInfo().getDiggCount());
        hotComment.setText(hotRank.get(0).getInfo().getPlayCount());
    }

    //关于ViewPager的操作
    private void aboutViewPager(List<VideoData.ResultBean.AdBean> videoAd) {
        videoPager = new LinkedList<>();
        for(int i=0;i<videoAd.size();i++){
            VideoPagerFragment fragment=new VideoPagerFragment();
            Bundle args=new Bundle();
            args.putString("img",videoAd.get(i).getImgUrl());
            fragment.setArguments(args);
            videoPager.add(fragment);
        }
        //适配器
        VideoPagerAdapter adapter=new VideoPagerAdapter(getSupportFragmentManager(),videoPager);
         vpVideo.setAdapter(adapter);
        // 给ViewPger添加监听器，决定小圆点的状态
        vpVideo.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
//                index=position;
//                position=position%videoPager.size();
                // ViewPager决定小圆点的状态
                for (int i=0;i<videoPager.size();i++){//状态复原
                    llContainer.getChildAt(i).setEnabled(true);
                }
                // 将position位置处的小圆点enable属性值设置为false
                llContainer.getChildAt(position).setEnabled(false);
                super.onPageSelected(position);
            }
        });
    }


    /**
     * 关于小圆点的操作
     */
    private void aboutLittleDots() {
        // 分析：
        // 1）小圆点的个数与ViewPager中数据源中Fragment的个数是一样的
        // 2）在占位的容器控件中，动态添加ImageView。
        // 3）联动效果的添加：
        // a)小圆点决定ViewPager当前页面的状态
        // b)ViewPager决定小圆点的状态
        MyOnClickListener listener=new MyOnClickListener();
        for (int i=0;i<videoPager.size();i++){
            ImageView iv = new ImageView(this);
            iv.setImageResource(R.drawable.dot_selector);
            // 给ImageView添加标签
            iv.setTag(i);
            iv.setOnClickListener(listener);
            // ImageView控件上显示的图片，动态由Enabled属性值，根据选择器，来动态加载图片
            iv.setEnabled(true);
            llContainer.addView(iv);
        }
        // 默认第一个小圆点是选中的状态
        llContainer.getChildAt(0).setEnabled(false);
    }
    //
    private  final class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            // 小圆点决定ViewPager当前页面的状态
            vpVideo.setCurrentItem((Integer) view.getTag());
        }
    }
    private void circleShowPic() {
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
               vpVideo.setCurrentItem(index++);
                if (index==videoPager.size()-1){
                    index=0;
                }
                handler.sendEmptyMessageDelayed(1,1000);
            }
        };
       handler.sendEmptyMessageDelayed(1,1000);
    }
}
