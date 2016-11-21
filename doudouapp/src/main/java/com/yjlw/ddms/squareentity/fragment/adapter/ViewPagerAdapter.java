package com.yjlw.ddms.squareentity.fragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yjlw.ddms.squareentity.fragment.fragment.TopicFragment;

import java.util.LinkedList;
import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/21
 * @Version: [v1.0]
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<TopicFragment> fragments;
    public ViewPagerAdapter(FragmentManager fm, List<TopicFragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}