package com.yjlw.ddms.fristentity.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.HotSkipAdapter;
import com.yjlw.ddms.fristentity.entity.HotSkipData;

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
 * Date: 2016年11月29  0:08
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotClassSkipActivity extends AppCompatActivity {
    @ViewInject(R.id.hot_class_back)
    private ImageView hotClassBack;
    @ViewInject(R.id.hot_class_title)
    private TextView hotClassTitle;
    @ViewInject(R.id.hot_class_rlv)
    private RecyclerView rlv;
    @ViewInject(R.id.hot_pb)
    private ProgressBar pb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_class);
        x.view().inject(this);
        hotClassBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        hotClassTitle.setText(title);
        int position = extras.getInt("position");
        downHotSkipData(position);
    }

    private void downHotSkipData(int position) {
        String hotItemUrl = Constant.HOT_CLASS_ITEM;
        RequestParams params=new RequestParams(hotItemUrl);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("type", "1");
        params.addBodyParameter("cate_id", (47-position)+"");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parseHotSkipData(result);
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

    private void parseHotSkipData(String result) {
        Gson gson=new Gson();
        HotSkipData hotSkipData = gson.fromJson(result, HotSkipData.class);
        List<HotSkipData.ResultBean.ListBean> skipList = hotSkipData.getResult().getList();
        if (skipList==null){
            pb.setVisibility(View.VISIBLE);
        }else {
             pb.setVisibility(View.GONE);
        }
        aboutRecyclerView(skipList);
    }

    private void aboutRecyclerView(List<HotSkipData.ResultBean.ListBean> skipList) {
        //初始化布局
        rlv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        HotSkipAdapter adapter=new HotSkipAdapter(skipList,this);
        rlv.setAdapter(adapter);
        //设置item之间的间隔
        SpacesItemDecoration decoration=new SpacesItemDecoration(5);
        rlv.addItemDecoration(decoration);

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
