package com.yjlw.ddms.homeentity.entity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/25
 * @Version: [v1.0]
 */
public class SalePriceBean {

    /**
     * status : 200
     * result : {"info":{"Title":"特价趁现在","CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460425225.jpg","ShareUrl":"http://m.haodou.com/mall/index
     * .php?r=wap/goods&id=173","ShareDesc":"今日特惠，年底大促！"},"ad":[{"ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460425225.jpg","Url":""}],"count":7,"list":[{"GoodsId":2105,
     * "Title":"包郵秒杀 红糖大瓜子","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/03/28/2105_56f8d5756e383_336_336.jpg","DealPrice":"￥18.00","Stock":"剩余21份",
     * "ShippingInfo":"全国快递","Url":"haodourecipe://haodou.com/goods/detail?id=2105",
     * "IsShippingFree":2,"Weight":"150克","Labels":["包邮"],"Price":"￥25.00"},{"GoodsId":4613,
     * "Title":"秘制卤料包35g/包（5份包邮，买10送1）","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/09/12/4613_57d583f6df18a_336_336.jpg","DealPrice":"￥5.80","Stock":"剩余100份",
     * "ShippingInfo":"配送上门/全国快递","Url":"haodourecipe://haodou.com/goods/detail?id=4613",
     * "IsShippingFree":1,"Weight":"35克","Labels":[],"Price":"￥9.00"},{"GoodsId":3904,
     * "Title":"三草瘦腿茶 买二送勿忘我花茶 买三送芦荟茶","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/05/29/3904_574aef17c1ed6_336_336.jpg","DealPrice":"￥15.00",
     * "Stock":"剩余249份","ShippingInfo":"配送上门/全国快递","Url":"haodourecipe://haodou
     * .com/goods/detail?id=3904","IsShippingFree":2,"Weight":"66克","Labels":["包邮"],"Price":"￥39
     * .00"},{"GoodsId":3162,"Title":"五味尚膳 鲜煮酸梅汤原料包","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/16/3162_56710ca654fb2_336_336.jpg","DealPrice":"￥15.00",
     * "Stock":"剩余1000份","ShippingInfo":"配送上门/全国快递","Url":"haodourecipe://haodou
     * .com/goods/detail?id=3162","IsShippingFree":1,"Weight":"165克","Labels":[],"Price":"￥19
     * .90"},{"GoodsId":3411,"Title":"韩国泡菜","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/22/3411_5678d476e1e79_336_336.jpg","DealPrice":"￥9.90","Stock":"剩余100份",
     * "ShippingInfo":"同城快递","Url":"haodourecipe://haodou.com/goods/detail?id=3411",
     * "IsShippingFree":1,"Weight":"500克","Labels":["新人价"],"Price":"￥15.00"},{"GoodsId":4642,
     * "Title":"香酥辣椒酥 辣条香酥椒小吃零食","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/01/4642_56d540986e8d5_336_336.jpg","DealPrice":"￥12.00",
     * "Stock":"剩余550份","ShippingInfo":"全国快递","Url":"haodourecipe://haodou
     * .com/goods/detail?id=4642","IsShippingFree":2,"Weight":"200克","Labels":["新人价","包邮"],
     * "Price":"￥18.00"},{"GoodsId":5549,"Title":"日式关东煮汤料55ml贴心小瓶设计|一餐一瓶",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/04/07/5549_5705dd6780b54_336_336.jpg",
     * "DealPrice":"￥9.90","Stock":"剩余2份","ShippingInfo":"全国快递","Url":"haodourecipe://haodou
     * .com/goods/detail?id=5549","IsShippingFree":1,"Weight":"500克","Labels":[],"Price":"￥19
     * .80"}],"CartTotalNum":8}
     */

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

