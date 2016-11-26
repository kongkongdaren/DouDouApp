package com.yjlw.ddms.homeentity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.adapter.FoodieListAdapter;
import com.yjlw.ddms.homeentity.entity.FoodieLikeData;


import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

/**
 * 吃货最爱
 */
public class FoodieLikeActivity extends AppCompatActivity {
    @ViewInject(R.id.lv_bargain_price)
    private ListView lvPrice;
    @ViewInject(R.id.iv_home_back)
    private ImageView ivKitChenBack;
    private List<FoodieLikeData.ResultBean.ListBean> foodieLikes=new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodie_like);
        x.view().inject(this);
        ivKitChenBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        downLoadData();
        aboutListView();

    }


    private void aboutListView() {

    }

    private void downLoadData() {
        String url = Constant.SECOND_PAGE_FOODIE_LIKE;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");

        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {

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
        FoodieLikeData foodieLikeData = gson.fromJson(s, FoodieLikeData.class);
        foodieLikes.addAll(foodieLikeData.getResult().getList());
        FoodieListAdapter adapter = new FoodieListAdapter(foodieLikes,this);
        lvPrice.setAdapter(adapter);
    }
}
