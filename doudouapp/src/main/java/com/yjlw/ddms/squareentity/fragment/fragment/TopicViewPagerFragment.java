package com.yjlw.ddms.squareentity.fragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yjlw.ddms.R;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：图片轮播的Fragment<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月21上午 9:27
 *
 * @author 李磊
 * @version : 1.0
 */

public class TopicViewPagerFragment extends Fragment {

    private ImageView mPhoto;
    private String img;
    private String url;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        img = bundle.getString("img");
        Log.i("img",img);
        url = bundle.getString("url");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.squareen_topic_image, container,false);
        mPhoto = (ImageView) view.findViewById(R.id.iv_topic_photo_id);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Picasso.with(getContext()).load(img).placeholder(R.mipmap.default_high).into(mPhoto);
        super.onActivityCreated(savedInstanceState);
    }
}
