package com.yjlw.ddms.application;

import android.app.Application;

import org.xutils.x;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月16  20:14
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class xUtilsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
