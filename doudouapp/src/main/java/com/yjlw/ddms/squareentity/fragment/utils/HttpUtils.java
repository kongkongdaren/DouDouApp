package com.yjlw.ddms.squareentity.fragment.utils;

import android.util.Log;

import com.yjlw.ddms.common.Constant;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Description：xxx<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 7:16
 *
 * @author 李磊
 * @version : 1.0
 */

public class HttpUtils {

    public static byte[] downloadJsonDataMethod(){
        try {
            String thirdPage = Constant.THIRD_PAGE;
            URL url=new URL(thirdPage);
            URLConnection conn = url.openConnection();
            conn.setReadTimeout(3000);
            conn.setConnectTimeout(3000);
            conn.connect();
            InputStream is = conn.getInputStream();
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] b=new byte[1024];
            int len=-1;
            while((len=is.read(b))!=-1){
                bos.write(b,0,len);
            }
            Log.i("download",bos.toString());
            return bos.toByteArray();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
