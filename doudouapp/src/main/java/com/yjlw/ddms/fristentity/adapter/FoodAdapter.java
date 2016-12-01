package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.FoodData;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年12月01  19:24
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class FoodAdapter extends BaseAdapter {
    private final int VIDEO = 0; //有视频
    private final int NO_VIDEO = 1;//没有视屏
    private final int NUM = 2;//布局数量


    List<FoodData.ResultBean.ListBean> list;
    private Context context;

    public FoodAdapter(List<FoodData.ResultBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getViewTypeCount() {
        return NUM;
    }

    @Override
    public int getItemViewType(int position) {

        if(list.get(position).getDuration().equals("")){

            return NO_VIDEO;

        }else{

            return VIDEO;

        }

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        VIDEO_Holder vh = null;
        NO_VIDEO_Holder nrh = null;

        int type = getItemViewType(i);

        if (view == null) {

            switch (type) {

                case VIDEO:

                    view = View.inflate(context, R.layout.item_food_1, null);

                    vh = new VIDEO_Holder();

                    vh.img = (ImageView) view.findViewById(R.id.kit_img);
                    vh.tv1 = (TextView) view.findViewById(R.id.kit_tv1);
                    vh.tv2 = (TextView) view.findViewById(R.id.kit_tv2);
                    vh.tv3 = (TextView) view.findViewById(R.id.kit_tv3);

                    view.setTag(vh);

                    break;

                case NO_VIDEO:

                    view = View.inflate(context, R.layout.item_food_2, null);

                    nrh = new NO_VIDEO_Holder();

                    nrh.img = (ImageView) view.findViewById(R.id.kit_img);
                    nrh.tv1 = (TextView) view.findViewById(R.id.kit_tv1);
                    nrh.tv2 = (TextView) view.findViewById(R.id.kit_tv2);
                    nrh.tv3 = (TextView) view.findViewById(R.id.kit_tv3);

                    view.setTag(nrh);

                    break;

                default:
                    break;
            }

        } else {

            switch (type) {

                case VIDEO:

                    vh = (VIDEO_Holder) view.getTag();

                    break;

                case NO_VIDEO:

                    nrh = (NO_VIDEO_Holder) view.getTag();

                    break;

                default:
                    break;
            }
        }


        FoodData.ResultBean.ListBean listBean = list.get(i);
        switch (type) {

            case VIDEO:

                vh.tv1.setText(listBean.getTitle());
                vh.tv2.setText(listBean.getCollection());
                vh.tv3.setText(listBean.getStuff());

                Picasso.with(context).load(listBean.getCover()).
                        placeholder(R.mipmap.default_high).into(vh.img);

                break;

            case NO_VIDEO:

                nrh.tv1.setText(listBean.getTitle());
                nrh.tv2.setText(listBean.getCollection());
                nrh.tv3.setText(listBean.getStuff());

                Picasso.with(context).load(listBean.getCover()).
                        placeholder(R.mipmap.default_high).into(nrh.img);

                break;

        }


        return view;
    }


    private final class VIDEO_Holder {

        private ImageView  img;
        private TextView   tv1;
        private TextView   tv2;
        private TextView   tv3;

    }

    private final class NO_VIDEO_Holder {

        private ImageView  img;
        private TextView   tv1;
        private TextView   tv2;
        private TextView   tv3;

    }

}
