package com.yjlw.ddms.squareentity.fragment.fragment;

import android.content.Context;
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
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.squareentity.fragment.adapter.MyViewPagerAdapter;
import com.yjlw.ddms.squareentity.fragment.entity.Lists;
import com.yjlw.ddms.squareentity.fragment.entity.Result;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;


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
    private View Topicview;
    private ListView mLv;
    private LinearLayout mLl;
    private ViewPager mVp;
    private List<Result.ResultBean.HotBean> hot;
    private int i;
    private int index=0;
    private View squareen_topic_group;
    private ProgressBar progressBar;
    private List<TopicViewPagerFragment> pager;
    private Handler handler;
    private Lists lists;
    private View beanFriendview;
    private ListView beanFriendListView;
    private List<Lists.ResultBean.ListBean> list;
    private ProgressBar beanfiend_progressbar_id;

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
            Topicview = inflater.inflate(R.layout.squareen_fragment, null);
            mLv = (ListView) Topicview.findViewById(R.id.lv_sq_id);
            progressBar = (ProgressBar) Topicview.findViewById(R.id.progressbar_id);

            TopicDownloadData();
            return Topicview;

        }else if(i==1){
            //TODO
            //关于豆友的
            beanFriendview = inflater.inflate(R.layout.squareen_beanfriend_listview, null);
            beanFriendListView = (ListView) beanFriendview.findViewById(R.id.lv_beanfiend_sq_id);
            beanfiend_progressbar_id = (ProgressBar) beanFriendview.findViewById(R.id.beanfiend_progressbar_id);
            BeanFriendDownLoadData();
            return beanFriendview;
        }else{
            //TODO
            //关于动态的
            DynamicDownLoadData();
        }
       return null;
    }



    //豆友的数据下载
    private void BeanFriendDownLoadData() {
        String thirdPageBeanFirend = Constant.THIRD_PAGE_BEAN_FIREND;
        RequestParams params = new RequestParams(thirdPageBeanFirend);
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid	", "0");
        params.addBodyParameter("position", "中国北京市东城区西长安街");
        params.addBodyParameter("lng", "116.403625");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("lat", "39.913249");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("log",result);
                parserThirdPagerBeanFirend(result);
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

    //豆友数据进行的Gson解析
    private void parserThirdPagerBeanFirend(String result) {
        Gson gson=new Gson();
        lists = gson.fromJson(result, Lists.class);
        list = lists.getResult().getList();
        if(list==null){
            beanfiend_progressbar_id.setVisibility(View.VISIBLE);
        }else{
            beanfiend_progressbar_id.setVisibility(View.GONE);
        }

//        MyBeanFriendBaseAdapter adapter=new MyBeanFriendBaseAdapter(list,getContext());
//
//        beanFriendListView.setAdapter(adapter);

    }


    //动态的数据下载
    private void DynamicDownLoadData() {
        String thirdPageDynamic = Constant.THIRD_PAGE_DYNAMIC;
        RequestParams params = new RequestParams(thirdPageDynamic);
        params.addBodyParameter("limit", "10");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid	", "0");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                parserThirdPagerDynamic(result);
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
    //动态数据进行的Gson解析
    private void parserThirdPagerDynamic(String result) {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
    }

    //下载数据
    private void TopicDownloadData() {
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

        hot = result1.getResult().getHot();

        ad.addAll(result1.getResult().getAd());

        if(groupBeans==null && hot==null && ad==null){
            progressBar.setVisibility(View.VISIBLE);
        }else{
            progressBar.setVisibility(View.GONE);
        }
        View inflate = View.inflate(getContext(),R.layout.squareen_topic_image_viewpager, null);
        mLl = (LinearLayout) inflate.findViewById(R.id.ll_topic_container_id);
        mVp = (ViewPager) inflate.findViewById(R.id.topic_vp_id);

        //填充ViewPager布局文件
        mLv.addHeaderView(inflate);

        //关于ViewPager的操作
        aboutViewPager();

        // 3、关于小圆点的操作
        aboutLittleDots();
        circleShowPic();
        ad.clear();

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

    //关于V
    private void aboutViewPager() {
        pager = new LinkedList<>();
        for (int i = 0; i < ad.size(); i++) {
            TopicViewPagerFragment fragment = new TopicViewPagerFragment();
            Bundle args = new Bundle();
            args.putString("img", ad.get(i).getImg());
            args.putString("url", ad.get(i).getUrl());
            fragment.setArguments(args);
            pager.add(fragment);
        }
        //适配器
        MyViewPagerAdapter adapter=new MyViewPagerAdapter(getFragmentManager(),pager);
        //绑定适配器
        mVp.setAdapter(adapter);
        // 给ViewPger添加监听器，决定小圆点的状态
        mVp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // ViewPager决定小圆点的状态
                for (int i = 0; i < pager.size(); i++) {// 状态复原
                    mLl.getChildAt(i).setEnabled(true);
                }

                // 将position位置处的小圆点enable属性值设置为false
                mLl.getChildAt(position).setEnabled(false);
            }
        });
    }

    /**
     * 关于小圆点的操作
     */
    private void aboutLittleDots() {
        // 分析：
        // 1）小圆点的个数与ViewPager中数据源中Fragment的个数是一样的
        // 2）在占位的容器控件中，动态添加ImageView。
        // 3）联动效果的添加：
        // a)小圆点决定ViewPager当前页面的状态
        // b)ViewPager决定小圆点的状态

        MyOnClickListener listener = new MyOnClickListener();

        for (int i = 0; i < pager.size(); i++) {// 每循环一次，构建一个ImageView的实例，添加到占位的容器控件中
            ImageView iv = new ImageView(getActivity());
            iv.setImageResource(R.drawable.dot_selector);

            // 给ImageView添加标签
            iv.setTag(i);
            // 给小圆点添加监听器
            iv.setOnClickListener(listener);

            // ImageView控件上显示的图片，动态由Enabled属性值，根据选择器，来动态加载图片
            iv.setEnabled(true);

            mLl.addView(iv);
        }

        // 默认第一个小圆点是选中的状态
        mLl.getChildAt(0).setEnabled(false);

    }

    // OnClickListener点击事件监听器
    private final class MyOnClickListener implements View.OnClickListener {

        /*
         * (non-Javadoc)
         *
         * @see android.view.View.OnClickListener#onClick(android.view.View)
         */
        @Override
        public void onClick(View v) {
            // 小圆点决定ViewPager当前页面的状态
            mVp.setCurrentItem((Integer) v.getTag());
        }

    }
    private void circleShowPic() {
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                mVp.setCurrentItem(index++);
                if(index==pager.size()){
                    index=0;
                }
                handler.sendEmptyMessageDelayed(1,2000);
            }
        };
        handler.sendEmptyMessageDelayed(1,2000);
    }
}
