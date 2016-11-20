package com.yjlw.ddms.fristentity.detailutils;

import android.util.Log;

import com.google.gson.Gson;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.entity.FirstPagerData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * Description：下载数据的工具类 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月18  21:32
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class DownFirstData {
    public void downloadFirstData(){
        String page = Constant.ONE_PAGE;
        RequestParams params = new RequestParams(page);
        params.addBodyParameter("_HOP_", "{\"sign\":\"3b92baa726f98229c2f8f6e12d87156c\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479478619," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        params.addBodyParameter("appid", "2");
        params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        params.addBodyParameter("channel", "anzhi_v6115");
        params.addBodyParameter("deviceid", "haodou864394010609719");
        params.addBodyParameter("from", "android");
        params.addBodyParameter("ip", "172.16.152.15");
        params.addBodyParameter("limit", "30");
        params.addBodyParameter("loguid", "0");
        params.addBodyParameter("network", "WIFI");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("vc", "105");
        params.addBodyParameter("virtual", "0");
        params.addBodyParameter("vn", "6.1.15");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("i","下载的数据是"+result);
                parserFirstPager(result);
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
   //解析数据
    private void parserFirstPager(String result) {
        Gson gson=new Gson();
        FirstPagerData firstPagerData = gson.fromJson(result, FirstPagerData.class);
        List<FirstPagerData.DataBean.ListBean> listBeen = firstPagerData.getData().getList();
        for(int i=0;i<listBeen.size();i++){
            String title = listBeen.get(i).getTitle();
            Log.i("i","标题是"+title);
        }

    }

}
