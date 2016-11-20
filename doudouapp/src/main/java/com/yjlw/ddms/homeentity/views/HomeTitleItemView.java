package com.yjlw.ddms.homeentity.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjlw.ddms.R;

import org.w3c.dom.Text;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/17
 * @Version: [v1.0]
 */
public class HomeTitleItemView extends LinearLayout {

    private View view;
    private TextView textView;
    private ImageView ivHomeIcon;

    public HomeTitleItemView(Context context) {
        super(context);
        initView();
    }

    public HomeTitleItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public HomeTitleItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public void initView() {
        view = View.inflate(getContext(), R.layout.home_title_item, this);
        textView = (TextView) view.findViewById(R.id.tv_center_title);
        ivHomeIcon = (ImageView) view.findViewById(R.id.iv_home_icon);
    }

    public void setTitle(String title) {
        textView.setText(title);
    }

    public void setIvResource(int id) {
        ivHomeIcon.setImageResource(id);
    }
}