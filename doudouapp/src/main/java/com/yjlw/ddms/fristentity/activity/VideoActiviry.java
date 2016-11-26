package com.yjlw.ddms.fristentity.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.entity.LookVideoData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;
import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月26  13:52
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class VideoActiviry extends AppCompatActivity {
    @ViewInject(R.id.iv_hotvideo_back)
            private ImageView ivVedioBack;
    @ViewInject(R.id.iv_hotvideo_collect)
    private ImageView ivVedioCollect;
    @ViewInject(R.id.iv_hotvideo_share)
    private ImageView ivVedioShare;
    @ViewInject(R.id.vv_hot)
     private VideoView mVideoView;
    @ViewInject(R.id.hotideo_img)
    private ImageView ivVedioPhoto;
     @ViewInject(R.id.video_start)
    private ImageView ibStart;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vitamio.isInitialized(getApplicationContext());//进行初始化
        setContentView(R.layout.hot_video_main);
        x.view().inject(this);
        ivVedioBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        String img = intent.getStringExtra("img");
        Picasso.with(this).load(img).placeholder(R.mipmap.default_high).into(ivVedioPhoto);
        downloadVedioUrl();
    }
//下载视频的url
    private void downloadVedioUrl() {
        String videoUrl = Constant.LOOK_VIDEO;
        RequestParams params=new RequestParams(videoUrl);
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
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

    private void parseVideoData(String result) {
        Gson gson=new Gson();
        LookVideoData lookVideoData = gson.fromJson(result, LookVideoData.class);
        String VedioUrl = lookVideoData.getResult().getUrl();
        aboutPlayVideo(VedioUrl);
    }

    private void aboutPlayVideo(final String vedioUrl) {
        ibStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mVideoView.setVideoURI(Uri.parse(vedioUrl));
                mVideoView.setMediaController(new MediaController(VideoActiviry.this));
                mVideoView.requestFocus();

                mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mediaPlayer.setPlaybackSpeed(1.0f);
                        ivVedioPhoto.setVisibility(View.GONE);
                        ibStart.setVisibility(View.GONE);
                    }
                });
            }
        });
    }
}
