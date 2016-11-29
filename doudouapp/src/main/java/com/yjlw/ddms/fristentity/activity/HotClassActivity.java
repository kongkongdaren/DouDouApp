package com.yjlw.ddms.fristentity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.HotTextAdapter;
import com.yjlw.ddms.fristentity.entity.HotClassItem;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Description：热门分类界面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  23:02
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotClassActivity extends AppCompatActivity {
    @ViewInject(R.id.hotclass_back)
    private ImageView ivhotclassBack;
    @ViewInject(R.id.hotclass_item)
    private GridView gvitem;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotclass_gv);
        x.view().inject(this);
        ivhotclassBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        downhotClassData();
    }
//下载数据
    private void downhotClassData() {
        String hotUrl = Constant.HOT_CLASS;
        RequestParams params=new RequestParams(hotUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                parseHotClassData(result);
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

    private void parseHotClassData(String result) {
        Gson gson=new Gson();
        HotClassItem hotClassItem = gson.fromJson(result, HotClassItem.class);
        List<HotClassItem.ResultBean.ListBean> hotItemList = hotClassItem.getResult().getList();
        aboutGridView(hotItemList);
    }

    private void aboutGridView(final List<HotClassItem.ResultBean.ListBean> hotItemList) {
        HotTextAdapter adapter=new HotTextAdapter(hotItemList,this);
        gvitem.setAdapter(adapter);
        gvitem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(HotClassActivity.this,HotClassSkipActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("title",hotItemList.get(position).getCateName());
                bundle.putString("cateId",hotItemList.get(position).getCateId());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
