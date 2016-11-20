package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


import com.viewpagerindicator.TabPageIndicator;
import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.NewsRecommendGoodBean;

import org.w3c.dom.Text;
import org.xutils.x;

import java.util.List;


/**
 * Simple to Introduction
 *
 * @Description: 新品逻辑书写
 * @Author: 原海忠
 * @CreateDate: 2016/11/19
 * @Version: [v1.0]
 */
public class HomeNewProduct {
    private View view;
    private Context context;
    private ResultBean resultBean;
    private TextView userName;
    private NewsRecommendGoodBean newsRecommendGood;
    private TextView storeInfo;
    private TextView storeContent;
    private ImageView storeCoverUrl;
    private TextView storeTitle;
    private TextView storeDealPrice;
    private ViewPager mViewPagerTags;

    private List<ResultBean.TagsBean> tagsBeanList;
    private TabPageIndicator indicator;
    private List<ResultBean.TagsBean> tags;

    public HomeNewProduct(View view, Context context, ResultBean resultBean) {
        this.view = view;
        this.context = context;
        this.resultBean = resultBean;
        initView();
        initData();
    }

    private void initView() {
        newsRecommendGood = resultBean.getNewsRecommendGood();

        if (resultBean != null) {
            view.setVisibility(View.VISIBLE);
        }
        MySelfCircleView imgUrl = (MySelfCircleView) view.findViewById(R.id.mycirview_storelogourl);

        x.image().bind(imgUrl, newsRecommendGood.getImgUrl());
        userName = (TextView) view.findViewById(R.id.tv_store_userName);
        storeInfo = (TextView) view.findViewById(R.id.tv_info);
        storeContent = (TextView) view.findViewById(R.id.tv_content);
        storeCoverUrl = (ImageView) view.findViewById(R.id.iv_new_product_coverUrl);
        storeTitle = (TextView) view.findViewById(R.id.tv_new_product_title);
        storeDealPrice = (TextView) view.findViewById(R.id.tv_new_product_dealprice);
        mViewPagerTags = (ViewPager) view.findViewById(R.id.vp_new_product_viewpager);
        //        //初始化TabPageIndicator
        indicator = (TabPageIndicator) view.findViewById(R.id.vp_new_product_tags);

    }

    private void initData() {
        userName.setText(newsRecommendGood.getUserName());
        storeInfo.setText(newsRecommendGood.getInfo());//TODO
        storeContent.setText(newsRecommendGood.getContent());
        NewsRecommendGoodBean.GoodsBean goods = newsRecommendGood.getGoods();
        x.image().bind(storeCoverUrl, goods.getCoverUrl());
        storeTitle.setText("新品\t" + goods.getTitle());
        storeDealPrice.setText(goods.getDealPrice());
        tags = resultBean.getTags();

        mViewPagerTags.setAdapter(new TagsAdapter());
        indicator.setVisibility(View.VISIBLE);
        indicator.setViewPager(mViewPagerTags);


    }

    /**
     * ViewPager的操作
     */
    private void aboutViewPager() {
        //适配器


    }

    /**
     * viewPager 的适配器
     */
    private class TagsAdapter extends PagerAdapter {

        @Override
        public CharSequence getPageTitle(int position) {
            //            Log.i("Log", resultBean.getTags().get(position).getTitle());
            return tags.get(position).getTitle();
        }

        @Override
        public int getCount() {
            return tags.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = View.inflate(context, R.layout.home_news_grade, null);
            ImageView viewById = (ImageView) view.findViewById(R.id.iv_home_icon);
            x.image().bind(viewById, tags.get(position).getGoods().getCoverUrl());
//            Log.i("Log", tags.get(position).getGoods().getCoverUrl());
            TextView title = (TextView) view.findViewById(R.id.tv_title);
            title.setText(tags.get(position).getGoods().getTitle());
            TextView dealPrice = (TextView) view.findViewById(R.id.tv_deal_price);
            dealPrice.setText("¥"+tags.get(position).getGoods().getDealPrice());
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }
}