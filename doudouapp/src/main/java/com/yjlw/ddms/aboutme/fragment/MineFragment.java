package com.yjlw.ddms.aboutme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yjlw.ddms.R;
import com.yjlw.ddms.aboutme.views.SettingItemClickView;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月16  18:01
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class MineFragment extends Fragment {
    private SettingItemClickView mPublic;
    private SettingItemClickView mDynamic;
    private SettingItemClickView mMessage;
    private SettingItemClickView mGift_change;
    private SettingItemClickView mMake_money;
    private SettingItemClickView mDownload_id;
    private SettingItemClickView mCollect;
    private SettingItemClickView mList;
    private SettingItemClickView mHaodouxz;
    private SettingItemClickView mOrder;
    private SettingItemClickView mMycoupons;
    private SettingItemClickView mAddress;
    private View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate( R.layout.activity_about_me, null);
        //界面控件实例的获取
        initWidget();


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    //界面控件实例的获取
    private void initWidget() {
        mPublic = (SettingItemClickView) view.findViewById(R.id.mv_public_menu_id);
        mPublic.setTextView("发布菜单");
        mPublic.setLeftImage(R.mipmap.ico_center_camera);

        mDynamic = (SettingItemClickView) view.findViewById(R.id.mv_my_dynamic_id);
        mDynamic.setTextView("我的动态");
        mPublic.setLeftImage(R.mipmap.ico_user_my_dynamic);

        mMessage = (SettingItemClickView) view.findViewById(R.id.mv_message_id);
        mMessage.setTextView("消息");
        mMessage.setLeftImage(R.mipmap.ico_user_my_message);

        mMake_money = (SettingItemClickView) view.findViewById(R.id.mv_make_money_id);
        mMake_money.setTextView("做任务赚豆币");
        mMake_money.setLeftImage(R.mipmap.ico_user_zrwzdb);

        mGift_change = (SettingItemClickView) view.findViewById(R.id.mv_gift_change_id);
        mGift_change.setTextView("礼品兑换");
        mGift_change.setLeftImage(R.mipmap.ico_user_gift_exchange);

        mDownload_id = (SettingItemClickView)view. findViewById(R.id.mv_download_id);
        mDownload_id.setTextView("我的下载");
        mDownload_id.setLeftImage(R.mipmap.ico_user_mydown);

        mCollect = (SettingItemClickView) view.findViewById(R.id.mv_collect_id);
        mCollect.setTextView("我的收藏");
        mCollect.setLeftImage(R.mipmap.ico_user_myfav);

        mList = (SettingItemClickView) view.findViewById(R.id.mv_list_id);
        mList.setTextView("采购清单");
        mList.setLeftImage(R.mipmap.ico_user_purchase_list);

        mHaodouxz = (SettingItemClickView) view.findViewById(R.id.mv_haodouxz_id);
        mHaodouxz.setTextView("好豆小智");
        mHaodouxz.setLeftImage(R.mipmap.ico_user_haodouxz);

        mOrder = (SettingItemClickView) view.findViewById(R.id.mv_order_id);
        mOrder.setTextView("我的订单");
        mOrder.setOrderTextView("查看全部订单");
        mOrder.setLeftImage(R.mipmap.ico_user_myorder);

        mMycoupons = (SettingItemClickView)view.findViewById(R.id.user_mycoupons);
        mMycoupons.setTextView("我的优惠券");
        mMycoupons.setLeftImage(R.mipmap.ico_user_mycoupons);

        mAddress = (SettingItemClickView) view.findViewById(R.id.user_address);
        mAddress.setTextView("收货地址");
        mAddress.setLeftImage(R.mipmap.ico_user_sign_in_on);
    }
}
