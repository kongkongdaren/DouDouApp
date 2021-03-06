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
import com.yjlw.ddms.homeentity.adapter.ProductCommentAdapter;
import com.yjlw.ddms.homeentity.entity.ProductCommentData;


import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;


public class ProductCommentActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_home_back)
    private ImageView ivKitChenBack;
    @ViewInject(R.id.lv_comment)
    private ListView lvComment;
    private String goodsid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_comment);
        x.view().inject(this);
        Bundle bundle = this.getIntent().getExtras();
        goodsid = bundle.getString("goodsid");
        ivKitChenBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        downLoadData();
    }

    private void downLoadData() {
        String url = Constant.PRODUCT_COMMENT;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("id", goodsid);
        params.addBodyParameter("rid", "");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("type", "1");
        params.addBodyParameter("cid", "");

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
        ProductCommentData productCommentData = gson.fromJson(s, ProductCommentData.class);
        List<ProductCommentData.ResultBean.ListBean> comments = productCommentData.getResult()
                .getList();
        ProductCommentAdapter adapter= new ProductCommentAdapter(comments,this);
        lvComment.setAdapter(adapter);
    }

}
