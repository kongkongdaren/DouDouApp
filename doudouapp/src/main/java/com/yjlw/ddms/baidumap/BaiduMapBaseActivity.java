package com.yjlw.ddms.baidumap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.overlayutil.PoiOverlay;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiDetailResult;
import com.baidu.mapapi.search.poi.PoiDetailSearchOption;
import com.baidu.mapapi.search.poi.PoiNearbySearchOption;
import com.baidu.mapapi.search.poi.PoiResult;
import com.baidu.mapapi.search.poi.PoiSearch;
import com.google.gson.Gson;
import com.yjlw.ddms.R;
import com.yjlw.ddms.baidumap.entity.AddressInfo;
import com.yjlw.ddms.baidumap.entity.GpsAddress;
import com.yjlw.ddms.utils.SharedPreferencesUtils;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;


public class BaiduMapBaseActivity extends AppCompatActivity {

    protected BaiduMap baiduMap;
    protected MapView mapview;
    protected double latitude = 40.050966;// 经度
    protected double longitude = 116.303128;// 纬度
    //    39.913248,116.403624
    protected LatLng hmPos = new LatLng(latitude, longitude);
    private PoiSearch poiSearch;
    private LatLng currentPos;
    protected EditText etFood;
    private String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initManager();

        setContentView(R.layout.activity_base);
        etFood = (EditText) findViewById(R.id.et_food);
        init();
    }

    private void initManager() {
    }

    private void init() {
        // 设置地图级别（V2.X 3-19 V1.X 3-18）
        // ① 修改了文件的格式 优化了空间的使用（北京 110M 15M）
        // ② 增加了级别 3D效果（18 19）
        mapview = (MapView) findViewById(R.id.mapview);
        baiduMap = mapview.getMap();
        // BaiduMap: 管理具体的某一个MapView ： 旋转，移动，缩放，事件。。

        // 描述地图状态将要发生的变化 使用工厂类MapStatusUpdateFactory创建

        MapStatusUpdate mapstatusUpdate = MapStatusUpdateFactory.zoomTo(15);// 默认的级别12
        // 设置缩放级别
        baiduMap.setMapStatus(mapstatusUpdate);

        // LatLng latlng = new LatLng(arg0, arg1);// 坐标 经纬度 参数1 纬度 参数2 经度
        MapStatusUpdate mapstatusUpdatePoint = MapStatusUpdateFactory.newLatLng(hmPos);
        // 设置中心点 默认是天安门
        baiduMap.setMapStatus(mapstatusUpdatePoint);

        // mapview.showZoomControls(false);// 默认是true 显示缩放按钮
        //
        // mapview.showScaleControl(false);// 默认是true 显示标尺

    }

    public void OkAddress(View view) {
        String currentLongitude = SharedPreferencesUtils.getString(getApplicationContext(),
                "longitude", "");
        String currentLatitude = SharedPreferencesUtils.getString(getApplicationContext(),
                "latitude", "");
        double currLong = Double.parseDouble(currentLongitude);
        double currLati = Double.parseDouble(currentLatitude);
        String url = "http://api.haoservice.com/api/convertlnglat";
        RequestParams params = new RequestParams(url);
        //        39.913248,116.403624
        Log.i("Log", currLati + "," + currLong);

        params.addBodyParameter("old_lnglat", currLong + "," + currLati);
        //                params.addBodyParameter("type", "2");
        params.addBodyParameter("key", "cebfba62dbf04e1db8a6d4c3e352e062");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
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

    private void parserAddressInFo(String s) {
        Gson gson = new Gson();
        Log.i("Log", s);

        GpsAddress gpsAddress = gson.fromJson(s, GpsAddress.class);
        GpsAddress.ResultBean result = gpsAddress.getResult();
        address = gpsAddress.getResult().getCity() + gpsAddress.getResult().getDist()+result.getArea()+result.getTown();
        Log.i("Log", gpsAddress.toString());
        SharedPreferencesUtils.saveString(this, "gspAddress", address);
finish();
    }

    /**
     * 搜索周边
     *
     * @param view
     */
    public void searchAction(View view) {

        search();
    }

    private void search() {
        startActivity(new Intent(getApplicationContext(), PoiSearchInCityDemo.class));
        //
    }

    @Override
    protected void onDestroy() {
        mapview.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        mapview.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mapview.onPause();
        super.onPause();
    }
}
