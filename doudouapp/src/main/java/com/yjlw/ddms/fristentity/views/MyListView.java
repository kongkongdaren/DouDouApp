package com.yjlw.ddms.fristentity.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

/**
 * Description：自定义ListView <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月18  21:14
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class MyListView extends ListView {
    View.OnTouchListener mGestureListener;


    private View touchView;

    public void touchView(View view)
    {
        touchView=view;
    }

    public MyListView(Context context) {
        super(context);
    }
    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFadingEdgeLength(0);
    }
    public MyListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(touchView!=null){
            //判断在视图内的动作则返回 false
            Rect rect = new Rect(touchView.getLeft(),touchView.getTop(),touchView.getRight(),touchView.getBottom());
            if(rect.contains((int)ev.getX(), (int)ev.getY())){
                return false;
            }}
        return super.onInterceptTouchEvent(ev);
    }
}
