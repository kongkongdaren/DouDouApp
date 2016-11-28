package com.yjlw.ddms.homeentity.entity;


import static android.R.attr.id;

public class DataBean {

    int id;

    public DataBean(int id, long _id, int carNum, String shopName, String content, String openUrl, long goodsId, float price) {
        this.id = id;
        this._id = _id;
        this.carNum = carNum;
        this.shopName = shopName;
        this.content = content;
        this.openUrl = openUrl;
        this.goodsId = goodsId;
        this.price = price;
    }

    public DataBean() {

    }

    long _id;
    int carNum;

    String shopName;

    String content;
    String openUrl;
    long goodsId;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getOpenUrl() {
        return openUrl;
    }

    public void setOpenUrl(String openUrl) {
        this.openUrl = openUrl;
    }

    float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
