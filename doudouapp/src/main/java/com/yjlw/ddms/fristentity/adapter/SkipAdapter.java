package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.SkipData;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  14:38
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class SkipAdapter extends HomeCustomBaseAdapter<SkipData.ResultBean.ListBean> {
    public SkipAdapter(List<SkipData.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.ship_item,null);
            vh.ivSkipCir= (MySelfCircleView) convertView.findViewById(R.id.mfc_skip);
            vh.tvName= (TextView) convertView.findViewById(R.id.tv_skip_name);
            vh.tvTitle= (TextView) convertView.findViewById(R.id.tv_title_skip);
            vh.tvTime= (TextView) convertView.findViewById(R.id.tv_skip_time);
            vh.ivimg1= (ImageView) convertView.findViewById(R.id.img1);
            vh.ivimg2= (ImageView) convertView.findViewById(R.id.img2);
            vh.ivimg3= (ImageView) convertView.findViewById(R.id.img3);
            vh.ivimg4= (ImageView) convertView.findViewById(R.id.img4);
            vh.ivimg5= (ImageView) convertView.findViewById(R.id.img5);
            vh.ivimg6= (ImageView) convertView.findViewById(R.id.img6);
            vh.ivimg7= (ImageView) convertView.findViewById(R.id.img7);
            vh.ivimg8= (ImageView) convertView.findViewById(R.id.img8);
            vh.ivimg9= (ImageView) convertView.findViewById(R.id.img9);

            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(vh.ivSkipCir);
        vh.tvName.setText(lists.get(position).getUserInfo().getUserName());
        vh.tvTitle.setText(lists.get(position).getTopicTags().get(0).getName());
        vh.tvTime.setText(lists.get(position).getCreateTime()+"");
              if(lists.get(position).getImages().size()==1){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
              }else if(lists.get(position).getImages().size()==2){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
              }else if(lists.get(position).getImages().size()==3){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
              }else if(lists.get(position).getImages().size()==4){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
                  Picasso.with(context).load(lists.get(position).getImages().get(3).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg4);
              }else if(lists.get(position).getImages().size()==5){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
                  Picasso.with(context).load(lists.get(position).getImages().get(3).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg4);
                  Picasso.with(context).load(lists.get(position).getImages().get(4).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg5);
              }else if(lists.get(position).getImages().size()==6){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
                  Picasso.with(context).load(lists.get(position).getImages().get(3).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg4);
                  Picasso.with(context).load(lists.get(position).getImages().get(4).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg5);
                  Picasso.with(context).load(lists.get(position).getImages().get(5).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg6);
              }else if(lists.get(position).getImages().size()==7){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
                  Picasso.with(context).load(lists.get(position).getImages().get(3).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg4);
                  Picasso.with(context).load(lists.get(position).getImages().get(4).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg5);
                  Picasso.with(context).load(lists.get(position).getImages().get(5).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg6);
                  Picasso.with(context).load(lists.get(position).getImages().get(6).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg7);
              }else if(lists.get(position).getImages().size()==8){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
                  Picasso.with(context).load(lists.get(position).getImages().get(3).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg4);
                  Picasso.with(context).load(lists.get(position).getImages().get(4).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg5);
                  Picasso.with(context).load(lists.get(position).getImages().get(5).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg6);
                  Picasso.with(context).load(lists.get(position).getImages().get(6).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg7);
                  Picasso.with(context).load(lists.get(position).getImages().get(7).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg8);
              }else if(lists.get(position).getImages().size()==9){
                  Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg1);
                  Picasso.with(context).load(lists.get(position).getImages().get(1).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg2);
                  Picasso.with(context).load(lists.get(position).getImages().get(2).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg3);
                  Picasso.with(context).load(lists.get(position).getImages().get(3).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg4);
                  Picasso.with(context).load(lists.get(position).getImages().get(4).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg5);
                  Picasso.with(context).load(lists.get(position).getImages().get(5).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg6);
                  Picasso.with(context).load(lists.get(position).getImages().get(6).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg7);
                  Picasso.with(context).load(lists.get(position).getImages().get(7).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg8);
                  Picasso.with(context).load(lists.get(position).getImages().get(8).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivimg9);
              }
        return convertView;
    }
   private final class ViewHolder{
    private MySelfCircleView ivSkipCir;
    private TextView tvName;
    private TextView tvTitle;
    private TextView tvTime;
       private ImageView ivimg1;
       private ImageView ivimg2;
       private ImageView ivimg3;
       private ImageView ivimg4;
       private ImageView ivimg5;
       private ImageView ivimg6;
       private ImageView ivimg7;
       private ImageView ivimg8;
       private ImageView ivimg9;
   }
}
