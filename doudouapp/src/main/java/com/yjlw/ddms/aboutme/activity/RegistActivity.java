package com.yjlw.ddms.aboutme.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.utils.SharedPreferencesUtils;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by 王俞娟 on 2016/11/28.
 */

public class RegistActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_home_back)
    private ImageView back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        x.view().inject(this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
//        SharedPreferencesUtils.saveString(this, "userName", mUserName.getText().toString());
    }
}
