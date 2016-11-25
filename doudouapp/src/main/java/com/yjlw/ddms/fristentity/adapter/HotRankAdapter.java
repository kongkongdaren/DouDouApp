package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.HotRank;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月25  20:53
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotRankAdapter extends HomeCustomBaseAdapter<HotRank.ResultBean.ListBean> {
    public HotRankAdapter(List<HotRank.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.hot_rank_item,null);
            vh.ivRankPhoto= (ImageView) convertView.findViewById(R.id.iv_hot_rank);
            vh.tvCount= (TextView) convertView.findViewById(R.id.tv_count);
            vh.tvRankTitle= (TextView) convertView.findViewById(R.id.hot_rank_title);
            vh.tvRankZan= (TextView) convertView.findViewById(R.id.hot_rank_zan);
            vh.tvRankComment= (TextView) convertView.findViewById(R.id.hot_rank_comment);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getCover()).placeholder(R.mipmap.default_high).into(vh.ivRankPhoto);
        vh.tvCount.setText(lists.get(position).getPlayCount()+"");
        vh.tvRankTitle.setText(lists.get(position).getTitle());
        vh.tvRankZan.setText(lists.get(position).getDiggCount()+"");
        vh.tvRankComment.setText(lists.get(position).getCommentCount()+"");
        return convertView;
    }
    private final class ViewHolder{
        private ImageView ivRankPhoto;
        private TextView tvCount;
        private TextView tvRankTitle;
        private TextView tvRankZan;
        private TextView tvRankComment;
    }
}
