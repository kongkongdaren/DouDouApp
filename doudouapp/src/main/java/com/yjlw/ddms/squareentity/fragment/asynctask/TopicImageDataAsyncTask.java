package com.yjlw.ddms.squareentity.fragment.asynctask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;


import com.yjlw.ddms.squareentity.fragment.utils.HttpUtils;
import com.yjlw.ddms.squareentity.fragment.utils.ParserJSONDataUtils;

import java.util.List;

/**
 * Description：下载图片的异步任务<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 7:25
 *
 * @author 李磊
 * @version : 1.0
 */

public class TopicImageDataAsyncTask extends AsyncTask<String,Void,byte[]> {
    private MyCallBack callBack;

    public TopicImageDataAsyncTask(MyCallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    protected byte[] doInBackground(String... strings) {
        byte[] bytes = HttpUtils.downloadJsonDataMethod(strings[0]);
        return bytes;
    }

    @Override
    protected void onPostExecute(byte[] bytes) {
        if(bytes!=null && bytes.length>0){
            Bitmap bitmap= BitmapFactory.decodeByteArray(bytes,0,bytes.length);
            callBack.setbitmapToImageView(bitmap);

        }
        super.onPostExecute(bytes);
    }
    public interface MyCallBack{
        void setbitmapToImageView(Bitmap bitmap);
    }
}
