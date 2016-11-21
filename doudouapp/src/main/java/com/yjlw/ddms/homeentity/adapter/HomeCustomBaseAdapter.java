package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 到家的自定义适配器基类
 * @Author: 原海忠
 * @CreateDate: 2016/11/18
 * @Version: [v1.0]
 */
public abstract class HomeCustomBaseAdapter<T> extends BaseAdapter {
    public List<T> lists;
    public Context context;

    public HomeCustomBaseAdapter(List<T> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public T getItem(int position) {
        return lists.get(position);
    }

    @Override

    public long getItemId(int position) {
        return position;
    }
}

