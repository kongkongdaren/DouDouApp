package com.yjlw.ddms.squareentity.fragment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.Lists;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;


/**
 * Description：豆友的自定义适配器<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 6:58
 *
 * @author 李磊
 * @version : 1.0
 */

public class MyBeanFriendBaseAdapter extends HomeCustomBaseAdapter<Lists.ResultBean.ListBean> {
    private final int TYPE_CNT = 2; //布局文件的类型
    private final int TYPT_MAIN = 0;
    private final int TYPE_FRAVITOR_MAIN = 1;

    public MyBeanFriendBaseAdapter(List<Lists.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public int getViewTypeCount() {
        return TYPE_CNT;
    }

    @Override
    public int getItemViewType(int position) {
        if (lists.get(position).getFavoriteList().size()==3) {
            return TYPE_FRAVITOR_MAIN;
        } else {
            return TYPT_MAIN;
        }
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolderMain vh1 = null;
        ViewHolderFavritorMain vh2= null;
        int type = getItemViewType(i);
        if (convertView == null) {
            switch (type) {
                case TYPT_MAIN:
                    convertView=View.inflate(context, R.layout.squareen_beanfriend_main,null);
                    vh1=new ViewHolderMain();
                    vh1.iv_beanjfriend_userPhoto= (ImageView) convertView.findViewById(R.id.iv_beanjfriend_userPhoto);
                    vh1.tv_beanfriend_username_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_username_id);
                    vh1.tv_beanfriend_content_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_content_id);
                    vh1.tv_beanfriend_address_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_address_id);
                   convertView.setTag(vh1);
                    break;
                case TYPE_FRAVITOR_MAIN:
                    convertView=View.inflate(context,R.layout.squareen_beanfriend_favritor_main,null);
                    vh2=new ViewHolderFavritorMain();
                    vh2.iv_beanjfriend_userPhoto= (ImageView) convertView.findViewById(R.id.iv_beanjfriend_userPhoto);
                    vh2.tv_beanfriend_username_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_username_id);
                    vh2.tv_beanfriend_content_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_content_id);
                    vh2.tv_beanfriend_fravritor1_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_fravritor1_id);
                    vh2.tv_beanfriend_fravritor2_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_fravritor2_id);
                    vh2.tv_beanfriend_fravritor3_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_fravritor3_id);
                    vh2.tv_beanfriend_address_id= (TextView) convertView.findViewById(R.id.tv_beanfriend_address_id);
                    convertView.setTag(vh2);
                    break;
            }
        } else {
            switch (type) {
                case TYPT_MAIN:
                    vh1= (ViewHolderMain) convertView.getTag();
                    break;
                case TYPE_FRAVITOR_MAIN:
                    vh2= (ViewHolderFavritorMain) convertView.getTag();
                    break;
            }
        }

        Lists.ResultBean.ListBean listBean = lists.get(i);
        switch (type) {
            case TYPT_MAIN:
                Picasso.with(context).load(listBean.getAvatar()).into(vh1.iv_beanjfriend_userPhoto);
                vh1.tv_beanfriend_username_id.setText(listBean.getUserName());
                vh1.tv_beanfriend_content_id.setText(listBean.getIntro());
                vh1.tv_beanfriend_address_id.setText(listBean.getAddress());
                break;
            case TYPE_FRAVITOR_MAIN:
                Picasso.with(context).load(listBean.getAvatar()).into(vh2.iv_beanjfriend_userPhoto);
                vh2.tv_beanfriend_username_id.setText(listBean.getUserName());
                vh2.tv_beanfriend_content_id.setText(listBean.getIntro());
                vh2.tv_beanfriend_fravritor1_id.setText(listBean.getFavoriteList().get(0).getName());
                vh2.tv_beanfriend_fravritor2_id.setText(listBean.getFavoriteList().get(1).getName());
                vh2.tv_beanfriend_fravritor3_id.setText(listBean.getFavoriteList().get(2).getName());
                vh2.tv_beanfriend_address_id.setText(listBean.getAddress());
                break;
        }

            return convertView;
        }

        private final class ViewHolderMain {
            private ImageView iv_beanjfriend_userPhoto;
            private TextView tv_beanfriend_username_id;
            private TextView tv_beanfriend_content_id;
            private TextView tv_beanfriend_address_id;

        }

        private final class ViewHolderFavritorMain {
            private ImageView iv_beanjfriend_userPhoto;
            private TextView tv_beanfriend_username_id;
            private TextView tv_beanfriend_content_id;
            private TextView tv_beanfriend_fravritor1_id;
            private TextView tv_beanfriend_fravritor2_id;
            private TextView tv_beanfriend_fravritor3_id;
            private TextView tv_beanfriend_address_id;
        }
}