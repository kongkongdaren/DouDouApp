package com.yjlw.ddms.fristentity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.KitChenAdapter;
import com.yjlw.ddms.fristentity.entity.KitchenData;
import com.yjlw.ddms.fristentity.entity.KitchenTitle;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Description：厨房宝典实现类 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  11:04
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class KitchenActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_back)
    private ImageView ivKitChenBack;
    @ViewInject(R.id.sp_id)
    private Spinner sp;
    @ViewInject(R.id.lv_kitchen)
    private PullToRefreshListView lv;
    @ViewInject(R.id.pb_kitchen)
    private ProgressBar pb;
    private KitChenAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitchen_activity);
        x.view().inject(this);
        ivKitChenBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        downKitchenName();
    }

    /**
     * 下载厨房宝典数据
     */
    private void downKitchenName() {
        String allKitchenUrl = Constant.AllKitchen;
        RequestParams params=new RequestParams(allKitchenUrl);
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>(){
            @Override
            public void onSuccess(String result) {
                parseKitchenName(result);
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
    private void parseKitchenName(String result) {
        Gson gson=new Gson();
        KitchenTitle kitchenTitle = gson.fromJson(result, KitchenTitle.class);
        final List<KitchenTitle.ResultBean.ListBean> listNames = kitchenTitle.getResult().getList();
        List<String> ds=new LinkedList<>();
        Collections.addAll(ds,listNames.get(0).getName(),listNames.get(1).getName(),listNames.get(2).getName(),listNames.get(3).getName(),listNames.get(4).getName(),listNames.get(5).getName(),listNames.get(6).getName());
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.kitchen_text,ds);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        downKitchenContent(0,Constant.SECOND_PAGE_KITCHEN ,"0");
                        break;
                    case 1:
                        downKitchenContent(1,Constant.SECOND_PAGE_FOODPROCESSING,"1");
                        break;
                    case 2:
                        downKitchenContent(2,Constant.SECOND_PAGE_COOKINGSKILL ,"2");
                        break;
                    case 3:
                        downKitchenContent(3,Constant.SECOND_PAGE_KITCHENCLEAN ,"3");
                        break;
                    case 4:
                        downKitchenContent(4,Constant.SECOND_PAGE_HOMEMADE ,"4");
                        break;
                    case 5:
                        downKitchenContent(5,Constant.SECOND_PAGE_BAKERY ,"5");
                        break;
                    case 6:
                        downKitchenContent(6,Constant.ONE_PAGE_KITCHEN_CABBAGE ,"6");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    /**
     * 下载数据
     */
    private void downKitchenContent(final int position, String url, String id) {
        RequestParams params=new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("tagid", id);
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
        params.addBodyParameter("type", "1");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>(){
            @Override
            public void onSuccess(String result) {
                Log.i("Log","我想要的是"+result);
                parseKitchenData(result,position);
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
     * @param position
     */
    private void parseKitchenData(String result, int position) {
        Gson gson=new Gson();
        KitchenData kitchenData = gson.fromJson(result, KitchenData.class);
        List<KitchenData.ResultBean.ListBean> listData = kitchenData.getResult().getList();
        Log.i("Log","标题是"+listData.get(0).getTitle());
        if(listData==null){
            pb.setVisibility(View.VISIBLE);
        }else{
            pb.setVisibility(View.GONE);
        }
        aboutListView(listData,position);
    }

    /**
     * 关于ListView 的操作
     * @param listData
     * @param position
     */
    private void aboutListView(final List<KitchenData.ResultBean.ListBean> listData, final int position) {
        //适配器
        adapter = new KitChenAdapter(listData,this);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(KitchenActivity.this,PhotoWebActivity.class);
                intent.putExtra("url",listData.get(position).getUrl());
                startActivity(intent);
            }
        });
        //设置PullRefreshListView上提加载时的加载提示
        lv.setMode(PullToRefreshBase.Mode.BOTH);
        String str = DateUtils.formatDateTime(KitchenActivity.this, System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);
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
                refreshData(listData,position);
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                refreshData(listData,position);
            }
        });
    }

    private void refreshData(final List<KitchenData.ResultBean.ListBean> listData, int position) {
        switch (position){
            case 0:
                downRefreshKitchenContent(listData,Constant.SECOND_PAGE_KITCHEN ,"0");
                break;
            case 1:
                downRefreshKitchenContent(listData,Constant.SECOND_PAGE_FOODPROCESSING,"1");
                break;
            case 2:
                downRefreshKitchenContent(listData,Constant.SECOND_PAGE_COOKINGSKILL ,"2");
                break;
            case 3:
                downRefreshKitchenContent(listData,Constant.SECOND_PAGE_KITCHENCLEAN ,"3");
                break;
            case 4:
                downRefreshKitchenContent(listData,Constant.SECOND_PAGE_HOMEMADE ,"4");
                break;
            case 5:
                downRefreshKitchenContent(listData,Constant.SECOND_PAGE_BAKERY ,"5");
                break;
            case 6:
                downRefreshKitchenContent(listData,Constant.ONE_PAGE_KITCHEN_CABBAGE ,"6");
                break;
        }
    }

    private void downRefreshKitchenContent(final List<KitchenData.ResultBean.ListBean> listData, String refreshUrl, String s) {
        RequestParams params=new RequestParams(refreshUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("tagid", s);
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
        params.addBodyParameter("type", "1");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>(){
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                KitchenData kitchenData = gson.fromJson(result, KitchenData.class);
                List<KitchenData.ResultBean.ListBean> listRefreshData = kitchenData.getResult().getList();
                listData.addAll(listRefreshData);
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
