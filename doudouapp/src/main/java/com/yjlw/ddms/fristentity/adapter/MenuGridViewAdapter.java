package com.yjlw.ddms.fristentity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yjlw.ddms.R;
import com.yjlw.ddms.fristentity.entity.MenuSort;
import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;

import java.util.List;

/**
 * Description：GridView适配器 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月23  18:51
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class MenuGridViewAdapter extends HomeCustomBaseAdapter <MenuSort.ResultBean.ListBean.TagsBean>{
    public MenuGridViewAdapter(List<MenuSort.ResultBean.ListBean.TagsBean> lists, Context context) {
        super(lists, context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh=null;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.menu_sort_gv_item,null);
            vh=new ViewHolder();
           vh.btnGrid= (Button) convertView.findViewById(R.id.btn_menu_gv);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        vh.btnGrid.setText(lists.get(position).getName());
        return convertView;
    }
    private final class ViewHolder{
        private Button btnGrid;
    }
}
