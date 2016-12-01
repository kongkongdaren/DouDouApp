package com.yjlw.ddms.fristentity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.FoodAdapter;
import com.yjlw.ddms.fristentity.entity.FoodData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;


/**
 * Description：食品 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年12月01  18:56
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class FoodActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_food_id)
    private ImageView ivBack;
    @ViewInject(R.id.food_tv)
    private TextView tvFood;
    @ViewInject(R.id.food_lv)
    private ListView lvFood;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        x.view().inject(this);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String id = bundle.getString("id");
        tvFood.setText(title);
        downLoadFoodData(id);
    }

    private void downLoadFoodData(String id) {
        String foodDateUrl = Constant.FOOD_DATE;
        RequestParams params=new RequestParams(foodDateUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("scene", "t1");
        params.addBodyParameter("tagid", id);
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("offset", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parseFoodData(result);
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
    private void parseFoodData(String result) {
        Gson gson=new Gson();
        FoodData foodData = gson.fromJson(result, FoodData.class);
        List<FoodData.ResultBean.ListBean> foodList = foodData.getResult().getList();
        aboutListView(foodList);
    }

    private void aboutListView(final List<FoodData.ResultBean.ListBean> foodList) {
        FoodAdapter adapter=new FoodAdapter(foodList,this);
        lvFood.setAdapter(adapter);
        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String url = "http://www.haodou.com/recipe/"+foodList.get(position).getRecipeId()+"/";

                Log.i("url",url);

                Intent intent = new Intent(FoodActivity.this,PhotopuActivity.class);

                intent.putExtra("url",url);

                startActivity(intent);
            }
        });
    }
}
