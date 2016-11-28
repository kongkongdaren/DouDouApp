package com.yjlw.ddms.fristentity.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
import com.yjlw.ddms.fristentity.adapter.NewDataAdapter;
import com.yjlw.ddms.fristentity.entity.NewData;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Description：新手活动 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月25  21:35
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class NewActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_new_back)
    private ImageView ivNew;
    @ViewInject(R.id.tv_new_title)
    private TextView tvNewTitle;
    @ViewInject(R.id.new_gv)
    private RecyclerView newGv;
    @ViewInject(R.id.new_pb)
    private ProgressBar newPb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_gv);
        x.view().inject(this);
        ivNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        tvNewTitle.setText(title);
        downloadNewData();
    }
//下载数据
    private void downloadNewData() {
        String newUrl = Constant.SECOND_PAGE_FRESHCLASSROOM;
        RequestParams params=new RequestParams(newUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("type", "");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("Log","新手"+result);
                parseNewData(result);
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
    private void parseNewData(String result) {
        Gson gson=new Gson();
        NewData newData = gson.fromJson(result, NewData.class);
        List<NewData.ResultBean.ListBean> newDataList = newData.getResult().getList();
        if(newDataList==null){
            newPb.setVisibility(View.VISIBLE);
        }else{
            newPb.setVisibility(View.GONE);
        }
        Log.i("Log","新手数据"+newDataList.get(0).getTitle());
        aboutGridView(newDataList);

    }

    private void aboutGridView(List<NewData.ResultBean.ListBean> newDataList) {
        //初始化布局
        newGv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //适配器
        NewDataAdapter adapter=new NewDataAdapter(newDataList,this);
        newGv.setAdapter(adapter);
        //设置item之间的间隔
        SpacesItemDecoration decoration=new SpacesItemDecoration(10);
        newGv.addItemDecoration(decoration);

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
