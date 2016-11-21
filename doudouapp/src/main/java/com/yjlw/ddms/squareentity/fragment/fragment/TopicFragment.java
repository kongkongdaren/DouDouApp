package com.yjlw.ddms.squareentity.fragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.squareentity.fragment.entity.Result;

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

    private View view;
    private ListView mLv;
    private LinearLayout mLl;
    private ViewPager mVp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        bundle.getString("tabName");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.squareen_fragment, null);
        mLv = (ListView) view.findViewById(R.id.lv_id);

        View inflate=inflater.inflate(R.layout.squareen_topic_image_viewpager, null);
        mLl = (LinearLayout) inflate.findViewById(R.id.ll_container_id);
        mVp = (ViewPager) inflate.findViewById(R.id.vp_id);

        mLv.addHeaderView(inflate);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        //准备数据源
        List<Result.ResultBean> TempDs=new LinkedList<>();

        //

        //

        super.onActivityCreated(savedInstanceState);
    }

}
