package com.yjlw.ddms.baidumap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.yjlw.ddms.R;




public class BaseActivity extends AppCompatActivity {

    private MyBaduSdkReceiver baduSdkReceiver;
    private MapView mapView;
    private BaiduMap baiduMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initManager();
        setContentView(R.layout.activity_base);
        init();
    }

    private void initManager() {
        SDKInitializer.initialize(getApplicationContext());
        baduSdkReceiver = new MyBaduSdkReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR);// 注册网络错误
        filter.addAction(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR); //
        // 注册key校验结果
        registerReceiver(baduSdkReceiver, filter);
    }
    private void init() {
        mapView = (MapView) findViewById(R.id.mapview);
        baiduMap = mapView.getMap();
    }
   private  class MyBaduSdkReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String result = intent.getAction();
            switch (result) {
                case SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR:
                    //网络错误
                    Toast.makeText(context, "无网络", Toast.LENGTH_SHORT).show();
                    break;
                case SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR:
                    //key校验失败
                    Toast.makeText(context, "Key校验失败", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
