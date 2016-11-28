package com.yjlw.ddms.homeentity.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;




/**
 * Simple to Introduction
 *
 * @Description: 购物车实体类
 * @Author: 原海忠
 * @CreateDate: 2016/11/27
 * @Version: [v1.0]
 */
@Entity
public class ShoppingCartData {
    @Id(autoincrement = true)
    private Long id;
    private String StoreId;
    private String StoreLogo;
    private String StoreName;
    private String CoverUrl;
    private String DealPrice;
    private String GoodsId;
    private String GoodsNum;
    private String Price;
    private String Title;
    @Generated(hash = 2008639752)
    public ShoppingCartData(Long id, String StoreId, String StoreLogo,
            String StoreName, String CoverUrl, String DealPrice, String GoodsId,
            String GoodsNum, String Price, String Title) {
        this.id = id;
        this.StoreId = StoreId;
        this.StoreLogo = StoreLogo;
        this.StoreName = StoreName;
        this.CoverUrl = CoverUrl;
        this.DealPrice = DealPrice;
        this.GoodsId = GoodsId;
        this.GoodsNum = GoodsNum;
        this.Price = Price;
        this.Title = Title;
    }
    @Generated(hash = 1360067192)
    public ShoppingCartData() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStoreId() {
        return this.StoreId;
    }
    public void setStoreId(String StoreId) {
        this.StoreId = StoreId;
    }
    public String getStoreLogo() {
        return this.StoreLogo;
    }
    public void setStoreLogo(String StoreLogo) {
        this.StoreLogo = StoreLogo;
    }
    public String getStoreName() {
        return this.StoreName;
    }
    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }
    public String getCoverUrl() {
        return this.CoverUrl;
    }
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }
    public String getDealPrice() {
        return this.DealPrice;
    }
    public void setDealPrice(String DealPrice) {
        this.DealPrice = DealPrice;
    }
    public String getGoodsId() {
        return this.GoodsId;
    }
    public void setGoodsId(String GoodsId) {
        this.GoodsId = GoodsId;
    }
    public String getGoodsNum() {
        return this.GoodsNum;
    }
    public void setGoodsNum(String GoodsNum) {
        this.GoodsNum = GoodsNum;
    }
    public String getPrice() {
        return this.Price;
    }
    public void setPrice(String Price) {
        this.Price = Price;
    }
    public String getTitle() {
        return this.Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }

    @Override
    public String toString() {
        return "ShoppingCartData{" +
                "id=" + id +
                ", StoreId='" + StoreId + '\'' +
                ", StoreLogo='" + StoreLogo + '\'' +
                ", StoreName='" + StoreName + '\'' +
                ", CoverUrl='" + CoverUrl + '\'' +
                ", DealPrice='" + DealPrice + '\'' +
                ", GoodsId='" + GoodsId + '\'' +
                ", GoodsNum='" + GoodsNum + '\'' +
                ", Price='" + Price + '\'' +
                ", Title='" + Title + '\'' +
                '}';
    }
}