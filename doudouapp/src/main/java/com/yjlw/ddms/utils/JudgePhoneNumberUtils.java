package com.yjlw.ddms.utils;

import android.text.TextUtils;

/**
 * Simple to Introduction
 *
 * @Description: 判断电话号码的合法性
 * @Author: 原海忠
 * @CreateDate: 2016/11/17
 * @Version: [v1.0]
 */
public class JudgePhoneNumberUtils {

    public static boolean isPhoneNumberValid(String phoneNumber) {
        String telRegex = "[1][358]\\d{9}";
        //"[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(phoneNumber)) {
            return false;
        } else {
            return phoneNumber.matches(telRegex);
        }
    }
}