package com.yjlw.ddms.fristentity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yjlw.ddms.R;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月24  17:00
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class VideoPagerFragment extends Fragment {

    private String img;
    private ImageView ivVideo;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        // 从宿主获得传入的值
        Bundle arguments = getArguments();
        img = arguments.getString("img");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view= inflater.inflate(R.layout.video_pager_tem,container,false);
        ivVideo = (ImageView) view.findViewById(R.id.iv_video_photo_id);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Picasso.with(getContext()).load(img).placeholder(R.mipmap.default_high).into(ivVideo);
        super.onActivityCreated(savedInstanceState);
    }
}
