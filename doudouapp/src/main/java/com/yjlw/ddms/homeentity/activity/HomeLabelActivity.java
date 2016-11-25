package com.yjlw.ddms.homeentity.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.baidu.mapapi.SDKInitializer;
import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.baidumap.LocationActivity;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.adapter.SpinnerAdapter;
import com.yjlw.ddms.homeentity.entity.LabelDetailsResult;
import com.yjlw.ddms.homeentity.homelogic.HomeTitleItem;
import com.yjlw.ddms.homeentity.views.PopupWindowsItem;
import com.yjlw.ddms.utils.SharedPreferencesUtils;
import com.yjlw.ddms.utils.ToastUtils;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static android.R.attr.data;
import static android.R.attr.key;

/**
 * 标签页面
 */
public class HomeLabelActivity extends AppCompatActivity implements View.OnClickListener {
    private List<LabelDetailsResult> labelDetailsResults = new LinkedList<>();
    private List<LabelDetailsResult.ResultBean.ListBean> list = new LinkedList<>();
    private String detailsResult;
    @ViewInject(R.id.lv_details)
    private ListView listView;

    @ViewInject(R.id.sp_classify)
    private Spinner spinnerClassify;//产品种类
    @ViewInject(R.id.tv_address)
    private TextView tvAddress;
    @ViewInject(R.id.iv_drown_address)
    private ImageView ivDownAddress;
    @ViewInject(R.id.rb_product_mold)
    private RadioButton productMold;
    @ViewInject(R.id.rb_home_sales)
    private RadioButton productSales;
    @ViewInject(R.id.rb_home_price)
    private RadioButton productPrice;

