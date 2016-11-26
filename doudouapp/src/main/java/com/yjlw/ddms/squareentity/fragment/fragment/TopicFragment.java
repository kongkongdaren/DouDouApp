package com.yjlw.ddms.squareentity.fragment.fragment;

import android.content.Context;
import android.os.Bundle;
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
import com.yjlw.ddms.squareentity.fragment.adapter.MyBaseAdapter;
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

import it.sephiroth.android.library.picasso.Picasso;

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

    private Result result1;
    private List<Result.ResultBean.AdBean> ad = new LinkedList<>();
    private List<Result.ResultBean.GroupBean> groupBeans = new LinkedList<>();
    private View view;
    private ListView mLv;
    private LinearLayout mLl;
    private ViewPager mVp;
    private List<Result.ResultBean.HotBean> hot;
    private int i;
    private View squareen_topic_group;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        bundle.getString("tabName");
        i = bundle.getInt("i");

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {

        if(i==0){
            //填充布局文件squareen_fragment
            view = inflater.inflate(R.layout.squareen_fragment, null);
            mLv = (ListView) view.findViewById(R.id.lv_sq_id);

            DownloadData();

        }else if(i==1){
        //TODO
            //关于豆友的

        }else{
        //TODO
            //关于动态的
        }
        return view;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        if(i==0){

        }else if(i==1){

        }else{

        }
        super.onActivityCreated(savedInstanceState);
    }

    //下载数据
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

        groupBeans.addAll(result1.getResult().getGroup());//向ListView中添加数据源

        // Log.i("log",groupBeans.toString());
        hot = result1.getResult().getHot();

        ad.addAll(result1.getResult().getAd());

        View inflate = View.inflate(getContext(),R.layout.squareen_topic_image_viewpager, null);
        mLl = (LinearLayout) inflate.findViewById(R.id.ll_container_id);
        mVp = (ViewPager) inflate.findViewById(R.id.vp_id);

        //填充ViewPager布局文件
        mLv.addHeaderView(inflate);

        //关于ViewPager的操作
        //aboutViewPager();

        //添加实时热点
        View squareen_real_time = View.inflate(getContext(),R.layout.squareen_real_time, null);
        mLv.addHeaderView(squareen_real_time);

        ListViewAdapter adapter = new ListViewAdapter(hot, getContext());

        mLv.setAdapter(adapter);

        //添加分割线
        View squareen_view = View.inflate(getContext(),R.layout.squareen_view, null);
        mLv.addFooterView(squareen_view);

        //添加话题小组
        squareen_topic_group = View.inflate(getContext(),R.layout.squareen_topic_group,null);
        mLv.addFooterView(squareen_topic_group);

        for(int i=0;i<groupBeans.size();i++){
            //填充控件
            View squareen_topic_group_item = View.inflate(getContext(),R.layout.squareen_topic_group_item, null);
            mLv.addFooterView(squareen_topic_group_item);
            ImageView topic_group_item_image_id =(ImageView)squareen_topic_group_item.findViewById(R.id.topic_group_item_image_id);
            TextView tv_Name_id= (TextView) squareen_topic_group_item.findViewById(R.id.tv_Name_id);
            TextView tv_ViewDesc_id= (TextView) squareen_topic_group_item.findViewById(R.id.tv_ViewDesc_id);
            TextView tv_Desc_id= (TextView) squareen_topic_group_item.findViewById(R.id.tv_Desc_id);

            x.image().bind(topic_group_item_image_id,groupBeans.get(i).getImg());
            tv_Name_id.setText(groupBeans.get(i).getName());
            tv_ViewDesc_id.setText(groupBeans.get(i).getViewDesc());
            tv_Desc_id.setText(groupBeans.get(i).getDesc());
        }

        //清空数据源
        groupBeans.clear();

    }

    //实时热点
    private class ListViewAdapter extends HomeCustomBaseAdapter<Result.ResultBean.HotBean> {
        @Override
        public int getCount() {
            return 3;
        }

        public ListViewAdapter(List<Result.ResultBean.HotBean> hot, Context context) {
            super(hot, context);
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            ViewHolder vh = null;
            if (convertView == null) {
                convertView = View.inflate(context, R.layout.squareen_item, null);
                vh = new ViewHolder();
                vh.imageView= (ImageView) convertView.findViewById(R.id.iv_real_time_iamge);
                vh.title= (TextView) convertView.findViewById(R.id.tv_title_id);
                vh.LeftimageView= (ImageView) convertView.findViewById(R.id.iv_left_iamge_id);
                vh.username= (TextView) convertView.findViewById(R.id.tv_username_id);
                vh.tv_content= (TextView) convertView.findViewById(R.id.tv_content_id);
                vh.tv_dianji_count_id= (TextView) convertView.findViewById(R.id.tv_dianji_count_id);
                vh.tv_message_count_id= (TextView) convertView.findViewById(R.id.tv_message_count_id);
                convertView.setTag(vh);
            } else {
                vh = (ViewHolder) convertView.getTag();
            }
            x.image().bind(vh.imageView,hot.get(i).getImg());
            vh.title.setText(hot.get(i).getTitle());
            x.image().bind(vh.LeftimageView,hot.get(i).getAvatar());
            vh.username.setText(hot.get(i).getUserName());
            vh.tv_content.setText(hot.get(i).getPreviewContent());
            vh.tv_dianji_count_id.setText(hot.get(i).getDigCount()+"");
            vh.tv_message_count_id.setText(hot.get(i).getCommentCount()+"");

            return convertView;
        }

        private final class ViewHolder {
            ImageView imageView;
            TextView title;
            ImageView LeftimageView;
            TextView username;
            TextView tv_content;
            TextView tv_dianji_count_id;
            TextView tv_message_count_id;
        }
    }
}
