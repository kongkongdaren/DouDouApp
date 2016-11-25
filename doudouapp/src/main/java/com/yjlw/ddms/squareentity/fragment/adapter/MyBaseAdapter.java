package com.yjlw.ddms.squareentity.fragment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.squareentity.fragment.entity.Result;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：自定义适配器<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 6:58
 *
 * @author 李磊
 * @version : 1.0
 */

public class MyBaseAdapter extends BaseAdapter {
    private final int TYPE_CNT=2; //布局文件的类型
    private final int TYPT_HOT=1;//实时热点的布局文件
    private final int TYPE_GROUP=2;//话题小组的布局文件

    private List<Result.ResultBean.GroupBean> groupBeans;
    private Context context;

    public MyBaseAdapter(List<Result.ResultBean.GroupBean> groupBeans, Context context) {
        this.groupBeans = groupBeans;
        this.context = context;
    }

    @Override
    public int getViewTypeCount() {
        return TYPE_CNT;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getCount() {
        return groupBeans.size();
    }

    @Override
    public Object getItem(int i) {
        return groupBeans.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.squareen_topic_group_item,null);
            vh=new ViewHolder();
            vh.topic_group_item_image_id= (ImageView) convertView.findViewById(R.id.topic_group_item_image_id);
            vh.tv_Name_id= (TextView) convertView.findViewById(R.id.tv_Name_id);
            vh.tv_ViewDesc_id= (TextView) convertView.findViewById(R.id.tv_ViewDesc_id);
            vh.tv_Desc_id= (TextView) convertView.findViewById(R.id.tv_Desc_id);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }

        Result.ResultBean.GroupBean groupBean = groupBeans.get(i);
        Picasso.with(context).load(groupBean.getImg()).into(vh.topic_group_item_image_id);
        vh.tv_Name_id.setText(groupBean.getName());
        vh.tv_ViewDesc_id.setText(groupBean.getViewDesc());
        vh.tv_Desc_id.setText(groupBean.getDesc());

        return convertView;
    }

    private final class ViewHolder{
        ImageView topic_group_item_image_id;
        TextView tv_Name_id;
        TextView tv_ViewDesc_id;
        TextView tv_Desc_id;

    }

}
