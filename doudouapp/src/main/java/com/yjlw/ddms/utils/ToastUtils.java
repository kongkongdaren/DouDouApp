package com.yjlw.ddms.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Simple to Introduction

 * @ClassName: ToastUtils
 * @Description: [吐司工具类]
 * @Author: 原海忠
 * @Version: [v1.0]
 */
public class ToastUtils {
    public  static void showToast(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();

    }
}