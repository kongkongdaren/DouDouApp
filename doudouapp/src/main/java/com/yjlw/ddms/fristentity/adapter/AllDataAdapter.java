package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
            vh.llTag= (LinearLayout) convertView.findViewById(R.id.ll_tag);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        HotAll.ResultBean.ListBean listBean = lists.get(position);
        Picasso.with(context).load(listBean.getCover()).placeholder(R.mipmap.default_high).into(vh
                .ivTitlePhoto);
        vh.tvContent.setText(listBean.getTitle());
        vh.tvName.setText("by "+listBean.getUserName());
        vh.tvPraiseCount.setText(listBean.getLikeCount()+"");
        for(int i=0;i<listBean.getTags().size();i++){
                TextView tvTag = new TextView(context);
                // 第一个参数为宽的设置，第二个参数为高的设置。
                tvTag.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.MATCH_PARENT));
                tvTag.setTextColor(Color.BLACK);
                tvTag.setGravity(Gravity.CENTER);
                tvTag.setPadding(25, 0, 0, 25);//left, top, right, bottom
                tvTag.setSingleLine(true);
                tvTag.setEllipsize(TextUtils.TruncateAt.END);
                tvTag.setText(listBean.getTags().get(i).getName());
                vh.llTag.addView(tvTag);
        }
        return convertView;

    }

    private final class ViewHolder {
        private ImageView ivTitlePhoto;
        private ImageView ivPraise;
        private TextView tvContent;
        private TextView tvName;
        private TextView tvPraiseCount;
        private LinearLayout llTag;
    }
}
