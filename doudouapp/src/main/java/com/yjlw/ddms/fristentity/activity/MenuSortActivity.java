package com.yjlw.ddms.fristentity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.MenuGridViewAdapter;
import com.yjlw.ddms.fristentity.adapter.MenuSortAdapter;
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
    @ViewInject(R.id.gv_sort)
    private GridView gv;
    @ViewInject(R.id.pb_sort)
    private ProgressBar pb;
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
        if(listSort==null){
            pb.setVisibility(View.VISIBLE);
        }else{
            pb.setVisibility(View.GONE);
        }
        aboutListView(listSort);
        aboutGridView(listSort.get(0).getTags());
    }
//关于ListView的操作
    private void aboutListView(final List<MenuSort.ResultBean.ListBean> listSort) {
             //适配器
        MenuSortAdapter adapter=new MenuSortAdapter(listSort,this);
        lvSort.setAdapter(adapter);
        lvSort.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                List<MenuSort.ResultBean.ListBean.TagsBean> listSortTags = listSort.get(i).getTags();
                aboutGridView(listSortTags);
            }
        });
    }
//关于GridView的操作
    private void aboutGridView(final List<MenuSort.ResultBean.ListBean.TagsBean> listSortTags) {
        //适配器
        MenuGridViewAdapter adapter=new MenuGridViewAdapter(listSortTags,this);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("zouleme","吃屎吧");
                Intent intent=new Intent(MenuSortActivity.this,FoodActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("title",listSortTags.get(position).getName());
                bundle.putString("id",listSortTags.get(position).getId()+"");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
