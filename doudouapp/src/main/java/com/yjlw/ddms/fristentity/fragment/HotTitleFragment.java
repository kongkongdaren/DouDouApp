package com.yjlw.ddms.fristentity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.activity.CaipuActivity;
import com.yjlw.ddms.fristentity.adapter.AllDataAdapter;
import com.yjlw.ddms.fristentity.entity.HotAll;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  14:18
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotTitleFragment extends Fragment {

    private PullToRefreshListView lv;
    private String hotNames;
    private List<HotAll.ResultBean.ListBean> listAll;
    private ProgressBar pb;
    private AllDataAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        hotNames = arguments.getString("hotName");

        switch (hotNames){
            case "全部":
                DownHotAllData(Constant.SECOND_PAGE_ALLPOPULARRECIPES,"热门菜谱");
                break;
            case "私人":
                DownHotAllData(Constant.SECOND_PAGE_PERSONAL,"私人定制");
                break;
            case "时令":
                DownHotAllData(Constant.SECOND_PAGE_SEASONALDELICACIES,"时令佳肴");
                break;
            case "达人":
                DownHotAllData(Constant.SECOND_PAGE_TALENTMENU,"达人菜谱");
                break;
            case "最新":
                DownHotAllData(Constant.SECOND_PAGE_NEWEST,"私人定制");
                break;
            case "烘焙":
                DownHotAllData(Constant.SECOND_PAGE_BAKE,"快乐的烘焙");
                break;


        }
        super.onCreate(savedInstanceState);
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.title_fragment,container,false);
        lv = (PullToRefreshListView) view.findViewById(R.id.lv_title);
        pb = (ProgressBar) view.findViewById(R.id.pb_progress);
        return view;
    }

    /**
     * 下载热门菜谱之全部
     * @param url
     * @param info
     */
    private void DownHotAllData(String url, String info) {

        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "10");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98%E7%84%99");
        params.addBodyParameter("type", info);
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("Log","下载全部的数据是"+result);
                parseHotAllData(result);
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
    private void parseHotAllData(String result) {
        Gson gson=new Gson();
        HotAll hotAll = gson.fromJson(result, HotAll.class);
        listAll = hotAll.getResult().getList();
        if(listAll==null){
            pb.setVisibility(View.VISIBLE);
        }else{
            pb.setVisibility(View.GONE);
        }
        aboutListView(listAll);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    /**
     * 关于ListView的操作
     * @param listAll
     */
    private void aboutListView(final List<HotAll.ResultBean.ListBean> listAll) {
            //适配器
        adapter = new AllDataAdapter(listAll,getContext());
        //绑定适配器
        lv.setAdapter(adapter);
        //设置PullRefreshListView上提加载时的加载提示
        lv.setMode(PullToRefreshBase.Mode.BOTH);
        String str = DateUtils.formatDateTime(getActivity(), System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);
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
                refreshData(listAll);
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                refreshData(listAll);
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(getActivity(), CaipuActivity.class);
                Bundle bundle=new Bundle();
                String url="http://www.haodou.com/recipe/"+listAll.get(position-1).getRecipeId()+"";
                bundle.putString("url",url);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void refreshData(List<HotAll.ResultBean.ListBean> listAll) {
        switch (hotNames){
            case "全部":
                DownRefreshHotAllData(listAll,Constant.SECOND_PAGE_ALLPOPULARRECIPES,"热门菜谱");
                break;
            case "私人":
                DownRefreshHotAllData(listAll,Constant.REFRESH_SIREN,"私人定制");
                break;
            case "时令":
                DownRefreshHotAllData(listAll,Constant.SECOND_PAGE_SEASONALDELICACIES,"时令佳肴");
                break;
            case "达人":
                DownRefreshHotAllData(listAll,Constant.SECOND_PAGE_TALENTMENU,"达人菜谱");
                break;
            case "最新":
                DownRefreshHotAllData(listAll,Constant.SECOND_PAGE_NEWEST,"私人定制");
                break;
            case "烘焙":
                DownRefreshHotAllData(listAll,Constant.SECOND_PAGE_BAKE,"快乐的烘焙");
                break;


        }
    }

    private void DownRefreshHotAllData(final List<HotAll.ResultBean.ListBean> listAll, String refreshUrl, String id) {
        RequestParams params = new RequestParams(refreshUrl);
        params.addBodyParameter("limit", "10");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98%E7%84%99");
        params.addBodyParameter("type", id);
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                HotAll hotAll = gson.fromJson(result, HotAll.class);
                List<HotAll.ResultBean.ListBean> hotRefreshlist = hotAll.getResult().getList();
                listAll.addAll(0,hotRefreshlist);
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

