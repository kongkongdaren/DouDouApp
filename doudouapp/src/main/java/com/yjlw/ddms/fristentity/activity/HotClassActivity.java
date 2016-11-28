package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Description：热门分类界面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  23:02
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotClassActivity extends AppCompatActivity {
    @ViewInject(R.id.hotclass_back)
    private ImageView ivhotclassBack;
    @ViewInject(R.id.hotclass_item)
    private GridView gvitem;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotclass_gv);
        x.view().inject(this);
        ivhotclassBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
