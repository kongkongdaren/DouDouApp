package com.yjlw.ddms.homeentity.adapter;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.homeentity.entity.BuyProductInFosData.ResultBean.RelationShopListBean.ListBean;
import com.yjlw.ddms.R;

import org.xutils.x;

import java.util.List;

import static android.R.attr.data;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/26
 * @Version: [v1.0]
 */
public class StoreRecyclerViewAdapter extends RecyclerView.Adapter<StoreRecyclerViewAdapter
        .ViewHolder> {
    private List<ListBean> datas = null;

    public StoreRecyclerViewAdapter(List<ListBean> datas) {
        this.datas = datas;
        Log.i("Log", "传过来的数据是" + datas.toString());
    }

    //创建新View，被LayoutManager所调用
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                .home_recycler_view_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    //将数据与界面进行绑定的操作
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        ListBean listBean = datas.get(position);
        x.image().bind(viewHolder.coverUrl, listBean.getCoverUrl());
        viewHolder.title.setText(listBean.getTitle());
        viewHolder.price.setText(listBean.getPrice());
        viewHolder.price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
        viewHolder.dealPrice.setText(listBean.getDealPrice());
        if (listBean.getLabels().size()!=0) {
            viewHolder.labels0.setVisibility(View.VISIBLE);
        }
    }

    //获取数据的数量
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView coverUrl;
        public TextView title;
        public TextView price;
        public ImageView labels0;
        public TextView dealPrice;
        public ImageView buyProduct;

        public ViewHolder(View view) {
            super(view);
            coverUrl = (ImageView) view.findViewById(R.id.iv_cover_url);
            title = (TextView) view.findViewById(R.id.tv_title);
            price = (TextView) view.findViewById(R.id.tv_price);
            labels0 = (ImageView) view.findViewById(R.id.tv_labels0);
            dealPrice = (TextView) view.findViewById(R.id.tv_deal_price);
            buyProduct = (ImageView) view.findViewById(R.id.iv_buy_product);

        }
    }
}