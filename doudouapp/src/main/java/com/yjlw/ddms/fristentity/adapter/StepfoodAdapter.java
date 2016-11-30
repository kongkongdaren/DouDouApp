package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.CaipuData;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月30  21:22
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class StepfoodAdapter extends HomeCustomBaseAdapter<CaipuData.ResultBean.InfoBean.StepsBean> {
    public StepfoodAdapter(List<CaipuData.ResultBean.InfoBean.StepsBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.step_item,null);
            vh.ivStepPhoto= (ImageView) convertView.findViewById(R.id.iv_step_photo);
            vh.tvComment= (TextView) convertView.findViewById(R.id.tv_step_count);
            convertView.setTag(vh);
        }else{
           vh= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(lists.get(position).getStepPhoto()).placeholder(R.mipmap.default_high).into(vh.ivStepPhoto);
        vh.tvComment.setText(lists.get(position).getIntro());
        return convertView;
    }
    private final  class ViewHolder{
        private ImageView ivStepPhoto;
        private TextView tvComment;
    }
}
