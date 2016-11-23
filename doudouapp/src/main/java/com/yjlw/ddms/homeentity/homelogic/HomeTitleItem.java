package com.yjlw.ddms.homeentity.homelogic;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.yjlw.ddms.homeentity.adapter.HomeCustomBaseAdapter;
import com.yjlw.ddms.homeentity.entity.LabelDetailsResult;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 到家的标签导航详情界面书写
 * @Author: 原海忠
 * @CreateDate: 2016/11/23
 * @Version: [v1.0]
 */
public class HomeTitleItem {
    private List<LabelDetailsResult> labelDetailsResults;
    private Context context;

    public HomeTitleItem(List<LabelDetailsResult> labelDetailsResults, Context context) {
        this.labelDetailsResults = labelDetailsResults;
        this.context = context;
        Log.i("Log", "接收的数据是："+labelDetailsResults.toString());
    }

    private class TitleItemBasAdapter extends HomeCustomBaseAdapter<LabelDetailsResult> {

        public TitleItemBasAdapter(List<LabelDetailsResult> lists, Context context) {
            super(lists, context);
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}