package com.yjlw.ddms.homeentity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;

import com.yjlw.ddms.homeentity.adapter.CateListAdapter;

import com.yjlw.ddms.homeentity.entity.CateData;


import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;


/**
 * 美食研究所
 */
public class CateActivity extends AppCompatActivity {
    @ViewInject(R.id.lv_bargain_price)
    private ListView lvPrice;
    @ViewInject(R.id.iv_home_back)
    private ImageView ivKitChenBack;

    @ViewInject(R.id.tv_title)
    private TextView tvTitle;


    private List<CateData.ResultBean.ListBean> listBeanList=new LinkedList<>();
    private CateListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cate);
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

    /**
     * 下载数据
     */
    private void downLoadData() {
        String url = Constant.SECOND_PAGE_CATE;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/goods/dailyfirst?type=new");
        params.addBodyParameter("Latitude", "39.913249");
        params.addBodyParameter("Longitude", "116.403625");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("type", "new");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                Log.i("Log", s);
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
        CateData cateData = gson.fromJson(s, CateData.class);
        listBeanList.addAll(cateData.getResult().getList());

        String title = cateData.getResult().getTitle();
        tvTitle.setText(title);
        adapter = new CateListAdapter(listBeanList,this);
        lvPrice.setAdapter(adapter);
    }

    /**
     * ListView的操作
     */
    private void aboutListView() {

        //        lvHomeArrave.setOnRefreshListener(new RefreshListView.OnRefreshListener() {
        //            @Override
        //            public void onRefresh() {//下拉刷新
        //                downLoadData();
        //            }
        //
        //            @Override
        //            public void onLoadMore() {//上拉刷新
        //                ToastUtils.showToast(getContext(), "最后一页了");
        //                lvPrice.onRefreshComplete(false);// 收起加载更多的布局
        //            }
        //        });

    }
}
