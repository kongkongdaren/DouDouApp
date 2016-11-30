package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.activity.BuyProductActivity;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.FoodieFavoriteGoodsBean;

import org.xutils.x;

import java.util.List;


/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/19
 * @Version: [v1.0]
 */
public class strollGridViewAdapter extends HomeCustomBaseAdapter<FoodieFavoriteGoodsBean> {
    public strollGridViewAdapter(List<FoodieFavoriteGoodsBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final FoodieFavoriteGoodsBean goodsBean = getItem(position);
        ViewHolder vh = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.home_gridview_item, null);
            vh = new ViewHolder();
            vh.ivCoverUrl = (ImageView) convertView.findViewById(R.id.iv_cover_url);
            vh.tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
            vh.Price = (TextView) convertView.findViewById(R.id.tv_price);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        x.image().bind(vh.ivCoverUrl, goodsBean.getCoverUrl());
        vh.tvTitle.setText(goodsBean.getTitle());
        vh.Price.setText(goodsBean.getPrice());
        vh.Price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BuyProductActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("GoodsId", goodsBean.getGoodsId()+"");

                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });
        return convertView;
    }

    class ViewHolder {
        ImageView ivCoverUrl;//头像
        TextView tvTitle;//店铺名
        TextView Price;//电商名
    }
}