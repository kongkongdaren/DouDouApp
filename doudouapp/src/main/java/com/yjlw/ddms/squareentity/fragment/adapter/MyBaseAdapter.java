package com.yjlw.ddms.squareentity.fragment.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Description：自定义适配器<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 6:58
 *
 * @author 李磊
 * @version : 1.0
 */

public class MyBaseAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
//    private List<Result.ResultBean> ds;
//    private Context context;
//
//    public MyBaseAdapter(List<Result.ResultBean> ds, Context context) {
//        this.ds = ds;
//        this.context = context;
//    }
//
//    @Override
//    public int getCount() {
//        return ds.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return ds.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View convertView, ViewGroup viewGroup) {
//        ViewHolder vh=null;
//        if(convertView==null){
//            convertView=View.inflate(context, R.layout.squareen_topic_image,null);
//            vh=new ViewHolder();
//            vh.imageView= (ImageView) convertView.findViewById(R.id.iv_topic_image);
//            convertView.setTag(vh);
//        }else{
//            vh= (ViewHolder) convertView.getTag();
//        }
//        Result.ResultBean resultBean = ds.get(i);
//        Result.ResultBean.AdBean adBean = resultBean.getAd().get(i);
//
//        String img = adBean.getImg();
//        final ViewHolder finalVh = vh;
//        new TopicImageDataAsyncTask(new TopicImageDataAsyncTask.MyCallBack() {
//            @Override
//            public void setbitmapToImageView(Bitmap bitmap) {
//                finalVh.imageView.setImageBitmap(bitmap);
//            }
//        }).execute(img);
//        return convertView;
//    }
//
//    private final class ViewHolder{
//        ImageView imageView;
//    }
}
