package com.yjlw.ddms.homeentity.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.adapter.StoreRecyclerViewAdapter;
import com.yjlw.ddms.homeentity.entity.BuyProductInFosData;
import com.yjlw.ddms.homeentity.entity.BuyProductInFosData.ResultBean.RelationShopListBean.ListBean;
import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

/**
 * 购买产品的页面
 */
public class BuyProductActivity extends AppCompatActivity {
    @ViewInject(R.id.toolbar)
    private Toolbar tooBar;
    @ViewInject(R.id.rv_product_info)
    private RecyclerView rvProductStore;//店铺
    private ActionBar actionBar;
    private List<ListBean> shopLists=new LinkedList<>();
    private StoreRecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_product);
        x.view().inject(this);
        setSupportActionBar(tooBar);

        //2、设置ToolBar的标题

        //3、从ToolBar获取ActionBar，设置界面向左的箭头
        actionBar = getSupportActionBar();
        actionBar.setTitle("");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        downLoadData();
        abutRecyclerView();
    }

    private void abutRecyclerView() {

    }

    private void downLoadData() {
        String url = Constant.BUY_PRODUCT_INFO;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("Latitude", "38.945562");
        params.addBodyParameter("Longitude", "100.45229");
        params.addBodyParameter("GoodsId", "2786");

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
        BuyProductInFosData buyProductInFosData = gson.fromJson(s, BuyProductInFosData.class);
        List<BuyProductInFosData.ResultBean.ListBeanX> listBeanXes = buyProductInFosData.getResult()
                .getList();//评论
        shopLists.addAll(buyProductInFosData.getResult().getRelationShopList().getList());//店铺
        Log.i("Log", shopLists.toString());
        rvProductStore.setLayoutManager(new GridLayoutManager(this,2));
        recyclerViewAdapter = new StoreRecyclerViewAdapter(shopLists);
        rvProductStore.setAdapter(recyclerViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
