package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
            //vh.ll= (LinearLayout) convertView.findViewById(R.id.ll_skip);
            vh.ivPhoto= (ImageView) convertView.findViewById(R.id.iv_skip_photo);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getUserInfo().getAvatar()).placeholder(R.mipmap.default_high).into(vh.ivSkipCir);
        vh.tvName.setText(lists.get(position).getUserInfo().getUserName());
        vh.tvTitle.setText(lists.get(position).getTopicTags().get(0).getName());
        vh.tvTime.setText(lists.get(position).getCreateTime()+"");
//        for (int i=1;i<lists.get(position).getImages().size();i++){
//            if(i<4) {
//                ImageView iv = new ImageView(context);
//                iv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
//                        LinearLayout.LayoutParams.WRAP_CONTENT));
//                iv.setPadding(50, 5, 5, 5);
//                Picasso.with(context).load(lists.get(i).getImages().get(i).getSmallUrl()).placeholder(R.mipmap.default_high).into(iv);
//                vh.ll.addView(iv);
//            }
//        }
        Picasso.with(context).load(lists.get(position).getImages().get(0).getSmallUrl()).placeholder(R.mipmap.default_high).into(vh.ivPhoto);
        return convertView;
    }
   private final class ViewHolder{
    private MySelfCircleView ivSkipCir;
    private TextView tvName;
    private TextView tvTitle;
    private TextView tvTime;
       private  LinearLayout ll;
       private ImageView ivPhoto;
   }
}
