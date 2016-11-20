package com.yjlw.ddms.fristentity.views;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;

/**
 * Description：自定义布局 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月17  20:51
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class PhotographCategoryView extends CardView {

    private TextView tvDinner;
    private ImageView ivDinner;
    private TextView tvSmallDinner;

    public PhotographCategoryView(Context context) {
        super(context);
        initView();
    }
    public PhotographCategoryView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public PhotographCategoryView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    private void initView() {
        View view = View.inflate(getContext(), R.layout.bean_image, this);
        ivDinner = (ImageView) view.findViewById(R.id.iv_dinner);
        tvDinner = (TextView) view.findViewById(R.id.tv_dinner_big);
        tvSmallDinner = (TextView) view.findViewById(R.id.tv_dinner_small);
    }
    //为imageview设置图片
    public void setImageView(int picId){
        ivDinner.setImageResource(picId);
    }
    //为textview设置
    public void setTextView(String bigTitle){
        tvDinner.setText(bigTitle);
    }
    //为textview设置
    public void setSmallTextView(String smallTitle){tvSmallDinner.setText(smallTitle);
    }
}
