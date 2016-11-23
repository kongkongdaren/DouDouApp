package com.yjlw.ddms.homeentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yjlw.ddms.R;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

import static android.view.View.inflate;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/23
 * @Version: [v1.0]
 */
public class SpinnerAdapter extends BaseAdapter {
    private String[] address;
    private Context context;
    private TextView textView;

    public SpinnerAdapter(String[] address, Context context) {
        this.address = address;
        this.context = context;
    }

    @Override
    public int getCount() {
        return address.length;
    }

    @Override
    public Object getItem(int position) {
        return address[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        String item = (String) getItem(position);
        if (view == null) {
            view = View.inflate(context, R.layout.home_address_spinner_item, null);

            textView = (TextView) view.findViewById(R.id.tv_address_product);
        }
        textView.setText(item);
        return view;
    }
}