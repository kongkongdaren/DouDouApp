package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;

import com.yjlw.ddms.homeentity.activity.BuyProductActivity;
import com.yjlw.ddms.homeentity.entity.SalePriceBean.ResultBean.ListBean;

import org.xutils.x;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 特价
 * @Author: 原海忠
 * @CreateDate: 2016/11/25
 * @Version: [v1.0]
 */
public class BargainPriceAdapter extends HomeCustomBaseAdapter<ListBean> {
    public BargainPriceAdapter(List<ListBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh = null;
        ListBean item = getItem(position);
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.home_top_listview_item, null);
            vh = new ViewHolder();
            initView(vh, convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        x.image().bind(vh.coverUrl, item.getCoverUrl());
        vh.storeTitle.setText(item.getTitle());
        vh.stock.setText(item.getStock());
        vh.dealPrice.setText(item.getDealPrice());
        vh.price.setText(item.getPrice());
        vh.price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
        vh.buyProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, BuyProductActivity.class));
            }
        });
        return convertView;
    }

    private void initView(ViewHolder vh, View convertView) {
        vh.coverUrl = (ImageView) convertView.findViewById(R.id.iv_coverUrl);
        vh.storeTitle = (TextView) convertView.findViewById(R.id.tv_title);
        vh.price = (TextView) convertView.findViewById(R.id.tv_price);
        vh.labels= (TextView) convertView.findViewById(R.id.tv_labels);
        vh.dealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);
        vh.stock = (TextView) convertView.findViewById(R.id.tv_stock);
        vh.buyProduct= (TextView) convertView.findViewById(R.id.tv_begin_buy);


    }

    class ViewHolder {
        TextView storeTitle;//店铺名
        ImageView coverUrl;//店铺图片
        TextView labels;//包邮
        TextView dealPrice;//价钱
        TextView price;//标价
        TextView stock;//剩余
        TextView buyProduct;
    }
}