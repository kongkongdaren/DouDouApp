package com.yjlw.ddms.homeentity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.ImageView;

import android.widget.ListView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.adapter.BargainPriceAdapter;
import com.yjlw.ddms.homeentity.entity.SalePriceBean;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;
import static android.view.View.inflate;

/**
 * 特价趁现在
 */
public class EveryBargainPriceActivity extends AppCompatActivity {
    @ViewInject(R.id.lv_bargain_price)
    private ListView lvPrice;
    @ViewInject(R.id.iv_home_back)
    private ImageView ivKitChenBack;

    private List<SalePriceBean> salePriceBeens = new LinkedList<>();
    private BargainPriceAdapter adapter;
    private ImageView imageView;
    private List<SalePriceBean.ResultBean.ListBean> listBeen = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_every_bargain_price);
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
        String url = Constant.SECOND_PAGE_EVERY_MONEY;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/goods/subjectlist/?id=173");
        params.addBodyParameter("Id", "173");
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
        SalePriceBean salePriceBean = gson.fromJson(s, SalePriceBean.class);
        salePriceBeens.add(salePriceBean);
        listBeen.addAll(salePriceBean.getResult().getList());
        String imgUrl = salePriceBean.getResult().getAd().get(0).getImgUrl();
        View topImage=inflate(this, R.layout.home_top_image_item, null);
        imageView= (ImageView) topImage.findViewById(R.id.iv_top_image);
        x.image().bind(imageView, imgUrl);
        lvPrice.addHeaderView(topImage);


    }

    /**
     * ListView的操作
     */
    private void aboutListView() {
        adapter = new BargainPriceAdapter(listBeen, this);
        lvPrice.setAdapter(adapter);

    }
}
