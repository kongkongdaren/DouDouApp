package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.KitchenData;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：厨房宝典适配器 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  13:51
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class KitChenAdapter extends HomeCustomBaseAdapter<KitchenData.ResultBean.ListBean> {
    public KitChenAdapter(List<KitchenData.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.kitchen_item,null);
            vh.tvKitChenName= (TextView) convertView.findViewById(R.id.tv_kitchen_title);
            vh.ivKitChenPhoto= (ImageView) convertView.findViewById(R.id.iv_kitchen);
            vh.tvUserName= (TextView) convertView.findViewById(R.id.tv_kitchen_name);
            vh.tvContent= (TextView) convertView.findViewById(R.id.tv_kitchen_content);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getImage()).placeholder(R.mipmap.default_high).into(vh.ivKitChenPhoto);
        vh.tvKitChenName.setText(lists.get(position).getTitle());
        vh.tvUserName.setText(lists.get(position).getCollection());
        vh.tvContent.setText(lists.get(position).getContent());
        return convertView;
    }
    private final class ViewHolder{
        private ImageView ivKitChenPhoto;
        private TextView tvKitChenName;
        private TextView tvUserName;
        private TextView tvContent;

    }
}
