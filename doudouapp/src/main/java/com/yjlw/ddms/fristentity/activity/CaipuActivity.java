package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.adapter.MainfoodAdapter;
import com.yjlw.ddms.fristentity.adapter.OtherfoodAdapter;
import com.yjlw.ddms.fristentity.adapter.StepfoodAdapter;
import com.yjlw.ddms.fristentity.entity.CaipuData;
import com.yjlw.ddms.fristentity.views.MyListView;
import com.yjlw.ddms.fristentity.views.MySelfCircleView;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月30  20:24
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class CaipuActivity extends AppCompatActivity {
    @ViewInject(R.id.caipu_back)
    private ImageView caiBack;
    @ViewInject(R.id.caipu_share)
    private ImageView caiShare;
    @ViewInject(R.id.cai_photo)
    private ImageView caiPhoto;
    @ViewInject(R.id.cai_title)
    private TextView caiTitle;
    @ViewInject(R.id.cai_time)
    private TextView caiTime;
    @ViewInject(R.id.cai_ViewCount)
    private TextView caiViewCount;
    @ViewInject(R.id.cai_CommentCount)
    private TextView caiCommentCount;
    @ViewInject(R.id.msf_photo)
    private MySelfCircleView msfPhoto;
    @ViewInject(R.id.cai_name)
    private TextView caiName;
    @ViewInject(R.id.cai_small_name)
    private TextView caiSmallName;
    @ViewInject(R.id.ll_cai)
    private LinearLayout llCai;
    @ViewInject(R.id.cai_content)
    private TextView caiContent;
    @ViewInject(R.id.cai_shicai)
    private TextView caiShiCai;
    @ViewInject(R.id.lv_shicai)
    private MyListView lvMain;
    @ViewInject(R.id.lv_othershicai)
    private MyListView otherLv;
    @ViewInject(R.id.cai_CookTime)
    private TextView caiCookTime;
    @ViewInject(R.id.cai_cheng)
    private MyListView lvChe;
    private int rid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caipu_item);
        x.view().inject(this);
        caiBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras = getIntent().getExtras();
        rid = extras.getInt("id");
        downHotCaiPu();
    }
//下载数据
    private void downHotCaiPu() {
        String hotCaiPuUrl = Constant.HOT_CAI_PU;
        RequestParams params=new RequestParams(hotCaiPuUrl);
        params.addBodyParameter("sign", "df04ef8cf3aab201ce09175f64129ac4");
        params.addBodyParameter("uid", "10282642");
        params.addBodyParameter("return_request_id", "");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("rid", rid+"");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parseHotCaiPu(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void parseHotCaiPu(String result) {
        Gson gson=new Gson();
        CaipuData caipuData = gson.fromJson(result, CaipuData.class);
        CaipuData.ResultBean.InfoBean info = caipuData.getResult().getInfo();
        Picasso.with(this).load(info.getCover()).placeholder(R.mipmap.default_high).into(caiPhoto);
        caiTitle.setText(info.getTitle());
        caiTime.setText(info.getCreateTime()+"");
        caiViewCount.setText(info.getViewCount()+"");
        caiCommentCount.setText(info.getCommentCount()+"");
        caiCookTime.setText(info.getCookTime()+"");
        CaipuData.ResultBean.InfoBean.UserInfoBean userInfo = info.getUserInfo();
        Picasso.with(this).load(userInfo.getAvatar()).placeholder(R.mipmap.default_high).into(msfPhoto);
        caiName.setText(userInfo.getUserName());
        caiSmallName.setText(userInfo.getIntro());
        for(int i=0;i<userInfo.getFavoriteList().size();i++){
            TextView tv=new TextView(this);
            tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.MATCH_PARENT));
            tv.setSingleLine(true);
            tv.setPadding(20,0,0,0);
            tv.setText(userInfo.getFavoriteList().get(i).getName());
            llCai.addView(tv);
        }
        caiContent.setText(info.getIntro());
        List<CaipuData.ResultBean.InfoBean.MainStuffBean> mainStuff = info.getMainStuff();
        List<CaipuData.ResultBean.InfoBean.OtherStuffBean> otherStuff = info.getOtherStuff();
        List<CaipuData.ResultBean.InfoBean.StepsBean> steps = info.getSteps();
        aboutShiListView(mainStuff);
        aboutOtherListView(otherStuff);
        aboutStepListView(steps);
    }

    private void aboutShiListView(List<CaipuData.ResultBean.InfoBean.MainStuffBean> mainStuff) {
        lvMain.setFocusable(false);
        MainfoodAdapter adapter=new MainfoodAdapter(mainStuff,this);
        lvMain.setAdapter(adapter);
    }
    private void aboutOtherListView(List<CaipuData.ResultBean.InfoBean.OtherStuffBean> otherStuff) {
        otherLv.setFocusable(false);
        OtherfoodAdapter adapter=new OtherfoodAdapter(otherStuff,this);
        otherLv.setAdapter(adapter);
    }
    private void aboutStepListView(List<CaipuData.ResultBean.InfoBean.StepsBean> steps) {
        lvChe.setFocusable(false);
        StepfoodAdapter adapter=new StepfoodAdapter(steps,this);
        lvChe.setAdapter(adapter);
    }
}
