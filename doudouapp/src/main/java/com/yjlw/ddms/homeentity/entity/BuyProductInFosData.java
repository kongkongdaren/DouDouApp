package com.yjlw.ddms.homeentity.entity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/26
 * @Version: [v1.0]
 */
public class BuyProductInFosData {



    private int status;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BuyProductInFosData{" +
                "status=" + status +
                ", result=" + result +
                '}';
    }

    public static class ResultBean {
        private int ShowShare;
        private String Title;
        private String CoverUrl;
        private String ShareUrl;
        private String ShareDesc;
        private String SubTitle;
        private String DealPrice;
        private String ShippingInfo;
        private int IsLike;
        private int LikeCount;
        private int CmtCount;
        private String TasteCount;
        private int BuyCount;
        private int CartNum;
        private int Stock;
        private String MadeIn;
        private String ForecastShippingFee;
        private String Weight;
        private int PricePerKilogram;
        private RelationShopListBean RelationShopList;
        private StoreInfoBean StoreInfo;
        private int IsShippingFree;
        private String Price;
        private int count;
        private List<String> ImgInfo;
        private List<String> ContentParam;
        private List<ContentBean> Content;
        private List<GoodsTasteBean> GoodsTaste;
        private List<?> PriceLabels;
        private List<?> Labels;
        private List<?> PromotionActivityList;
        private List<?> Feature;
        private List<ListBeanX> list;

        @Override
        public String toString() {
            return "ResultBean{" +
                    "ShowShare=" + ShowShare +
                    ", Title='" + Title + '\'' +
                    ", CoverUrl='" + CoverUrl + '\'' +
                    ", ShareUrl='" + ShareUrl + '\'' +
                    ", ShareDesc='" + ShareDesc + '\'' +
                    ", SubTitle='" + SubTitle + '\'' +
                    ", DealPrice='" + DealPrice + '\'' +
                    ", ShippingInfo='" + ShippingInfo + '\'' +
                    ", IsLike=" + IsLike +
                    ", LikeCount=" + LikeCount +
                    ", CmtCount=" + CmtCount +
                    ", TasteCount='" + TasteCount + '\'' +
                    ", BuyCount=" + BuyCount +
                    ", CartNum=" + CartNum +
                    ", Stock=" + Stock +
                    ", MadeIn='" + MadeIn + '\'' +
                    ", ForecastShippingFee='" + ForecastShippingFee + '\'' +
                    ", Weight='" + Weight + '\'' +
                    ", PricePerKilogram=" + PricePerKilogram +
                    ", RelationShopList=" + RelationShopList +
                    ", StoreInfo=" + StoreInfo +
                    ", IsShippingFree=" + IsShippingFree +
                    ", Price='" + Price + '\'' +
                    ", count=" + count +
                    ", ImgInfo=" + ImgInfo +
                    ", ContentParam=" + ContentParam +
                    ", Content=" + Content +
                    ", GoodsTaste=" + GoodsTaste +
                    ", PriceLabels=" + PriceLabels +
                    ", Labels=" + Labels +
                    ", PromotionActivityList=" + PromotionActivityList +
                    ", Feature=" + Feature +
                    ", list=" + list +
                    '}';
        }

        public int getShowShare() {
            return ShowShare;
        }

