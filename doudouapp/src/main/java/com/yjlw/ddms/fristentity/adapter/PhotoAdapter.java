package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.PhotoData;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  0:06
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class PhotoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
     private List<PhotoData.DataBean.ListBean> list;
     private Context context;
    private MyItemClickListener listener;

    public void setOnItemClickListener(MyItemClickListener listener) {
        this.listener = listener;
    }

    public PhotoAdapter(List<PhotoData.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.photo_item,parent,false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (listener!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position2=holder.getLayoutPosition();
                    String url=list.get(position).getUrl();
                    String url2=null;
                    String url3=null;
                    if(url.contains("collect")){
                        url2 = url.substring(url.lastIndexOf("id=")+3);
                        url3 = "http://www.haodou.com/recipe/album/"+url2+"/";
                    }else{
                        url2 = url.substring(url.lastIndexOf("id=")+3,url.lastIndexOf("&"));

                        url3 = "http://www.haodou.com/recipe/"+url2+"/";
                    }
                    listener.onItemClick(holder.itemView, url3);
                }
            });
        }
        MyViewHolder mvh= (MyViewHolder) holder;
        Picasso.with(context).load(list.get(position).getImgs().get(0)).placeholder(R.mipmap.default_high).into(mvh.ivPhoto);
        mvh.tvPhotoName.setText(list.get(position).getTitle());
        mvh.tvPhotoContent.setText(list.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
     private final class MyViewHolder extends  RecyclerView.ViewHolder{
         private ImageView ivPhoto;
         private TextView tvPhotoName;
         private TextView tvPhotoContent;
         public MyViewHolder(View itemView) {
             super(itemView);
            ivPhoto= (ImageView) itemView.findViewById(R.id.iv_photo);
             tvPhotoName= (TextView) itemView.findViewById(R.id.tv_photo_title);
             tvPhotoContent= (TextView) itemView.findViewById(R.id.tv_photo_content);

         }
     }
    /**
     * 自定义回调接口
     */
    public interface MyItemClickListener{
        void onItemClick(View view,String url3);
    }
}
