package com.yjlw.ddms.squareentity.fragment.utils;

import android.util.Log;

import com.yjlw.ddms.common.Constant;

import org.xutils.http.RequestParams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Description：下载工具类<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 7:16
 *
 * @author 李磊
 * @version : 1.0
 */

public class HttpUtils {

    public static byte[] downloadJsonDataMethod(){
        String thirdPage = Constant.THIRD_PAGE;
        RequestParams params = new RequestParams(thirdPage);
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");

        return null;
    }
}
