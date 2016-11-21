package com.yjlw.ddms.squareentity.fragment.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.fragment.FirstFragment;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.squareentity.fragment.adapter.MyViewPagerAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.Result;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Description：话题Fragment<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 1:59
 *
 * @author 李磊
 * @version : 1.0
 */

public class TopicFragment extends Fragment {
    private boolean isTaskRun;
    private Result.ResultBean resultBean;
    private List<TopicViewPagerFragment> tempDs;
    private Timer htimer;
    private TimerTask htimerTask;
    private Result result1;
    private List<Result.ResultBean.AdBean> ad = new LinkedList<>();
    private List<Result.ResultBean.GroupBean> groupBeans = new LinkedList<>();
    private View view;
    private ListView mLv;
    private LinearLayout mLl;
    private ViewPager mVp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        //                Bundle bundle = getArguments();
        //                bundle.getString("tabName");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.squareen_fragment, null);
        mLv = (ListView) view.findViewById(R.id.lv_sq_id);

        View inflate = inflater.inflate(R.layout.squareen_topic_image_viewpager, null);
        mLl = (LinearLayout) inflate.findViewById(R.id.ll_container_id);
        mVp = (ViewPager) inflate.findViewById(R.id.vp_id);

        mLv.addHeaderView(inflate);

        //数据下载

        //准备数据源
        DownloadData();

        return view;
    }

    private void DownloadData() {
        String thirdPage = Constant.THIRD_PAGE;
        RequestParams params = new RequestParams(thirdPage);
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parserThirdPager(result);
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

    //Gson解析数据
    private void parserThirdPager(String result) {

        Gson gson = new Gson();
        result1 = gson.fromJson(result, Result.class);
        String img = result1.getResult().getAd().get(0).getImg();
        groupBeans.addAll(result1.getResult().getGroup());//向ListView中添加数据源
        ad.addAll(result1.getResult().getAd());

        ListViewAdapter adapter = new ListViewAdapter(groupBeans, getContext());
        mLv.setAdapter(adapter);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    private class ListViewAdapter extends HomeCustomBaseAdapter<Result.ResultBean.GroupBean> {

        public ListViewAdapter(List<Result.ResultBean.GroupBean> lists, Context context) {
            super(lists, context);
            Log.i("Log", lists.toString());
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            ViewHolder vh = null;
            if (convertView == null) {
                convertView = View.inflate(context, R.layout.squareen_item, null);
                vh = new ViewHolder();
                vh.imageView= (ImageView) convertView.findViewById(R.id.iv_real_time_iamge);
                vh.title= (TextView) convertView.findViewById(R.id.tv_title_id);
                convertView.setTag(vh);
            } else {
                vh = (ViewHolder) convertView.getTag();
            }
            x.image().bind(vh.imageView,lists.get(i).getImg());
            vh.title.setText(lists.get(i).getName());
            return convertView;
        }

        private final class ViewHolder {
            ImageView imageView;
            TextView title;
        }
    }
}
