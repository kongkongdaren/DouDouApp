package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;

import it.sephiroth.android.library.picasso.Picasso;

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
    @ViewInject(R.id.iv_photo_list)
    private ImageView ivListPhoto;
    @ViewInject(R.id.tv_list_title)
    private TextView tvListTitle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_web);
        ivListBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        String img = extras.getString("imgUrl");
        Log.i("img",title);
        Picasso.with(this).load(img).placeholder(R.mipmap.default_high).into(ivListPhoto);
        tvListTitle.setText(title);
    }
}
