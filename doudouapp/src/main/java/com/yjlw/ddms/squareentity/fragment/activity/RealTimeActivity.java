package com.yjlw.ddms.squareentity.fragment.activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.squareentity.fragment.adapter.MyRealTimeBaseAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.RealTime;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * Description：实时热点的跳转页面<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月29下午 10:47
 *
 * @author 李磊
 * @version : 1.0
 */

public class RealTimeActivity extends AppCompatActivity {

    private ListView mLv;
    private ProgressBar squareen_progressbar_id;
    private ActionBar actionBar;
    private RealTime realTime;
    private List<RealTime.ResultBean.ListBean> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squareen_real_time);
        mLv = (ListView) findViewById(R.id.lv_squareen_listview_id);
        squareen_progressbar_id = (ProgressBar) findViewById(R.id.squareen_progressbar_id);
//        actionBar = getActionBar();
//        actionBar.hide();
        downLoadData();
    }

    //下载数据
    private void downLoadData() {
        String thirdPageRealTime = Constant.THIRD_PAGE_REAL_TIME;
        RequestParams params = new RequestParams(thirdPageRealTime);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/Topic/getHotTopicList/");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("list",result);
                parserThirdPagerRealTime(result);
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
    private void parserThirdPagerRealTime(String result) {
        Gson gson=new Gson();
        realTime = gson.fromJson(result, RealTime.class);
        list = realTime.getResult().getList();
        if(list==null){
            squareen_progressbar_id.setVisibility(View.VISIBLE);
        }else{
            squareen_progressbar_id.setVisibility(View.GONE);
        }
        MyRealTimeBaseAdapter adapter=new MyRealTimeBaseAdapter(list,this);
        mLv.setAdapter(adapter);


    }
}
