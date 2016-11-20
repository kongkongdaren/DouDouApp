package com.yjlw.ddms.fristentity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yjlw.ddms.R;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月19  0:01
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class ViewPagerFragment extends Fragment {

    private ImageView ivPhoto;
    private TextView tvAdverTitle;
    private String title;
    private String img;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        // 从宿主获得传入的值
        Bundle arguments = getArguments();
        title = arguments.getString("title");
         img = arguments.getString("img");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bean_advertise_item, container, false);
        ivPhoto = (ImageView) view.findViewById(R.id.iv_photo_id);
        tvAdverTitle = (TextView) view.findViewById(R.id.tv_advertise_title);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        tvAdverTitle.setText(title);
        Picasso.with(getContext()).load(img).into(ivPhoto);
        super.onActivityCreated(savedInstanceState);
    }
}
