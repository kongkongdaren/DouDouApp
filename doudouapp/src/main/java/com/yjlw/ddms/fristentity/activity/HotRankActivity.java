package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.HotRankAdapter;
import com.yjlw.ddms.fristentity.entity.HotRank;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Description：热门排行榜 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月25  20:10
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotRankActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_rank_back)
    private ImageView ivRank;
    @ViewInject(R.id.tv_rank_title)
    private TextView  tvRankTitle;
    @ViewInject(R.id.hot_lv)
    private ListView hotLv;
    @ViewInject(R.id.hot_pb)
    private ProgressBar hotPb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_rank_list);
        x.view().inject(this);
        ivRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        tvRankTitle.setText(title);
        downloadRankData();
    }
//下载数据
    private void downloadRankData() {
        String rankUrl = Constant.SECOND_PAGE_BILLBOARD;
        RequestParams params=new RequestParams(rankUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("Log","看视频。。。"+result);
                parseRankData(result);
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
    private void parseRankData(String result) {
        Gson gson=new Gson();
        HotRank hotRank = gson.fromJson(result, HotRank.class);
        List<HotRank.ResultBean.ListBean> hotRankList = hotRank.getResult().getList();
        if(hotRankList==null){
            hotPb.setVisibility(View.VISIBLE);
        }else{
            hotPb.setVisibility(View.GONE);
        }
        aboutListView(hotRankList);
    }

    private void aboutListView(List<HotRank.ResultBean.ListBean> hotRankList) {
        //适配器
        HotRankAdapter adapter=new HotRankAdapter(hotRankList,this);
        hotLv.setAdapter(adapter);
    }
}
