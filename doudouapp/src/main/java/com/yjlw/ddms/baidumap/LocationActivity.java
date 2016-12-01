package com.yjlw.ddms.baidumap;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.KeyEvent;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MyLocationConfiguration;
import com.baidu.mapapi.map.MyLocationData;
import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.baidumap.entity.AddressInfo;
import com.yjlw.ddms.utils.SharedPreferencesUtils;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * 定位操作
 */
public class LocationActivity extends BaiduMapBaseActivity {
    public LocationClient mLocationClient;
    public BDLocationListener myListener = new MyLocationListener();
    private BitmapDescriptor geo;
    private BaiduMapReceiver baiduMapReceiver;
    private LocalBroadcastManager localBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        localBroadcast = LocalBroadcastManager.getInstance(this);
        lacate();
        //        setContentView(R.layout.activity_location_demo);
    }

    private void lacate() {
        mLocationClient = new LocationClient(getApplicationContext());
        mLocationClient.registerLocationListener(myListener);
        LocationClientOption option = new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);// 设置定位模式
        option.setCoorType("bd09ll");// 返回的定位结果是百度经纬度,默认值gcj02
        option.setScanSpan(5000);// 设置发起定位请求的间隔时间为5000ms
        option.setIsNeedAddress(true);// 返回的定位结果包含地址信息
        option.setNeedDeviceDirect(true);// 返回的定位结果包含手机机头的方向
        mLocationClient.setLocOption(option);
        geo = BitmapDescriptorFactory.fromResource(R.mipmap.icon_geo);
        MyLocationConfiguration configuration = new MyLocationConfiguration
                (MyLocationConfiguration.LocationMode.FOLLOWING, true, geo);

        baiduMap.setMyLocationConfigeration(configuration);// 设置定位显示的模式
        baiduMap.setMyLocationEnabled(true);// 打开定位图层
    }

    @Override
    protected void onStart() {
        mLocationClient.start();
        super.onStart();
    }

    @Override
    protected void onPause() {
        mLocationClient.stop();
        super.onPause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_1:
                // 正常
                baiduMap.setMyLocationConfigeration(new MyLocationConfiguration
                        (MyLocationConfiguration.LocationMode.NORMAL, true, geo));// 设置定位显示的模式
                break;
            case KeyEvent.KEYCODE_2:
                // 罗盘
                baiduMap.setMyLocationConfigeration(new MyLocationConfiguration
                        (MyLocationConfiguration.LocationMode.COMPASS, true, geo));// 设置定位显示的模式
                break;
            case KeyEvent.KEYCODE_3:
                // 跟随
                baiduMap.setMyLocationConfigeration(new MyLocationConfiguration
                        (MyLocationConfiguration.LocationMode.FOLLOWING, true, geo));// 设置定位显示的模式
                break;

            default:
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class MyLocationListener implements BDLocationListener {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            if (bdLocation != null) {
                MyLocationData data = new MyLocationData.Builder().latitude(bdLocation
                        .getLatitude()).longitude(bdLocation.getLongitude()).build();
                baiduMap.setMyLocationData(data);

                Log.i("Log", bdLocation.getLatitude() + "," + bdLocation.getLongitude());
                double longitude = bdLocation.getLongitude();
                double latitude = bdLocation.getLatitude();
                SharedPreferencesUtils.saveString(getApplicationContext(),"longitude",longitude+"");
                SharedPreferencesUtils.saveString(getApplicationContext(),"latitude",latitude+"");
                String url = "http://api.haoservice.com/api/getLocationinfor";
                RequestParams params = new RequestParams(url);
                params.addBodyParameter("latlng", bdLocation.getLatitude() + "," + bdLocation
                        .getLongitude());
                params.addBodyParameter("type", "2");
                params.addBodyParameter("key", "9eb3943f742c430fae3178ba5dcf9717");
                x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
                    @Override
                    public void onSuccess(String s) {
                        Log.i("Log", s);
                        parserAddressInFo(s);
                    }

                    @Override
                    public void onError(Throwable throwable, boolean b) {

                    }

                    @Override
                    public void onCancelled(CancelledException e) {

                    }

                    @Override
                    public void onFinished() {

                    }
                });
            }
        }
    }

    private void parserAddressInFo(String s) {
        Gson gson = new Gson();
        AddressInfo addressInfo = gson.fromJson(s, AddressInfo.class);
        String address = addressInfo.getResult().getAddress();
        //动态注册一个广播，用于发送定位信息
        baiduMapReceiver = new BaiduMapReceiver();
        Intent intent = new Intent();

        intent.setAction("pic");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
//        intent.putExtra("flg", addressInfo);

        localBroadcast.sendBroadcast(intent);
        Log.i("Log", addressInfo.toString());
        SharedPreferencesUtils.saveString(this, "addressinfo", address);
    }

    /**
     * 位置广播发送
     */
    private class BaiduMapReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

        }
    }
}
