package com.yjlw.ddms.homeentity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.entity.LabelDetailsResult;
import com.yjlw.ddms.homeentity.homelogic.HomeTitleItem;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

import static android.R.attr.key;

/**
 * 标签页面
 */
public class HomeLabelActivity extends AppCompatActivity {
    private List<LabelDetailsResult> labelDetailsResults = new LinkedList<>();
    List<LabelDetailsResult.ResultBean.ListBean> list = new LinkedList<>();
    private String detailsResult;
    @ViewInject(R.id.lv_details)
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_label);
        Bundle bundle = this.getIntent().getExtras();
        detailsResult = bundle.getString("detailsResult");
        x.view().inject(this);
        initView();
        downLoadData();

    }

    private void initView() {

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
        LabelDetailsResult labelResult = gson.fromJson(s, LabelDetailsResult.class);
        labelDetailsResults.add(labelResult);
        list.addAll(labelResult.getResult().getList());

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
