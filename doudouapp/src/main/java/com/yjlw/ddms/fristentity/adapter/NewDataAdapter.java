package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.NewData;

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

    public class NewDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
       List<NewData.ResultBean.ListBean> lists;
       private Context context;

    public NewDataAdapter(List<NewData.ResultBean.ListBean> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.newclass_item,parent,false));

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder mholder= (MyViewHolder) holder;
        Picasso.with(context).load(lists.get(position).getCover()).placeholder(R.mipmap.default_high).into(mholder.ivNewPhoto);
        mholder.tvCount.setText(lists.get(position).getPlayCount()+"");
        mholder.tvNewTitle.setText(lists.get(position).getTitle());
        mholder.tvNewZan.setText(lists.get(position).getDiggCount()+"");
        mholder.tvNewComment.setText(lists.get(position).getCommentCount()+"");

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }
}
      class  MyViewHolder extends RecyclerView.ViewHolder {
          public ImageView ivNewPhoto;
          public TextView tvCount;
          public TextView tvNewTitle;
          public TextView tvNewZan;
          public TextView tvNewComment;

         public MyViewHolder(View itemView) {
             super(itemView);
             ivNewPhoto= (ImageView) itemView.findViewById(R.id.iv_new_rank);
             tvCount= (TextView) itemView.findViewById(R.id.tv_count);
             tvNewTitle= (TextView) itemView.findViewById(R.id.hot_new_title);
             tvNewZan= (TextView) itemView.findViewById(R.id.hot_new_zan);
             tvNewComment= (TextView) itemView.findViewById(R.id.hot_new_comment);
         }
     }
