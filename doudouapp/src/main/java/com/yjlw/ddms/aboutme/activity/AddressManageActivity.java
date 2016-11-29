package com.yjlw.ddms.aboutme.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

public class AddressManageActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_home_back)
    private ImageView back;
    @ViewInject(R.id.tv_save)
    private TextView tvSave;//保存

    @ViewInject(R.id.et_user_name)
    private EditText etUserName;//收货人
    @ViewInject(R.id.et_user_number_phone)
    private EditText etUserPhoneNumber;//联系电话

    @ViewInject(R.id.tv_address_street)
    private TextView tvaddressStreet;//地区

    @ViewInject(R.id.tv_address_region)
    private TextView tvaddressRegion;//街道

    @ViewInject(R.id.et_detailed_address)
    private EditText etDetailedAddress;//详细地址

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_manage);
        x.view().inject(this);
    }

    @Event(type = View.OnClickListener.class, value = R.id.btn_pay)
    private void saveAddress(View view) {

    }
}