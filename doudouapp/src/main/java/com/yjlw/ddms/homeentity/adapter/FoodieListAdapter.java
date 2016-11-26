package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;


import com.yjlw.ddms.homeentity.activity.BuyProductActivity;
import com.yjlw.ddms.homeentity.activity.FoodieLikeActivity;
import com.yjlw.ddms.homeentity.activity.ProductCommentActivity;
import com.yjlw.ddms.homeentity.entity.FoodieLikeData.ResultBean.ListBean;
import com.yjlw.ddms.utils.ToastUtils;


import java.util.List;
import org.xutils.x;

import static com.baidu.platform.comapi.map.e.i;


/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/19
 * @Version: [v1.0]
 */
public class FoodieListAdapter extends HomeCustomBaseAdapter<ListBean> {

    public FoodieListAdapter(List<ListBean> lists, Context context) {
        super(lists, context);
        Log.i("Log", lists.toString());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final ListBean listBeans =lists.get(position);;
        ViewHolder vh = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.home_foodile_item, null);
            vh = new ViewHolder();
            initView(vh, convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        x.image().bind(vh.coverUrl, listBeans.getCoverUrl());
        vh.title.setText(listBeans.getTitle());
        vh.subTitle.setText(listBeans.getSubTitle());
        vh.storyAddress.setText(listBeans.getStoreAddress());
        vh.creatTime.setText(listBeans.getCreateTime());
        if (listBeans.getComments().size() == 2) {
            vh.comments0.setText(listBeans.getComments().get(0).getUserName() + ":" + listBeans
                    .getComments().get(0).getContent());

            vh.comments1.setText(listBeans.getComments().get(1).getUserName() + ":" + listBeans
                    .getComments().get(1).getContent());

        } else  if (listBeans.getComments().size() == 1){
            vh.comments0.setText(listBeans.getComments().get(0).getUserName() + ":" + listBeans
                    .getComments().get(0).getContent());
        }

        if(listBeans.getLabels().size()==1){
            vh.lablels0.setVisibility(View.VISIBLE);
            vh.lablels0.setText(listBeans.getLabels().get(0)+"");

        }else if(listBeans.getLabels().size()==2){
            vh.lablels0.setVisibility(View.VISIBLE);
            vh.lablels0.setText(listBeans.getLabels().get(0)+"");
            vh.lablels1.setVisibility(View.VISIBLE);
            vh.lablels1.setText(listBeans.getLabels().get(1)+"");
        }
        vh.cmtCount.setText(listBeans.getCmtCount() + "");
        vh.dealPrice.setText(listBeans.getDealPrice());
        vh.price.setText(listBeans.getPrice());
        vh.likeCount.setText(listBeans.getLikeCount()+"");
        vh.cmtCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ProductCommentActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("goodsid",listBeans.getGoodsId()+"");
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
        vh.price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
        vh.ivClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.showToast(context,"点赞了");

            }
        });
        //添加到购物车
        vh.openUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BuyProductActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("GoodsId", listBeans.getGoodsId()+"");

                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
        return convertView;
    }


    private void initView(ViewHolder vh, View convertView) {

        vh.coverUrl = (ImageView) convertView.findViewById(R.id.iv_coverUrl);
        vh.title = (TextView) convertView.findViewById(R.id.tv_Title);
        vh.subTitle = (TextView) convertView.findViewById(R.id.tv_subTitle);
        vh.storyAddress = (TextView) convertView.findViewById(R.id.tv_story_address);
        vh.creatTime = (TextView) convertView.findViewById(R.id.tv_creat_time);
        vh.ivClick = (ImageView) convertView.findViewById(R.id.iv_click);
        vh.likeCount = (TextView) convertView.findViewById(R.id.tv_like_count);
        vh.comments0 = (TextView) convertView.findViewById(R.id.tv_comments_0);
        vh.comments1 = (TextView) convertView.findViewById(R.id.tv_comments_1);
        vh.cmtCount = (TextView) convertView.findViewById(R.id.tv_cmt_count);

        vh.dealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);

        vh.price = (TextView) convertView.findViewById(R.id.tv_price);

        vh.lablels1 = (TextView) convertView.findViewById(R.id.tv_labels_1);
        vh.lablels0 = (TextView) convertView.findViewById(R.id.tv_labels_0);
        vh.openUrl= (ImageButton) convertView.findViewById(R.id.btn_openurl);

    }

    class ViewHolder {

        ImageView coverUrl;//店铺图片
        TextView title;//标题
        TextView subTitle;//子标题
        TextView storyAddress;//地址
        TextView creatTime;//地址
        ImageView ivClick;//点赞
        TextView likeCount;//点赞总数
        TextView comments0;//评论0
        TextView comments1;
        TextView cmtCount;//评论总数
        TextView dealPrice;//价钱
        TextView price;//标价
        TextView lablels0;//包邮
        TextView lablels1;//包邮
        ImageButton openUrl;//开始购买
//
    }
}