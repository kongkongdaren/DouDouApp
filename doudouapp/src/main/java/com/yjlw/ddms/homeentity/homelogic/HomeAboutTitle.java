package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.activity.HomeLabelActivity;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.CateListBean;

import java.util.LinkedList;
import java.util.List;

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
                tvTitle.setTextSize(16);

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
            Intent intent = new Intent();

            intent.setClass(context, HomeLabelActivity.class);
            switch (lab) {
                case "家传秘制":
                    aboutTitleOne(intent,Constant.SECOND_PAGE_THE_FAMILY_SECRET,58, lab);
                    break;
                case "肉禽蛋类":
                    aboutTitleOne(intent,Constant.SECOND_PAGE_MEATS, 59, lab);
                    break;
                case "烘焙面点":
                    aboutTitleOne(intent, Constant.SECOND_PAGE_BAKEDPASTRY, 60, lab);
                    break;
                case "水产海鲜":
                    aboutTitleOne(intent,Constant.SECOND_PAGE_AQUACULTURE_SEAFOOD, 61, lab);
                    break;
                case "腌腊制品":

                    aboutTitleOne(intent,Constant.SECOND_PAGE_GASES, 62, lab);
                    break;
                case "调味酱料":

                    aboutTitleOne(intent,Constant.SECOND_PAGE_SAUCE, 63, lab);
                    break;
                case "养生养颜":

                    aboutTitleOne(intent,Constant.SECOND_PAGE_KEEPING, 64, lab);
                    break;
                case "小吃零嘴":

                    aboutTitleOne(intent, Constant.SECOND_PAGE_SMALL, 65, lab);
                    break;
                case "冲调饮品":

                    aboutTitleOne(intent,Constant.SECOND_PAGE_MIXING_DRINKS, 66, lab);
                    break;
                case "生鲜果蔬":

                    aboutTitleOne(intent,Constant.SECOND_PAGE_FRUIT, 67, lab);
                    break;
            }


        }


    }

    /**
     * 界面的跳转
     * @param intent
     * @param url
     * @param i
     * @param lab
     */
    private void aboutTitleOne(Intent intent, String url, int i, String lab) {
        Bundle bundle = new Bundle();
        bundle.putString("detailsResult", lab);
        bundle.putString("url", url);

        bundle.putString("CateId",i+"");
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}