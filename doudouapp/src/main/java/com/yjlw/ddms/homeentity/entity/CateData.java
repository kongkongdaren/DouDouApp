package com.yjlw.ddms.homeentity.entity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 美食研究所实体类
 * @Author: 原海忠
 * @CreateDate: 2016/11/25
 * @Version: [v1.0]
 */
public class CateData {

    /**
     * status : 200
     * result : {"Title":"美食研究所","list":[{"StoreId":7555,"StoreTitle":"徐庆食品",
     * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/03/14/56e63eb8c4a29.jpg",
     * "UserId":"9624730","UserName":"徐庆食品","GoodsId":5472,"Title":"玫瑰酥",
     * "SubTitle":"看得见的花瓣，吃得到的美味，真材实料，只为玫瑰酥！","DealPrice":"￥25.90","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/18/5472_56eb9e466bee9_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5472","LikeCount":20,"Stock":300,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"235克",
     * "Price":"￥35.90"},{"StoreId":5566,"StoreTitle":"唇味烘培","StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/12/16/5671256642ce7.jpg","UserId":"9182269","UserName":"唇味","GoodsId":5343,
     * "Title":"牛乳慕斯","SubTitle":"蛋糕","DealPrice":"￥158.00","ShippingInfo":"配送上门/同城快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/30/5343_56fb9e5dae4b9_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5343","LikeCount":10,"Stock":100,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"450克","Price":"￥188
     * .00"},{"StoreId":7557,"StoreTitle":"喵姐甜品店","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2016/03/14/56e66634ab066.jpg","UserId":"5105954","UserName":"JIALIN.CAI",
     * "GoodsId":5473,"Title":"7寸千层蛋糕","SubTitle":"抹茶/可可奥利奥千层","DealPrice":"￥179.00",
     * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/18/5473_56eba1b589ddc_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5473","LikeCount":6,"Stock":99,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"1200克","Price":"￥269.00"},{"StoreId":7117,
     * "StoreTitle":"美食速递","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/02/26/56d0703871580
     * .jpg","UserId":"9534111","UserName":"冷月姮娥","GoodsId":5257,"Title":"休闲零食炭烧腰果越南坚果干果",
     * "SubTitle":"营养丰富","DealPrice":"￥27.90","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2
     * .hoto.cn/goods/2016/03/11/5257_56e19f0d09a36_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5257","LikeCount":7,"Stock":200,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"200克","Price":"￥50.00"},{"StoreId":7117,
     * "StoreTitle":"美食速递","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/02/26/56d0703871580
     * .jpg","UserId":"9534111","UserName":"冷月姮娥","GoodsId":5194,"Title":"即食鱿鱼丝 特产小吃 休闲海鲜",
     * "SubTitle":"碳烤鱿鱼丝","DealPrice":"￥13.50","ShippingInfo":"配送上门/同城快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/03/08/5194_56de7823615ce_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5194","LikeCount":4,"Stock":200,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":["新人价"],"Weight":"150克","Price":"￥30
     * .00"},{"StoreId":2792,"StoreTitle":"懒人汤料","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/08/5616212c7503f.jpg","UserId":"8708859","UserName":"林记66",
     * "GoodsId":5148,"Title":"35头鳕鱼胶","SubTitle":"满满的胶原蛋白，滋补佳品","DealPrice":"￥128.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/03/07/5148_56dcfd21d145c_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5148","LikeCount":3,"Stock":100,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"100克","Price":"￥168.00"},{"StoreId":3404,
     * "StoreTitle":"蜜小蜜","StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/03/563895d8c1765
     * .jpg","UserId":"8809832","UserName":"小甜甜vivi","GoodsId":4693,"Title":"养胃大麦茶200克买三送一",
     * "SubTitle":"偏远地区不包邮，买三送一份柠檬干，买六送二","DealPrice":"￥12.00","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/05/30/4693_574bc8f0cf970_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4693","LikeCount":9,"Stock":668,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"200克","Price":"￥22
     * .00"},{"StoreId":3666,"StoreTitle":"广玉兰记","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2015/10/29/5631daf0d10fc.jpg","UserId":"8850179","UserName":"广玉兰记",
     * "GoodsId":1120,"Title":"【满58元有礼】广东汤料包增强免疫力套餐3款","SubTitle":"订单满58元送1包玉竹淮山枸杞汤",
     * "DealPrice":"￥82.00","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/20/1120_564e988c138f5_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1120","LikeCount":20,"Stock":182,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"245克","Price":"￥164.00"},{"StoreId":8197,
     * "StoreTitle":"素年锦食","StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/03/16/56e96891c2c34
     * .jpg","UserId":"9582052","UserName":"素年锦食豆掌柜","GoodsId":5562,"Title":"新疆特级手制黄杏干",
     * "SubTitle":"天然晾制出来的好味道。","DealPrice":"￥19.00","ShippingInfo":"配送上门/同城快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/21/5562_56f00f692c29f_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5562","LikeCount":1,"Stock":50,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":["新人价"],"Weight":"150克","Price":"￥25
     * .00"},{"StoreId":8197,"StoreTitle":"素年锦食","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2016/03/16/56e96891c2c34.jpg","UserId":"9582052","UserName":"素年锦食豆掌柜",
     * "GoodsId":5560,"Title":"新疆绿香妃葡萄干","SubTitle":"新疆最好的葡萄干，纯自然风干，肉质细腻，粒大味美。","DealPrice":"￥28
     * .00","ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/21/5560_56f00b2c8de9c_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5560","LikeCount":0,"Stock":50,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"150克","Price":"￥35.00"},{"StoreId":8197,
     * "StoreTitle":"素年锦食","StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/03/16/56e96891c2c34
     * .jpg","UserId":"9582052","UserName":"素年锦食豆掌柜","GoodsId":5559,"Title":"福安奈李干",
     * "SubTitle":"闽东特色小食，传统手工，酸酸甜甜自然味，越吃越有好感。","DealPrice":"￥18.00","ShippingInfo":"配送上门/同城快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/21/5559_56f0090bbffdf_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5559","LikeCount":1,"Stock":50,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":["新人价"],"Weight":"200克","Price":"￥25
     * .00"},{"StoreId":7117,"StoreTitle":"美食速递","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/02/26/56d0703871580.jpg","UserId":"9534111","UserName":"冷月姮娥",
     * "GoodsId":5188,"Title":"休闲零食坚果炒货花生米","SubTitle":"香酥松脆  回味无穷","DealPrice":"￥9.90",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/08/5188_56de6c383acf8_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5188","LikeCount":4,"Stock":200,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"258克","Price":"￥20.00"},{"StoreId":7353,
     * "StoreTitle":"UCoffee悠咖啡","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/03/09/56dfb40752a50.jpg","UserId":"9591662","UserName":"UCoffee悠咖啡",
     * "GoodsId":5245,"Title":"拿铁咖啡","SubTitle":"香醇的拿铁咖啡","DealPrice":"￥34.00",
     * "ShippingInfo":"同城快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/10/5245_56e13110587b7_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5245","LikeCount":1,"Stock":100,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"300克","Price":"￥35.00"},{"StoreId":5845,
     * "StoreTitle":"李太太养生花草茶","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/02/10/56bb33d214fac.jpg","UserId":"9226304","UserName":"李太太萧萧",
     * "GoodsId":5314,"Title":"月季花茶","SubTitle":"纯天然特级月季花茶 暖宫调经 祛斑美容 养颜","DealPrice":"￥16.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/13/5314_56e5567ba85e5_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5314","LikeCount":0,"Stock":100,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"30克","Price":"￥26.00"},{"StoreId":3526,
     * "StoreTitle":"辣喊吧","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/26/562db32f4f904
     * .jpg","UserId":"8829483","UserName":"辣喊","GoodsId":979,"Title":"【包邮】蜂蜜柠檬爽脆萝卜皮【食味⑨久】",
     * "SubTitle":"脆到没朋友","DealPrice":"￥26.50","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/10/29/979_5631f7568a00f_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=979","LikeCount":23,"Stock":100,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥35
     * .00"},{"StoreId":4472,"StoreTitle":"Wong辣子-他和她的私房菜","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/17/564a7dd88375c.jpg","UserId":"8975990","UserName":"wong辣子",
     * "GoodsId":1885,"Title":"【Wong辣子】私房辣子鸡 曲靖辣子鸡 沾益辣子鸡",
     * "SubTitle":"源自辣子鸡发源地曲靖沾益总站，妈妈做的辣子鸡，家的味道。","DealPrice":"￥120.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/23/1885_5652bac7ab182_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1885","LikeCount":11,"Stock":100,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"500克"},{"StoreId":2943,"StoreTitle":"领秀美食",
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/09/56405f758e6ec.jpg",
     * "UserId":"5184673","UserName":"领秀美食","GoodsId":4758,"Title":"小香薯番薯干",
     * "SubTitle":"甜而不腻，入口难忘，回味无穷","DealPrice":"￥22.00","ShippingInfo":"配送上门/同城快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/11/18/4758_582ea40a675cd_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4758","LikeCount":3,"Stock":100,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"500克","Price":"￥25.00"},
     * {"StoreId":3253,"StoreTitle":"山人饭堂","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/20/56260a92a0b40.jpg","UserId":"8789888","UserName":"山人饭堂",
     * "GoodsId":774,"Title":"酱肘花","SubTitle":"秘制酱料，新鲜食材。","DealPrice":"￥40.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/10/22/774_56282d64c02b6_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=774","LikeCount":10,"Stock":20,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":[],"Weight":"500克"},{"StoreId":6251,"StoreTitle":"王家珍味私房秘制",
     * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2016/01/07/568e0b8441d9d.jpg",
     * "UserId":"8884162","UserName":"王家珍味","GoodsId":5568,"Title":"香菇鸡肉拌饭酱",
     * "SubTitle":"满口回香，醇香层叠，欲罢不能的感觉","DealPrice":"￥28.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/22/5568_56f0c2d7a6474_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5568","LikeCount":2,"Stock":99,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"180克",
     * "Price":"￥58.00"},{"StoreId":6251,"StoreTitle":"王家珍味私房秘制","StoreLogoUrl":"http://pimg2
     * .hoto.cn/store/2016/01/07/568e0b8441d9d.jpg","UserId":"8884162","UserName":"王家珍味",
     * "GoodsId":5567,"Title":"虎妈辣肉拌饭酱","SubTitle":"酱香醇美，肉粒嫩滑劲爽","DealPrice":"￥38.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/03/22/5567_56f0be1a10544_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5567","LikeCount":0,"Stock":99,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"180克","Price":"￥68.00"}],"count":21,
     * "CartTotalNum":8}
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
         * Title : 美食研究所
         * list : [{"StoreId":7555,"StoreTitle":"徐庆食品","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/03/14/56e63eb8c4a29.jpg","UserId":"9624730","UserName":"徐庆食品",
         * "GoodsId":5472,"Title":"玫瑰酥","SubTitle":"看得见的花瓣，吃得到的美味，真材实料，只为玫瑰酥！","DealPrice":"￥25
         * .90","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/18/5472_56eb9e466bee9_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5472","LikeCount":20,"Stock":300,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"235克","Price":"￥35.90"},{"StoreId":5566,
         * "StoreTitle":"唇味烘培","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/12/16/5671256642ce7.jpg","UserId":"9182269","UserName":"唇味",
         * "GoodsId":5343,"Title":"牛乳慕斯","SubTitle":"蛋糕","DealPrice":"￥158.00",
         * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/30/5343_56fb9e5dae4b9_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5343","LikeCount":10,"Stock":100,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"450克","Price":"￥188.00"},{"StoreId":7557,
         * "StoreTitle":"喵姐甜品店","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/03/14/56e66634ab066.jpg","UserId":"5105954","UserName":"JIALIN.CAI",
         * "GoodsId":5473,"Title":"7寸千层蛋糕","SubTitle":"抹茶/可可奥利奥千层","DealPrice":"￥179.00",
         * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/18/5473_56eba1b589ddc_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5473","LikeCount":6,"Stock":99,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"1200克","Price":"￥269.00"},{"StoreId":7117,
         * "StoreTitle":"美食速递","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/02/26/56d0703871580.jpg","UserId":"9534111","UserName":"冷月姮娥",
         * "GoodsId":5257,"Title":"休闲零食炭烧腰果越南坚果干果","SubTitle":"营养丰富","DealPrice":"￥27.90",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/11/5257_56e19f0d09a36_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5257","LikeCount":7,"Stock":200,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"200克","Price":"￥50.00"},{"StoreId":7117,
         * "StoreTitle":"美食速递","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/02/26/56d0703871580.jpg","UserId":"9534111","UserName":"冷月姮娥",
         * "GoodsId":5194,"Title":"即食鱿鱼丝 特产小吃 休闲海鲜","SubTitle":"碳烤鱿鱼丝","DealPrice":"￥13.50",
         * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/08/5194_56de7823615ce_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5194","LikeCount":4,"Stock":200,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"150克","Price":"￥30.00"},{"StoreId":2792,
         * "StoreTitle":"懒人汤料","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/08/5616212c7503f.jpg","UserId":"8708859","UserName":"林记66",
         * "GoodsId":5148,"Title":"35头鳕鱼胶","SubTitle":"满满的胶原蛋白，滋补佳品","DealPrice":"￥128.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/07/5148_56dcfd21d145c_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5148","LikeCount":3,"Stock":100,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"100克","Price":"￥168.00"},{"StoreId":3404,
         * "StoreTitle":"蜜小蜜","StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/03/563895d8c1765
         * .jpg","UserId":"8809832","UserName":"小甜甜vivi","GoodsId":4693,"Title":"养胃大麦茶200克买三送一",
         * "SubTitle":"偏远地区不包邮，买三送一份柠檬干，买六送二","DealPrice":"￥12.00","ShippingInfo":"全国快递",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/05/30/4693_574bc8f0cf970_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4693","LikeCount":9,"Stock":668,
         * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"200克","Price":"￥22
         * .00"},{"StoreId":3666,"StoreTitle":"广玉兰记","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2015/10/29/5631daf0d10fc.jpg","UserId":"8850179","UserName":"广玉兰记",
         * "GoodsId":1120,"Title":"【满58元有礼】广东汤料包增强免疫力套餐3款","SubTitle":"订单满58元送1包玉竹淮山枸杞汤",
         * "DealPrice":"￥82.00","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/20/1120_564e988c138f5_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1120","LikeCount":20,"Stock":182,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"245克","Price":"￥164.00"},{"StoreId":8197,
         * "StoreTitle":"素年锦食","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/03/16/56e96891c2c34.jpg","UserId":"9582052","UserName":"素年锦食豆掌柜",
         * "GoodsId":5562,"Title":"新疆特级手制黄杏干","SubTitle":"天然晾制出来的好味道。","DealPrice":"￥19.00",
         * "ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/21/5562_56f00f692c29f_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5562","LikeCount":1,"Stock":50,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"150克","Price":"￥25.00"},{"StoreId":8197,
         * "StoreTitle":"素年锦食","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/03/16/56e96891c2c34.jpg","UserId":"9582052","UserName":"素年锦食豆掌柜",
         * "GoodsId":5560,"Title":"新疆绿香妃葡萄干","SubTitle":"新疆最好的葡萄干，纯自然风干，肉质细腻，粒大味美。",
         * "DealPrice":"￥28.00","ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/21/5560_56f00b2c8de9c_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5560","LikeCount":0,"Stock":50,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"150克","Price":"￥35.00"},{"StoreId":8197,
         * "StoreTitle":"素年锦食","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/03/16/56e96891c2c34.jpg","UserId":"9582052","UserName":"素年锦食豆掌柜",
         * "GoodsId":5559,"Title":"福安奈李干","SubTitle":"闽东特色小食，传统手工，酸酸甜甜自然味，越吃越有好感。",
         * "DealPrice":"￥18.00","ShippingInfo":"配送上门/同城快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/21/5559_56f0090bbffdf_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5559","LikeCount":1,"Stock":50,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"200克","Price":"￥25.00"},{"StoreId":7117,
         * "StoreTitle":"美食速递","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/02/26/56d0703871580.jpg","UserId":"9534111","UserName":"冷月姮娥",
         * "GoodsId":5188,"Title":"休闲零食坚果炒货花生米","SubTitle":"香酥松脆  回味无穷","DealPrice":"￥9.90",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/08/5188_56de6c383acf8_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5188","LikeCount":4,"Stock":200,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"258克","Price":"￥20.00"},{"StoreId":7353,
         * "StoreTitle":"UCoffee悠咖啡","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/03/09/56dfb40752a50.jpg","UserId":"9591662","UserName":"UCoffee悠咖啡",
         * "GoodsId":5245,"Title":"拿铁咖啡","SubTitle":"香醇的拿铁咖啡","DealPrice":"￥34.00",
         * "ShippingInfo":"同城快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/10/5245_56e13110587b7_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5245","LikeCount":1,"Stock":100,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"300克","Price":"￥35.00"},{"StoreId":5845,
         * "StoreTitle":"李太太养生花草茶","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/02/10/56bb33d214fac.jpg","UserId":"9226304","UserName":"李太太萧萧",
         * "GoodsId":5314,"Title":"月季花茶","SubTitle":"纯天然特级月季花茶 暖宫调经 祛斑美容 养颜","DealPrice":"￥16
         * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/13/5314_56e5567ba85e5_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5314","LikeCount":0,"Stock":100,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"30克","Price":"￥26.00"},{"StoreId":3526,
         * "StoreTitle":"辣喊吧","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/26/562db32f4f904
         * .jpg","UserId":"8829483","UserName":"辣喊","GoodsId":979,"Title":"【包邮】蜂蜜柠檬爽脆萝卜皮【食味⑨久】",
         * "SubTitle":"脆到没朋友","DealPrice":"￥26.50","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/10/29/979_5631f7568a00f_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=979","LikeCount":23,"Stock":100,
         * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥35
         * .00"},{"StoreId":4472,"StoreTitle":"Wong辣子-他和她的私房菜","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/17/564a7dd88375c.jpg","UserId":"8975990","UserName":"wong辣子",
         * "GoodsId":1885,"Title":"【Wong辣子】私房辣子鸡 曲靖辣子鸡 沾益辣子鸡",
         * "SubTitle":"源自辣子鸡发源地曲靖沾益总站，妈妈做的辣子鸡，家的味道。","DealPrice":"￥120.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/23/1885_5652bac7ab182_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1885","LikeCount":11,"Stock":100,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"500克"},{"StoreId":2943,"StoreTitle":"领秀美食",
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/09/56405f758e6ec.jpg",
         * "UserId":"5184673","UserName":"领秀美食","GoodsId":4758,"Title":"小香薯番薯干",
         * "SubTitle":"甜而不腻，入口难忘，回味无穷","DealPrice":"￥22.00","ShippingInfo":"配送上门/同城快递",
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/11/18/4758_582ea40a675cd_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4758","LikeCount":3,"Stock":100,
         * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"500克","Price":"￥25
         * .00"},{"StoreId":3253,"StoreTitle":"山人饭堂","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/20/56260a92a0b40.jpg","UserId":"8789888","UserName":"山人饭堂",
         * "GoodsId":774,"Title":"酱肘花","SubTitle":"秘制酱料，新鲜食材。","DealPrice":"￥40.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/10/22/774_56282d64c02b6_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=774","LikeCount":10,"Stock":20,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"500克"},{"StoreId":6251,"StoreTitle":"王家珍味私房秘制",
         * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2016/01/07/568e0b8441d9d.jpg",
         * "UserId":"8884162","UserName":"王家珍味","GoodsId":5568,"Title":"香菇鸡肉拌饭酱",
         * "SubTitle":"满口回香，醇香层叠，欲罢不能的感觉","DealPrice":"￥28.00","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/22/5568_56f0c2d7a6474_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5568","LikeCount":2,"Stock":99,
         * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["新人价","包邮"],"Weight":"180克",
         * "Price":"￥58.00"},{"StoreId":6251,"StoreTitle":"王家珍味私房秘制","StoreLogoUrl":"http://pimg2
         * .hoto.cn/store/2016/01/07/568e0b8441d9d.jpg","UserId":"8884162","UserName":"王家珍味",
         * "GoodsId":5567,"Title":"虎妈辣肉拌饭酱","SubTitle":"酱香醇美，肉粒嫩滑劲爽","DealPrice":"￥38.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/03/22/5567_56f0be1a10544_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5567","LikeCount":0,"Stock":99,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["新人价","包邮"],"Weight":"180克","Price":"￥68.00"}]
         * count : 21
         * CartTotalNum : 8
         */

        private String Title;
        private int count;
        private int CartTotalNum;
        private List<ListBean> list;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * StoreId : 7555
             * StoreTitle : 徐庆食品
             * StoreLogoUrl : http://pimg1.hoto.cn/store/2016/03/14/56e63eb8c4a29.jpg
             * UserId : 9624730
             * UserName : 徐庆食品
             * GoodsId : 5472
             * Title : 玫瑰酥
             * SubTitle : 看得见的花瓣，吃得到的美味，真材实料，只为玫瑰酥！
             * DealPrice : ￥25.90
             * ShippingInfo : 全国快递
             * CoverUrl : http://pimg1.hoto.cn/goods/2016/03/18/5472_56eb9e466bee9_680_450.jpg
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=5472
             * LikeCount : 20
             * Stock : 300
             * IsShippingFree : 2
             * IsLike : 0
             * CartNum : 0
             * Labels : ["新人价","包邮"]
             * Weight : 235克
             * Price : ￥35.90
             */

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
            private List<String> Labels;

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

            public List<String> getLabels() {
                return Labels;
            }

            public void setLabels(List<String> Labels) {
                this.Labels = Labels;
            }
        }
    }
}