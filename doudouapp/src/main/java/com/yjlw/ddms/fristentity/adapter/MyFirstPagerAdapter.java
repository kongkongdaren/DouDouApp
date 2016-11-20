package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.FirstPagerData;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：自定义适配器 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月19  13:59
 *
 * @author 姜文莒
 * @version : 1.0
 */
public class MyFirstPagerAdapter extends HomeCustomBaseAdapter<FirstPagerData.DataBean.ListBean> {
    private final int TYPE_CNT = 2;// 布局类型的个数
    private final int TYPE_DES = 0;// 不包含圆形图片的布局类型
    private final int TYPE_ALL = 1;// 都包含
    public MyFirstPagerAdapter(List<FirstPagerData.DataBean.ListBean> lists, Context context) {
        super(lists, context);

    }

    @Override
    public int getItemViewType(int position) {
        if(lists.get(position).getUserName()!=null){
            return TYPE_ALL;
        }else{
            return TYPE_DES;

        }
    }
    @Override
    public int getViewTypeCount() {
        return TYPE_CNT;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        ViewCircleHolder vch=null;
        //获得布局类型
        int type = getItemViewType(position);
        if(convertView==null){
            switch (type){
                case TYPE_DES://不包含圆形图片的布局类型
                  convertView= View.inflate(context, R.layout.list_item,null);
                    vh=new ViewHolder();
                   vh.ivPhoto= (ImageView) convertView.findViewById(R.id.iv_list_photo);
                   vh.tvTitle= (TextView) convertView.findViewById(R.id.tv_list_title);
                    vh.tvDec= (TextView) convertView.findViewById(R.id.tv_list_content);
                    convertView.setTag(vh);
                    break;
                case TYPE_ALL://都包含
                    convertView= View.inflate(context, R.layout.list_item_circle,null);
                    vch=new ViewCircleHolder();
                   vch.ivPhotoView= (ImageView) convertView.findViewById(R.id.iv_list_photo_circle);
                    vch.ivCirclePhoto= (MySelfCircleView) convertView.findViewById(R.id.circle_photo);
                   vch.tvName= (TextView) convertView.findViewById(R.id.tv_name);
                    vch.tvTitleView= (TextView) convertView.findViewById(R.id.tv_list_circle_title);
                    vch.tvDecView= (TextView) convertView.findViewById(R.id.tv_list_circle_content);
                    convertView.setTag(vch);
                    break;
                default:
                    break;
            }
        }else{
            switch (type){
                case TYPE_DES:
                    vh= (ViewHolder) convertView.getTag();
                    break;
                case TYPE_ALL:
                   vch= (ViewCircleHolder) convertView.getTag();
                    break;
                default:
                    break;
            }
        }
        FirstPagerData.DataBean.ListBean bean = lists.get(position);
        switch (type){
            case TYPE_DES:
                vh.tvTitle.setText(bean.getTitle());
                vh.tvDec.setText(bean.getDesc());
                Picasso.with(context).load(bean.getImgs().get(0)).error(R.mipmap.ic_main_logo).into(vh.ivPhoto);
                break;
            case TYPE_ALL:
                vch.tvTitleView.setText(bean.getTitle());
                vch.tvDecView.setText(bean.getDesc());
                vch.tvName.setText(bean.getUserName());
                Picasso.with(context).load(bean.getImgs().get(0)).error(R.mipmap.ic_main_logo).into(vch.ivPhotoView);
                Picasso.with(context).load(bean.getUserAvatar()).error(R.mipmap.ic_main_logo).into(vch.ivCirclePhoto);
                break;
            default:
                break;

        }
        return convertView;
    }
    private  final class ViewHolder{
        private ImageView ivPhoto;
        private TextView tvTitle;
        private TextView tvDec;
    }
    private final class ViewCircleHolder{
        private ImageView ivPhotoView;
        private TextView tvTitleView;
        private TextView tvDecView;
        private MySelfCircleView ivCirclePhoto;
        private TextView  tvName;
    }
}
