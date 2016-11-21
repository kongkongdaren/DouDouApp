package com.yjlw.ddms.squareentity.fragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yjlw.ddms.R;

/**
 * Description：动态Fragment<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 1:59
 *
 * @author 李磊
 * @version : 1.0
 */

public class DynamicFragment extends Fragment {

    private View view;
    private ListView mLv;

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
        mLv = (ListView) view.findViewById(R.id.lv_sq__id);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        //准备数据源

        //准备适配器
        //MyBaseAdapter adapter=new MyBaseAdapter();

        //绑定适配器
        //mLv.setAdapter(adapter);
        super.onActivityCreated(savedInstanceState);
    }
}
