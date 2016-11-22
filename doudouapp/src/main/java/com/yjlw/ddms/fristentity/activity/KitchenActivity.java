package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import com.google.gson.Gson;
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
    private ListView lv;
    @ViewInject(R.id.pb_kitchen)
    private ProgressBar pb;
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
                        downKitchenContent(Constant.SECOND_PAGE_KITCHEN ,"0");
                        break;
                    case 1:
                        downKitchenContent(Constant.SECOND_PAGE_FOODPROCESSING,"1");
                        break;
                    case 2:
                        downKitchenContent(Constant.SECOND_PAGE_COOKINGSKILL ,"2");
                        break;
                    case 3:
                        downKitchenContent(Constant.SECOND_PAGE_KITCHENCLEAN ,"3");
                        break;
                    case 4:
                        downKitchenContent(Constant.SECOND_PAGE_HOMEMADE ,"4");
                        break;
                    case 5:
                        downKitchenContent(Constant.SECOND_PAGE_BAKERY ,"5");
                        break;
                    case 6:
                        downKitchenContent(Constant.ONE_PAGE_KITCHEN_CABBAGE ,"6");
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
    private void downKitchenContent(String url,String id) {
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
                parseKitchenData(result);
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
    private void parseKitchenData(String result) {
        Gson gson=new Gson();
        KitchenData kitchenData = gson.fromJson(result, KitchenData.class);
        List<KitchenData.ResultBean.ListBean> listData = kitchenData.getResult().getList();
        Log.i("Log","标题是"+listData.get(0).getTitle());
        if(listData==null){
            pb.setVisibility(View.VISIBLE);
        }else{
            pb.setVisibility(View.GONE);
        }
        aboutListView(listData);
    }

    /**
     * 关于ListView 的操作
     * @param listData
     */
    private void aboutListView(List<KitchenData.ResultBean.ListBean> listData) {
        //适配器
        KitChenAdapter adapter=new KitChenAdapter(listData,this);
        lv.setAdapter(adapter);
    }
}
