package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.NewData;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月25  21:47
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class NewDataAdapter extends HomeCustomBaseAdapter<NewData.ResultBean.ListBean> {
    public NewDataAdapter(List<NewData.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.hot_rank_item,null);
            vh.ivNewPhoto= (ImageView) convertView.findViewById(R.id.iv_hot_rank);
            vh.tvCount= (TextView) convertView.findViewById(R.id.tv_count);
            vh.tvNewTitle= (TextView) convertView.findViewById(R.id.hot_rank_title);
            vh.tvNewZan= (TextView) convertView.findViewById(R.id.hot_rank_zan);
            vh.tvNewComment= (TextView) convertView.findViewById(R.id.hot_rank_comment);
            convertView.setTag(vh);
        }else{
           vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getCover()).placeholder(R.mipmap.default_high).into(vh.ivNewPhoto);
        vh.tvCount.setText(lists.get(position).getPlayCount()+"");
        vh.tvNewTitle.setText(lists.get(position).getTitle());
        vh.tvNewZan.setText(lists.get(position).getDiggCount()+"");
        vh.tvNewComment.setText(lists.get(position).getCommentCount()+"");
        Log.i("Log","评论数"+lists.get(0).getCommentCount()+"");
        return convertView;
    }
    private final class ViewHolder{
        private ImageView ivNewPhoto;
        private TextView tvCount;
        private TextView tvNewTitle;
        private TextView tvNewZan;
        private TextView tvNewComment;
    }
}
