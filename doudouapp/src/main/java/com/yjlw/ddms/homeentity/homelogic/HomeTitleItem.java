package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.activity.BuyProductActivity;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.homeentity.entity.LabelDetailsResult;
import com.yjlw.ddms.homeentity.entity.LabelDetailsResult.ResultBean.ListBean;

import org.xutils.x;

import java.util.List;

import static android.R.id.list;

/**
 * Simple to Introduction
 *
 * @Description: 到家的标签导航详情界面书写
 * @Author: 原海忠
 * @CreateDate: 2016/11/23
 * @Version: [v1.0]
 */
public class HomeTitleItem {
    private List<ListBean> listBeen;
    private Context context;
    private ListView mLv;

    public HomeTitleItem(ListView listView, List<ListBean> listBeen, Context context) {
        this.listBeen = listBeen;
        this.context = context;
        this.mLv = listView;
        aboutTitle();
    }

    private void aboutTitle() {
        //控件实例的获取
        aboutListView();
    }

    private void aboutListView() {
        TitleItemBasAdapter adapter = new TitleItemBasAdapter(listBeen, context);
        mLv.setAdapter(adapter);
    }

    private class TitleItemBasAdapter extends HomeCustomBaseAdapter<ListBean> {

        public TitleItemBasAdapter(List<ListBean> lists, Context context) {
            super(lists, context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            final ListBean listBean = getItem(position);
            ViewHolder vh = null;
            if (convertView == null) {
                convertView = View.inflate(context, R.layout.home_lable_details_item, null);
                vh = new ViewHolder();
                initView(vh, convertView);
                convertView.setTag(vh);
            } else {
                vh = (ViewHolder) convertView.getTag();
            }
            x.image().bind(vh.storeLogoUrl, listBean.getStoreLogoUrl());
            vh.storeTitle.setText(listBean.getStoreTitle());
            vh.userName.setText(listBean.getUserName());

            x.image().bind(vh.coverUrl, listBean.getCoverUrl());
            vh.title.setText(listBean.getTitle());
            vh.subTitle.setText(listBean.getSubTitle());
            vh.dealPrice.setText(listBean.getDealPrice());
            vh.price.setText("原价:" + listBean.getPrice());
            vh.price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
            List<String> labels = listBean.getLabels();
            if (labels.size() == 1) {
                vh.LabelsExp.setText(labels.get(0));
                vh.LabelsExp.setVisibility(View.VISIBLE);
            } else if (labels.size() == 2) {
                vh.activityPrice.setText(labels.get(0));
                vh.LabelsExp.setText(labels.get(1));
                vh.LabelsExp.setVisibility(View.VISIBLE);
                vh.activityPrice.setVisibility(View.VISIBLE);
            }
            vh.openUrl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, BuyProductActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("GoodsId", listBean.getGoodsId()+"");

                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            });
            return convertView;
        }


        private void initView(ViewHolder vh, View convertView) {
            vh.storeLogoUrl = (MySelfCircleView) convertView.findViewById(R.id
                    .mycirview_storelogourl);
            vh.storeTitle = (TextView) convertView.findViewById(R.id.tv_store_title);
            vh.userName = (TextView) convertView.findViewById(R.id.tv_user_name);
            //            vh.stock = (TextView) convertView.findViewById(R.id.tv_stock);
            vh.coverUrl = (ImageView) convertView.findViewById(R.id.iv_coverUrl);
            vh.title = (TextView) convertView.findViewById(R.id.tv_Title);
            vh.subTitle = (TextView) convertView.findViewById(R.id.tv_subTitle);
            vh.dealPrice = (TextView) convertView.findViewById(R.id.tv_deal_price);
            vh.price = (TextView) convertView.findViewById(R.id.tv_price);
            vh.activityPrice = (TextView) convertView.findViewById(R.id.tv_labels_Activity_price);
            vh.LabelsExp = (TextView) convertView.findViewById(R.id.tv_labels_exp);
            vh.openUrl = (ImageButton) convertView.findViewById(R.id.btn_openurl);
        }

        class ViewHolder {
            MySelfCircleView storeLogoUrl;//头像
            TextView storeTitle;//店铺名
            TextView userName;//电商名
            ImageView coverUrl;//店铺图片
            TextView title;//标题
            TextView subTitle;//子标题
            TextView dealPrice;//价钱
            TextView price;//标价
            TextView activityPrice;//活动价
            TextView LabelsExp;//包邮
            ImageButton openUrl;//店铺立即购买
        }
    }
}