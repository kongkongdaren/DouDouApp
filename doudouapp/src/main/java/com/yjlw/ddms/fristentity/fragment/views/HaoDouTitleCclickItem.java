package com.yjlw.ddms.fristentity.fragment.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.yjlw.ddms.R;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/17
 * @Version: [v1.0]
 */
public class HaoDouTitleCclickItem extends LinearLayout {
    public HaoDouTitleCclickItem(Context context) {
        super(context);
        initViews();
    }

    public HaoDouTitleCclickItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public HaoDouTitleCclickItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    public void initViews() {
        View view = View.inflate(getContext(), R.layout.haodou_title_click_item, this);
    }

    public void setLeftImage(int ResPicId) {

    }

    //向TextView设置text
    public void setTextView(String title) {

    }
}