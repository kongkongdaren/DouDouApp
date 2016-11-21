package com.yjlw.ddms.fristentity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
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

    private ListView lv;
    private String hotNames;
    private List<HotAll.ResultBean.ListBean> listAll;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        hotNames = arguments.getString("hotName");

        switch (hotNames){
            case "全部":
                DownHotAllData();
                break;
            case "私人":
                DownPrivateData();
                break;
            case "时令":
                break;
            case "达人":
                break;
            case "最新":
                break;
            case "烘焙":
                break;


        }
        super.onCreate(savedInstanceState);
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.title_fragment,container,false);
        lv = (ListView) view.findViewById(R.id.lv_title);
        return view;
    }

    /**
     * 下载热门菜谱之全部
     */
    private void DownHotAllData() {
        String secondUrl = Constant.SECOND_PAGE_ALLPOPULARRECIPES;
        RequestParams params = new RequestParams(secondUrl);
        params.addBodyParameter("limit", "10");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98%E7%84%99");
        params.addBodyParameter("type", "热门菜谱");
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
    private void DownPrivateData() {
        String secondUrl = Constant.SECOND_PAGE_PERSONAL;
        RequestParams params = new RequestParams(secondUrl);
        params.addBodyParameter("limit", "10");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou"+
                ".com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8"+
                "%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81"+
                "%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4"+
                "%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96"+
                "%B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84"+
                "%E7%83%98%E7%84%99");
        params.addBodyParameter("type", "私人定制");
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
    private void aboutListView(List<HotAll.ResultBean.ListBean> listAll) {
            //适配器
        AllDataAdapter adapter=new AllDataAdapter(listAll,getContext());
        //绑定适配器
        lv.setAdapter(adapter);
    }
}