        public void setShowShare(int ShowShare) {
            this.ShowShare = ShowShare;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getCoverUrl() {
            return CoverUrl;
        }

        public void setCoverUrl(String CoverUrl) {
            this.CoverUrl = CoverUrl;
        }

        public String getShareUrl() {
            return ShareUrl;
        }

        public void setShareUrl(String ShareUrl) {
            this.ShareUrl = ShareUrl;
        }

        public String getShareDesc() {
            return ShareDesc;
        }

        public void setShareDesc(String ShareDesc) {
            this.ShareDesc = ShareDesc;
        }

        public String getSubTitle() {
            return SubTitle;
        }

        public void setSubTitle(String SubTitle) {
            this.SubTitle = SubTitle;
        }

        public String getDealPrice() {
            return DealPrice;
        }

        public void setDealPrice(String DealPrice) {
            this.DealPrice = DealPrice;
        }

        public String getShippingInfo() {
            return ShippingInfo;
        }

        public void setShippingInfo(String ShippingInfo) {
            this.ShippingInfo = ShippingInfo;
        }

        public int getIsLike() {
            return IsLike;
        }

        public void setIsLike(int IsLike) {
            this.IsLike = IsLike;
        }

        public int getLikeCount() {
            return LikeCount;
        }

        public void setLikeCount(int LikeCount) {
            this.LikeCount = LikeCount;
        }

        public int getCmtCount() {
            return CmtCount;
        }

        public void setCmtCount(int CmtCount) {
            this.CmtCount = CmtCount;
        }

        public String getTasteCount() {
            return TasteCount;
        }

        public void setTasteCount(String TasteCount) {
            this.TasteCount = TasteCount;
        }

        public int getBuyCount() {
            return BuyCount;
        }

        public void setBuyCount(int BuyCount) {
            this.BuyCount = BuyCount;
        }

        public int getCartNum() {
            return CartNum;
        }

        public void setCartNum(int CartNum) {
            this.CartNum = CartNum;
        }

        public int getStock() {
            return Stock;
        }

        public void setStock(int Stock) {
            this.Stock = Stock;
        }

        public String getMadeIn() {
            return MadeIn;
        }

        public void setMadeIn(String MadeIn) {
            this.MadeIn = MadeIn;
        }

        public String getForecastShippingFee() {
            return ForecastShippingFee;
        }

        public void setForecastShippingFee(String ForecastShippingFee) {
            this.ForecastShippingFee = ForecastShippingFee;
        }

        public String getWeight() {
            return Weight;
        }

        public void setWeight(String Weight) {
            this.Weight = Weight;
        }

        public int getPricePerKilogram() {
            return PricePerKilogram;
        }

        public void setPricePerKilogram(int PricePerKilogram) {
            this.PricePerKilogram = PricePerKilogram;
        }

        public RelationShopListBean getRelationShopList() {
            return RelationShopList;
        }

        public void setRelationShopList(RelationShopListBean RelationShopList) {
            this.RelationShopList = RelationShopList;
        }

        public StoreInfoBean getStoreInfo() {
            return StoreInfo;
        }

        public void setStoreInfo(StoreInfoBean StoreInfo) {
            this.StoreInfo = StoreInfo;
        }

        public int getIsShippingFree() {
            return IsShippingFree;
        }

        public void setIsShippingFree(int IsShippingFree) {
            this.IsShippingFree = IsShippingFree;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String Price) {
            this.Price = Price;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<String> getImgInfo() {
            return ImgInfo;
        }

        public void setImgInfo(List<String> ImgInfo) {
            this.ImgInfo = ImgInfo;
        }

        public List<String> getContentParam() {
            return ContentParam;
        }

        public void setContentParam(List<String> ContentParam) {
            this.ContentParam = ContentParam;
        }

        public List<ContentBean> getContent() {
            return Content;
        }

        public void setContent(List<ContentBean> Content) {
            this.Content = Content;
        }

        public List<GoodsTasteBean> getGoodsTaste() {
            return GoodsTaste;
        }

        public void setGoodsTaste(List<GoodsTasteBean> GoodsTaste) {
            this.GoodsTaste = GoodsTaste;
        }

        public List<?> getPriceLabels() {
            return PriceLabels;
        }

        public void setPriceLabels(List<?> PriceLabels) {
            this.PriceLabels = PriceLabels;
        }

        public List<?> getLabels() {
            return Labels;
        }

        public void setLabels(List<?> Labels) {
            this.Labels = Labels;
        }

        public List<?> getPromotionActivityList() {
            return PromotionActivityList;
        }

        public void setPromotionActivityList(List<?> PromotionActivityList) {
            this.PromotionActivityList = PromotionActivityList;
        }

        public List<?> getFeature() {
            return Feature;
        }

        public void setFeature(List<?> Feature) {
            this.Feature = Feature;
        }

        public List<ListBeanX> getList() {
            return list;
        }

        public void setList(List<ListBeanX> list) {
            this.list = list;
        }

        public static class RelationShopListBean {

            private int count;
            private List<ListBean> list;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            @Override
            public String toString() {
                return "RelationShopListBean{" +
                        "count=" + count +
                        ", list=" + list +
                        '}';
            }

            public static class ListBean {

                private int StoreId;
                private String StoreTitle;
                private String StoreLogoUrl;
                private String UserId;
                private String UserName;
                private int GoodsId;
                private String Title;
                private String SubTitle;
                private String DealPrice;
                private String ShippingInfo;
                private String CoverUrl;
                private String OpenUrl;
                private int LikeCount;
                private int Stock;
                private int IsShippingFree;
                private int IsLike;
                private int CartNum;
                private String Weight;
                private String Price;
                private List<?> Labels;

                public int getStoreId() {
                    return StoreId;
                }

                public void setStoreId(int StoreId) {
                    this.StoreId = StoreId;
                }

                public String getStoreTitle() {
                    return StoreTitle;
                }

                public void setStoreTitle(String StoreTitle) {
                    this.StoreTitle = StoreTitle;
                }

                public String getStoreLogoUrl() {
                    return StoreLogoUrl;
                }

                public void setStoreLogoUrl(String StoreLogoUrl) {
                    this.StoreLogoUrl = StoreLogoUrl;
                }

                public String getUserId() {
                    return UserId;
                }

                public void setUserId(String UserId) {
                    this.UserId = UserId;
                }

                public String getUserName() {
                    return UserName;
                }

                public void setUserName(String UserName) {
                    this.UserName = UserName;
                }

                public int getGoodsId() {
                    return GoodsId;
                }

                public void setGoodsId(int GoodsId) {
                    this.GoodsId = GoodsId;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }

                public String getSubTitle() {
                    return SubTitle;
                }

                public void setSubTitle(String SubTitle) {
                    this.SubTitle = SubTitle;
                }

                public String getDealPrice() {
                    return DealPrice;
                }

                public void setDealPrice(String DealPrice) {
                    this.DealPrice = DealPrice;
                }

                public String getShippingInfo() {
                    return ShippingInfo;
                }

                public void setShippingInfo(String ShippingInfo) {
                    this.ShippingInfo = ShippingInfo;
                }

                public String getCoverUrl() {
                    return CoverUrl;
                }

                public void setCoverUrl(String CoverUrl) {
                    this.CoverUrl = CoverUrl;
                }

                public String getOpenUrl() {
                    return OpenUrl;
                }

                public void setOpenUrl(String OpenUrl) {
                    this.OpenUrl = OpenUrl;
                }

                public int getLikeCount() {
                    return LikeCount;
                }

                public void setLikeCount(int LikeCount) {
                    this.LikeCount = LikeCount;
                }

                public int getStock() {
                    return Stock;
                }

                public void setStock(int Stock) {
                    this.Stock = Stock;
                }

                public int getIsShippingFree() {
                    return IsShippingFree;
                }

                public void setIsShippingFree(int IsShippingFree) {
                    this.IsShippingFree = IsShippingFree;
                }

                public int getIsLike() {
                    return IsLike;
                }

                public void setIsLike(int IsLike) {
                    this.IsLike = IsLike;
                }

                public int getCartNum() {
                    return CartNum;
                }

                public void setCartNum(int CartNum) {
                    this.CartNum = CartNum;
                }

                public String getWeight() {
                    return Weight;
                }

                public void setWeight(String Weight) {
                    this.Weight = Weight;
                }

                public String getPrice() {
                    return Price;
                }

                public void setPrice(String Price) {
                    this.Price = Price;
                }

                public List<?> getLabels() {
                    return Labels;
                }

                public void setLabels(List<?> Labels) {
                    this.Labels = Labels;
                }

                @Override
                public String toString() {
                    return "ListBean{" +
                            "StoreId=" + StoreId +
                            ", StoreTitle='" + StoreTitle + '\'' +
                            ", StoreLogoUrl='" + StoreLogoUrl + '\'' +
                            ", UserId='" + UserId + '\'' +
                            ", UserName='" + UserName + '\'' +
                            ", GoodsId=" + GoodsId +
                            ", Title='" + Title + '\'' +
                            ", SubTitle='" + SubTitle + '\'' +
                            ", DealPrice='" + DealPrice + '\'' +
                            ", ShippingInfo='" + ShippingInfo + '\'' +
                            ", CoverUrl='" + CoverUrl + '\'' +
                            ", OpenUrl='" + OpenUrl + '\'' +
                            ", LikeCount=" + LikeCount +
                            ", Stock=" + Stock +
                            ", IsShippingFree=" + IsShippingFree +
                            ", IsLike=" + IsLike +
                            ", CartNum=" + CartNum +
                            ", Weight='" + Weight + '\'' +
                            ", Price='" + Price + '\'' +
                            ", Labels=" + Labels +
                            '}';
                }
            }

        }

        public static class StoreInfoBean {


            private ShopkeeperBean Shopkeeper;
            private int StoreId;
            private int UserId;
            private String LogoUrl;
            private int IsHealth;
            private String Title;
            private String AutoAddress;
            private int IsFollow;

            public ShopkeeperBean getShopkeeper() {
                return Shopkeeper;
            }

            public void setShopkeeper(ShopkeeperBean Shopkeeper) {
                this.Shopkeeper = Shopkeeper;
            }

            public int getStoreId() {
                return StoreId;
            }

            public void setStoreId(int StoreId) {
                this.StoreId = StoreId;
            }

            public int getUserId() {
                return UserId;
            }

            public void setUserId(int UserId) {
                this.UserId = UserId;
            }

            public String getLogoUrl() {
                return LogoUrl;
            }

            public void setLogoUrl(String LogoUrl) {
                this.LogoUrl = LogoUrl;
            }

            public int getIsHealth() {
                return IsHealth;
            }

            public void setIsHealth(int IsHealth) {
                this.IsHealth = IsHealth;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getAutoAddress() {
                return AutoAddress;
            }

            public void setAutoAddress(String AutoAddress) {
                this.AutoAddress = AutoAddress;
            }

            public int getIsFollow() {
                return IsFollow;
            }

            public void setIsFollow(int IsFollow) {
                this.IsFollow = IsFollow;
            }

            public static class ShopkeeperBean {

                private int Online;
                private int UserId;
                private String UserName;
                private String Idiograph;
                private int Vip;
                private int FansCount;
                private int NoticeCnt;
                private String AvatarUrl;
                private AreaBean Area;

                public int getOnline() {
                    return Online;
                }

                public void setOnline(int Online) {
                    this.Online = Online;
                }

                public int getUserId() {
                    return UserId;
                }

                public void setUserId(int UserId) {
                    this.UserId = UserId;
                }

                public String getUserName() {
                    return UserName;
                }

                public void setUserName(String UserName) {
                    this.UserName = UserName;
                }

                public String getIdiograph() {
                    return Idiograph;
                }

                public void setIdiograph(String Idiograph) {
                    this.Idiograph = Idiograph;
                }

                public int getVip() {
                    return Vip;
                }

                public void setVip(int Vip) {
                    this.Vip = Vip;
                }

                public int getFansCount() {
                    return FansCount;
                }

                public void setFansCount(int FansCount) {
                    this.FansCount = FansCount;
                }

                public int getNoticeCnt() {
                    return NoticeCnt;
                }

                public void setNoticeCnt(int NoticeCnt) {
                    this.NoticeCnt = NoticeCnt;
                }

                public String getAvatarUrl() {
                    return AvatarUrl;
                }

                public void setAvatarUrl(String AvatarUrl) {
                    this.AvatarUrl = AvatarUrl;
                }

                public AreaBean getArea() {
                    return Area;
                }

                public void setArea(AreaBean Area) {
                    this.Area = Area;
                }

                @Override
                public String toString() {
                    return "ShopkeeperBean{" +
                            "Online=" + Online +
                            ", UserId=" + UserId +
                            ", UserName='" + UserName + '\'' +
                            ", Idiograph='" + Idiograph + '\'' +
                            ", Vip=" + Vip +
                            ", FansCount=" + FansCount +
                            ", NoticeCnt=" + NoticeCnt +
                            ", AvatarUrl='" + AvatarUrl + '\'' +
                            ", Area=" + Area +
                            '}';
                }

                public static class AreaBean {
                    /**
                     * ProvinceId : 0
                     * ProvinceName : 北京
                     * CityId : 0
                     * CityName : 北京
                     */

                    private int ProvinceId;
                    private String ProvinceName;
                    private int CityId;
                    private String CityName;

                    public int getProvinceId() {
                        return ProvinceId;
                    }

                    public void setProvinceId(int ProvinceId) {
                        this.ProvinceId = ProvinceId;
                    }

                    public String getProvinceName() {
                        return ProvinceName;
                    }

                    public void setProvinceName(String ProvinceName) {
                        this.ProvinceName = ProvinceName;
                    }

                    public int getCityId() {
                        return CityId;
                    }

                    public void setCityId(int CityId) {
                        this.CityId = CityId;
                    }

                    public String getCityName() {
                        return CityName;
                    }

                    public void setCityName(String CityName) {
                        this.CityName = CityName;
                    }

                    @Override
                    public String toString() {
                        return "AreaBean{" +
                                "ProvinceId=" + ProvinceId +
                                ", ProvinceName='" + ProvinceName + '\'' +
                                ", CityId=" + CityId +
                                ", CityName='" + CityName + '\'' +
                                '}';
                    }
                }

            }

            @Override
            public String toString() {
                return "StoreInfoBean{" +
                        "Shopkeeper=" + Shopkeeper +
                        ", StoreId=" + StoreId +
                        ", UserId=" + UserId +
                        ", LogoUrl='" + LogoUrl + '\'' +
                        ", IsHealth=" + IsHealth +
                        ", Title='" + Title + '\'' +
                        ", AutoAddress='" + AutoAddress + '\'' +
                        ", IsFollow=" + IsFollow +
                        '}';
            }
        }

        public static class ContentBean {
            /**
             * ImgUrl : http://pimg2.hoto.cn/goods/2015/07/31/271_55bb72af8c32c.jpg
             * Desc :
             */

            private String ImgUrl;
            private String Desc;

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getDesc() {
                return Desc;
            }

            public void setDesc(String Desc) {
                this.Desc = Desc;
            }

            @Override
            public String toString() {
                return "ContentBean{" +
                        "ImgUrl='" + ImgUrl + '\'' +
                        ", Desc='" + Desc + '\'' +
                        '}';
            }
        }


        public static class GoodsTasteBean {
            /**
             * GoodsTasteId : 7
             * UserName : 好豆品鉴员
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2015/11/1447047612.jpg
             * Content : 物流：同城速度很快。

             包装：包装很卫生。

             口味：入味且肉非常烂，肥肉也不腻，个头份量足。
             * ContentTags : ["品鉴"]
             * Tags : ["靓家货  肘子"]
             * Info : 好豆品鉴员  欣欣
             */

            private int GoodsTasteId;
            private String UserName;
            private String ImgUrl;
            private String Content;
            private String Info;
            private List<String> ContentTags;
            private List<String> Tags;

            public int getGoodsTasteId() {
                return GoodsTasteId;
            }

            public void setGoodsTasteId(int GoodsTasteId) {
                this.GoodsTasteId = GoodsTasteId;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getInfo() {
                return Info;
            }

            public void setInfo(String Info) {
                this.Info = Info;
            }

            public List<String> getContentTags() {
                return ContentTags;
            }

            public void setContentTags(List<String> ContentTags) {
                this.ContentTags = ContentTags;
            }

            public List<String> getTags() {
                return Tags;
            }

            public void setTags(List<String> Tags) {
                this.Tags = Tags;
            }

            @Override
            public String toString() {
                return "GoodsTasteBean{" +
                        "GoodsTasteId=" + GoodsTasteId +
                        ", UserName='" + UserName + '\'' +
                        ", ImgUrl='" + ImgUrl + '\'' +
                        ", Content='" + Content + '\'' +
                        ", Info='" + Info + '\'' +
                        ", ContentTags=" + ContentTags +
                        ", Tags=" + Tags +
                        '}';
            }
        }

        public static class ListBeanX {
            /**
             * Cid : 63846
             * UserId : 10063357
             * Avatar : http://avatar1.hoto.cn/fd/8d/10063357_185.jpg?v=1
             * UserName : Engels
             * AtUserId : 0
             * AtUserName :
             * Content : 非常好吃，下次再来！
             * AtContent :
             * CreateTime : 09-20 03:00
             * Mark : 10
             * Gender : 2
             */

            private String Cid;
            private String UserId;
            private String Avatar;
            private String UserName;
            private String AtUserId;
            private String AtUserName;
            private String Content;
            private String AtContent;
            private String CreateTime;
            private String Mark;
            private int Gender;

            public String getCid() {
                return Cid;
            }

            public void setCid(String Cid) {
                this.Cid = Cid;
            }

            public String getUserId() {
                return UserId;
            }

            public void setUserId(String UserId) {
                this.UserId = UserId;
            }

            public String getAvatar() {
                return Avatar;
            }

            public void setAvatar(String Avatar) {
                this.Avatar = Avatar;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public String getAtUserId() {
                return AtUserId;
            }

            public void setAtUserId(String AtUserId) {
                this.AtUserId = AtUserId;
            }

            public String getAtUserName() {
                return AtUserName;
            }

            public void setAtUserName(String AtUserName) {
                this.AtUserName = AtUserName;
            }

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getAtContent() {
                return AtContent;
            }

            public void setAtContent(String AtContent) {
                this.AtContent = AtContent;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public String getMark() {
                return Mark;
            }

            public void setMark(String Mark) {
                this.Mark = Mark;
            }

            public int getGender() {
                return Gender;
            }

            public void setGender(int Gender) {
                this.Gender = Gender;
            }

            @Override
            public String toString() {
                return "ListBeanX{" +
                        "Cid='" + Cid + '\'' +
                        ", UserId='" + UserId + '\'' +
                        ", Avatar='" + Avatar + '\'' +
                        ", UserName='" + UserName + '\'' +
                        ", AtUserId='" + AtUserId + '\'' +
                        ", AtUserName='" + AtUserName + '\'' +
                        ", Content='" + Content + '\'' +
                        ", AtContent='" + AtContent + '\'' +
                        ", CreateTime='" + CreateTime + '\'' +
                        ", Mark='" + Mark + '\'' +
                        ", Gender=" + Gender +
                        '}';
            }
        }
    }
}