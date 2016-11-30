package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.CaipuData;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月30  21:22
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class OtherfoodAdapter extends HomeCustomBaseAdapter<CaipuData.ResultBean.InfoBean.OtherStuffBean> {

    public OtherfoodAdapter(List<CaipuData.ResultBean.InfoBean.OtherStuffBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.other_list_item,null);
            vh.tvComm= (TextView) convertView.findViewById(R.id.tv_other);
            vh.tvComment= (TextView) convertView.findViewById(R.id.tv_other_count);
            convertView.setTag(vh);
        }else{
           vh= (ViewHolder) convertView.getTag();
        }
        vh.tvComm.setText(lists.get(position).getName());
        vh.tvComment.setText(lists.get(position).getWeight()+"");
        return convertView;
    }
    private final  class ViewHolder{
        private TextView tvComm;
        private TextView tvComment;
    }
}
