package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.entity.MenuSort;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Description：菜谱分类 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  17:09
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class MenuSortActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_sort_photo)
    private ImageView ivSortBack;
    @ViewInject(R.id.iv_sort_search)
    private ImageView ivSearch;
    @ViewInject(R.id.lv_sort)
    private ListView lvSort;
    @ViewInject(R.id.fl)
    private FrameLayout flSort;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_sort);
        x.view().inject(this);
        ivSortBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        downMenuSortData();
    }

    /**
     * 下载菜谱分类数据
     */
    private void downMenuSortData() {
        String menuSortUrl = Constant.ONE_PAGE_MENU_TYPE_TB;
        RequestParams params=new RequestParams(menuSortUrl);
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>(){
            @Override
            public void onSuccess(String result) {
                Log.i("Log","分类"+result);
                parseMenuSortData(result);
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
    private void parseMenuSortData(String result) {
        Gson gson=new Gson();
        MenuSort menuSort = gson.fromJson(result, MenuSort.class);
        List<MenuSort.ResultBean.ListBean> listSort = menuSort.getResult().getList();
        aboutListView(listSort);

    }
//关于ListView的操作
    private void aboutListView(List<MenuSort.ResultBean.ListBean> listSort) {

    }
}
