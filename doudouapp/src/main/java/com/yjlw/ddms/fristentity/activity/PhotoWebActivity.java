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

import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  16:04
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class PhotoWebActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_web_back)
    private ImageView ivWebBack;
    @ViewInject(R.id.iv_collect)
    private ImageView ivCollect;
    @ViewInject(R.id.iv_share)
    private ImageView ivShare;
    @ViewInject(R.id.web_id)
    private WebView web;
    private ProgressDialog dialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitchen_web);
        x.view().inject(this);
        ivWebBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
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
        web.setWebViewClient(new webViewClient());//
        dialog = ProgressDialog.show(this,null,"正在为小主努力加载。。。");
        web.loadUrl(url);
    }

    private class webChromeClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            // TODO Auto-generated method stub
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
}
