package com.yjlw.ddms.squareentity.fragment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.Lists;
import com.yjlw.ddms.squareentity.fragment.entity.RealTime;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;


/**
 * Description：实时热点的自定义适配器<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 6:58
 *
 * @author 李磊
 * @version : 1.0
 */

public class MyRealTimeBaseAdapter extends HomeCustomBaseAdapter<RealTime.ResultBean.ListBean> {
    private final int TYPE_CNT = 4; //布局文件的类型
    private final int TYPT_REAL_TIME = 0;
    private final int TYPT_REAL_TIME_JING = 1;
    private final int TYPT_REAL_TIME_HUO=2;
    private final int TYPT_REAL_TIME_JING_HUO=3;

    public MyRealTimeBaseAdapter(List<RealTime.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }


    @Override
    public int getViewTypeCount() {
        return TYPE_CNT;
    }

    @Override
    public int getItemViewType(int position) {
        if ("0".equals(lists.get(position).getElite()) && "0".equals(lists.get(position).getHot())) {
            return TYPT_REAL_TIME;
        } else if("1".equals(lists.get(position).getElite()) && "0".equals(lists.get(position).getHot())){
            return TYPT_REAL_TIME_JING;
        }else if("0".equals(lists.get(position).getElite()) && "1".equals(lists.get(position).getHot())){
            return TYPT_REAL_TIME_HUO;
        }else{
            return TYPT_REAL_TIME_JING_HUO;
        }
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolderMain vh1 = null;
        ViewHolderJingMain vh2= null;
        ViewHolderHuoMain vh3= null;
        ViewHolderJingHuoMain vh4= null;
        int type = getItemViewType(i);
        if (convertView == null) {
            switch (type) {
                case TYPT_REAL_TIME:
                    convertView=View.inflate(context, R.layout.squareen_real_time_item,null);
                    vh1=new ViewHolderMain();
                    vh1.iv_real_time_iamge= (ImageView) convertView.findViewById(R.id.iv_real_time_iamge);
                    vh1.tv_title_id= (TextView) convertView.findViewById(R.id.tv_title_id);
                    vh1.iv_left_iamge_id= (ImageView) convertView.findViewById(R.id.iv_left_iamge_id);
                    vh1.tv_username_id= (TextView) convertView.findViewById(R.id.tv_username_id);
                    vh1.tv_squareen_time_id= (TextView) convertView.findViewById(R.id.tv_squareen_time_id);
                    vh1.tv_squareen_commentcount_id= (TextView) convertView.findViewById(R.id.tv_squareen_commentcount_id);
                   convertView.setTag(vh1);
                    break;
                case TYPT_REAL_TIME_JING:
                    convertView=View.inflate(context,R.layout.squareen_real_time_jing_item,null);
                    vh2=new ViewHolderJingMain();
                    vh2.iv_real_time_iamge= (ImageView) convertView.findViewById(R.id.iv_real_time_iamge);
                    vh2.tv_title_id= (TextView) convertView.findViewById(R.id.tv_title_id);
                    vh2.iv_left_iamge_id= (ImageView) convertView.findViewById(R.id.iv_left_iamge_id);
                    vh2.tv_username_id= (TextView) convertView.findViewById(R.id.tv_username_id);
                    vh2.tv_squareen_time_id= (TextView) convertView.findViewById(R.id.tv_squareen_time_id);
                    vh2.tv_squareen_commentcount_id= (TextView) convertView.findViewById(R.id.tv_squareen_commentcount_id);
                    convertView.setTag(vh2);
                    break;
                case TYPT_REAL_TIME_HUO:
                    convertView=View.inflate(context, R.layout.squareen_real_time_huo_item,null);
                    vh3=new ViewHolderHuoMain();
                    vh3.iv_real_time_iamge= (ImageView) convertView.findViewById(R.id.iv_real_time_iamge);
                    vh3.tv_title_id= (TextView) convertView.findViewById(R.id.tv_title_id);
                    vh3.iv_left_iamge_id= (ImageView) convertView.findViewById(R.id.iv_left_iamge_id);
                    vh3.tv_username_id= (TextView) convertView.findViewById(R.id.tv_username_id);
                    vh3.tv_squareen_time_id= (TextView) convertView.findViewById(R.id.tv_squareen_time_id);
                    vh3.tv_squareen_commentcount_id= (TextView) convertView.findViewById(R.id.tv_squareen_commentcount_id);
                    convertView.setTag(vh3);
                    break;
                case TYPT_REAL_TIME_JING_HUO:
                    convertView=View.inflate(context,R.layout.squareen_real_time_jing_huo_item,null);
                    vh4=new ViewHolderJingHuoMain();
                    vh4.iv_real_time_iamge= (ImageView) convertView.findViewById(R.id.iv_real_time_iamge);
                    vh4.tv_title_id= (TextView) convertView.findViewById(R.id.tv_title_id);
                    vh4.iv_left_iamge_id= (ImageView) convertView.findViewById(R.id.iv_left_iamge_id);
                    vh4.tv_username_id= (TextView) convertView.findViewById(R.id.tv_username_id);
                    vh4.tv_squareen_time_id= (TextView) convertView.findViewById(R.id.tv_squareen_time_id);
                    vh4.tv_squareen_commentcount_id= (TextView) convertView.findViewById(R.id.tv_squareen_commentcount_id);
                    convertView.setTag(vh4);
                    break;
            }
        } else {
            switch (type) {
                case TYPT_REAL_TIME:
                    vh1= (ViewHolderMain) convertView.getTag();
                    break;
                case TYPT_REAL_TIME_JING:
                    vh2= (ViewHolderJingMain) convertView.getTag();
                    break;
                case TYPT_REAL_TIME_HUO:
                    vh3= (ViewHolderHuoMain) convertView.getTag();
                    break;
                case TYPT_REAL_TIME_JING_HUO:
                    vh4= (ViewHolderJingHuoMain) convertView.getTag();
                    break;
            }
        }

        RealTime.ResultBean.ListBean listBean = lists.get(i);
        switch (type) {
            case TYPT_REAL_TIME:
                Picasso.with(context).load(listBean.getAvatar()).into(vh1.iv_real_time_iamge);
                vh1.tv_title_id.setText(listBean.getTitle());
                Picasso.with(context).load(listBean.getCover()).into(vh1.iv_left_iamge_id);
                vh1.tv_username_id.setText(listBean.getUserName());
                vh1.tv_squareen_time_id.setText(listBean.getLastPostTime());
                vh1.tv_squareen_commentcount_id.setText(listBean.getCommentCount());
                break;
            case TYPT_REAL_TIME_JING:
                Picasso.with(context).load(listBean.getAvatar()).into(vh2.iv_real_time_iamge);
                vh2.tv_title_id.setText(listBean.getTitle());
                Picasso.with(context).load(listBean.getCover()).into(vh2.iv_left_iamge_id);
                vh2.tv_username_id.setText(listBean.getUserName());
                vh2.tv_squareen_time_id.setText(listBean.getLastPostTime());
                vh2.tv_squareen_commentcount_id.setText(listBean.getCommentCount());
                break;
            case TYPT_REAL_TIME_HUO:
                Picasso.with(context).load(listBean.getAvatar()).into(vh3.iv_real_time_iamge);
                vh3.tv_title_id.setText(listBean.getTitle());
                Picasso.with(context).load(listBean.getCover()).into(vh3.iv_left_iamge_id);
                vh3.tv_username_id.setText(listBean.getUserName());
                vh3.tv_squareen_time_id.setText(listBean.getLastPostTime());
                vh3.tv_squareen_commentcount_id.setText(listBean.getCommentCount());
                break;
            case TYPT_REAL_TIME_JING_HUO:
                Picasso.with(context).load(listBean.getAvatar()).into(vh4.iv_real_time_iamge);
                vh4.tv_title_id.setText(listBean.getTitle());
                Picasso.with(context).load(listBean.getCover()).into(vh4.iv_left_iamge_id);
                vh4.tv_username_id.setText(listBean.getUserName());
                vh4.tv_squareen_time_id.setText(listBean.getLastPostTime());
                vh4.tv_squareen_commentcount_id.setText(listBean.getCommentCount());
                break;
        }

            return convertView;
        }

        private final class ViewHolderMain {
            private ImageView iv_real_time_iamge;
            private TextView tv_title_id;
            private ImageView iv_left_iamge_id;
            private TextView tv_username_id;
            private TextView tv_squareen_time_id;
            private TextView tv_squareen_commentcount_id;

        }

        private final class ViewHolderJingMain {
            private ImageView iv_real_time_iamge;
            private TextView tv_title_id;
            private ImageView iv_left_iamge_id;
            private TextView tv_username_id;
            private TextView tv_squareen_time_id;
            private TextView tv_squareen_commentcount_id;
        }

    private final class ViewHolderHuoMain{
        private ImageView iv_real_time_iamge;
        private TextView tv_title_id;
        private ImageView iv_left_iamge_id;
        private TextView tv_username_id;
        private TextView tv_squareen_time_id;
        private TextView tv_squareen_commentcount_id;
    }
    private final class ViewHolderJingHuoMain{
        private ImageView iv_real_time_iamge;
        private TextView tv_title_id;
        private ImageView iv_left_iamge_id;
        private TextView tv_username_id;
        private TextView tv_squareen_time_id;
        private TextView tv_squareen_commentcount_id;
    }

}