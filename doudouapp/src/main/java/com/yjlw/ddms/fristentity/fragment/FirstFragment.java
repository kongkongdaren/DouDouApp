package com.yjlw.ddms.fristentity.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.common.Constant;
import com.yjlw.ddms.fristentity.activity.HotActivity;
import com.yjlw.ddms.fristentity.activity.HotTitleActivity;
import com.yjlw.ddms.fristentity.adapter.MyFirstPagerAdapter;
import com.yjlw.ddms.fristentity.adapter.MyViewPagerAdapter;
import com.yjlw.ddms.fristentity.entity.FirstPagerData;
import com.yjlw.ddms.fristentity.views.HaoDouTitleCclickItem;
import com.yjlw.ddms.fristentity.views.PhotographCategoryView;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import it.sephiroth.android.library.picasso.Picasso;

import static android.view.View.inflate;

/**
 * Description： 好豆页面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月16  17:55
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class FirstFragment extends Fragment {

    private View view;
    private ViewPager vp;
    private ListView rlv;
    private LinearLayout llContainer;
    private List<FirstPagerData.DataBean> beanlist = new LinkedList<>();
    private List<ViewPagerFragment> pager;
    private int index = 1;
    private boolean isTaskRun;
    private boolean flg;// true：当前页的数据加载完毕；false：没有还在完毕
    private int pageIndex = 0;// 页码
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
               vp.setCurrentItem(++index);
            }
            super.handleMessage(msg);
        }
    };
    private Timer htimer;
    private TimerTask htimerTask;
    private View classify;
    private View imageSelfView;
    private List<FirstPagerData.DataBean.HeaderBean.ListBeanX> listClass;
    private HaoDouTitleCclickItem classVedio;
    private HaoDouTitleCclickItem classKitchen;
    private HaoDouTitleCclickItem classHotActivity;
    private HaoDouTitleCclickItem classMenu;
    private HaoDouTitleCclickItem classTitle;
    private List<FirstPagerData.DataBean.ListBean> listBeen;
    private PhotographCategoryView pcvDinner;
    private PhotographCategoryView pcvLoon;
    private PhotographCategoryView pcvEat;
    private PhotographCategoryView pcvOldDiet;
    private PhotographCategoryView pcHotSpecial;
    private List<FirstPagerData.DataBean.HeaderBean.ListBeanX> photoList;
    private ProgressDialog dialog;
    private ProgressBar pbContent;
    private MyFirstPagerAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_haoodu, null);
        View viewPager = inflate(getContext(), R.layout.bean_advertisement, null);
        vp = (ViewPager) viewPager.findViewById(R.id.vp_id);
        pbContent = (ProgressBar) view.findViewById(R.id.pb_content);
        rlv = (ListView) view.findViewById(R.id.lv_first);
        llContainer = (LinearLayout) viewPager.findViewById(R.id.ll_container_id);
        rlv.addHeaderView(viewPager);
        classify = inflate(getContext(), R.layout.bean_selfview_classify, null);
        rlv.addHeaderView(classify);//给ListView添加分类布局
        imageSelfView = inflate(getContext(), R.layout.bean_imageselfview, null);

        rlv.addHeaderView(imageSelfView);//给ListView添加图片布局


        loadFirstPagerData();
        return this.view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //界面控件实例的获取
        initWidget();
        super.onActivityCreated(savedInstanceState);

    }

    /**
     * 界面控件实例的获取
     */
    private void initWidget() {
        classTitle = (HaoDouTitleCclickItem) classify.findViewById(R.id.htc_poprecipe);
        classVedio = (HaoDouTitleCclickItem) classify.findViewById(R.id.htc_video);
        classKitchen = (HaoDouTitleCclickItem) classify.findViewById(R.id.htc_kitchen);
        classHotActivity = (HaoDouTitleCclickItem) classify.findViewById(R.id.htc_hot_activity);
        classMenu = (HaoDouTitleCclickItem) classify.findViewById(R.id.htc_menu_classify);
        pcvDinner = (PhotographCategoryView) imageSelfView.findViewById(R.id.pcv_dinner);
        pcvLoon = (PhotographCategoryView) imageSelfView.findViewById(R.id.pcv_loon);
        pcvEat = (PhotographCategoryView) imageSelfView.findViewById(R.id.pcv_eat);
        pcvOldDiet = (PhotographCategoryView) imageSelfView.findViewById(R.id.pcv_old_diet);
        pcHotSpecial = (PhotographCategoryView) imageSelfView.findViewById(R.id.pcv_hot_special);
    }

    /**
     * 下载数据
     */
    private void loadFirstPagerData() {
        String url = Constant.ONE_PAGE;
        RequestParams params = new RequestParams(url);

        params.addBodyParameter("_HOP_", "{\"sign\":\"ba4767a053ddfe6f66c3a265cc23251f\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479269055," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        params.addBodyParameter("appid", "2");
        params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        params.addBodyParameter("channel", "anzhi_v6115");
        params.addBodyParameter("deviceid", "haodou864394010208983");
        params.addBodyParameter("from", "android");
        params.addBodyParameter("ip", "172.16.152.15");
        params.addBodyParameter("limit", "30");
        params.addBodyParameter("loguid", "0");
        params.addBodyParameter("network", "WIFI");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        params.addBodyParameter("vc", "105");
        params.addBodyParameter("virtual", "0");
        params.addBodyParameter("vn", "6.1.15");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                //Log.i("Log", "首页下载的数据是" + result);
                    parserFirstPager(result);
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

    /**
     * 解析数据
     *
     * @param result
     */
    private void parserFirstPager(String result) {
        Gson gson = new Gson();
        FirstPagerData firstPagerData = gson.fromJson(result, FirstPagerData.class);
        List<FirstPagerData.DataBean.HeaderBean.ListBeanX> listAder = firstPagerData.getData().getHeader().get(0).getList();
        if(listAder==null){
            pbContent.setVisibility(View.VISIBLE);
        }else{
            pbContent.setVisibility(View.GONE);
        }
        listBeen = firstPagerData.getData().getList();
        aboutListView(listBeen);
        listClass = firstPagerData.getData().getHeader().get(1).getList();
        classTitle.setTextView(listClass.get(0).getTitle());
        ImageView recipeIcon = (ImageView) classTitle.findViewById(R.id.iv_haodou_icon);
        Picasso.with(getContext()).load(listClass.get(0).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(recipeIcon);
        classTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), HotTitleActivity.class));
            }
        });
        classVedio.setTextView(listClass.get(1).getTitle());
        ImageView vedioIcon = (ImageView) classVedio.findViewById(R.id.iv_haodou_icon);
        Picasso.with(getContext()).load(listClass.get(1).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(vedioIcon);

        classKitchen.setTextView(listClass.get(2).getTitle());
        ImageView kitchenIcon = (ImageView) classKitchen.findViewById(R.id.iv_haodou_icon);
        Picasso.with(getContext()).load(listClass.get(2).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(kitchenIcon);

        classHotActivity.setTextView(listClass.get(3).getTitle());
        ImageView hotIcon = (ImageView) classHotActivity.findViewById(R.id.iv_haodou_icon);
        Picasso.with(getContext()).load(listClass.get(3).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(hotIcon);
        classHotActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), HotActivity.class));
            }
        });
        classMenu.setTextView(listClass.get(4).getTitle());
        ImageView menuIcon = (ImageView) classMenu.findViewById(R.id.iv_haodou_icon);
        Picasso.with(getContext()).load(listClass.get(4).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(menuIcon);

        photoList = firstPagerData.getData().getHeader().get(2).getList();
        pcvDinner.setTextView(photoList.get(0).getTitle());
        pcvDinner.setSmallTextView(photoList.get(0).getDesc());
        ImageView dinnerIcon= (ImageView) pcvDinner.findViewById(R.id.iv_dinner);
        Picasso.with(getContext()).load(photoList.get(0).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(dinnerIcon);
        pcvLoon.setTextView(photoList.get(1).getTitle());
        pcvLoon.setSmallTextView(photoList.get(1).getDesc());
        ImageView loonIcon= (ImageView) pcvLoon.findViewById(R.id.iv_dinner);
        Picasso.with(getContext()).load(photoList.get(1).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(loonIcon);
        pcvEat.setTextView(photoList.get(2).getTitle());
        pcvEat.setSmallTextView(photoList.get(2).getDesc());
        ImageView eatIcon= (ImageView) pcvEat.findViewById(R.id.iv_dinner);
        Picasso.with(getContext()).load(photoList.get(2).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(eatIcon);
        TextView  tvPcvOld= (TextView) pcvOldDiet.findViewById(R.id.tv_dinner_big);
        tvPcvOld.setMaxLines(2);
        tvPcvOld.setMaxEms(5);
        tvPcvOld.setEllipsize(TextUtils.TruncateAt.END);
        tvPcvOld.setText(photoList.get(3).getTitle());
        pcvOldDiet.setSmallTextView(photoList.get(3).getDesc());
        ImageView oldDietIcon= (ImageView) pcvOldDiet.findViewById(R.id.iv_dinner);
        Picasso.with(getContext()).load(photoList.get(3).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(oldDietIcon);
        pcHotSpecial.setTextView(photoList.get(4).getTitle());
        pcHotSpecial.setSmallTextView(photoList.get(4).getDesc());
        ImageView hotSpecialIcon= (ImageView)pcHotSpecial.findViewById(R.id.iv_dinner);
        Picasso.with(getContext()).load(photoList.get(4).getImgs().get(0)).error(R.mipmap.ic_main_logo).into(hotSpecialIcon);
        // 2、关于ViewPager的操作
        aboutViewPager(listAder);

        // 3、关于小圆点的操作
        aboutLittleDots();
    }

    private void aboutListView(List<FirstPagerData.DataBean.ListBean> listBeen) {
        //适配器
        adapter = new MyFirstPagerAdapter(listBeen, getContext());
         rlv.setAdapter(adapter);
         rlv.setOnScrollListener(new MyOnScrollListener());
    }
    private final class MyOnScrollListener implements AbsListView.OnScrollListener{

        @Override
        public void onScrollStateChanged(AbsListView absListView, int scrollState) {
            if(scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE && flg){

            }
        }

        @Override
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            flg = firstVisibleItem + visibleItemCount == totalItemCount;
        }
    }


    private void aboutViewPager(List<FirstPagerData.DataBean.HeaderBean.ListBeanX> listAder) {
        pager = new LinkedList<>();
        for (int i = 0; i < listAder.size(); i++) {
            ViewPagerFragment vpf = new ViewPagerFragment();
            Bundle args = new Bundle();
            args.putString("title", listAder.get(i).getTitle());
            args.putString("img", listAder.get(i).getImgs().get(0));
            args.putString("url", listAder.get(i).getUrl());
            vpf.setArguments(args);
            pager.add(vpf);
        }
        //适配器
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(getFragmentManager(), pager);
        //绑定适配器
        vp.setAdapter(adapter);
        // 给ViewPger添加监听器，决定小圆点的状态
        vp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                index = position;
                position = position % pager.size();
                // ViewPager决定小圆点的状态
                for (int i = 0; i < pager.size(); i++) {// 状态复原
                    llContainer.getChildAt(i).setEnabled(true);

                }

                // 将position位置处的小圆点enable属性值设置为false
                llContainer.getChildAt(position).setEnabled(false);
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                  /* state: 0空闲，1是滑行中，2加载完毕 */

                if (state == 0 && !isTaskRun) {
                    startTask();
                } else if (state == 1 && isTaskRun) {
                    stopTask();
                } else if (state == 2) {
                }
                super.onPageScrollStateChanged(state);
            }
        });
    }

    private void startTask() {
        isTaskRun = true;
        htimer = new Timer();
        htimerTask = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        };
        htimer.schedule(htimerTask, 2 * 1000, 2 * 1000);// 这里设置自动切换的时间，单位是毫秒，2*1000表示2秒，
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

            llContainer.addView(iv);
        }

        // 默认第一个小圆点是选中的状态
        llContainer.getChildAt(0).setEnabled(false);

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
            vp.setCurrentItem((Integer) v.getTag());
        }

    }

    /**
     * 停止定时任务
     */
    private void stopTask() {
        isTaskRun = false;
        htimer.cancel();
    }

    /**
     * 重新获得焦点
     */
    public void onResume() {
        super.onResume();
        startTask();
    }

    /**
     * 失去焦点
     */
    @Override
    public void onPause() {
        super.onPause();
        stopTask();
    }

}
