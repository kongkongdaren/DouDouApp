package com.yjlw.ddms.fristentity.activity;

import android.content.Intent;
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
import com.yjlw.ddms.fristentity.adapter.LookVedioAdapter;
import com.yjlw.ddms.fristentity.adapter.VideoPagerAdapter;
import com.yjlw.ddms.fristentity.entity.VideoData;
import com.yjlw.ddms.fristentity.fragment.VideoPagerFragment;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
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
    @ViewInject(R.id.vp_video_id)
    private ViewPager vpVideo;
    @ViewInject(R.id.ll_container_video_id)
    private LinearLayout llContainer;
    @ViewInject(R.id.httv_hot)
    private HomeTitleItemView htivHot;
    @ViewInject(R.id.iv_hot_photo)
    private ImageView ivHotPhoto;
    @ViewInject(R.id.iv_hot_play)
    private ImageView ivHotPlay;
    @ViewInject(R.id.iv_hot_circle)
    private MySelfCircleView ivHotCirclePhoto;
    @ViewInject(R.id.tv_hot_user)
    private TextView  hotUser;
    @ViewInject(R.id.tv_name_hot)
    private TextView hotName;
    @ViewInject(R.id.tv_hot_content)
    private TextView hotContent;
    @ViewInject(R.id.tv_hot_time)
    private TextView hotTime;
    @ViewInject(R.id.tv_zan)
    private TextView hotZan;
    @ViewInject(R.id.tv_hot_comment)
    private TextView hotComment;
    private List<VideoPagerFragment> videoPager;
    @ViewInject(R.id.htiv_new)
    private HomeTitleItemView htivNew;
    @ViewInject(R.id.iv_new_photo)
    private ImageView ivNewPhoto;
    @ViewInject(R.id.iv_new_play)
    private ImageView ivNewPlay;
    @ViewInject(R.id.iv_new_circle)
    private MySelfCircleView ivNewCirclePhoto;
    @ViewInject(R.id.tv_new_user)
    private TextView  newUser;
    @ViewInject(R.id.tv_new_title)
    private TextView newName;
    @ViewInject(R.id.tv_new_content)
    private TextView newContent;
    @ViewInject(R.id.tv_new_time)
    private TextView newTime;
    @ViewInject(R.id.tv_new_zan)
    private TextView newZan;
    @ViewInject(R.id.tv_new_comment)
    private TextView newComment;
    private int index ;
    @ViewInject(R.id.htiv_greens)
    private HomeTitleItemView htivGreen;
    @ViewInject(R.id.iv_greens_photo)
    private ImageView ivGreensPhoto;
    @ViewInject(R.id.iv_greens_play)
    private ImageView ivGreenPlay;
    @ViewInject(R.id.iv_greens_circle)
    private MySelfCircleView ivGreensCirclePhoto;
    @ViewInject(R.id.tv_greens_user)
    private TextView  greensUser;
    @ViewInject(R.id.tv_greens_title)
    private TextView greensName;
    @ViewInject(R.id.tv_greens_content)
    private TextView greensContent;
    @ViewInject(R.id.tv_greens_time)
    private TextView greensTime;
    @ViewInject(R.id.tv_greens_zan)
    private TextView greensZan;
    @ViewInject(R.id.tv_greens_comment)
    private TextView greensComment;
    private Handler handler;
    @ViewInject(R.id.htiv_category)
    private HomeTitleItemView htivCategory;
    @ViewInject(R.id.iv_category_photo)
    private ImageView ivCategoryPhoto;
    @ViewInject(R.id.tv_category)
    private TextView tvCategory;
    @ViewInject(R.id.htiv_interest)
    private HomeTitleItemView htivInterest;
    @ViewInject(R.id.lv_interest)
    private ListView lvInterest;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lookvedio);
        x.view().inject(this);
        ivVideoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        downLoadVedioData();
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
        aboutViewPager(videoAd);
        //关于小圆点的操作
        aboutLittleDots();
        // 使用Handler技术实现广告图片的循环播放
        circleShowPic();
        List<VideoData.ResultBean.HotrankBean> hotRank = videoData.getResult().getHotrank();
        htivHot.setIvResource(R.mipmap.ic_main_logo);
        htivHot.setTitle("热门排行总榜");
        htivHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LookVideoActivity.this,HotRankActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("title","热门排行总榜");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Picasso.with(this).load(hotRank.get(0).getInfo().getCover()).placeholder(R.mipmap.default_high).into(ivHotPhoto);
        Picasso.with(this).load(hotRank.get(0).getInfo().getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(ivHotCirclePhoto);
        hotUser.setText(hotRank.get(0).getInfo().getUserInfo().getUserName());
        hotName.setText(hotRank.get(0).getInfo().getTitle());
        hotContent.setText(hotRank.get(0).getInfo().getIntro());
        hotTime.setText(hotRank.get(0).getInfo().getCreateTime());
        hotZan.setText(hotRank.get(0).getInfo().getDiggCount()+"");
        hotComment.setText(hotRank.get(0).getInfo().getCommentCount()+"");

        List<VideoData.ResultBean.NoviceBean> newNovice = videoData.getResult().getNovice();
        htivNew.setIvResource(R.mipmap.ico_vedio_newclass);
        htivNew.setTitle("新手课堂");
        htivNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LookVideoActivity.this,NewActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("title","新手课堂");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Picasso.with(this).load(newNovice.get(0).getInfo().getCover()).placeholder(R.mipmap.default_high).into(ivNewPhoto);
        Picasso.with(this).load(newNovice.get(0).getInfo().getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(ivNewCirclePhoto);
        newUser.setText(newNovice.get(0).getInfo().getUserInfo().getUserName());
        newName.setText(newNovice.get(0).getInfo().getTitle());
        newContent.setText(newNovice.get(0).getInfo().getIntro());
        newTime.setText(newNovice.get(0).getInfo().getCreateTime());
        newZan.setText(newNovice.get(0).getInfo().getDiggCount()+"");
        newComment.setText(newNovice.get(0).getInfo().getCommentCount()+"");
        List<VideoData.ResultBean.RecipeBean> videoRecipe = videoData.getResult().getRecipe();
        htivGreen.setIvResource(R.mipmap.ico_vedio_recipe);
        htivGreen.setTitle("视频菜谱");
        Picasso.with(this).load(videoRecipe.get(0).getInfo().getCover()).placeholder(R.mipmap.default_high).into(ivGreensPhoto);
        Picasso.with(this).load(videoRecipe.get(0).getInfo().getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(ivGreensCirclePhoto);
        greensUser.setText(videoRecipe.get(0).getInfo().getUserInfo().getUserName());
        greensName.setText(videoRecipe.get(0).getInfo().getTitle());
        greensContent.setText(videoRecipe.get(0).getInfo().getIntro());
        greensTime.setText(videoRecipe.get(0).getInfo().getCreateTime());
        greensZan.setText(videoRecipe.get(0).getInfo().getDiggCount()+"");
        greensComment.setText(videoRecipe.get(0).getInfo().getPlayCount()+"");
        List<VideoData.ResultBean.HotCateBean> hotCate = videoData.getResult().getHotCate();
        htivCategory.setIvResource(R.mipmap.ico_hot_classfix);
        htivCategory.setTitle("热门分类");
        Picasso.with(this).load(hotCate.get(0).getCover()).placeholder(R.mipmap.default_high).into(ivCategoryPhoto);
        tvCategory.setText(hotCate.get(0).getCateName());
        List<VideoData.ResultBean.FunlifeBean> hotFunlife = videoData.getResult().getFunlife();
        htivInterest.setIvResource(R.mipmap.ico_fun_live);
        htivInterest.setTitle("趣味生活");
        aboutListViewInterest(hotFunlife);
    }

    private void aboutListViewInterest(List<VideoData.ResultBean.FunlifeBean> hotFunlife) {
        //适配器
        LookVedioAdapter adapter=new LookVedioAdapter(hotFunlife,this);
        //绑定适配器
        lvInterest.setAdapter(adapter);
    }

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
                if (index==videoPager.size()){
                    index=0;
                }
                handler.sendEmptyMessageDelayed(1,2000);
            }
        };
        handler.sendEmptyMessageDelayed(1,2000);
    }

}
