package com.yjlw.ddms.homeentity.entity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 吃货最爱实体类
 * @Author: 原海忠
 * @CreateDate: 2016/11/25
 * @Version: [v1.0]
 */
public class FoodieLikeData {
    private ResultBean result;
    private int status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class ResultBean {

        private int CartTotalNum;
        private int count;
        private List<?> ad;
        private List<ListBean> list;

        public int getCartTotalNum() {
            return CartTotalNum;
        }

        public void setCartTotalNum(int CartTotalNum) {
            this.CartTotalNum = CartTotalNum;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<?> getAd() {
            return ad;
        }

        public void setAd(List<?> ad) {
            this.ad = ad;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * CartNum : 0
             * CmtCount : 103
             * Comments : [{"Avatar":"http://avatar1.hoto.cn/27/f9/9763111_185.jpg?v=1",
             * "Cid":"64758","Content":"非常好吃，下次再来！","CreateTime":"5天前","UserId":9763111,
             * "UserName":"haodou9602630813"},{"Avatar":"http://avatar1.hoto
             * .cn/6b/78/10188907_185.jpg","Cid":"64671","Content":"非常好吃，下次再来！",
             * "CreateTime":"11-13 03:00","UserId":10188907,"UserName":"弥撒1992"}]
             * CoverUrl : http://pimg3.hoto.cn/goods/2016/04/07/5549_5705dd6780b54_680_450.jpg
             * CreateTime : 03-21 16:57
             * DealPrice : ￥9.90
             * GoodsId : 5549
             * IsLike : 0
             * Labels : []
             * LikeCount : 791
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=5549
             * Price : ￥19.80
             * StoreAddress : 北京市昌平区回龙观-地铁站
             * SubTitle : 超好吃关东煮汤料.日本美食
             * Title : 日式关东煮汤料55ml贴心小瓶设计|一餐一瓶
             */

            private int CartNum;
            private int CmtCount;
            private String CoverUrl;
            private String CreateTime;
            private String DealPrice;
            private int GoodsId;
            private int IsLike;
            private int LikeCount;
            private String OpenUrl;
            private String Price;
            private String StoreAddress;
            private String SubTitle;
            private String Title;
            private List<CommentsBean> Comments;
            private List<?> Labels;

            public int getCartNum() {
                return CartNum;
            }

            public void setCartNum(int CartNum) {
                this.CartNum = CartNum;
            }

            public int getCmtCount() {
                return CmtCount;
            }

            public void setCmtCount(int CmtCount) {
                this.CmtCount = CmtCount;
            }

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public String getDealPrice() {
                return DealPrice;
            }

            public void setDealPrice(String DealPrice) {
                this.DealPrice = DealPrice;
            }

            public int getGoodsId() {
                return GoodsId;
            }

            public void setGoodsId(int GoodsId) {
                this.GoodsId = GoodsId;
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

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public String getStoreAddress() {
                return StoreAddress;
            }

            public void setStoreAddress(String StoreAddress) {
                this.StoreAddress = StoreAddress;
            }

            public String getSubTitle() {
                return SubTitle;
            }

            public void setSubTitle(String SubTitle) {
                this.SubTitle = SubTitle;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public List<CommentsBean> getComments() {
                return Comments;
            }

            public void setComments(List<CommentsBean> Comments) {
                this.Comments = Comments;
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
                        "CartNum=" + CartNum +
                        ", CmtCount=" + CmtCount +
                        ", CoverUrl='" + CoverUrl + '\'' +
                        ", CreateTime='" + CreateTime + '\'' +
                        ", DealPrice='" + DealPrice + '\'' +
                        ", GoodsId=" + GoodsId +
                        ", IsLike=" + IsLike +
                        ", LikeCount=" + LikeCount +
                        ", OpenUrl='" + OpenUrl + '\'' +
                        ", Price='" + Price + '\'' +
                        ", StoreAddress='" + StoreAddress + '\'' +
                        ", SubTitle='" + SubTitle + '\'' +
                        ", Title='" + Title + '\'' +
                        ", Comments=" + Comments +
                        ", Labels=" + Labels +
                        '}';
            }

            public static class CommentsBean {
                /**
                 * Avatar : http://avatar1.hoto.cn/27/f9/9763111_185.jpg?v=1
                 * Cid : 64758
                 * Content : 非常好吃，下次再来！
                 * CreateTime : 5天前
                 * UserId : 9763111
                 * UserName : haodou9602630813
                 */

                private String Avatar;
                private String Cid;
                private String Content;
                private String CreateTime;
                private int UserId;
                private String UserName;

                public String getAvatar() {
                    return Avatar;
                }

                public void setAvatar(String Avatar) {
                    this.Avatar = Avatar;
                }

                public String getCid() {
                    return Cid;
                }

                public void setCid(String Cid) {
                    this.Cid = Cid;
                }

                public String getContent() {
                    return Content;
                }

                public void setContent(String Content) {
                    this.Content = Content;
                }

                public String getCreateTime() {
                    return CreateTime;
                }

                public void setCreateTime(String CreateTime) {
                    this.CreateTime = CreateTime;
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

                @Override
                public String toString() {
                    return "CommentsBean{" +
                            "Avatar='" + Avatar + '\'' +
                            ", Cid='" + Cid + '\'' +
                            ", Content='" + Content + '\'' +
                            ", CreateTime='" + CreateTime + '\'' +
                            ", UserId=" + UserId +
                            ", UserName='" + UserName + '\'' +
                            '}';
                }
            }
        }


        @Override
        public String toString() {
            return "ResultBean{" +
                    "CartTotalNum=" + CartTotalNum +
                    ", count=" + count +
                    ", ad=" + ad +
                    ", list=" + list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "FoodieLikeData{" +
                "result=" + result +
                ", status=" + status +
                '}';
    }
}