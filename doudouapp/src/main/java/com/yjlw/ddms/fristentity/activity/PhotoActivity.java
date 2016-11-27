package com.yjlw.ddms.fristentity.activity;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.PhotoAdapter;
import com.yjlw.ddms.fristentity.entity.PhotoData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;


/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  21:44
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class PhotoActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_photo_back)
    private ImageView ivPhotoBack;
    @ViewInject(R.id.tv_photo_name)
    private TextView tvPhotoName;
    @ViewInject(R.id.rlv_id)
    private RecyclerView rlv;
    @ViewInject(R.id.srf)
    private SwipeRefreshLayout srf;
    @ViewInject(R.id.pb_photo)
    private ProgressBar pb;
    private PhotoAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_activity);
        x.view().inject(this);
        ivPhotoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //获得传过来的值
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name");
        tvPhotoName.setText(name);
        downPhotoData();
    }

    /**
     * 下载数据
     */
    private void downPhotoData() {
        String pageUrl = Constant.page_guide_1;
        RequestParams params=new RequestParams(pageUrl);
        params.addBodyParameter("_HOP_", "{\"sign\":\"654f188bd2e1937b7e342083901d5799\"," +
                "\"action\":\"cms.feed.page\",\"current_time\":1479736220," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        params.addBodyParameter("appid", "2");
        params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        params.addBodyParameter("channel", "anzhi_v6115");
        params.addBodyParameter("deviceid", "haodou864394010609719");
        params.addBodyParameter("format", "1");
        params.addBodyParameter("from", "android");
        params.addBodyParameter("ip", "172.16.151.15");
        params.addBodyParameter("limit", "30");
        params.addBodyParameter("loguid", "0");
        params.addBodyParameter("name", "page_guide_1");
        params.addBodyParameter("network", "WIFI");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("vc", "105");
        params.addBodyParameter("virtual", "0");
        params.addBodyParameter("vn", "6.1.15");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String> () {
            @Override
            public void onSuccess(String result) {
                Log.i("Log","图片"+result);
                parsePhotoData(result);
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
    private void parsePhotoData(String result) {
        Gson gson=new Gson();
        PhotoData photoData = gson.fromJson(result, PhotoData.class);
        List<PhotoData.DataBean.ListBean> listPhoto = photoData.getData().getList();
        Log.i("Log",listPhoto.get(0).getTitle());
        if (listPhoto==null){
            pb.setVisibility(View.VISIBLE);
        }else{
            pb.setVisibility(View.GONE);
        }
        aboutRecyclerView(listPhoto);

    }

    /**
     * 关于RecyclerView的操作
     * @param listPhoto
     */
    @TargetApi(Build.VERSION_CODES.M)
    private void aboutRecyclerView(final List<PhotoData.DataBean.ListBean> listPhoto) {
        //初始化布局
         rlv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
         //适配器
        adapter = new PhotoAdapter(listPhoto,this);
        rlv.setAdapter(adapter);
        rlv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                downRefreshData(listPhoto);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        //设置item之间的间隔
        SpacesItemDecoration decoration=new SpacesItemDecoration(10);
        rlv.addItemDecoration(decoration);
        srf.setColorSchemeColors(getResources().getColor(android.R.color.holo_orange_light));
        srf.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                downRefreshData(listPhoto);
            }
        });

    }

    private void downRefreshData(final List<PhotoData.DataBean.ListBean> listPhoto) {
        String pageUrl = Constant.page_guide_1;
        RequestParams params=new RequestParams(pageUrl);
        params.addBodyParameter("_HOP_", "{\"sign\":\"654f188bd2e1937b7e342083901d5799\"," +
                "\"action\":\"cms.feed.page\",\"current_time\":1479736220," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        params.addBodyParameter("appid", "2");
        params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        params.addBodyParameter("channel", "anzhi_v6115");
        params.addBodyParameter("deviceid", "haodou864394010609719");
        params.addBodyParameter("format", "1");
        params.addBodyParameter("from", "android");
        params.addBodyParameter("ip", "172.16.151.15");
        params.addBodyParameter("limit", "30");
        params.addBodyParameter("loguid", "0");
        params.addBodyParameter("name", "page_guide_1");
        params.addBodyParameter("network", "WIFI");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("vc", "105");
        params.addBodyParameter("virtual", "0");
        params.addBodyParameter("vn", "6.1.15");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String> () {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                PhotoData photoData = gson.fromJson(result, PhotoData.class);
                List<PhotoData.DataBean.ListBean> listRefreshPhoto = photoData.getData().getList();
                listPhoto.addAll(0,listRefreshPhoto);
                adapter.notifyDataSetChanged();
                srf.setRefreshing(false);
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

    public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

        private int space;

        public SpacesItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            outRect.left = space;
            outRect.right = space;
            outRect.bottom = space;
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top = space;
            }
        }
    }
}
