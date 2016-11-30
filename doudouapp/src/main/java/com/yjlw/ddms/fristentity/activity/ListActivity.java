package com.yjlw.ddms.fristentity.activity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月27  0:28
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class ListActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_back_list)
    private ImageView ivListBack;
    @ViewInject(R.id.iv_list_share)
    private ImageView ivListShare;
    @ViewInject(R.id.webv_id)
    private WebView web;
    private ProgressDialog dialog;
    private UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(ListActivity.this, platform + " 分享成功啦", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(ListActivity.this, platform + " 分享失败啦", Toast.LENGTH_SHORT).show();
            if (t != null) {
                Log.d("throw", "throw:" + t.getMessage());
            }
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media) {
            Toast.makeText(ListActivity.this,share_media + " 分享取消了", Toast.LENGTH_SHORT).show();
        }
    };

        @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_web);
        x.view().inject(this);
        ivListBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        final String url = extras.getString("url");
        final String title=extras.getString("title");
            final String content=extras.getString("content");
        ivListShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(url,title,content);
            }
        });
        WebSettings settings = web.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        //设置缓存模式
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMinimumFontSize(settings.getMinimumFontSize() + 8);
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        web.setWebChromeClient(new WebChroemClient());// 支持运行特殊的javascript（例如：alert()）
        web.setWebViewClient(new webClient());//
        dialog = ProgressDialog.show(this,null,"正在为小主努力加载。。。");
        web.loadUrl(url);
    }

    private void shareData(final String url, final String title, final String content) {
        AlertDialog.Builder builder=new AlertDialog.Builder(ListActivity.this);
        //把布局文件先填充成View对象
        View inflate=View.inflate(ListActivity.this,R.layout.share_item,null);
        ImageView ivQQ= (ImageView) inflate.findViewById(R.id.iv_qq);
        ImageView ivWeixin= (ImageView) inflate.findViewById(R.id.iv_weixin);
        ImageView ivQZone= (ImageView) inflate.findViewById(R.id.iv_qzone);
        ivQQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareAction qq=new ShareAction(ListActivity.this);
                qq.withTitle(title);
                qq.withText(content);
                UMImage urlImage = new UMImage(ListActivity.this,R.mipmap.ic_main_logo);
                qq.withMedia(urlImage);
                qq.withTargetUrl(url);
                qq.setPlatform(SHARE_MEDIA.QQ).setCallback(umShareListener).share();
            }
        });

        ivQZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareAction Qzone=new ShareAction(ListActivity.this);
                Qzone.withTitle(title);
                Qzone.withText(content);
                //分享图片
                UMImage urlImage = new UMImage(ListActivity.this,R.mipmap.ic_main_logo);
                Qzone.withMedia(urlImage);
                Qzone.withTargetUrl(url);
                Qzone.setPlatform(SHARE_MEDIA.QZONE).setCallback(umShareListener).share();
            }
        });
        ivWeixin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareAction weixin=new ShareAction(ListActivity.this);
                weixin.withTitle(title);
                weixin.withText(content);
                weixin.withTargetUrl(url);
                UMImage urlImage = new UMImage(ListActivity.this,R.mipmap.ic_main_logo);
                weixin.withMedia(urlImage);
                weixin.setPlatform(SHARE_MEDIA.WEIXIN_CIRCLE).setCallback(umShareListener).share();
            }
        });
        builder.setView(inflate);
        builder.show();
    }

    private class WebChroemClient extends WebChromeClient {

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            // TODO Auto-generated method stub
            super.onProgressChanged(view, newProgress);
        }
    }
    private  class webClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            dialog.dismiss();
        }
    }
}
