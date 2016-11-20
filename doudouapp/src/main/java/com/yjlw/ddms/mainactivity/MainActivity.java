package com.yjlw.ddms.mainactivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.yjlw.ddms.R;
import com.yjlw.ddms.aboutme.fragment.MineFragment;
import com.yjlw.ddms.fristentity.fragment.FirstFragment;
import com.yjlw.ddms.homeentity.fragment.HomeFragment;
import com.yjlw.ddms.squareentity.fragment.SquareFragment;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.Collections;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.rg_group)
    private RadioGroup rg;
    private FragmentManager manager;
    private LinkedList<Fragment> list;
    private Fragment currentFragment;// 目前的Fragment
    private static boolean isExit = false;//true表示退出，false表示不退出
    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {

            super.handleMessage(msg);

            isExit = false;
        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        x.view().inject(this);
        //获得FragmentManager的实例
        manager = getSupportFragmentManager();

        //准备Fragment的实例
        prepareFragment();

        //关于RadioGroup的操作（点击下角图标，跳转到相应的Fragment）
        aboutRadioGroup();


        //默认先展示首页
        currentFragment = list.get(0);
        startFragment(0);
    }

    private void startFragment(int i) {
        // 思路：
        FragmentTransaction beginTransaction = manager.beginTransaction();

        // 1、隐藏当前的
        beginTransaction.hide(currentFragment);

        // 2、判断选中的RadioButton对应的Fragment是否曾经附着在容器控件上
        Fragment nowFrament = list.get(i);

        // ①附着上了，就显示
        // ②没有附着，先附着，再显示
        if (!nowFrament.isAdded()) {

            beginTransaction.add(R.id.fl_content, nowFrament);

        }

        beginTransaction.show(nowFrament);

        // 3、将目前选中Fragment赋值给当前currentFragment
        currentFragment = nowFrament;

        // 4、commit
        beginTransaction.commit();
    }
    /**
     * 按俩次返回退出
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
            Toast.makeText(getApplicationContext(), "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            // 利用handler延迟发送更改状态信息
            handler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }


    /**
     * 关于RadioGroup的操作（点击下角图标，跳转到相应的Fragment）
     */
    private void aboutRadioGroup() {
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //遍历RadioGroup，找到被点击的RadioButton，跳转到相应的Fragment
                for (int j = 0; j < radioGroup.getChildCount(); j++) {
                    if (radioGroup.getChildAt(j).getId() == i) {

                        startFragment(j);
                    }

                }
            }
        });
    }

    /**
     * 准备Fragment的实例
     */
    private void prepareFragment() {
        FirstFragment beanFragment=new FirstFragment();
        HomeFragment homeFragment=new HomeFragment();
        SquareFragment squreFragment=new SquareFragment();
        MineFragment mineFragment=new MineFragment();
        list=new LinkedList<>();
        Collections.addAll(list,beanFragment,homeFragment,squreFragment,mineFragment);
    }
}
