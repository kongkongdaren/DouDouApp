package com.yjlw.ddms.homeentity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.yjlw.ddms.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * 特价趁现在
 */
public class EveryBargainPriceActivity extends AppCompatActivity {
    @ViewInject(R.id.lv_bargain_price)
    private ListView lvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_every_bargain_price);
        x.view().inject(this);
        aboutListView();
    }

    /**
     * ListView的操作
     */
    private void aboutListView() {

    }
}
