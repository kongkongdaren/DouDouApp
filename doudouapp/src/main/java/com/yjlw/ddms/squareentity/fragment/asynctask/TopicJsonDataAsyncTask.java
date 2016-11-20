package com.yjlw.ddms.squareentity.fragment.asynctask;

import android.os.AsyncTask;

import com.yjlw.ddms.squareentity.fragment.utils.HttpUtils;

/**
 * Description：下载JSON数据的异步任务<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 7:25
 *
 * @author 李磊
 * @version : 1.0
 */

public class TopicJsonDataAsyncTask extends AsyncTask<String,Void,byte[]> {
    private MyJsonCallBack callBack;

    public TopicJsonDataAsyncTask(MyJsonCallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    protected byte[] doInBackground(String... strings) {
        byte[] bytes = HttpUtils.downloadJsonDataMethod(strings[0]);
        return bytes;
    }

    @Override
    protected void onPostExecute(byte[] bytes) {
//        if(bytes!=null && bytes.length>0){
//            List<Result.ResultBean> resultBeen = ParserJSONDataUtils.parserJSONDataMethod(bytes);
//            callBack.setJSONDataToDs(resultBeen);
//        }
        super.onPostExecute(bytes);
    }
    public interface MyJsonCallBack{
//        void setJSONDataToDs(List<Result.ResultBean> resultBeen);
    }
}
