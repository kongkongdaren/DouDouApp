package com.yjlw.ddms.fristentity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.fragment.HotTitleFragment;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.LinkedList;
import java.util.List;

/**
 * Description：热门菜谱页面 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  12:43
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotTitleActivity extends AppCompatActivity {
   @ViewInject(R.id.iv_back)
    private ImageView ivBack;
    @ViewInject(R.id.tb_id)
    private TabLayout tbLayout;
    @ViewInject(R.id.vp_id)
    private ViewPager vp;
    private List<HotTitleFragment> fragments;
    private String[] hotNames;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classtitle);
        //控件实例的获取
        x.view().inject(this);
        hotNames = getResources().getStringArray(R.array.hottitlename);
        aboutViewPager();
        aboutTabLayout();
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 finish();
            }
      });
    }




    /**
     * 关于TabLayout
     */
    private void aboutTabLayout() {
        //建立TabLayout与ViewPager的关联
        tbLayout.setupWithViewPager(vp);
    }

    /**
     * 关于ViewPager的操作
     */
    private void aboutViewPager() {
        fragments = new LinkedList<>();
        for (String hotName:hotNames){
            HotTitleFragment fragment=new HotTitleFragment();
            Bundle args=new Bundle();
            args.putString("hotName",hotName);
            fragment.setArguments(args);
            fragments.add(fragment);

        }
        //适配器
        MyFragmentPagerAdapter adapter=new MyFragmentPagerAdapter(getSupportFragmentManager());
        //绑定适配器
        vp.setAdapter(adapter);
    }

    /**
     * 自定义适配器
     */
    private final class MyFragmentPagerAdapter extends FragmentStatePagerAdapter{

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return hotNames[position];
        }
    }
    @Override
    public void onBackPressed() {
        HotTitleActivity.this.finish();
        super.onBackPressed();
    }


}
