package com.yjlw.ddms.homeentity.activity;

import android.graphics.Paint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
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
    private List<ListBean> shopLists = new LinkedList<>();
    private StoreRecyclerViewAdapter recyclerViewAdapter;
    private String GoodsId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_product);
        x.view().inject(this);
        setSupportActionBar(tooBar);
        Bundle bundle = this.getIntent().getExtras();
        GoodsId = bundle.getString("GoodsId");
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
        params.addBodyParameter("GoodsId", GoodsId);

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
        List<BuyProductInFosData.ResultBean.ListBeanX> listBeanXes = buyProductInFosData
                .getResult().getList();//评论
        shopLists.addAll(buyProductInFosData.getResult().getRelationShopList().getList());//店铺
        Log.i("Log", shopLists.toString());
        rvProductStore.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewAdapter = new StoreRecyclerViewAdapter(shopLists);
        rvProductStore.setAdapter(recyclerViewAdapter);
        RecyclerViewHeader header = RecyclerViewHeader.fromXml(this, R.layout
                .home_buy_product_item_top);


        header.attachTo(rvProductStore);
        aboutRecyclerViewHeadler(header, buyProductInFosData);
    }

    private void aboutRecyclerViewHeadler(RecyclerViewHeader header, BuyProductInFosData
            buyProductInFosData) {
        Log.i("Log",buyProductInFosData.getResult().toString());
        ImageView imgInfo = (ImageView) header.findViewById(R.id.iv_img_info);
        TextView title = (TextView) header.findViewById(R.id.tv_title);
        TextView subTitle = (TextView) header.findViewById(R.id.tv_sub_title);
        TextView dealPrice = (TextView) header.findViewById(R.id.tv_deal_price);
        TextView price = (TextView) header.findViewById(R.id.tv_price);
        TextView weight = (TextView) header.findViewById(R.id.tv_weight);
        TextView stock = (TextView) header.findViewById(R.id.tv_product_stock);
        TextView likeCount = (TextView) header.findViewById(R.id.tv_like_count);

        TextView tasteCount = (TextView) header.findViewById(R.id.tv_taste_count);
        MySelfCircleView imgUrl = (MySelfCircleView) header.findViewById(R.id.iv_imageUrl);
        TextView userName = (TextView) header.findViewById(R.id.tv_userName);
        TextView info = (TextView) header.findViewById(R.id.tv_info);
        TextView contentTags = (TextView) header.findViewById(R.id.tv_contentTags);
        TextView content = (TextView) header.findViewById(R.id.tv_content);
        TextView tags = (TextView) header.findViewById(R.id.tv_tags);
        TextView contentParam0 = (TextView) header.findViewById(R.id.tv_content_param0);
        TextView contentParam1 = (TextView) header.findViewById(R.id.tv_content_param1);
        TextView contentParam2 = (TextView) header.findViewById(R.id.tv_content_param2);
        TextView count = (TextView) header.findViewById(R.id.tv_count);
        TextView allEvaluate = (TextView) header.findViewById(R.id.tv_all_evaluate);
        BuyProductInFosData.ResultBean result = buyProductInFosData.getResult();
        x.image().bind(imgInfo, result.getImgInfo().get(0));
        title.setText(result.getTitle());
        subTitle.setText(result.getSubTitle());
        dealPrice.setText(result.getDealPrice());
        price.setText(result.getPrice());
        price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
        weight.setText(result.getWeight());
        stock.setText("库存"+result.getStock());
        likeCount.setText(result.getLikeCount()+"");
        tasteCount.setText(result.getTasteCount()+"");
        x.image().bind(imgUrl,result.getCoverUrl());
        BuyProductInFosData.ResultBean.GoodsTasteBean goodsTasteBean = result.getGoodsTaste().get
                (0);
        userName.setText(goodsTasteBean.getUserName());
        info.setText(goodsTasteBean.getInfo());
        contentTags.setText(goodsTasteBean.getContentTags().get(0));
        content.setText(goodsTasteBean.getContent());
        tags.setText(goodsTasteBean.getTags().get(0));
        List<String> contentParam = result.getContentParam();
        contentParam0.setText(contentParam.get(0));
        contentParam1.setText(contentParam.get(1));
        contentParam2.setText(contentParam.get(2));
        count.setText(result.getCount()+"");

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
