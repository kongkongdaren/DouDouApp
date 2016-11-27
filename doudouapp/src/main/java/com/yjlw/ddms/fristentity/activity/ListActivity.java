package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;

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
    @ViewInject(R.id.wb_id)
    private WebView web;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_web);
    }
}
