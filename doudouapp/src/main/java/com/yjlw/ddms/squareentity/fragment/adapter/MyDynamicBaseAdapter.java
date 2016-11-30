package com.yjlw.ddms.squareentity.fragment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.Dynamic;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;


/**
 * Description：动态的自定义适配器<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 6:58
 *
 * @author 李磊
 * @version : 1.0
 */

public class MyDynamicBaseAdapter extends HomeCustomBaseAdapter<Dynamic.ResultBean.ListBean> {
    private final int TYPE_CNT = 2; //布局文件的类型
    private final int TYPT_MAIN = 0;
    private final int TYPT_COMMENT_MAIN = 1;

    public MyDynamicBaseAdapter(List<Dynamic.ResultBean.ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public int getViewTypeCount() {
        return TYPE_CNT;
    }

    @Override
    public int getItemViewType(int position) {
        if(lists.get(position).getData().getCommentList().size()==2){
            return TYPT_COMMENT_MAIN;
        }else{
            return TYPT_MAIN;
        }
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolderMain vh1=null;
        ViewHolderCommentMain vh2=null;
        int type = getItemViewType(i);
        if(convertView==null){
            switch(type){
                case TYPT_MAIN:
                    convertView=View.inflate(context,R.layout.squareen_dynamic_main,null);
                    vh1=new ViewHolderMain();
                    vh1.iv_dynamic_image_id= (ImageView) convertView.findViewById(R.id.iv_dynamic_image_id);
                    vh1.tv_dynamic_username_id= (TextView) convertView.findViewById(R.id.tv_dynamic_username_id);
                    vh1.tv_dynamic_user_content_id= (TextView) convertView.findViewById(R.id.tv_dynamic_user_content_id);
                    vh1.tv_dynamic_data_content_id= (TextView) convertView.findViewById(R.id.tv_dynamic_data_content_id);
                    vh1.iv_dynamic_result_image_id= (ImageView) convertView.findViewById(R.id.iv_dynamic_result_image_id);
                    vh1.tv_dynamic_title_id= (TextView) convertView.findViewById(R.id.tv_dynamic_title_id);
                    vh1.tv_dynamic_content_id= (TextView) convertView.findViewById(R.id.tv_dynamic_content_id);
                    vh1.tv_dynamic_date_id= (TextView) convertView.findViewById(R.id.tv_dynamic_date_id);
                    vh1.tv_dynamic_dianzan_count_id= (TextView) convertView.findViewById(R.id.tv_dynamic_dianzan_count_id);
                    vh1.tv_dynamic_pinlun_count_id= (TextView) convertView.findViewById(R.id.tv_dynamic_pinlun_count_id);
                    convertView.setTag(vh1);
                    break;
                case TYPT_COMMENT_MAIN:
                    convertView=View.inflate(context,R.layout.squareen_dynamic_commentmain,null);
                    vh2=new ViewHolderCommentMain();
                    vh2.iv_dynamic_image_id= (ImageView) convertView.findViewById(R.id.iv_dynamic_image_id);
                    vh2.tv_dynamic_username_id= (TextView) convertView.findViewById(R.id.tv_dynamic_username_id);
                    vh2.tv_dynamic_user_content_id= (TextView) convertView.findViewById(R.id.tv_dynamic_user_content_id);
                    vh2.tv_dynamic_data_content_id= (TextView) convertView.findViewById(R.id.tv_dynamic_data_content_id);
                    vh2.iv_dynamic_result_image_id= (ImageView) convertView.findViewById(R.id.iv_dynamic_result_image_id);
                    vh2.tv_dynamic_title_id= (TextView) convertView.findViewById(R.id.tv_dynamic_title_id);
                    vh2.tv_dynamic_content_id= (TextView) convertView.findViewById(R.id.tv_dynamic_content_id);
                    vh2.tv_dynamic_date_id= (TextView) convertView.findViewById(R.id.tv_dynamic_date_id);
                    vh2.tv_dynamic_dianzan_count_id= (TextView) convertView.findViewById(R.id.tv_dynamic_dianzan_count_id);
                    vh2.tv_dynamic_pinlun_count_id= (TextView) convertView.findViewById(R.id.tv_dynamic_pinlun_count_id);
                    vh2.tv_dynamic_pinglun_username1_id= (TextView) convertView.findViewById(R.id.tv_dynamic_pinglun_username1_id);
                    vh2.tv_dynamic_pinglun_content1_id= (TextView) convertView.findViewById(R.id.tv_dynamic_pinglun_content1_id);
                    vh2.tv_dynamic_pinglun_username2_id= (TextView) convertView.findViewById(R.id.tv_dynamic_pinglun_username2_id);
                    vh2.tv_dynamic_pinglun_content2_id= (TextView) convertView.findViewById(R.id.tv_dynamic_pinglun_content2_id);
                    convertView.setTag(vh2);
                    break;
            }
        }else{
            switch(type){
                case TYPT_MAIN:
                    vh1= (ViewHolderMain) convertView.getTag();
                    break;
                case TYPT_COMMENT_MAIN:
                    vh2= (ViewHolderCommentMain) convertView.getTag();
                    break;
            }
        }

        Dynamic.ResultBean.ListBean listBean = lists.get(i);
        Dynamic.ResultBean.ListBean.DataBean data = listBean.getData();
        Dynamic.ResultBean.ListBean.UserInfoBean userInfo = listBean.getUserInfo();
        switch(type){
            case TYPT_MAIN:
                Picasso.with(context).load(userInfo.getAvatar()).into(vh1.iv_dynamic_image_id);
                vh1.tv_dynamic_username_id.setText(userInfo.getUserName());
                vh1.tv_dynamic_user_content_id.setText(userInfo.getIntro());
                vh1.tv_dynamic_data_content_id.setText(data.getCmtContent());
                Picasso.with(context).load(data.getImg()).into(vh1.iv_dynamic_result_image_id);
                vh1.tv_dynamic_title_id.setText(data.getTitle());
                vh1.tv_dynamic_content_id.setText(data.getContent());
                vh1.tv_dynamic_date_id.setText(data.getCreateTime());
                vh1.tv_dynamic_dianzan_count_id.setText(data.getDiggCnt()+"");
                vh1.tv_dynamic_pinlun_count_id.setText(data.getCommentCnt()+"");
                break;
            case TYPT_COMMENT_MAIN:
                Picasso.with(context).load(userInfo.getAvatar()).into(vh2.iv_dynamic_image_id);
                vh2.tv_dynamic_username_id.setText(userInfo.getUserName());
                vh2.tv_dynamic_user_content_id.setText(userInfo.getIntro());
                vh2.tv_dynamic_data_content_id.setText(data.getCmtContent());
                Picasso.with(context).load(data.getImg()).into(vh2.iv_dynamic_result_image_id);
                vh2.tv_dynamic_title_id.setText(data.getTitle());
                vh2.tv_dynamic_content_id.setText(data.getContent());
                vh2.tv_dynamic_date_id.setText(data.getCreateTime());
                vh2.tv_dynamic_dianzan_count_id.setText(data.getDiggCnt()+"");
                vh2.tv_dynamic_pinlun_count_id.setText(data.getCommentCnt()+"");
                vh2.tv_dynamic_pinglun_username1_id.setText(data.getCommentList().get(0).getUserName()+": ");
                vh2.tv_dynamic_pinglun_content1_id.setText(data.getCommentList().get(0).getContent());
                vh2.tv_dynamic_pinglun_username2_id.setText(data.getCommentList().get(1).getUserName()+": ");
                vh2.tv_dynamic_pinglun_content2_id.setText(data.getCommentList().get(1).getContent());
                break;
        }

            return convertView;
        }

    private final class ViewHolderMain {
        private ImageView iv_dynamic_image_id;
        private TextView tv_dynamic_username_id;
        private TextView tv_dynamic_user_content_id;
        private TextView tv_dynamic_data_content_id;
        private ImageView iv_dynamic_result_image_id;
        private TextView tv_dynamic_title_id;
        private TextView tv_dynamic_content_id;
        private TextView tv_dynamic_date_id;
        private TextView tv_dynamic_dianzan_count_id;
        private TextView tv_dynamic_pinlun_count_id;

    }

        private final class ViewHolderCommentMain {
            private ImageView iv_dynamic_image_id;
            private TextView tv_dynamic_username_id;
            private TextView tv_dynamic_user_content_id;
            private TextView tv_dynamic_data_content_id;
            private ImageView iv_dynamic_result_image_id;
            private TextView tv_dynamic_title_id;
            private TextView tv_dynamic_content_id;
            private TextView tv_dynamic_date_id;
            private TextView tv_dynamic_dianzan_count_id;
            private TextView tv_dynamic_pinlun_count_id;
            private TextView tv_dynamic_pinglun_username1_id;
            private TextView tv_dynamic_pinglun_content1_id;
            private TextView tv_dynamic_pinglun_username2_id;
            private TextView tv_dynamic_pinglun_content2_id;

        }

}