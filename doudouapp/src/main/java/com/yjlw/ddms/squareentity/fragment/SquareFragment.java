package com.yjlw.ddms.squareentity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.yjlw.ddms.R;
import com.yjlw.ddms.squareentity.fragment.adapter.ViewPagerAdapter;
import com.yjlw.ddms.squareentity.fragment.fragment.TopicFragment;

import java.util.LinkedList;
import java.util.List;

/**
 * Description：广场 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月16  18:00
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class SquareFragment extends Fragment {

    private View view;
    private RadioGroup mRg;
    private ViewPager mVp;
    private List<TopicFragment> fragments;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.squareen_main,null);
        mRg = (RadioGroup) view.findViewById(R.id.rg_id);
        mVp = (ViewPager) view.findViewById(R.id.sqvp_id);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        //关于ViewPage
        aboutViewPager();

        //关于RadioGroup
        aboutRadioGroup();

        super.onActivityCreated(savedInstanceState);
    }

    //关于RadioGroup
    private void aboutRadioGroup() {
        // 给RadioGroup添加监听器
        mRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 遍历RadioGroup的子控件，找到被选中的那一个,让其决定ViewPager的状态
                for (int i = 0; i < group.getChildCount(); i++) {
                    RadioButton rb = (RadioButton) group.getChildAt(i);
                    if (rb.isChecked()) {
                        mVp.setCurrentItem(i);
                        break;
                    }

                }

            }

        });
    }

    //关于ViewPage
    private void aboutViewPager() {
        //数据源
        fragments = new LinkedList<>();
        for(int i=0;i<mRg.getChildCount();i++){
            TopicFragment topicFragment=new TopicFragment();

            Bundle bundle=new Bundle();
            bundle.putString("tabName",((RadioButton)mRg.getChildAt(i))
                    .getText().toString());
            bundle.putInt("i",i);
            topicFragment.setArguments(bundle);
            fragments.add(topicFragment);
        }

        //适配器
        ViewPagerAdapter adapter=new ViewPagerAdapter(getFragmentManager(),fragments);

        //绑定适配器
        mVp.setAdapter(adapter);

        //绑定监听器
        mVp.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            /*
             * (non-Javadoc)
             *
             * @see
             * android.support.v4.view.ViewPager.SimpleOnPageChangeListener#
             * onPageSelected(int)
             */
            @Override
            public void onPageSelected(int position) {
                // ViewPager决定RadioButton的状态
                RadioButton rb = (RadioButton) mRg.getChildAt(position);
                rb.setChecked(true);
            }
        });


    }
}
