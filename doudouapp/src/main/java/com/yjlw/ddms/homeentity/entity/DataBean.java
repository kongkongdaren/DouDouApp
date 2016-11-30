package com.yjlw.ddms.homeentity.entity;


import java.io.Serializable;

/**
 * 购物车实体类
 */
public class DataBean implements Serializable {

    private static final long serialVersionUID = -3337009124431935919L;

    int id;
    long _id;
    int carNum;
    String shopName;
    String content;
    String openUrl;
    String coverUrl;
    String subTitle;
    long goodsId;


    public DataBean() {

    }

    public DataBean(int id, long _id, int carNum, String shopName, String content, String
            openUrl, String coverUrl, String subTitle, long goodsId, float price) {
        this.id = id;
        this._id = _id;
        this.carNum = carNum;
        this.shopName = shopName;
        this.content = content;
        this.openUrl = openUrl;
        this.coverUrl = coverUrl;
        this.subTitle = subTitle;
        this.goodsId = goodsId;
        this.price = price;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

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

    @Override
    public String toString() {
        return "DataBean{" +
                "id=" + id +
                ", _id=" + _id +
                ", carNum=" + carNum +
                ", shopName='" + shopName + '\'' +
                ", content='" + content + '\'' +
                ", openUrl='" + openUrl + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", goodsId=" + goodsId +
                ", price=" + price +
                '}';
    }
}
