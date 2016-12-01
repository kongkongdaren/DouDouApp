package com.yjlw.ddms.fristentity.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月30  20:24
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class PhotopuActivity extends AppCompatActivity {
    @ViewInject(R.id.caipu_back)
    private ImageView caiBack;
    @ViewInject(R.id.caipu_share)
    private ImageView caiShare;
    @ViewInject(R.id.cai_web)
    private WebView web;
    private ProgressDialog dialog;
    private UMShareListener umShareListener1 = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA share_media) {

            Toast.makeText(PhotopuActivity.this, "分享成功", Toast.LENGTH_LONG).show();

        }

        @Override
        public void onError(SHARE_MEDIA share_media, Throwable throwable) {
            Toast.makeText(PhotopuActivity.this, "分享失败", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media) {

            Toast.makeText(PhotopuActivity.this, "分享取消", Toast.LENGTH_LONG).show();


        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caipu_item);
        x.view().inject(this);
        caiBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        final String url = extras.getString("url");
        caiShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share(url);
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
        web.setWebChromeClient(new webChromeClient());// 支持运行特殊的javascript（例如：alert()）
        web.setWebViewClient(new  webViewClient());//
        dialog = ProgressDialog.show(this, null, "正在为小猪努力加载。。。。。");
        web.loadUrl(url);
    }

    private void share(String url) {
        new ShareAction(this).setDisplayList(SHARE_MEDIA.WEIXIN_CIRCLE, SHARE_MEDIA.QQ, SHARE_MEDIA.QZONE, SHARE_MEDIA.MORE)
                .withTitle("给你看一条美食相关")
                .withText("你好啊。。。")
                .withTargetUrl(url)
                .setCallback(umShareListener1)
                .open();
    }

    private class webChromeClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
    }

    private class webViewClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            dialog.dismiss();

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }
}
