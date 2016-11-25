package com.yjlw.ddms.homeentity.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjlw.ddms.R;

/**
 * Simple to Introduction
 *
 * @Description: PopupWindows 的布局详情
 * @Author: 原海忠
 * @CreateDate: 2016/11/24
 * @Version: [v1.0]
 */
public class PopupWindowsItem extends LinearLayout {

    private View view;
    private TextView textView;

    public PopupWindowsItem(Context context) {
        super(context);
        initView();
    }

    public PopupWindowsItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public PopupWindowsItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    public void initView() {
        view = View.inflate(getContext(), R.layout.home_popup_window_item, this);
        textView = (TextView) view.findViewById(R.id.tv_popup_item);
    }
    public void setTitle(String title) {
        textView.setText(title);
    }
    public String getTitle() {
       return textView.getText().toString();
    }
}