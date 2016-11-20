package com.yjlw.ddms.fristentity.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjlw.ddms.R;

/**
 * Description：自定义控件 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月16  17:55
 *
 * @author 姜文莒
 * @version : 1.0
 */
public class HaoDouTitleCclickItem extends LinearLayout {

    private ImageView ivIcon;
    private TextView tvTitle;

    public HaoDouTitleCclickItem(Context context) {
        super(context);
        initView();
    }

    public HaoDouTitleCclickItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public HaoDouTitleCclickItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);        initView();
    }

    private void initView() {
        View view = View.inflate(getContext(),R.layout.haodou_title_click_item, this);
        ivIcon = (ImageView) view.findViewById(R.id.iv_haodou_icon);
        tvTitle = (TextView) view.findViewById(R.id.tv_haodou_title);
    }
    //向imageview中设置内容
    public void setImage(int picId){
        ivIcon.setImageResource(picId);
    }
    //像TextView设置内容
    public void setTextView(String text){
        tvTitle.setText(text);
    }
}