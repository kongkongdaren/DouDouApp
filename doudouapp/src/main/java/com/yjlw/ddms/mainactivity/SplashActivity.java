package com.yjlw.ddms.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

import com.yjlw.ddms.R;
import com.yjlw.ddms.utils.SharedPreferencesUtils;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;


public class SplashActivity extends AppCompatActivity {
    @ViewInject(R.id.rl_root)
    private RelativeLayout rlRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        x.view().inject(this);
        startAnim();
    }

    /**
     * 启动动画效果
     */
    private void startAnim() {
        AnimationSet set = new AnimationSet(false);//动画集合
        //旋转动画
        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setFillAfter(true);
        //缩放动画
        ScaleAnimation scale = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(1000);
        scale.setFillAfter(true);
        //渐变动画
        AlphaAnimation alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(1000);
        alpha.setFillAfter(true);
        set.addAnimation(rotate);
        set.addAnimation(scale);
        set.addAnimation(alpha);
        //设置动画监听
        set.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            //结束
            @Override
            public void onAnimationEnd(Animation animation) {
                //跳转到新手引导页
                jumpNextPage();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        rlRoot.startAnimation(set);

    }

    /**
     * 跳转下一个页面
     */
    private void jumpNextPage() {
        //判断之前有没有显示过新手引导页面
        boolean userGuide = SharedPreferencesUtils.getBoolean(this, "is_user_guide_show", false);
        if (!userGuide) {
            startActivity(new Intent(this, GuideActivity.class));

        } else {
            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
    }
}