    public static class ResultBean {
        /**
         * info : {"Title":"特价趁现在","CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460425225.jpg","ShareUrl":"http://m.haodou.com/mall/index
         * .php?r=wap/goods&id=173","ShareDesc":"今日特惠，年底大促！"}
         * ad : [{"ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460425225.jpg","Url":""}]
         * count : 7
         * list : [{"GoodsId":2105,"Title":"包郵秒杀 红糖大瓜子","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/03/28/2105_56f8d5756e383_336_336.jpg","DealPrice":"￥18.00",
         * "Stock":"剩余21份","ShippingInfo":"全国快递","Url":"haodourecipe://haodou
         * .com/goods/detail?id=2105","IsShippingFree":2,"Weight":"150克","Labels":["包邮"],
         * "Price":"￥25.00"},{"GoodsId":4613,"Title":"秘制卤料包35g/包（5份包邮，买10送1）",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/09/12/4613_57d583f6df18a_336_336.jpg",
         * "DealPrice":"￥5.80","Stock":"剩余100份","ShippingInfo":"配送上门/全国快递",
         * "Url":"haodourecipe://haodou.com/goods/detail?id=4613","IsShippingFree":1,
         * "Weight":"35克","Labels":[],"Price":"￥9.00"},{"GoodsId":3904,"Title":"三草瘦腿茶 买二送勿忘我花茶
         * 买三送芦荟茶","CoverUrl":"http://pimg2.hoto.cn/goods/2016/05/29/3904_574aef17c1ed6_336_336
         * .jpg","DealPrice":"￥15.00","Stock":"剩余249份","ShippingInfo":"配送上门/全国快递",
         * "Url":"haodourecipe://haodou.com/goods/detail?id=3904","IsShippingFree":2,
         * "Weight":"66克","Labels":["包邮"],"Price":"￥39.00"},{"GoodsId":3162,"Title":"五味尚膳
         * 鲜煮酸梅汤原料包","CoverUrl":"http://pimg1.hoto.cn/goods/2015/12/16/3162_56710ca654fb2_336_336
         * .jpg","DealPrice":"￥15.00","Stock":"剩余1000份","ShippingInfo":"配送上门/全国快递",
         * "Url":"haodourecipe://haodou.com/goods/detail?id=3162","IsShippingFree":1,
         * "Weight":"165克","Labels":[],"Price":"￥19.90"},{"GoodsId":3411,"Title":"韩国泡菜",
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/12/22/3411_5678d476e1e79_336_336.jpg",
         * "DealPrice":"￥9.90","Stock":"剩余100份","ShippingInfo":"同城快递",
         * "Url":"haodourecipe://haodou.com/goods/detail?id=3411","IsShippingFree":1,
         * "Weight":"500克","Labels":["新人价"],"Price":"￥15.00"},{"GoodsId":4642,"Title":"香酥辣椒酥
         * 辣条香酥椒小吃零食","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/01/4642_56d540986e8d5_336_336.jpg","DealPrice":"￥12.00",
         * "Stock":"剩余550份","ShippingInfo":"全国快递","Url":"haodourecipe://haodou
         * .com/goods/detail?id=4642","IsShippingFree":2,"Weight":"200克","Labels":["新人价","包邮"],
         * "Price":"￥18.00"},{"GoodsId":5549,"Title":"日式关东煮汤料55ml贴心小瓶设计|一餐一瓶",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/04/07/5549_5705dd6780b54_336_336.jpg",
         * "DealPrice":"￥9.90","Stock":"剩余2份","ShippingInfo":"全国快递","Url":"haodourecipe://haodou
         * .com/goods/detail?id=5549","IsShippingFree":1,"Weight":"500克","Labels":[],"Price":"￥19
         * .80"}]
         * CartTotalNum : 8
         */

        private InfoBean info;
        private int count;
        private int CartTotalNum;
        private List<AdBean> ad;
        private List<ListBean> list;

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCartTotalNum() {
            return CartTotalNum;
        }

        public void setCartTotalNum(int CartTotalNum) {
            this.CartTotalNum = CartTotalNum;
        }

        public List<AdBean> getAd() {
            return ad;
        }

        public void setAd(List<AdBean> ad) {
            this.ad = ad;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class InfoBean {
            /**
             * Title : 特价趁现在
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460425225.jpg
             * ShareUrl : http://m.haodou.com/mall/index.php?r=wap/goods&id=173
             * ShareDesc : 今日特惠，年底大促！
             */

            private String Title;
            private String CoverUrl;
            private String ShareUrl;
            private String ShareDesc;

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

            @Override
            public String toString() {
                return "InfoBean{" +
                        "Title='" + Title + '\'' +
                        ", CoverUrl='" + CoverUrl + '\'' +
                        ", ShareUrl='" + ShareUrl + '\'' +
                        ", ShareDesc='" + ShareDesc + '\'' +
                        '}';
            }
        }

        public static class AdBean {
            /**
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460425225.jpg
             * Url :
             */

            private String ImgUrl;
            private String Url;

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }

            @Override
            public String toString() {
                return "AdBean{" +
                        "ImgUrl='" + ImgUrl + '\'' +
                        ", Url='" + Url + '\'' +
                        '}';
            }
        }

        public static class ListBean {
            /**
             * GoodsId : 2105
             * Title : 包郵秒杀 红糖大瓜子
             * CoverUrl : http://pimg3.hoto.cn/goods/2016/03/28/2105_56f8d5756e383_336_336.jpg
             * DealPrice : ￥18.00
             * Stock : 剩余21份
             * ShippingInfo : 全国快递
             * Url : haodourecipe://haodou.com/goods/detail?id=2105
             * IsShippingFree : 2
             * Weight : 150克
             * Labels : ["包邮"]
             * Price : ￥25.00
             */

            private int GoodsId;
            private String Title;
            private String CoverUrl;
            private String DealPrice;
            private String Stock;
            private String ShippingInfo;
            private String Url;
            private int IsShippingFree;
            private String Weight;
            private String Price;
            private List<String> Labels;

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

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public String getDealPrice() {
                return DealPrice;
            }

            public void setDealPrice(String DealPrice) {
                this.DealPrice = DealPrice;
            }

            public String getStock() {
                return Stock;
            }

            public void setStock(String Stock) {
                this.Stock = Stock;
            }

            public String getShippingInfo() {
                return ShippingInfo;
            }

            public void setShippingInfo(String ShippingInfo) {
                this.ShippingInfo = ShippingInfo;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }

            public int getIsShippingFree() {
                return IsShippingFree;
            }

            public void setIsShippingFree(int IsShippingFree) {
                this.IsShippingFree = IsShippingFree;
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

            public List<String> getLabels() {
                return Labels;
            }

            public void setLabels(List<String> Labels) {
                this.Labels = Labels;
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "info=" + info +
                    ", count=" + count +
                    ", CartTotalNum=" + CartTotalNum +
                    ", ad=" + ad +
                    ", list=" + list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SalePriceBean{" +
                "status=" + status +
                ", result=" + result +
                '}';
    }
}