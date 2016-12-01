package com.yjlw.ddms.baidumap;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.overlayutil.PoiOverlay;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiDetailResult;
import com.baidu.mapapi.search.poi.PoiResult;
import com.baidu.mapapi.search.poi.PoiSearch;

import java.util.List;

/**
 * 城市内搜索
 */
public class PoiSearchInCityDemo extends BaiduMapBaseActivity {

    private PoiSearch poiSearch;
    private int currentPageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        poiSearch = PoiSearch.newInstance();
        poiSearch.setOnGetPoiSearchResultListener(new MyGetPoiSearchResultListener());

        search();

    }

    private void search() {

        PoiCitySearchOption cityOption = new PoiCitySearchOption();
        cityOption.city("北京市");
        cityOption.keyword("饭馆");//搜索的关键字
        cityOption.pageNum(currentPageIndex);
        poiSearch.searchInCity(cityOption);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_1) {
            currentPageIndex++;
            search();
        }
        return super.onKeyDown(keyCode, event);
    }

    private class MyGetPoiSearchResultListener implements OnGetPoiSearchResultListener {

        @Override
        public void onGetPoiResult(PoiResult poiResult) {
            if (poiResult == null || SearchResult.ERRORNO.RESULT_NOT_FOUND == poiResult.error) {
                Toast.makeText(getApplicationContext(), "没有搜索到", Toast.LENGTH_SHORT).show();
                return;
            }
            String text = "共" + poiResult.getTotalPageNum() + "页，共" + poiResult.getTotalPoiNum()
                    + "条，当前第" + poiResult.getCurrentPageNum() + "页，当前页" + poiResult
                    .getCurrentPageCapacity() + "条";
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            baiduMap.clear();//清空之前的覆盖物
            MyPoiOverLay overLay = new MyPoiOverLay(baiduMap);
            baiduMap.setOnMarkerClickListener(overLay);//把事件分发给overLay
            overLay.setData(poiResult);
            overLay.addToMap();//把搜索的结果添加到地图中
            overLay.zoomToSpan();//缩放地图
        }

        @Override
        public void onGetPoiDetailResult(PoiDetailResult poiDetailResult) {

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
            return super.onPoiClick(index);
        }
    }
}
