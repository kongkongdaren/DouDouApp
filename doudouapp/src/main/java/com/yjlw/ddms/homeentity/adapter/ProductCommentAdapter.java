package com.yjlw.ddms.homeentity.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.entity.ProductCommentData.ResultBean.ListBean;

import org.xutils.x;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/26
 * @Version: [v1.0]
 */
public class ProductCommentAdapter extends HomeCustomBaseAdapter<ListBean> {
    public ProductCommentAdapter(List<ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh = null;
        ListBean listBean = lists.get(position);
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.product_comment_item, null);
            vh = new ViewHolder();
            initView(vh, convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        x.image().bind(vh.avatar,listBean.getAvatar());
        vh.userName.setText(listBean.getUserName());
        vh.mark.setText(listBean.getMark()+".0评分");
        vh.createTime.setText(listBean.getCreateTime());
        vh.content.setText(listBean.getContent());
        return convertView;
    }

    private void initView(ViewHolder vh, View convertView) {
        vh.avatar = (MySelfCircleView) convertView.findViewById(R.id.iv_avatar);
        vh.userName = (TextView) convertView.findViewById(R.id.tv_user_name);
        vh.mark = (TextView) convertView.findViewById(R.id.tv_mark);
        vh.createTime = (TextView) convertView.findViewById(R.id.tv_create_time);
        vh.content = (TextView) convertView.findViewById(R.id.tv_content);

    }

    class ViewHolder {

        MySelfCircleView avatar;//用户头像
        TextView userName;//用户名
        TextView mark;//评分
        TextView createTime;//评论时间
        TextView content;//内容

    }
}