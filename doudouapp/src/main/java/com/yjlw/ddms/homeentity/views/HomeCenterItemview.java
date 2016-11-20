package com.yjlw.ddms.homeentity.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.yjlw.ddms.R;

/**
 * Simple to Introduction
 *
 * @Description: 到家的中间图形界面
 * @Author: 原海忠
 * @CreateDate: 2016/11/17
 * @Version: [v1.0]
 */
public class HomeCenterItemview extends LinearLayout {

    private View view;

    public HomeCenterItemview(Context context) {
        super(context);
        initView();
    }

    public HomeCenterItemview(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public HomeCenterItemview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public void initView() {
        view = View.inflate(getContext(), R.layout.home_centeri_tem, this);
    }
}