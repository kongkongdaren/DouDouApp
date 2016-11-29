package com.yjlw.ddms.aboutme.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.yjlw.ddms.R;
import com.yjlw.ddms.baidumap.LocationActivity;
import com.yjlw.ddms.utils.SharedPreferencesUtils;
import com.yjlw.ddms.utils.ToastUtils;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by 王俞娟 on 2016/11/28.
 */

public class LoginActivity extends AppCompatActivity {
    @ViewInject(R.id.et_user_name)
    private EditText mUserName;
    @ViewInject(R.id.et_user_pwd)
    private EditText mUserPwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        x.view().inject(this);
    }

    /**
     * 用户登录
     *
     * @param view
     */
    @Event(type = View.OnClickListener.class, value = R.id.btn_user_login_id)
    private void downAddress(View view) {
        SharedPreferencesUtils.saveString(this, "userName", mUserName.getText().toString());
        SharedPreferencesUtils.saveString(this, "userName", mUserPwd.getText().toString());
        ToastUtils.showToast(this, "登录成功");
        //TODO 向远程服务器发送请求
        finish();
    }


}
