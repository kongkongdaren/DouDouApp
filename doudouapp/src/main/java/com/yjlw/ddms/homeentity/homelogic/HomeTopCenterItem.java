package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.DailySpecialGoodsBean;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.DailyFirstGoodsBean;

import org.xutils.x;


/**
 * Simple to Introduction
 *
 * @Description: 到家的头部加载书写
 * @Author: 原海忠
 * @CreateDate: 2016/11/19
 * @Version: [v1.0]
 */
public class HomeTopCenterItem {
    private View view;
    private Context context;
    private ResultBean resultBean;


    public HomeTopCenterItem(View view, Context context, ResultBean resultBean) {
        this.view = view;
        this.context = context;
        this.resultBean = resultBean;
        initData();
    }

    private void initData() {
        if (resultBean != null) {
            view.setVisibility(View.VISIBLE);
        }
        DailySpecialGoodsBean dailySpecialGoods = resultBean.getDailySpecialGoods();
        ImageView leftCoverUrl = (ImageView) view.findViewById(R.id.iv_center_coverurl);
        x.image().bind(leftCoverUrl, dailySpecialGoods.getCoverUrl());
        TextView leftTitle = (TextView) view.findViewById(R.id.tv_center_left_title);
        leftTitle.setText(dailySpecialGoods.getTitle());
        TextView leftPrice = (TextView) view.findViewById(R.id.tv_center_left_price);
        leftPrice.setText(dailySpecialGoods.getPrice());

        DailyFirstGoodsBean dailyFirstGoods = resultBean.getDailyFirstGoods();
        ImageView rightCoverUrl = (ImageView) view.findViewById(R.id.iv_center_right_coverurl);
        x.image().bind(rightCoverUrl, dailyFirstGoods.getCoverUrl());
        TextView rightTitle = (TextView) view.findViewById(R.id.tv_center_right_title);
        rightTitle.setText(dailyFirstGoods.getTitle());
        TextView rightLabel = (TextView) view.findViewById(R.id.tv_center_right_label);
        rightLabel.setText(dailyFirstGoods.getLabel());


        ResultBean.OneHourGoodsBean oneHourGoods = resultBean.getOneHourGoods();
        ImageView starCoverUrl = (ImageView) view.findViewById(R.id
                .iv_center_right_bottom_coverurl);
        x.image().bind(starCoverUrl, oneHourGoods.getCoverUrl());
        TextView starTitle = (TextView) view.findViewById(R.id.tv_center_star_title);
        starTitle.setText(oneHourGoods.getTitle());
        TextView starLabel = (TextView) view.findViewById(R.id.tv_center_right_bottom_label);
        starLabel.setText(oneHourGoods.getLabel());
    }
}