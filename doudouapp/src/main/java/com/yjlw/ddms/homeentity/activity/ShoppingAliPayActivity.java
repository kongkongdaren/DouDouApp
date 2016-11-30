package com.yjlw.ddms.homeentity.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.alipay.sdk.app.PayTask;
import com.yjlw.ddms.R;
import com.yjlw.ddms.aboutme.activity.AddressManageActivity;
import com.yjlw.ddms.aboutme.activity.LoginActivity;
import com.yjlw.ddms.homeentity.adapter.CommodityAdapter;
import com.yjlw.ddms.homeentity.entity.DataBean;
import com.yjlw.ddms.homeentity.entity.PayResult;
import com.yjlw.ddms.mainactivity.MainActivity;
import com.yjlw.ddms.utils.SharedPreferencesUtils;
import com.yjlw.ddms.utils.SignUtils;
import com.yjlw.ddms.utils.ToastUtils;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import static com.yjlw.ddms.R.string.price;
import static com.yjlw.ddms.common.Constants.PARTNER;
import static com.yjlw.ddms.common.Constants.RSA_PRIVATE;
import static com.yjlw.ddms.common.Constants.SDK_PAY_FLAG;
import static com.yjlw.ddms.common.Constants.SELLER;

/**
 * 阿里支付
 */
public class ShoppingAliPayActivity extends AppCompatActivity {
    @ViewInject(R.id.iv_back)
    private ImageView back;
    @ViewInject(R.id.iv_address)
    private ImageView ivAddress;
    @ViewInject(R.id.tv_total)
    private TextView tvTotal;//商品总价
    @ViewInject(R.id.tv_consignee)
    private TextView tvConsignee;//收货人
    @ViewInject(R.id.tv_address)
    private TextView tvAddress;//收货地址
    @ViewInject(R.id.tv_phone)
    private TextView tvPhone;//收货电话

    @ViewInject(R.id.lv_buy_product)
    private ListView lvBuyPro;//商品信息

    private Handler mHandler;

