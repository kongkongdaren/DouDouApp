package com.yjlw.ddms.squareentity.fragment.utils;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.squareentity.fragment.entity.Result;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Description：下载工具类<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 7:16
 *
 * @author 李磊
 * @version : 1.0
 */

public class HttpUtils {

    public void downloadJsonDataMethod(){
        String thirdPage = Constant.THIRD_PAGE;
        RequestParams params = new RequestParams(thirdPage);
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("download","下载的数据是"+result);
                parserThirdPager(result);
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

    //Gson解析数据
    private void parserThirdPager(String result) {

        Gson gson=new Gson();
        Result.ResultBean resultBean = gson.fromJson(result, Result.ResultBean.class);

        String name = resultBean.getGroup().get(0).getName();
        Log.i("name",name);

    }
}
