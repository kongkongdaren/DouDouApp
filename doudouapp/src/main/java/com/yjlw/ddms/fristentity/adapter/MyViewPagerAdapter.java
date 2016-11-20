package com.yjlw.ddms.fristentity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yjlw.ddms.fristentity.fragment.ViewPagerFragment;

import java.util.List;

/**
 * Description：自定义适配器 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月19  0:09
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<ViewPagerFragment> pager;
    public MyViewPagerAdapter(FragmentManager fm,List<ViewPagerFragment> pager) {
        super(fm);
        this.pager=pager;
    }

    @Override
    public Fragment getItem(int position) {
        return pager.get( position% pager.size());
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
}
