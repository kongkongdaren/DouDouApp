package com.yjlw.ddms.homeentity.fragment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.admom.mygreendaotest.ShoppingCartDataDao;
import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.application.xUtilsApplication;
import com.yjlw.ddms.common.Constant;

import com.yjlw.ddms.homeentity.activity.CateActivity;
import com.yjlw.ddms.homeentity.activity.EveryBargainPriceActivity;
import com.yjlw.ddms.homeentity.activity.FoodieLikeActivity;
import com.yjlw.ddms.homeentity.activity.ShoppingCartActivity;
import com.yjlw.ddms.homeentity.adapter.StrollShoppingListAdapter;
import com.yjlw.ddms.homeentity.adapter.strollGridViewAdapter;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.CateListBean;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.ListBean;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.FoodieFavoriteGoodsBean;
import com.yjlw.ddms.homeentity.homelogic.HomeAboutTitle;
import com.yjlw.ddms.homeentity.homelogic.HomeNewProduct;
import com.yjlw.ddms.homeentity.homelogic.HomeTopCenterItem;
import com.yjlw.ddms.homeentity.views.HomeTitleItemView;
import com.yjlw.ddms.homeentity.views.RefreshListView;
import com.yjlw.ddms.utils.ToastUtils;

import org.greenrobot.greendao.query.Query;
import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

import static android.view.View.inflate;

/**
 * Description：到家 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月16  17:58
 *
 * @author 原海忠
 * @version : 1.0
 */

public class HomeFragment extends Fragment {

