package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.HotAll;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  16:10
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class AllDataAdapter extends HomeCustomBaseAdapter<HotAll.ResultBean.ListBean> {

    public AllDataAdapter(List<HotAll.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh = null;
        if (convertView == null) {
            vh = new ViewHolder();
            convertView = View.inflate(context, R.layout.title_item, null);
            vh.ivTitlePhoto = (ImageView) convertView.findViewById(R.id.iv_title_photo);
            vh.ivPraise = (ImageView) convertView.findViewById(R.id.iv_praise_photo);
            vh.tvContent = (TextView) convertView.findViewById(R.id.tv_title_name);
            vh.tvName = (TextView) convertView.findViewById(R.id.tv_name_user);
            vh.tvPraiseCount = (TextView) convertView.findViewById(R.id.tv_count);
            vh.tvTag1 = (TextView) convertView.findViewById(R.id.tv_tag0);
            vh.tvTag2 = (TextView) convertView.findViewById(R.id.tv_tag1);
            vh.tvTag3 = (TextView) convertView.findViewById(R.id.tv_tag2);
            vh.tvTag4 = (TextView) convertView.findViewById(R.id.tv_tag3);
            vh.tvTag5 = (TextView) convertView.findViewById(R.id.tv_tag4);
            vh.tvTag6 = (TextView) convertView.findViewById(R.id.tv_tag5);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();

        }
        HotAll.ResultBean.ListBean listBean = lists.get(position);
        Picasso.with(context).load(listBean.getCover()).error(R.mipmap.ic_main_logo).into(vh
                .ivTitlePhoto);
        vh.tvContent.setText(listBean.getTitle());
        vh.tvName.setText("by "+listBean.getUserName());
        vh.tvPraiseCount.setText(listBean.getLikeCount()+"");
//        vh.tvTag1.setText(listBean.getTags().get(0).getName());
//        vh.tvTag2.setText(listBean.getTags().get(0).getName());
//        vh.tvTag3.setText(listBean.getTags().get(0).getName());
//        vh.tvTag4.setText(listBean.getTags().get(0).getName());
//        vh.tvTag5.setText(listBean.getTags().get(0).getName());
 //        vh.tvTag6.setText(listBean.getTags().get(0).getName());
        return convertView;

    }

    private final class ViewHolder {
        private ImageView ivTitlePhoto;
        private ImageView ivPraise;
        private TextView tvContent;
        private TextView tvName;
        private TextView tvPraiseCount;
        private TextView tvTag1;
        private TextView tvTag2;
        private TextView tvTag3;
        private TextView tvTag4;
        private TextView tvTag5;
        private TextView tvTag6;
    }
}
