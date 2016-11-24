package com.yjlw.ddms.fristentity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yjlw.ddms.fristentity.fragment.views.VideoPagerFragment;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月24  17:13
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class VideoPagerAdapter extends FragmentStatePagerAdapter {
     private List<VideoPagerFragment> videoPager;
    public VideoPagerAdapter(FragmentManager fm,List<VideoPagerFragment> videoPager) {
        super(fm);
        this.videoPager=videoPager;
    }

    @Override
    public Fragment getItem(int position) {
        return videoPager.get( position);
    }

    @Override
    public int getCount() {
        return videoPager.size();
    }
}
