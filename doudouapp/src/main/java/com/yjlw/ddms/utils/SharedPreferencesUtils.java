package com.yjlw.ddms.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Simple to Introduction
 *
 * @Description: 参数偏好工具类
 * @Author: 原海忠
 * @CreateDate: 2016/11/7
 * @Version: [v1.0]
 */
public class SharedPreferencesUtils {
    private static final String SP_NAMW = "config";

    /**
     * 保存Boolean类型的参数偏好设置
     *
     * @param context
     * @param key
     * @param vlaue
     */
    public static void saveBoolean(Context context, String key, boolean vlaue) {
        SharedPreferences mPref = context.getSharedPreferences(SP_NAMW, Context.MODE_PRIVATE);
        mPref.edit().putBoolean(key, vlaue).commit();

    }

    /**
     * 提取Boolean类型的参数偏好设置
     *
     * @param context
     * @param key
     * @param defVlaue
     * @return
     */
    public static boolean getBoolean(Context context, String key, boolean defVlaue) {
        SharedPreferences mPref = context.getSharedPreferences(SP_NAMW, Context.MODE_PRIVATE);
        return mPref.getBoolean(key, defVlaue);
    }

    /**
     * 保存String类型的参数偏好设置
     *
     * @param context
     * @param key
     * @param vlaue
     */
    public static void saveString(Context context, String key, String vlaue) {
        SharedPreferences mPref = context.getSharedPreferences(SP_NAMW, Context.MODE_PRIVATE);
        mPref.edit().putString(key, vlaue).commit();
    }

    /**
     * 获取String类型的参数偏好设置
     *
     * @param context
     * @param key
     * @param defVlaue
     * @return
     */
    public static String getString(Context context, String key, String defVlaue) {
        SharedPreferences mPref = context.getSharedPreferences(SP_NAMW, Context.MODE_PRIVATE);
        return mPref.getString(key, defVlaue);
    }

    /**
     * 保存Int类型的参数偏好设置
     *
     * @param context
     * @param key
     * @param vlaue
     */
    public static void saveInt(Context context, String key, int vlaue) {
        SharedPreferences mPref = context.getSharedPreferences(SP_NAMW, Context.MODE_PRIVATE);
        mPref.edit().putInt(key, vlaue).commit();
    }

    /**
     * 获取Int类型的参数偏好设置
     *
     * @param context
     * @param key
     * @param defVlaue
     * @return
     */
    public static int getInt(Context context, String key, int defVlaue) {
        SharedPreferences mPref = context.getSharedPreferences(SP_NAMW, Context.MODE_PRIVATE);
        return mPref.getInt(key, defVlaue);
    }


}