package com.yjlw.ddms.baidumap;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.baidu.mapapi.map.BaiduMap;
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
import com.yjlw.ddms.utils.SharedPreferencesUtils;

import java.util.List;

/**
 * 周边搜索
 */
public class PoiSearchNearByDemo extends BaiduMapBaseActivity {

    private PoiSearch poiSearch;
    private LatLng currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String currentLongitude = SharedPreferencesUtils.getString(getApplicationContext(),
                "longitude", "");
        String currentLatitude = SharedPreferencesUtils.getString(getApplicationContext(),
                "latitude", "");
        double currLong = Double.parseDouble(currentLongitude);
        double currLati = Double.parseDouble(currentLatitude);
        currentPos = new LatLng(currLati, currLong);
        Log.i("Log",currentLatitude+","+currentLongitude+","+currLong+","+currLati);
        search();

    }

    private void search() {
        poiSearch = PoiSearch.newInstance();
        poiSearch.setOnGetPoiSearchResultListener(new MyGetPoiSearchResultListener());

        PoiNearbySearchOption nearbyOption = new PoiNearbySearchOption();
        nearbyOption.location(currentPos);//设置中心点
        nearbyOption.radius(1000);//设置半径
        nearbyOption.keyword(etFood.getText().toString());//关键字
        poiSearch.searchNearby(nearbyOption);
    }

    private class MyGetPoiSearchResultListener implements OnGetPoiSearchResultListener {

        @Override
        public void onGetPoiResult(PoiResult poiResult) {
            if (poiResult == null || SearchResult.ERRORNO.RESULT_NOT_FOUND == poiResult.error) {
                Toast.makeText(getApplicationContext(), "没有搜索到", Toast.LENGTH_SHORT).show();
                return;
            }

            MyPoiOverLay overLay = new MyPoiOverLay(baiduMap);
            baiduMap.setOnMarkerClickListener(overLay);//把事件分发给overLay
            overLay.setData(poiResult);
            overLay.addToMap();//把搜索的结果添加到地图中
            overLay.zoomToSpan();//缩放地图

        }

        @Override
        public void onGetPoiDetailResult(PoiDetailResult poiDetailResult) {
            if (poiDetailResult == null || SearchResult.ERRORNO.RESULT_NOT_FOUND ==
                    poiDetailResult.error) {
                Toast.makeText(getApplicationContext(), "没有搜索到", Toast.LENGTH_SHORT).show();
                return;
            }
            String text = poiDetailResult.getAddress() + "||" + poiDetailResult.getCommentNum() +
                    "||" + poiDetailResult.getEnvironmentRating() + "||" + poiDetailResult
                    .getPrice()+""+poiDetailResult.getTelephone();
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();

        }
    }

    private class MyPoiOverLay extends PoiOverlay {

        public MyPoiOverLay(BaiduMap baiduMap) {
            super(baiduMap);
        }

        @Override
        public boolean onPoiClick(int index) {
            PoiResult poiResult = getPoiResult();
            List<PoiInfo> allPoi = poiResult.getAllPoi();
            PoiInfo poiInfo = allPoi.get(index);//得到点击的那个POI信息
            String text = poiInfo.name + poiInfo.address;
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            PoiDetailSearchOption datailOption = new PoiDetailSearchOption();
            datailOption.poiUid(poiInfo.uid);//设置POI的UID
            poiSearch.searchPoiDetail(datailOption);
            return super.onPoiClick(index);
        }
    }
}
