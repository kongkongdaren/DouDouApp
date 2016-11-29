package com.yjlw.ddms.homeentity.activity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.admom.mygreendaotest.NoteDao;
import com.admom.mygreendaotest.ShoppingCartDataDao;
import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.application.xUtilsApplication;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;
import com.yjlw.ddms.homeentity.adapter.StoreRecyclerViewAdapter;
import com.yjlw.ddms.homeentity.entity.BuyProductInFosData;
import com.yjlw.ddms.homeentity.entity.BuyProductInFosData.ResultBean;
import com.yjlw.ddms.homeentity.entity.BuyProductInFosData.ResultBean.RelationShopListBean.ListBean;
import com.yjlw.ddms.homeentity.entity.DataBean;
import com.yjlw.ddms.homeentity.entity.ShoppingCartData;
import com.yjlw.ddms.utils.ToastUtils;

import org.greenrobot.greendao.query.Query;
import org.w3c.dom.Text;
import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.yjlw.ddms.R.string.price;

/**
 * 购买产品的页面
 */
public class BuyProductActivity extends AppCompatActivity {
    @ViewInject(R.id.toolbar)
    private Toolbar tooBar;
    @ViewInject(R.id.rv_product_info)
    private RecyclerView rvProductStore;//店铺

    @ViewInject(R.id.tv_add_shopping_card)
    private TextView addShoppingCard;//添加到购物车
    private ActionBar actionBar;
    private List<ListBean> shopLists = new LinkedList<>();
    private StoreRecyclerViewAdapter recyclerViewAdapter;
    private String GoodsId;
    private ShoppingCartDataDao dao;
    private SQLiteDatabase db;
    private List<BuyProductInFosData> productResult = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_product);
        x.view().inject(this);
        setSupportActionBar(tooBar);
        Bundle bundle = this.getIntent().getExtras();
        GoodsId = bundle.getString("GoodsId");
        xUtilsApplication application = (xUtilsApplication) getApplication();
        db = application.getDb();

        dao = application.getDaoSession().getShoppingCartDataDao();
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
        productResult.add(buyProductInFosData);//店铺详情
        shopLists.addAll(buyProductInFosData.getResult().getRelationShopList().getList());//店铺
        //        Log.i("Log", shopLists.toString());
        rvProductStore.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewAdapter = new StoreRecyclerViewAdapter(shopLists);
        rvProductStore.setAdapter(recyclerViewAdapter);
        RecyclerViewHeader header = RecyclerViewHeader.fromXml(this, R.layout
                .home_buy_product_item_top);


        header.attachTo(rvProductStore);
        RecyclerViewHeader center = RecyclerViewHeader.fromXml(this, R.layout
                .home_bue_product_item_center);
        //        center.attachTo(rvProductStore);
        aboutRecyclerViewHeadler(header, buyProductInFosData, center);
    }

    private void aboutRecyclerViewHeadler(RecyclerViewHeader header, BuyProductInFosData
            buyProductInFosData, RecyclerViewHeader center) {

        ImageView imgInfo = (ImageView) header.findViewById(R.id.iv_img_info);
        TextView title = (TextView) header.findViewById(R.id.tv_title);
        TextView subTitle = (TextView) header.findViewById(R.id.tv_sub_title);
        TextView dealPrice = (TextView) header.findViewById(R.id.tv_deal_price);
        TextView price = (TextView) header.findViewById(R.id.tv_price);
        TextView weight = (TextView) header.findViewById(R.id.tv_weight);
        TextView stock = (TextView) header.findViewById(R.id.tv_product_stock);
        TextView likeCount = (TextView) header.findViewById(R.id.tv_like_count);

        TextView tasteCount = (TextView) header.findViewById(R.id.tv_taste_count);
        MySelfCircleView imgUrl = (MySelfCircleView) center.findViewById(R.id.iv_imageUrl);
        TextView userName = (TextView) center.findViewById(R.id.tv_userName);
        TextView info = (TextView) center.findViewById(R.id.tv_info);
        TextView contentTags = (TextView) center.findViewById(R.id.tv_contentTags);
        TextView content = (TextView) center.findViewById(R.id.tv_content);
        TextView tags = (TextView) center.findViewById(R.id.tv_tags);
        //        TextView contentParam0 = (TextView) center.findViewById(R.id.tv_content_param0);
        //        TextView contentParam1 = (TextView) center.findViewById(R.id.tv_content_param1);
        //        TextView contentParam2 = (TextView) center.findViewById(R.id.tv_content_param2);
        //        TextView count = (TextView) center.findViewById(R.id.tv_count);
        //        TextView allEvaluate = (TextView) center.findViewById(R.id.tv_all_evaluate);

        BuyProductInFosData.ResultBean result = buyProductInFosData.getResult();

        x.image().bind(imgInfo, result.getImgInfo().get(0));
        title.setText(result.getTitle());
        subTitle.setText(result.getSubTitle());
        dealPrice.setText(result.getDealPrice());
        price.setText(result.getPrice());
        price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
        weight.setText(result.getWeight());
        stock.setText("库存" + result.getStock());
        likeCount.setText(result.getLikeCount() + "");
        tasteCount.setText(result.getTasteCount() + "");
        BuyProductInFosData.ResultBean.GoodsTasteBean goodsTasteBean = result.getGoodsTaste().get
                (0);
        x.image().bind(imgUrl, goodsTasteBean.getImgUrl());//品检员头像
        userName.setText(goodsTasteBean.getUserName());
        info.setText(goodsTasteBean.getInfo());
        contentTags.setText("[" + goodsTasteBean.getContentTags().get(0) + "]");
        content.setText(goodsTasteBean.getContent());
        tags.setText(goodsTasteBean.getTags().get(0));
        //
        List<String> contentParam = result.getContentParam();
        //        Log.i("Log", "产品工艺" + contentParam.toString());
        //        contentParam0.setText(contentParam.get(0));
        //        contentParam1.setText(contentParam.get(1));
        //        contentParam2.setText(contentParam.get(2));
        //        count.setText(result.getCmtCount()+"");

    }


    public void addShoppingCard(View view) {
        BuyProductInFosData shippingInfo = productResult.get(0);


        BuyProductInFosData buyProductInFosData = productResult.get(0);
        ResultBean resultBean = buyProductInFosData.getResult();
        //        Log.i("Log",buyProductInFosData.toString());
        ResultBean.StoreInfoBean storeInfo = resultBean.getStoreInfo();
        int storeId = storeInfo.getStoreId();
        String storeLogoUrl = storeInfo.getLogoUrl();
        String storeName = storeInfo.getTitle();
        String coverUrl = resultBean.getCoverUrl();
        String dealPrice = resultBean.getDealPrice();
        String dealPrices = dealPrice.substring(dealPrice.indexOf("￥") + 1);
        int goodsId = storeInfo.getStoreId();
        String price = resultBean.getPrice();
        String prices = price.substring(price.indexOf("￥") + 1);

        String title = resultBean.getTitle();
        //        Log.i("Log", "购物车的数据是:" + storeId + "," + storeLogoUrl + "," + storeName + ","
        // + coverUrl
        //                + "," + dealPrice + "," + goodsId + "," + price + "," + title);

        ShoppingCartData shoppingCartData = new ShoppingCartData(null, storeId + "",
                storeLogoUrl, storeName, coverUrl, dealPrices, goodsId + "", 0 + "", prices, title);
        //        dao.queryBuilder().where(.equals(goodsId)).build();
        Query query = dao.queryBuilder().where(ShoppingCartDataDao.Properties.GoodsId.eq(goodsId
                + "")).build();
        List list = query.list();
        if (list.size() == 0) {
            dao.insert(shoppingCartData);
            ToastUtils.showToast(this, "添加到购物车");
        } else {
            for (int i = 0; i <= list.size(); i++) {
                ShoppingCartData shopping = (ShoppingCartData) list.get(i);
                if (shopping.getGoodsId().equals(goodsId + "")) {
                    ToastUtils.showToast(this, "存在了");
                    break;
                } else {
                    dao.insert(shoppingCartData);
                    ToastUtils.showToast(this, "添加到购物车");
                }

            }
        }

    }

    /**
     * 购买商品
     *
     * @param view
     */
    public void buyProduct(View view) {
        BuyProductInFosData buyProductInFosData = productResult.get(0);
        ResultBean resultBean = buyProductInFosData.getResult();
        //        Log.i("Log",buyProductInFosData.toString());
        ResultBean.StoreInfoBean storeInfo = resultBean.getStoreInfo();
        int storeId = storeInfo.getStoreId();
        String storeLogoUrl = storeInfo.getLogoUrl();
        String storeName = storeInfo.getTitle();
        String coverUrl = resultBean.getCoverUrl();
        String dealPrice = resultBean.getDealPrice();
        int goodsId = storeInfo.getStoreId();
        String price = resultBean.getPrice();
        String subTitle = resultBean.getSubTitle();
        String title = resultBean.getTitle();

        String prices = price.substring(price.indexOf("￥") + 1);

        List<DataBean> dataBeens = new ArrayList<>();
        DataBean dataBean=new DataBean();
        dataBean.setCoverUrl(coverUrl);
        dataBean.setShopName(storeName);
        dataBean.setSubTitle(subTitle);

        float parseFloat = Float.parseFloat(prices);
        dataBean.setPrice(parseFloat);
        dataBeens.add(dataBean);

        Intent intent = new Intent(this, ShoppingAliPayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("dataBeens",(Serializable) dataBeens);
        intent.putExtras(bundle);
        startActivity(intent);

        //        while (cursor.moveToNext()) {
        //            //            ShoppingCartData shoppingCartData = new ShoppingCartData
        // (null, storeId
        //            // + "",
        //            //                    storeLogoUrl, storeName, coverUrl, dealPrice, goodsId
        // + "", 0 +
        //            // "", price, title);
        //
        //            String storeId = cursor.getString(1);
        //            String storeLogoUrl = cursor.getString(2);
        //            String storeName = cursor.getString(3);
        //            String coverUrl = cursor.getString(4);
        //            String dealPrice = cursor.getString(5);
        //            String goodsId = cursor.getString(6);
        //            String cunt = cursor.getString(7);
        //            String price = cursor.getString(8);
        //            String title = cursor.getString(9);
        ////            Log.i("Log", "购物车的数据是:" + storeId + "," + storeLogoUrl + "," + storeName
        // + "," +
        ////                    coverUrl + "," + dealPrice + "," + goodsId + "," + price + "," +
        // title);
        //        }
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
