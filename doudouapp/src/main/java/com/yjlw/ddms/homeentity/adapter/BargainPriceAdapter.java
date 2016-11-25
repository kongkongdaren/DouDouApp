package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.entity.SalePriceBean.ResultBean.ListBean;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
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
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.home_top_listview_item, null);
            vh = new ViewHolder();
            initView(vh, convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    private void initView(ViewHolder vh, View convertView) {

    }

    class ViewHolder {

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