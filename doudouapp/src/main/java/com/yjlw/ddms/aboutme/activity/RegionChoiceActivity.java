package com.yjlw.ddms.aboutme.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.yjlw.ddms.R;
import com.yjlw.ddms.entity.Province;
import com.yjlw.ddms.utils.ParseXMLResource;

import java.util.List;

public class RegionChoiceActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner sp_province_id;
    private Spinner sp_city_id;
    private Spinner sp_county_id;
    private List<Province> provinces;
    private List<String> provinceNames;
    private ArrayAdapter<String> provinceAdapter;
    private ArrayAdapter<String> cityeAdapter;
    private ArrayAdapter<String> countyAdapter;
    private String selectedProvinceName;
    private String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_choice);

        // 思路：
        // 1、控件实例获取
        initWidgets();

        // 2、数据源
        provinces = ParseXMLResource.parseXML(this);
        prepareDataSource();

        // 3、适配器
        prepareAdapter();

        // 4、绑定适配器
        bindAdapterToSpinner();

        // 5、设置监听器
        setListenerToSpinner();

    }

    /**
     * 设置监听器
     */
    private void setListenerToSpinner() {
        // 给省份设置监听器
        sp_province_id.setOnItemSelectedListener(this);

        // 给市设置监听器
        sp_city_id.setOnItemSelectedListener(this);

        sp_county_id.setOnItemSelectedListener(this);
    }

    /**
     * 绑定适配器
     */
    private void bindAdapterToSpinner() {
        sp_province_id.setAdapter(provinceAdapter);
        sp_city_id.setAdapter(cityeAdapter);
        sp_county_id.setAdapter(countyAdapter);

    }

    /**
     * 适配器
     */
    private void prepareAdapter() {
        provinceAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, provinceNames);

        // 下述两个适配器不能指定数据源，因为数据源是变动的（若指定死，运行时，会崩溃！！！！）
        cityeAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item);

        countyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item);

    }

    /**
     * 数据源
     */
    private void prepareDataSource() {
        provinceNames = ParseXMLResource.getAllProvinceNames(provinces);

        // 市，县的数据源不是定值，而是变动的，不能给定
    }

    /**
     * 控件实例获取
     */
    private void initWidgets() {
        sp_province_id = (Spinner) findViewById(R.id.sp_province_id);
        sp_city_id = (Spinner) findViewById(R.id.sp_city_id);
        sp_county_id = (Spinner) findViewById(R.id.sp_county_id);

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * android.widget.AdapterView.OnItemSelectedListener#onItemSelected(android
     * .widget.AdapterView, android.view.View, int, long)
     */
    public void onItemSelected(AdapterView<?> parent, View view, int position,
                               long id) {
        List<String> contyNames =null;
        switch (parent.getId()) {
            case R.id.sp_province_id:// 若选中相应的省份，那么，会执行该case分支
                // 思路：
                // ①省份决定市
                selectedProvinceName = parent.getItemAtPosition(position)
                        .toString();

                List<String> cityNames = ParseXMLResource.getAllCityNames(
                        provinces, selectedProvinceName);
                cityeAdapter.clear();
                cityeAdapter.addAll(cityNames);
                sp_city_id.setSelection(0);

                // ②还决定县
                contyNames = ParseXMLResource.getAllCountyNames(provinces, selectedProvinceName, cityNames.get(0));

                countyAdapter.clear();
                countyAdapter.addAll(contyNames);
                sp_county_id.setSelection(0);


                break;
            case R.id.sp_city_id:// 若选中相应的城市，那么，会执行该case分支
                contyNames = ParseXMLResource.getAllCountyNames(provinces, selectedProvinceName,parent.getItemAtPosition(position).toString());

                countyAdapter.clear();
                countyAdapter.addAll(contyNames);
                sp_county_id.setSelection(0);
                break;
            case R.id.sp_county_id:

                break;

            default:
                break;
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * android.widget.AdapterView.OnItemSelectedListener#onNothingSelected(android
     * .widget.AdapterView)
     */
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void okAddressAction(View view){
        address = sp_province_id.getSelectedItem().toString()+"省（直辖市）" + sp_city_id
                .getSelectedItem().toString() +"市"+ sp_county_id.getSelectedItem().toString()+"县";
        Intent intent=new Intent(this,AddressManageActivity.class);
        Bundle extrs=new Bundle();
        extrs.putString("address",address);
        intent.putExtras(extrs);
        setResult(400, intent);
        finish();
    }
}
