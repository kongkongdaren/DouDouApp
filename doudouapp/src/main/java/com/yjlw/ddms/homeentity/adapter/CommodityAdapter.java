package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.entity.DataBean;


import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import static android.view.View.X;

/**
 * Simple to Introduction
 *
 * @Description: 购买产品的详细信息适配器子类
 * @Author: 原海忠
 * @CreateDate: 2016/11/29
 * @Version: [v1.0]
 */
public class CommodityAdapter extends HomeCustomBaseAdapter<DataBean> {
    //    @ViewInject(R.id.iv_cover_Url)
    //    private ImageView coverUrl;//商品图片
    //    @ViewInject(R.id.product_subject)
    //    private TextView tvSubject;//商品标题
    //    @ViewInject(R.id.tv_goods_detail)
    //    private TextView tvInfo;//商品描述
    //    @ViewInject(R.id.product_price)
    //    private TextView tvPrice;//商品价格
//    @ViewInject(R.id.tv_money)
    //    private TextView tvMoney;//商品总价

    public CommodityAdapter(List<DataBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh = null;
        DataBean dataBean = lists.get(position);
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.pay_listview_item, null);
            vh = new ViewHolder();
            initView(vh, convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        x.image().bind(vh.coverUrl, dataBean.getCoverUrl());
        vh.title.setText(dataBean.getShopName());
        vh.subTitle.setText(dataBean.getSubTitle());
        vh.dealPrice.setText("¥"+dataBean.getPrice());
        vh.moneyTotal.setText("¥"+dataBean.getPrice()*dataBean.getCarNum());
        vh.carNum.setText("x"+dataBean.getCarNum());
        return convertView;
    }

    private void initView(ViewHolder vh, View convertView) {
        vh.coverUrl = (ImageView) convertView.findViewById(R.id.iv_cover_Url);
        vh.title = (TextView) convertView.findViewById(R.id.product_subject);
        vh.subTitle = (TextView) convertView.findViewById(R.id.tv_goods_detail);
        vh.dealPrice = (TextView) convertView.findViewById(R.id.product_price);
        vh.moneyTotal = (TextView) convertView.findViewById(R.id.tv_money);
        vh.carNum = (TextView) convertView.findViewById(R.id.product_carNum);
    }

    class ViewHolder {
        ImageView coverUrl;//店铺图片
        TextView title;//标题
        TextView subTitle;//子标题
        TextView dealPrice;//价钱
        TextView moneyTotal;//标价
        TextView carNum;//数量
    }
}