package com.yjlw.ddms.aboutme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjlw.ddms.R;


/**
 * Description：自定义布局文件类<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月16下午 1:56
 *
 * @author 李磊
 * @version : 1.0
 */

public class SettingItemClickView extends LinearLayout {
    private ImageView left_image;
    private TextView mTitle;
    private TextView mOrder;

    public SettingItemClickView(Context context) {
        super(context);
        initView();
    }

    public SettingItemClickView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public SettingItemClickView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    //填充布局文件
    public void initView(){
        View view = View.inflate(getContext(), R.layout.setting_view_click_item, this);
        left_image = (ImageView) view.findViewById(R.id.iv_left_iamge_id);
        mTitle = (TextView) view.findViewById(R.id.tv_title);
        mOrder = (TextView) view.findViewById(R.id.tv_order_id);
    }

    //向左边的ImageView设置图片
    public void setLeftImage(int ResPicId){
        left_image.setImageResource(ResPicId);
    }

    //向TextView设置text
    public void setTextView(String title){
        mTitle.setText(title);
    }

    public void setOrderTextView(String order){
        mOrder.setText(order);
    }
}
