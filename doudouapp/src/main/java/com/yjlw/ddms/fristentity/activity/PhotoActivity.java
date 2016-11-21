package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  21:44
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class PhotoActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_photo_back)
    private ImageView ivPhotoBack;
    @ViewInject(R.id.tv_photo_name)
    private TextView tvPhotoName;
    @ViewInject(R.id.rlv_id)
    private RecyclerView rlv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_activity);
        x.view().inject(this);
        ivPhotoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
