package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.VideoData;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月25  15:22
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class LookVedioAdapter extends HomeCustomBaseAdapter<VideoData.ResultBean.FunlifeBean> {
    public LookVedioAdapter(List<VideoData.ResultBean.FunlifeBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.interest_life_item,null);
            vh.ivInterestPhoto= (ImageView) convertView.findViewById(R.id.iv_lifeitem_photo);
            vh.ivInterestPlay= (ImageView) convertView.findViewById(R.id.iv_lifeitem_play);
            vh.ivInterestCirclePhoto= (MySelfCircleView) convertView.findViewById(R.id.iv_lifeitem_circle);
            vh.tvInterestUser= (TextView) convertView.findViewById(R.id.tv_lifeitem_user);
            vh.tvInterestName= (TextView) convertView.findViewById(R.id.tv_lifeitem_name);
            vh.tvInterestContent= (TextView) convertView.findViewById(R.id.tv_lifeitem_content);
            vh.tvInterestTime= (TextView) convertView.findViewById(R.id.tv_lifeitem_time);
            vh.tvInterestZan= (TextView) convertView.findViewById(R.id.tv_lifeitem_zan);
            vh.tvInterestComment= (TextView) convertView.findViewById(R.id.tv_lifeitem_comment);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getInfo().getCover()).placeholder(R.mipmap.default_high).into(vh.ivInterestPhoto);
        Picasso.with(context).load(lists.get(position).getInfo().getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(vh.ivInterestCirclePhoto);
        vh.tvInterestUser.setText(lists.get(position).getInfo().getUserInfo().getUserName());
        vh.tvInterestName.setText(lists.get(position).getInfo().getTitle());
        vh.tvInterestContent.setText(lists.get(position).getInfo().getIntro());
        vh.tvInterestTime.setText(lists.get(position).getInfo().getCreateTime());
        vh.tvInterestZan.setText(lists.get(position).getInfo().getDiggCount()+"");
        vh.tvInterestComment.setText(lists.get(position).getInfo().getCommentCount()+"");
        return convertView;
    }
    private final class ViewHolder{
        private ImageView ivInterestPhoto;
        private ImageView ivInterestPlay;
        private MySelfCircleView ivInterestCirclePhoto;
        private TextView tvInterestUser;
        private TextView tvInterestName;
        private TextView tvInterestContent;
        private TextView tvInterestTime;
        private TextView tvInterestZan;
        private TextView tvInterestComment;
    }
}