    private List<DataBean> dataBeens = new LinkedList<>();
    private float count = 0;
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_ali_pay);
        x.view().inject(this);

        SetAddressData();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = this.getIntent();
        List<DataBean> beens = (List<DataBean>) intent.getSerializableExtra("dataBeens");
        dataBeens.addAll(beens);
        for (int i = 0; i < dataBeens.size(); i++) {
            DataBean dataBean = dataBeens.get(i);
            float price = dataBean.getPrice() * dataBean.getCarNum();
            count = price + count;
        }
        tvTotal.setText("¥" + count);
        ivAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShoppingAliPayActivity.this, AddressManageActivity.class));
            }
        });
        aboutHandler();
        aboutListView();
    }

    @Override
    protected void onStart() {
        SetAddressData();
        super.onStart();
    }

    private void SetAddressData() {
        userName = SharedPreferencesUtils.getString(this, "userName", "");
        String consignee = SharedPreferencesUtils.getString(this, "consignee", "");
        String addressRegion = SharedPreferencesUtils.getString(this, "addressRegion", "");
        String detailedAddress = SharedPreferencesUtils.getString(this, "detailedAddress", "");
        String userPhoneNumber = SharedPreferencesUtils.getString(this, "userPhoneNumber", "");
        tvConsignee.setText(consignee);
        tvAddress.setText(addressRegion + detailedAddress);
        tvPhone.setText(userPhoneNumber);
    }

    private void aboutListView() {
        CommodityAdapter adapter = new CommodityAdapter(dataBeens, this);
        lvBuyPro.setAdapter(adapter);
    }

    /**
     * 点击支付按钮开启子线程开始支付
     */
    private void aboutHandler() {
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case SDK_PAY_FLAG: {//处理支付完毕之后的反馈信息

                        PayResult payResult = new PayResult((String) msg.obj);
                        /**
                         * 同步返回的结果必须放置到服务端进行验证（验证的规则请看https://doc.open.alipay.com/doc2/
                         * detail.htm?spm=0.0.0.0.xdvAU6&treeId=59&articleId=103665&
                         * docType=1) 建议商户依赖异步通知
                         */
                        String resultInfo = payResult.getResult();// 同步返回需要验证的信息

                        String resultStatus = payResult.getResultStatus();

                        // 判断resultStatus 为“9000”则代表支付成功，具体状态码代表含义可参考接口文档
                        if (TextUtils.equals(resultStatus, "9000")) {
                            Toast.makeText(ShoppingAliPayActivity.this, "支付成功", Toast
                                    .LENGTH_SHORT).show();
                        } else {
                            // 判断resultStatus 为非"9000"则代表可能支付失败
                            // "8000"代表支付结果因为支付渠道原因或者系统原因还在等待支付结果确认，最终交易是否成功以服务端异步通知为准（小概率状态）
                            if (TextUtils.equals(resultStatus, "8000")) {
                                Toast.makeText(ShoppingAliPayActivity.this, "支付结果确认中", Toast
                                        .LENGTH_SHORT).show();

                            } else {
                                // 其他值就可以判断为支付失败，包括用户主动取消支付，或者系统返回的错误
                                Toast.makeText(ShoppingAliPayActivity.this, "支付失败", Toast
                                        .LENGTH_SHORT).show();

                            }
                        }
                        break;
                    }
                    default:
                        break;
                }
            }

        };
    }

    /**
     * 手机支付（Activity ）
     *
     * @param view
     */
    @Event(type = View.OnClickListener.class, value = R.id.btn_pay)
    private void userActivityPay(View view) {
        if (TextUtils.isEmpty(userName)) {
            ToastUtils.showToast(this, "请您登陆");
            startActivity(new Intent(this, LoginActivity.class));
        } else if (TextUtils.isEmpty(tvConsignee.getText().toString()) && TextUtils.isEmpty
                (tvAddress.getText().toString())) {
            ToastUtils.showToast(this, "收货地址不能为空");
            startActivity(new Intent(this, AddressManageActivity.class));

        } else {
            if (TextUtils.isEmpty(PARTNER) || TextUtils.isEmpty(RSA_PRIVATE) || TextUtils.isEmpty
                    (SELLER)) {
                new AlertDialog.Builder(this).setTitle("警告").setMessage("需要配置PARTNER | " +
                        "RSA_PRIVATE| " + "SELLER").setPositiveButton("确定", new DialogInterface
                        .OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                        //
                        finish();
                    }
                }).show();
                return;
            }
            // 订单
            String orderInfo = getOrderInfo("测试的商品", "该测试商品的详细描述", "0.01");

            //③获得签名信息，并进行编码（特别注意，这里的签名逻辑需要放在服务端，切勿将私钥泄露在代码中！）
            String sign = SignUtils.sign(orderInfo, RSA_PRIVATE);//sign中保存的是签名后的订单详情

            try {
                /**
                 * 仅需对sign 做URL编码
                 */
                sign = URLEncoder.encode(sign, "UTF-8");//为了解决乱码，对订单详情中的：参数名和参数值进行编码
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //④ 完整的符合支付宝参数规范的订单信息
            final String payInfo = orderInfo + "&sign=\"" + sign + "\"&" + "sign_type=\"RSA\"";

            //⑤开启子线程，进行支付操作
            //开启子线程进行支付
            beginPay(payInfo);
        }

    }

    /**
     * create the order info. 创建订单信息
     *
     * @param subject 商品名称
     * @param body    商品描述
     * @param price   商品价格
     * @return
     */
    private String getOrderInfo(String subject, String body, String price) {
        //①准备字符串构建器对象
        StringBuilder builder = new StringBuilder();

        //②准备要传递给远程支付宝服务器的参数
        //客户端向远程服务器发送支付请求，需要获得商户（收款方）的信息
        // 签约合作者身份ID
        builder.append("partner=").append("\"").append(PARTNER).append("\"");

        // 签约卖家支付宝账号
        builder.append("&seller_id=").append("\"").append(SELLER).append("\"");

        // 商户网站唯一订单号
        builder.append("&out_trade_no=").append("\"").append(getOutTradeNo()).append("\"");

        // 商品名称
        builder.append("&subject=").append("\"").append(subject).append("\"");

        // 商品详情
        builder.append("&body=").append("\"").append(body).append("\"");

        // 商品金额
        builder.append("&total_fee=").append("\"").append(price).append("\"");

        // 服务器异步通知页面路径
        builder.append("&notify_url=").append("\"").append("http://notify.msp.hk/notify.htm")
                .append("\"");

        // 服务接口名称， 固定值
        builder.append("&service=\"mobile.securitypay.pay\"");

        // 支付类型， 固定值
        builder.append("&payment_type=\"1\"");

        // 参数编码， 固定值
        builder.append("&_input_charset=\"utf-8\"");

        // 设置未付款交易的超时时间
        // 默认30分钟，一旦超时，该笔交易就会自动被关闭。
        // 取值范围：1m～15d。
        // m-分钟，h-小时，d-天，1c-当天（无论交易何时创建，都在0点关闭）。
        // 该参数数值不接受小数点，如1.5h，可转换为90m。
        builder.append("&it_b_pay=\"30m\"");

        // extern_token为经过快登授权获取到的alipay_open_id,带上此参数用户将使用授权的账户进行支付
        // orderInfo += "&extern_token=" + "\"" + extern_token ).append("\"");

        // 支付宝处理完请求后，当前页面跳转到商户指定页面的路径，可空
        builder.append("&return_url=\"m.alipay.com\"");

        // 调用银行卡支付，需配置此参数，参与签名（对信息进行加密）， 固定值 （需要签约《无线银行卡快捷支付》才能使用）
        // orderInfo += "&paymethod=\"expressGateway\"";

        return builder.toString();
    }

    /**
     * get the out_trade_no for an order. 生成商户订单号，该值在商户端应保持唯一（可自定义格式规范）
     */
    private String getOutTradeNo() {
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();//int取值范围内的一个随机数
        key = key.substring(0, 15);
        return key;
    }

    /**
     * 开始正式支付
     *
     * @param payInfo
     */
    private void beginPay(final String payInfo) {
        Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                // 构造PayTask 对象
                PayTask alipay = new PayTask(ShoppingAliPayActivity.this);

                // 调用支付接口，获取支付结果
                String result = alipay.pay(payInfo, true);

                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                mHandler.sendMessage(msg);
            }
        };

        // 必须异步调用
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

}
