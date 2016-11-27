package com.yjlw.ddms.homeentity.entity;



import static android.R.attr.id;
public class DataBean {

     int id;


    public DataBean(int id, int carNum, String shopName, String content, String openUrl, float
            price) {
        this.id = id;
        this.carNum = carNum;
        this.shopName = shopName;
        this.content = content;
        this.openUrl = openUrl;
        this.price = price;
    }

    public DataBean() {

    }

    int carNum;

    String shopName;

    String content;
    String openUrl;

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