    @ViewInject(R.id.rb_home_new_product)
    private RadioButton newProduct;
    private static final String[] addressProduct = {"全部", "附近", "全国"};
    private SpinnerAdapter arrayAdapter;
    private String addressinfo;
    private LinearLayout llPopupWindow;
    private PopupWindow popupWindow;
    private int mScreenWidth;
    private PopupWindow mPopupWindow;
    private LabelDetailsResult labelResult;
    private List<LabelDetailsResult.ResultBean.CateInfosBean> cateInfos = new LinkedList<>();
    private int mScreenHeight;
    private int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_label);
        addressinfo = SharedPreferencesUtils.getString(this, "addressinfo", "");
        SDKInitializer.initialize(getApplicationContext()); // 不能传递Activity，必须是全局Context
        Bundle bundle = this.getIntent().getExtras();
        detailsResult = bundle.getString("detailsResult");
        x.view().inject(this);
        tvAddress.setText(addressinfo);
        aboutAddressSpinner();
        downLoadData();
        productMold.setText("全部");
        productMold.setOnClickListener(this);
        productSales.setOnClickListener(this);
        productPrice.setOnClickListener(this);
        aboutListView();
    }

    private void aboutListView() {
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {

            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                popupWindowDismiss();
            }
        });
    }

    @Override
    protected void onRestart() {
        tvAddress.setText(addressinfo);
        super.onRestart();
    }

    /**
     * 关于Spinner的操作
     */
    private void aboutAddressSpinner() {

        arrayAdapter = new SpinnerAdapter(addressProduct, this);
        //设置下拉列表的风格,simple_spinner_dropdown_item是android系统自带的样式，等会自定义修改
        spinnerClassify.setAdapter(arrayAdapter);
    }

    /**
     * 用户的选择展示（排行以及商品）
     *
     * @param view
     */
    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.rb_product_mold://商品种类
                List<String> popupDatas = new ArrayList<>();
                popupDatas.clear();
                for (int i = 0; i < cateInfos.size(); i++) {
                    String cateName = cateInfos.get(i).getCateName();
                    popupDatas.add(cateName);
                }
                getPopupWindowInstance(popupDatas);
                mPopupWindow.showAsDropDown(view);
                break;
            case R.id.rb_home_sales://销量排行
                List<String> popupDatas2 = new ArrayList<>();
                popupDatas2.clear();
                Collections.addAll(popupDatas2, "销量由高到低", "销量由底到高");
                getPopupWindowInstance(popupDatas2);
                mPopupWindow.showAsDropDown(view);
                break;
            case R.id.rb_home_price://价格排行
                List<String> popupDatas3 = new ArrayList<>();
                Collections.addAll(popupDatas3, "价格由底到高", "价格由高到低");
                getPopupWindowInstance(popupDatas3);
                mPopupWindow.showAsDropDown(view);
                break;
        }
    }

    /*
         * 获取PopupWindow实例
         */
    private void getPopupWindowInstance(List<String> popupDatas) {
        if (null != mPopupWindow) {
            mPopupWindow.dismiss();
            return;
        } else {
            initPopuptWindow(popupDatas);
        }
    }

    /**
     * 关于PopupWindow的操作
     *
     * @param popupDatas
     */
    private void initPopuptWindow(final List<String> popupDatas) {

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View popupWindow = layoutInflater.inflate(R.layout.home_popup_window, null);
        LinearLayout popupRoot = (LinearLayout) popupWindow.findViewById(R.id.ll__popup_root);

        mScreenHeight = getWindowManager().getDefaultDisplay().getHeight();
        mPopupWindow = new PopupWindow(popupWindow);
        for (int i = 0; i < popupDatas.size(); i++) {
            final PopupWindowsItem windowsItem = new PopupWindowsItem(this);
            windowsItem.setTitle(popupDatas.get(i));
            popupRoot.addView(windowsItem);
            height += windowsItem.getMeasuredHeight();
            Log.i("Log", height + "");
            windowsItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mPopupWindow.dismiss();
                    mPopupWindow = null;
                    if (popupDatas.size() > 2) {
                        productMold.setText(windowsItem.getTitle());

                    }

                }
            });
        }
        // 创建一个PopupWindow
        // 参数1：contentView 指定PopupWindow的内容
        // 参数2：width 指定PopupWindow的width
        // 参数3：height 指定PopupWindow的height
        if (popupDatas.size() > 2) {
            mPopupWindow.setHeight(mScreenHeight);
        } else {
            mPopupWindow.setHeight(180);
        }

        // 获取屏幕和PopupWindow的width和height
        mScreenWidth = getWindowManager().getDefaultDisplay().getWidth();

        mPopupWindow.setWidth(mScreenWidth);

    }

    /**
     * 点击别的条目的时候关闭popupWindow
     */
    private void popupWindowDismiss() {
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();//关闭aboutPopupWindow
            popupWindow = null;
        }
    }

    /**
     * 获取popupwindow的布局文件
     *
     * @return
     */
    @NonNull
    private View getView() {
        View contentView = View.inflate(this, R.layout.home_popup_window, null);
        llPopupWindow = (LinearLayout) contentView.findViewById(R.id.ll__popup_root);
        return contentView;
    }

    /**
     * 获取验证
     *
     * @param view
     */
    @Event(type = View.OnClickListener.class, value = R.id.iv_drown_address)
    private void downAddress(View view) {
        startActivity(new Intent(getApplicationContext(), LocationActivity.class));
    }

    private void downLoadData() {
        String url = Constant.SECOND_PAGE_THE_FAMILY_SECRET;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("CateId", "58");
        params.addBodyParameter("Keyword", "");
        params.addBodyParameter("appqs", "haodourecipe://haodou" + "" +
                ".com/goods/searchResult/?CateId=58&CateName=家传秘制");
        params.addBodyParameter("Latitude", "38.945562");
        params.addBodyParameter("Longitude", "100.45229");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("TagId", "0");
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
        labelResult = gson.fromJson(s, LabelDetailsResult.class);
        labelDetailsResults.add(labelResult);
        list.addAll(labelResult.getResult().getList());
        cateInfos.addAll(labelResult.getResult().getCateInfos());
        aboutTitle(detailsResult);
    }

    /**
     * 详情界面的逻辑书写
     *
     * @param detailsResult
     */
    private void aboutTitle(String detailsResult) {
        switch (detailsResult) {
            case "家传秘制":
                new HomeTitleItem(listView, list, this);
                break;
        }
    }


}
