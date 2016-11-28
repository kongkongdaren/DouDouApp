package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.HotActivityAdapter;
import com.yjlw.ddms.fristentity.entity.HotAndData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Description：热门活动界面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  20:19
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_back)
    private ImageView ivBack;
    @ViewInject(R.id.lv_hot_activity)
    private PullToRefreshListView lv;
    @ViewInject(R.id.pb_hot)
    private ProgressBar pb;
    private HotActivityAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotactivity);
        x.view().inject(this);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        downLoadData();
    }

    /**
     * 下载数据
     */
    private void downLoadData() {
        String hotUrl = Constant.ONE_PAGE_POPLAR_ACTIVITIES;
        RequestParams params=new RequestParams(hotUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/latestactive/official/");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String> () {
            @Override
            public void onSuccess(String result) {
                parseData(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * 解析数据
     * @param result
     */
    private void parseData(String result) {
        Gson gson=new Gson();
        HotAndData hotAndActivity = gson.fromJson(result, HotAndData.class);
        List<HotAndData.ResultBean.ListBean> hotList = hotAndActivity.getResult().getList();
        if(hotList==null){
            pb.setVisibility(View.VISIBLE);
        }else{
            pb.setVisibility(View.GONE);
        }
        aboutListView(hotList);

    }

    /**
     * 关于listview 的操作
     * @param hotList
     */
    private void aboutListView(final List<HotAndData.ResultBean.ListBean> hotList) {
        //适配器
        adapter = new HotActivityAdapter(hotList,this);
        lv.setAdapter(adapter);
        //设置PullRefreshListView上提加载时的加载提示
        lv.setMode(PullToRefreshBase.Mode.BOTH);
        String str = DateUtils.formatDateTime(HotActivity.this, System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);
        lv.getLoadingLayoutProxy(false, true).setPullLabel("上拉加载...");
        lv.getLoadingLayoutProxy(false, true).setRefreshingLabel("正在加载...");
        lv.getLoadingLayoutProxy(false, true).setReleaseLabel("松开加载更多...");
        //设置上一次刷新的提示标签
        lv.getLoadingLayoutProxy().setLastUpdatedLabel("最后更新时间:" + str);
        // 设置PullRefreshListView下拉加载时的加载提示
        lv.getLoadingLayoutProxy(true, false).setPullLabel("下拉刷新...");
        lv.getLoadingLayoutProxy(true, false).setRefreshingLabel("正在刷新...");
        lv.getLoadingLayoutProxy(true, false).setReleaseLabel("松开刷新...");

        lv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                refreshData(hotList);

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                refreshData(hotList);
            }
        });
    }
    private void refreshData(final List<HotAndData.ResultBean.ListBean> hotList) {
        String hotUrl = Constant.HOT_ACTIVITY_REFRESH_DATA;
        RequestParams params=new RequestParams(hotUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "20");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/latestactive/official/");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String> () {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                HotAndData hotAndActivity = gson.fromJson(result, HotAndData.class);
                List<HotAndData.ResultBean.ListBean> hotRefreshList = hotAndActivity.getResult().getList();
                hotList.addAll(hotRefreshList);
                adapter.notifyDataSetChanged();
                lv.onRefreshComplete();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
