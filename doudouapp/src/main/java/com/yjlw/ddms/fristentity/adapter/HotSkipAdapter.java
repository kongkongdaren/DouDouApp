package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.HotSkipData;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月29  0:31
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotSkipAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<HotSkipData.ResultBean.ListBean> lists;
    private Context context;

    public HotSkipAdapter(List<HotSkipData.ResultBean.ListBean> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.hot_class_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder mvh= (MyViewHolder) holder;
        Picasso.with(context).load(lists.get(position).getCover()).placeholder(R.mipmap.default_high).into(mvh.ivSkipPhoto);
        mvh.tvSkipCount.setText(lists.get(position).getPlayCount()+"");
        mvh.tvSkipTitle.setText(lists.get(position).getTitle());
        mvh.tvSkipZan.setText(lists.get(position).getDiggCount()+"");
        mvh.tvSkipMessage.setText(lists.get(position).getCommentCount()+"");
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }
    class  MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivSkipPhoto;
        public TextView tvSkipCount;
        public TextView tvSkipTitle;
        public TextView tvSkipZan;
        public TextView tvSkipMessage;

        public MyViewHolder(View itemView) {
            super(itemView);
            ivSkipPhoto= (ImageView) itemView.findViewById(R.id.hot_item_photo);
            tvSkipCount= (TextView) itemView.findViewById(R.id.tv_hot_item);
            tvSkipTitle= (TextView) itemView.findViewById(R.id.hot_item_title);
            tvSkipZan= (TextView) itemView.findViewById(R.id.hot_item_zan);
            tvSkipMessage= (TextView) itemView.findViewById(R.id.hot_item_message);

        }
    }
}
