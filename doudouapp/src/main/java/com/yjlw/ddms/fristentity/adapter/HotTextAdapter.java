package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.HotClassItem;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  23:58
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotTextAdapter extends HomeCustomBaseAdapter<HotClassItem.ResultBean.ListBean> {
    public HotTextAdapter(List<HotClassItem.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.hot_item_text,null);
           vh.tvText= (TextView) convertView.findViewById(R.id.item_text);
            convertView.setTag(vh);
        }else{
           vh= (ViewHolder) convertView.getTag();
        }
        vh.tvText.setText(lists.get(position).getCateName());
        return convertView;
    }
    private final class ViewHolder{
        private TextView tvText;
    }
}
