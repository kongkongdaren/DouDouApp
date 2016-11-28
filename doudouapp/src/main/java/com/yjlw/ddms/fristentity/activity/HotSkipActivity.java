package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.SkipAdapter;
import com.yjlw.ddms.fristentity.entity.SkipData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：热门活动跳转界面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  12:15
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotSkipActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_skip_back)
    private ImageView ivSkipBack;
    @ViewInject(R.id.iv_skip_share)
    private ImageView ivSkipShare;
    @ViewInject(R.id.tv_skip_title)
    private TextView tvSkipTitle;
    @ViewInject(R.id.tv_skip_title_big)
    private TextView tvSkipBigTitle;
    @ViewInject(R.id.tv_skip_count)
    private TextView tvSkipCount;
    @ViewInject(R.id.iv_skip)
    private ImageView ivSkip;
    @ViewInject(R.id.tv_content)
    private TextView tvContent;
    @ViewInject(R.id.lv_skip)
    private PullToRefreshListView lv;
    @ViewInject(R.id.pb_skip)
    private ProgressBar pb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skip_hot);
        x.view().inject(this);
        ivSkipBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        tvSkipTitle.setText(title+"的作品");
        tvSkipBigTitle.setText(title);
        int  position = extras.getInt("position");
        downloadSkipData(position);
    }
//下载数据
    private void downloadSkipData(final int position) {
        String skipDataUrl = Constant.SKIP_DATA;
        final RequestParams params=new RequestParams(skipDataUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "df04ef8cf3aab201ce09175f64129ac4");
        params.addBodyParameter("uid	", "10282642");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/photolist/?type=1&id=position&_wt=5");
        params.addBodyParameter("topicTag",position+"");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parseSkipData(result);
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

    private void parseSkipData(String result) {
        Gson gson=new Gson();
        SkipData skipData = gson.fromJson(result, SkipData.class);
        SkipData.ResultBean resultData = skipData.getResult();
        Log.i("re","热门活动数据是////"+resultData.getInfo().getCount()+"");
        tvSkipCount.setText(resultData.getInfo().getCount()+"");
        Picasso.with(this).load(resultData.getInfo().getCover()).placeholder(R.mipmap.default_high).into(ivSkip);
        tvContent.setText(resultData.getInfo().getContent());
        List<SkipData.ResultBean.ListBean> listSkipData = skipData.getResult().getList();
        if (listSkipData==null){
            pb.setVisibility(View.VISIBLE);
        }else {
            pb.setVisibility(View.GONE);
        }
        Log.i("re","你想要的是"+listSkipData.get(0).getCreateTime()+"");
        aboutPullToRefresh(listSkipData);
    }

    private void aboutPullToRefresh(List<SkipData.ResultBean.ListBean> listSkipData) {
        SkipAdapter adapter=new SkipAdapter(listSkipData,this);
        lv.setAdapter(adapter);
    }
}
