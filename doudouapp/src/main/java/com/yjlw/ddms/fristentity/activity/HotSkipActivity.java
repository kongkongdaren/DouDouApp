package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.utils.Log;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.SkipAdapter;
import com.yjlw.ddms.fristentity.entity.SkipData;
import com.yjlw.ddms.fristentity.views.MyListView;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：热门活动跳转界面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  12:15
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotSkipActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_skip_back)
    private ImageView ivSkipBack;
    @ViewInject(R.id.iv_skip_share)
    private ImageView ivSkipShare;
    @ViewInject(R.id.tv_skip_title)
    private TextView tvSkipTitle;
    @ViewInject(R.id.tv_skip_title_big)
    private TextView tvSkipBigTitle;
    @ViewInject(R.id.tv_skip_count)
    private TextView tvSkipCount;
    @ViewInject(R.id.iv_skip)
    private ImageView ivSkip;
    @ViewInject(R.id.tv_content)
    private TextView tvContent;
    @ViewInject(R.id.lv_skip)
    private MyListView lv;
    @ViewInject(R.id.pb_skip)
    private ProgressBar pb;
    private SkipData.ResultBean.InfoBean.ShareInfoBean shareInfoData;
    private UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(HotSkipActivity.this, platform + " 分享成功啦", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(HotSkipActivity.this,platform + " 分享失败啦", Toast.LENGTH_SHORT).show();
            if(t!=null){
                Log.d("throw","throw:"+t.getMessage());
            }
        }

        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(HotSkipActivity.this,platform + " 分享取消了", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skip_hot);
        x.view().inject(this);
        ivSkipBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        tvSkipTitle.setText(title+"的作品");
        tvSkipBigTitle.setText(title);
        final int position = extras.getInt("position");
        downloadSkipData(position);
        ivSkipShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData();
            }
        });
    }
    //分享界面
    private void shareData() {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            //把布局文件先填充成View对象
            View inflate=View.inflate(this,R.layout.share_item,null);
            ImageView ivQQ= (ImageView) inflate.findViewById(R.id.iv_qq);
            ImageView ivWeixin= (ImageView) inflate.findViewById(R.id.iv_weixin);
            ImageView ivQZone= (ImageView) inflate.findViewById(R.id.iv_qzone);
            ivQQ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ShareAction qq=new ShareAction(HotSkipActivity.this);
                        qq.withTitle(shareInfoData.getTitle());
                        qq.withText(shareInfoData.getContent());
                    UMImage urlImage = new UMImage(HotSkipActivity.this,R.mipmap.ic_main_logo);
                    qq.withMedia(urlImage);
                         qq.withTargetUrl(shareInfoData.getUrl());
                    qq.setPlatform(SHARE_MEDIA.QQ).setCallback(umShareListener).share();
                }
            });

        ivQZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareAction Qzone=new ShareAction(HotSkipActivity.this);
                Qzone.withTitle(shareInfoData.getTitle());
                Qzone.withText(shareInfoData.getContent());
                //分享图片
                UMImage urlImage = new UMImage(HotSkipActivity.this,R.mipmap.ic_main_logo);
                Qzone.withMedia(urlImage);
                Qzone.withTargetUrl(shareInfoData.getUrl());
                Qzone.setPlatform(SHARE_MEDIA.QZONE).setCallback(umShareListener).share();
            }
        });
        ivWeixin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareAction weixin=new ShareAction(HotSkipActivity.this);
                weixin.withTitle(shareInfoData.getTitle());
                weixin.withText(shareInfoData.getContent());
                weixin.withTargetUrl(shareInfoData.getUrl());
                UMImage urlImage = new UMImage(HotSkipActivity.this,R.mipmap.ic_main_logo);
                weixin.withMedia(urlImage);
                weixin.setPlatform(SHARE_MEDIA.WEIXIN_CIRCLE).setCallback(umShareListener).share();
            }
        });
            builder.setView(inflate);
            builder.show();
        }


    //下载数据
    private void downloadSkipData(final int position) {
        String skipDataUrl = Constant.SKIP_DATA;
        final RequestParams params=new RequestParams(skipDataUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "df04ef8cf3aab201ce09175f64129ac4");
        params.addBodyParameter("uid	", "10282642");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/photolist/?type=1&id=(159-position)&_wt=5");
        params.addBodyParameter("topicTag",(159-position)+"");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parseSkipData(result);
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

    private void parseSkipData(String result) {
        Gson gson=new Gson();
        SkipData skipData = gson.fromJson(result, SkipData.class);
        SkipData.ResultBean resultData = skipData.getResult();
        shareInfoData = resultData.getInfo().getShareInfo();
        tvSkipCount.setText(resultData.getInfo().getCount()+"");
        Picasso.with(this).load(resultData.getInfo().getCover()).placeholder(R.mipmap.default_high).into(ivSkip);
        tvContent.setText(resultData.getInfo().getContent());
        List<SkipData.ResultBean.ListBean> listSkipData = skipData.getResult().getList();
        if (listSkipData==null){
            pb.setVisibility(View.VISIBLE);
        }else {
            pb.setVisibility(View.GONE);
        }
        aboutMyListView(listSkipData);
    }

    private void aboutMyListView(List<SkipData.ResultBean.ListBean> listSkipData) {
        lv.setFocusable(false);
        SkipAdapter adapter=new SkipAdapter(listSkipData,this);
        lv.setAdapter(adapter);
    }
}
