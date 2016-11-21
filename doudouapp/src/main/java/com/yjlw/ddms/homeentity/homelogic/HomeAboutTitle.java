package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.activity.HomeLabelActivity;
import com.yjlw.ddms.homeentity.activity.ShoppingCartActivity;
import com.yjlw.ddms.homeentity.entity.LabelDetailsResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.CateListBean;
import com.yjlw.ddms.mainactivity.MainActivity;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import static android.R.attr.key;
import static android.R.id.list;
import static java.security.AccessController.getContext;

/**
 * Simple to Introduction
 *
 * @Description: 到家的标签导航逻辑处理
 * @Author: 原海忠
 * @CreateDate: 2016/11/21
 * @Version: [v1.0]
 */
public class HomeAboutTitle implements View.OnClickListener {
    private List<CateListBean> cateLists = new LinkedList<>();
    private Context context;
    private LinearLayout llArrveTitle;

    public HomeAboutTitle(List<CateListBean> cateLists, Context context, LinearLayout
            llArrveTitle) {
        this.cateLists = cateLists;
        this.context = context;
        this.llArrveTitle = llArrveTitle;
        initData();
    }

    private void initData() {
        if (cateLists != null) {
            for (int i = 0; i < cateLists.size(); i++) {
                String cateName = cateLists.get(i).getCateName();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup
                        .LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                TextView tvTitle = new TextView(context);
                if (i > 0) {
                    layoutParams.setMargins(25, 0, 0, 0);
                }
                tvTitle.setCompoundDrawablePadding(5);
                tvTitle.setLayoutParams(layoutParams);//设置 <!--android:drawablePadding="2dp"-->
                Drawable drawable = context.getResources().getDrawable(R.mipmap
                        .ico_group_arrow_right);
                drawable.setBounds(0, 0, drawable.getMinimumWidth() + 5, drawable
                        .getMinimumHeight()); //设置边界
                tvTitle.setCompoundDrawables(null, null, drawable, null);//画在右边
                // <!--android:drawableRight="@mipmap/ico_group_arrow_right"-->
                tvTitle.setText(cateName);
                tvTitle.setOnClickListener(this);
                llArrveTitle.addView(tvTitle);
            }


        }
    }


    @Override
    public void onClick(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            String lab = textView.getText().toString();
//            如果传递的是List<Object>,可以把list强转成Serializable类型,而且object类型也必须实现了Serializable接口
//
//            Intent.putExtras(key, (Serializable)list)
//            接收
//
//                    (List<YourObject>)getIntent().getSerializable(key)
            Intent intent = new Intent();
            intent.setClass(context, HomeLabelActivity.class);
            switch (lab) {
                case "家传秘制":
                    aboutTitleOne(intent);
                    break;
                case "肉禽蛋类":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "烘焙面点":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "水产海鲜":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "腌腊制品":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "调味酱料":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "养生养颜":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "小吃零嘴":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "冲调饮品":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
                case "生鲜果蔬":
//                    context.startActivity(new Intent(context, HomeLabelActivity.class));
                    break;
            }


        }


    }

    private void aboutTitleOne(Intent intent) {
        downLoadData();
        Bundle bundle = new Bundle();
        LabelDetailsResult detailsResult = new LabelDetailsResult();
        bundle.putSerializable("detailsResult", detailsResult);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void downLoadData() {
        String url = Constant.SECOND_PAGE_THE_FAMILY_SECRET;
        RequestParams params = new RequestParams(url);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("CateId", "58");
        params.addBodyParameter("Keyword", "");
        params.addBodyParameter("appqs", "haodourecipe://haodou.com/goods/searchResult/?CateId=58&CateName=家传秘制");
                params.addBodyParameter("Latitude", "39.913249");
        params.addBodyParameter("Longitude", "116.403625");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("TagId", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                              Log.i("Log", "下载的数据是：" + s);
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
//        SecondPageResult secondPageResult = gson.fromJson(s, SecondPageResult.class);
//        List<CateListBean> cateLists = secondPageResult.getResult()
//                .getCateList();
//        for(int i=0;i<cateLists.size();i++){
//            String cateName = cateLists.get(i).getCateName();
//            //            Log.i("Log",cateName);
//        }
    }
}