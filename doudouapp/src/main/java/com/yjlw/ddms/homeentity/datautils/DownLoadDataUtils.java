package com.yjlw.ddms.homeentity.datautils;

import com.google.gson.Gson;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.CateListBean;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 下载数据的工具类
 * @Author: 原海忠
 * @CreateDate: 2016/11/17
 * @Version: [v1.0]
 */
public class DownLoadDataUtils {
    public void dataLoadSecondPageData() {
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
  //              Log.i("Log", "下载的数据是：" + s);
                parserSecondPageData(s);
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
    private void parserSecondPageData(String s) {
        Gson gson = new Gson();
        SecondPageResult secondPageResult = gson.fromJson(s, SecondPageResult.class);
        List<CateListBean> cateLists = secondPageResult.getResult()
                .getCateList();
        for(int i=0;i<cateLists.size();i++){
            String cateName = cateLists.get(i).getCateName();
//            Log.i("Log",cateName);
        }
    }
}