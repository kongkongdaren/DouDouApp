package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.homeentity.activity.HomeLabelActivity;
import com.yjlw.ddms.homeentity.activity.ShoppingCartActivity;
import com.yjlw.ddms.homeentity.entity.SecondPageResult;
import com.yjlw.ddms.homeentity.entity.SecondPageResult.ResultBean.CateListBean;

import java.util.LinkedList;
import java.util.List;

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

        context.startActivity(new Intent(context, HomeLabelActivity.class));    }
}