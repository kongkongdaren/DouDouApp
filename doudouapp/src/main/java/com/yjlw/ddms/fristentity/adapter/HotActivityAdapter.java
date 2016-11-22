package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.HotAndData;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：热门活动适配器 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  20:35
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotActivityAdapter extends HomeCustomBaseAdapter<HotAndData.ResultBean.ListBean> {
    public HotActivityAdapter(List<HotAndData.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
           convertView= View.inflate(context, R.layout.hot_activity_item,null);
           vh.ivHotPhoto= (ImageView) convertView.findViewById(R.id.iv_hot);
           vh.tvHotName= (TextView) convertView.findViewById(R.id.tv_hot_title);
            vh.tvHotContent= (TextView) convertView.findViewById(R.id.tv_hot_content);
            convertView.setTag(vh);
        }else{
           vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getImg()).placeholder(R.mipmap.default_high).into(vh.ivHotPhoto);
        vh.tvHotName.setText(lists.get(position).getTitle());
        vh.tvHotContent.setText(lists.get(position).getIntro());
        return convertView;
    }
    private final class ViewHolder {
        private ImageView ivHotPhoto;
        private TextView tvHotName;
        private TextView tvHotContent;
    }
}
