package com.yjlw.ddms.squareentity.fragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yjlw.ddms.squareentity.fragment.fragment.TopicViewPagerFragment;

import java.util.List;

/**
 * Description：ViewPagerAdapter自定义适配器<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月21下午 1:43
 *
 * @author 李磊
 * @version : 1.0
 */

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<TopicViewPagerFragment> tempDs;

    public MyViewPagerAdapter(FragmentManager fm, List<TopicViewPagerFragment> tempDs) {
        super(fm);
        this.tempDs=tempDs;
    }

    @Override
    public Fragment getItem(int position) {
        return tempDs.get( position% tempDs.size());
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
}
