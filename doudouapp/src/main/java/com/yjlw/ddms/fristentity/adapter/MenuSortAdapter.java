package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.MenuSort;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  17:51
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class MenuSortAdapter extends HomeCustomBaseAdapter<MenuSort.ResultBean.ListBean> {
    public MenuSortAdapter(List<MenuSort.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.menu_sort_item,null);
            vh=new ViewHolder();
            vh.tvSort= (TextView) convertView.findViewById(R.id.tv_sort);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        vh.tvSort.setText(lists.get(position).getCate());
        return convertView;
    }
    private final  class ViewHolder{
        private TextView tvSort;
    }
}
