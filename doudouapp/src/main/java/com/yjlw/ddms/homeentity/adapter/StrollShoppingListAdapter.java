package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.activity.BuyProductActivity;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.ListBean;

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
public class StrollShoppingListAdapter extends HomeCustomBaseAdapter<ListBean> {

public StrollShoppingListAdapter(List<ListBean> lists, Context context) {
        super(lists, context);
        }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
      ListBean strollShopping = getItem(position);
        ViewHolder vh = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.scroll_shopping_list_item, null);
            vh = new ViewHolder();
            initView(vh, convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        x.image().bind(vh.storeLogoUrl, strollShopping.getStoreLogoUrl());
        vh.storeTitle.setText(strollShopping.getStoreTitle());
        vh.userName.setText(strollShopping.getUserName());
        vh.stock.setText("剩余" + strollShopping.getStock() + "份");
        x.image().bind(vh.coverUrl, strollShopping.getCoverUrl());
        vh.title.setText(strollShopping.getTitle());
        vh.subTitle.setText(strollShopping.getSubTitle());
        vh.dealPrice.setText(strollShopping.getDealPrice());
        vh.price.setText(strollShopping.getPrice());
        vh.price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
        //开始购买
        vh.openUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, BuyProductActivity.class));
            }
        });
        return convertView;
    }


    private void initView(ViewHolder vh, View convertView) {
        vh.storeLogoUrl = (MySelfCircleView) convertView.findViewById(R.id.mycirview_storelogourl);
        vh.storeTitle = (TextView) convertView.findViewById(R.id.tv_store_title);
        vh.userName = (TextView) convertView.findViewById(R.id.tv_user_name);
        vh.stock = (TextView) convertView.findViewById(R.id.tv_stock);
        vh.coverUrl = (ImageView) convertView.findViewById(R.id.iv_coverUrl);
        vh.title = (TextView) convertView.findViewById(R.id.tv_Title);
        vh.subTitle = (TextView) convertView.findViewById(R.id.tv_subTitle);
        vh.dealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);
        vh.price = (TextView) convertView.findViewById(R.id.tv_price);
        vh.openUrl = (Button) convertView.findViewById(R.id.btn_openurl);
    }

    class ViewHolder {
        MySelfCircleView storeLogoUrl;//头像
        TextView storeTitle;//店铺名
        TextView userName;//电商名
        TextView stock;//剩余
        ImageView coverUrl;//店铺图片
        TextView title;//标题
        TextView subTitle;//子标题
        TextView dealPrice;//价钱
        TextView price;//标价
        Button openUrl;//店铺立即购买
    }
}