    private View view;
    private LinearLayout llArrveTitle;//标签栏
    private RefreshListView lvHomeArrave;//ListVeiw 布局
    private List<CateListBean> cateLists = new LinkedList<>();
    ;
    private List<ListBean> strollShoppings = new LinkedList<>();//逛逛的数据
    private SecondPageResult secondPageResult;
    private StrollShoppingListAdapter strollShoppingAdapter;
    private ProgressBar pbContent;
    private List<FoodieFavoriteGoodsBean> foodieFavoriteGoods = new LinkedList<>();
    private GridView gvFood;
    private com.yjlw.ddms.homeentity.adapter.strollGridViewAdapter strollGridViewAdapter;
    private View homeCenterFoodItem;
    private ImageView coverUrl;
    private TextView title;
    private TextView price;
    private View homeCenterView;
    private HomeTitleItemView itemView;
    private View titleItem;
    private View brandStory;
    private View brandTitleItem;
    private View newProductView;
    private HomeTitleItemView newProductTitle;
    private FloatingActionButton flactionBtn;
    private SQLiteDatabase db;
    private ShoppingCartDataDao dao;
    private int count;
    private TextView shoppingCount;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        xUtilsApplication application = (xUtilsApplication) getActivity().getApplication();
        db = application.getDb();
        dao = application.getDaoSession().getShoppingCartDataDao();
        Cursor cursor = db.query(dao.getTablename(), dao.getAllColumns(), null, null, null, null,
                null);
        count = cursor.getCount();
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_home_arrive, null);
        shoppingCount = (TextView) view.findViewById(R.id.tv_shopping_cart_count);
        llArrveTitle = (LinearLayout) view.findViewById(R.id.ll_home_arrive_title);
        lvHomeArrave = (RefreshListView) view.findViewById(R.id.lv_home_arrive);
        pbContent = (ProgressBar) view.findViewById(R.id.pb_content);
        flactionBtn = (FloatingActionButton) view.findViewById(R.id.flaction_btn);

        homeCenterView = inflate(getContext(), R.layout.home_centeri_tem, null);
        lvHomeArrave.addHeaderView(homeCenterView);//给ListView添加头布局
        RelativeLayout salePrice = (RelativeLayout) homeCenterView.findViewById(R.id.ll_sale_price);
        salePrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), EveryBargainPriceActivity.class));
            }
        });

        LinearLayout cateStore = (LinearLayout) homeCenterView.findViewById(R.id.ll_cate_store);
        cateStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), CateActivity.class));
            }
        });
        homeCenterFoodItem = inflate(getContext(), R.layout.home_center_food_item, null);//吃货最爱
        itemView = (HomeTitleItemView) homeCenterFoodItem.findViewById(R.id.home_food);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), FoodieLikeActivity.class));
            }
        });
        TextView foodTitle = (TextView) itemView.findViewById(R.id.tv_center_title);
        ImageView foodIocn = (ImageView) itemView.findViewById(R.id.iv_home_icon);
        foodTitle.setText("吃货最爱");
        foodIocn.setImageResource(R.mipmap.ico_favorite_version);
        gvFood = (GridView) homeCenterFoodItem.findViewById(R.id.gv_food);
        lvHomeArrave.addHeaderView(homeCenterFoodItem);//添加中间布局
        //品牌故事
        brandStory = inflate(getContext(), R.layout.home_brand_story, null);
        brandTitleItem = brandStory.findViewById(R.id.home_brand_title_item);
        TextView brandTitle = (TextView) brandTitleItem.findViewById(R.id.tv_center_title);
        ImageView brandIocn = (ImageView) brandTitleItem.findViewById(R.id.iv_home_icon);
        brandTitle.setText("品牌故事");
        brandIocn.setImageResource(R.mipmap.ico_brand_story);
        lvHomeArrave.addHeaderView(brandStory);
        //新品
        newProductView = inflate(getContext(), R.layout.home_new_product, null);
        newProductTitle = (HomeTitleItemView) newProductView.findViewById(R.id.new_product);
        TextView newProTitle = (TextView) newProductTitle.findViewById(R.id.tv_center_title);
        ImageView newProIocn = (ImageView) newProductTitle.findViewById(R.id.iv_home_icon);
        newProTitle.setText("新品");
        newProIocn.setImageResource(R.mipmap.ico_new_product);
        lvHomeArrave.addHeaderView(newProductView);
        //逛逛
        this.titleItem = inflate(getContext(), R.layout.home_listviewtitle_item, null);
        TextView title = (TextView) this.titleItem.findViewById(R.id.tv_center_title);
        ImageView titleIcon = (ImageView) this.titleItem.findViewById(R.id.iv_home_icon);
        titleIcon.setImageResource(R.mipmap.ico_mybrowse);
        title.setText("逛逛");
        lvHomeArrave.addHeaderView(this.titleItem);
        dataLoadSecondPageData();//初始化数据

        return this.view;
    }

    @Override
    public void onStart() {
        Cursor cursor = db.query(dao.getTablename(), dao.getAllColumns(), null, null, null, null,
                null);
        count = cursor.getCount();
        if (count != 0) {
            shoppingCount.setVisibility(View.VISIBLE);
            shoppingCount.setText(count + "");
        }else if(count==0) {
            shoppingCount.setVisibility(View.INVISIBLE);

        }
        super.onStart();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        if (count != 0) {
            shoppingCount.setVisibility(View.VISIBLE);
            shoppingCount.setText(count + "");
        }
        aboutListView();
        aboutGridView();
        coverUrl = (ImageView) homeCenterFoodItem.findViewById(R.id.iv_cover_url);
        title = (TextView) homeCenterFoodItem.findViewById(R.id.tv_title);
        price = (TextView) homeCenterFoodItem.findViewById(R.id.tv_price);
        flactionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ShoppingCartActivity.class));

            }
        });
        super.onActivityCreated(savedInstanceState);
    }


    /**
     * 下载数据
     */
    private void dataLoadSecondPageData() {
        String url = Constant.SECOND_PAGE;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        params.addBodyParameter("Latitude", "39.913249");
        params.addBodyParameter("Longitude", "116.403625");

        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                parserSecondPageData(s, false);
                lvHomeArrave.onRefreshComplete(true);
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * 解析数据
     *
     * @param s
     * @param b
     */
    private void parserSecondPageData(String s, boolean b) {
        Gson gson = new Gson();
        secondPageResult = gson.fromJson(s, SecondPageResult.class);
        //吃货最爱
        List<FoodieFavoriteGoodsBean> goodsBeens = secondPageResult.getResult()
                .getFoodieFavoriteGoods();
        //        foodieFavoriteGoods.addAll(goodsBeens);
        x.image().bind(coverUrl, goodsBeens.get(0).getCoverUrl());
        title.setText(goodsBeens.get(0).getTitle());
        price.setText(goodsBeens.get(0).getPrice());
        //品牌故事
        SecondPageResult.ResultBean.BrandStoreBean brandStore = secondPageResult.getResult()
                .getBrandStore();
        ImageView brandImgUrl = (ImageView) brandStory.findViewById(R.id.iv_brand_imgUrl);
        TextView brandTitle = (TextView) brandStory.findViewById(R.id.tv_brand_title);
        brandTitle.setVisibility(View.VISIBLE);
        brandTitle.setText(brandStore.getTitle());
        x.image().bind(brandImgUrl, brandStore.getImgUrl());
        //新品


        for (int i = 1; i < goodsBeens.size(); i++) {
            FoodieFavoriteGoodsBean goodsBean = goodsBeens.get(i);
            if (foodieFavoriteGoods.contains(goodsBean) == true) {
                break;
            } else {
                foodieFavoriteGoods.add(goodsBean);
            }
        }
        strollGridViewAdapter.notifyDataSetChanged();
        //标签导航

        SecondPageResult.ResultBean result = secondPageResult.getResult();
        List<CateListBean> cateList = secondPageResult.getResult().getCateList();

        for (int i = 0; i < cateList.size(); i++) {
            CateListBean cateListData = cateList.get(i);
            if (cateLists.contains(cateListData) == true) {
                break;
            } else {
                cateLists.addAll(cateList);
                new HomeAboutTitle(cateLists, getContext(), llArrveTitle);//标签导航页面的逻辑书写
                aboutTitle();
            }
        }

        new HomeNewProduct(newProductView, getContext(), result);
        new HomeTopCenterItem(homeCenterView, getContext(), result);
        List<ListBean> strollShopping = secondPageResult.getResult().getList();
        //逛逛的数据
        for (int i = 0; i < strollShopping.size(); i++) {
            ListBean listBean = strollShopping.get(i);
            if (strollShoppings.contains(listBean) == true) {
                break;
            } else {
                strollShoppings.addAll(strollShopping);
            }
        }
    }

    /**
     * 关于标题的操作
     */
    private void aboutTitle() {
        if (cateLists.size() != 0) {
            llArrveTitle.setVisibility(View.VISIBLE);
            itemView.setVisibility(View.VISIBLE);
            titleItem.setVisibility(View.VISIBLE);
            pbContent.setVisibility(View.INVISIBLE);
            brandTitleItem.setVisibility(View.VISIBLE);
            newProductTitle.setVisibility(View.VISIBLE);
        }

    }

    /**
     * 关于GridView的操作
     */
    private void aboutGridView() {

        strollGridViewAdapter = new strollGridViewAdapter(foodieFavoriteGoods, getContext());
        gvFood.setAdapter(strollGridViewAdapter);
    }

    /**
     * 关于ListView的操作
     */
    private void aboutListView() {

        strollShoppingAdapter = new StrollShoppingListAdapter(strollShoppings, getContext());
        lvHomeArrave.setAdapter(strollShoppingAdapter);
        lvHomeArrave.setOnRefreshListener(new RefreshListView.OnRefreshListener() {
            @Override
            public void onRefresh() {//下拉刷新
                dataLoadSecondPageData();
            }

            @Override
            public void onLoadMore() {//上拉刷新
                ToastUtils.showToast(getContext(), "最后一页了");
                lvHomeArrave.onRefreshComplete(false);// 收起加载更多的布局
            }
        });
    }
}
