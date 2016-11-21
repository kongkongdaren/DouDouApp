package com.yjlw.ddms.fristentity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yjlw.ddms.R;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  14:18
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotTitleFragment extends Fragment {

    private ListView lv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        String hotNames = arguments.getString("hotName");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.title_fragment,container,false);
        lv = (ListView) view.findViewById(R.id.lv_title);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        aboutListView();
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * 关于ListView的操作
     */
    private void aboutListView() {
    }
}

