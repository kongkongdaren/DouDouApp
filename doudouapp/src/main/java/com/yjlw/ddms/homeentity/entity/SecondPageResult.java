package com.yjlw.ddms.homeentity.entity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/17
 * @Version: [v1.0]
 */
public class SecondPageResult {


    /**
     * result : {"BrandStore":{"ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2016/06/1466748684
     * .jpg","InsertionUrl":"http://m.haodou.com/mall/index.php?r=wap/brand/home-page-recommend",
     * "OpenURL":"haodourecipe://haodou.com/opentopic/?id=471515&store_id=167",
     * "Title":"【夏日美食】一骑红尘荔枝蜜~"},"CartTotalNum":0,"CateList":[{"CateId":"58","CateName":"家传秘制",
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438411987.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=58&CateName=家传秘制"},
     * {"CateId":"59","CateName":"肉禽蛋类","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2015/08/1438412006.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=59&CateName=肉禽蛋类"},{"CateId":"60","CateName":"烘焙面点",
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412017.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=60&CateName=烘焙面点"},
     * {"CateId":"61","CateName":"水产海鲜","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2015/08/1438412028.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=61&CateName=水产海鲜"},{"CateId":"62","CateName":"腌腊制品",
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412038.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=62&CateName=腌腊制品"},
     * {"CateId":"63","CateName":"调味酱料","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2015/08/1438412074.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=63&CateName=调味酱料"},{"CateId":"64","CateName":"养生养颜",
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412060.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=64&CateName=养生养颜"},
     * {"CateId":"65","CateName":"小吃零嘴","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2015/08/1438412048.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=65&CateName=小吃零嘴"},{"CateId":"66","CateName":"冲调饮品",
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/11/1447986571.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=66&CateName=冲调饮品"},
     * {"CateId":"67","CateName":"生鲜果蔬","ImgUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2015/11/1448422666.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/searchResult/?CateId=67&CateName=生鲜果蔬"}],
     * "DailyFirstGoods":{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/03/1457419342.jpg",
     * "IsAuto":0,"Label":"美食研究所","OpenUrl":"haodourecipe://haodou
     * .com/goods/dailyfirst?type=new","Price":"￥0.00","Title":"新品推荐"},
     * "DailySpecialGoods":{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460520351.jpg",
     * "IsAuto":0,"Label":"","OpenUrl":"haodourecipe://haodou.com/goods/subjectlist/?id=173",
     * "Price":"￥9.90","Title":"今日特价"},"FoodieFavoriteGoods":[{"CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460599417.jpg","GoodsId":5549,"HomePosition":1,"Price":"￥9.90",
     * "Title":"日式汤料"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342044.jpg",
     * "GoodsId":2786,"HomePosition":2,"Price":"￥89.90","Title":"阿胶糕"},{"CoverUrl":"http://img1
     * .hoto.cn/mall/mall_ad/2016/04/1460342069.jpg","GoodsId":556,"HomePosition":3,"Price":"￥29
     * .90","Title":"核桃曲奇"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460599176
     * .jpg","GoodsId":1910,"HomePosition":4,"Price":"￥31.90","Title":"红肠"},
     * {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342883.jpg","GoodsId":5268,
     * "HomePosition":5,"Price":"￥16.90","Title":"糖蒜"},{"CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460342151.jpg","GoodsId":4364,"HomePosition":6,"Price":"￥32.00",
     * "Title":"山楂果酱"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342322.jpg",
     * "GoodsId":1155,"HomePosition":7,"Price":"￥16.80","Title":"酸角糕"},{"CoverUrl":"http://img1
     * .hoto.cn/mall/mall_ad/2016/04/1460342343.jpg","GoodsId":5172,"HomePosition":8,"Price":"￥35
     * .00","Title":"香蕉酥"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342371.jpg",
     * "GoodsId":985,"HomePosition":9,"Price":"￥48.00","Title":"香辣腊肉干"}],
     * "NewsRecommendGood":{"Content":"好豆到家","Goods":{"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg","DealPrice":"￥14.90","GoodsId":4786,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4786","Title":"买5冷面赠2凉皮한국냉면 매우맛있다"},
     * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460341662.jpg",
     * "Info":"冷面，面条劲道且富有弹性，是看得见的Q
     * ，看得见的弹！！酸溜溜的，甜滋滋的汤汁，浓郁到让你的舌头欲罢不能，火红的油辣子带来了不仅是满满的诚意而且更多幸福感。真空包装，卫生和干净都看得见。",
     * "Tags":["好吃不贵"],"UserName":"好豆到家品鉴员"},"OneHourGoods":{"CoverUrl":"http://img1.hoto
     * .cn/mall/mall_ad/2016/04/1460099180.jpg","IsAuto":2,"Label":"明星店铺",
     * "OpenUrl":"haodourecipe://haodou.com/store/?id=610","Price":"￥0.00","Title":"俊哥的小店儿"},
     * "count":200,"list":[{"CartNum":0,"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/07/31/271_55bb72af0a680_680_450.jpg","DealPrice":"￥150.00","GoodsId":271,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":2485,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=271","Price":"￥168.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":100,"StoreId":149,"StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/07/31/55bb6ac68d05a.jpg","StoreTitle":"靓家货","SubTitle":"【肘爷】酱肘子，肉质细腻",
     * "Title":"【肘爷】酱肘子","UserId":"8190340","UserName":"Leslie靓靓","Weight":"1000克"},{"CartNum":0,
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/11/25/1917_56551cf4d9142_680_450.jpg",
     * "DealPrice":"￥32.80","GoodsId":1917,"IsLike":0,"IsShippingFree":2,"Labels":["新人价","包邮"],
     * "LikeCount":202,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1917","Price":"￥48
     * .00","ShippingInfo":"全国快递","Stock":128,"StoreId":4174,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/11/19/564db750f35db.jpg","StoreTitle":"小钱包的美好生活","SubTitle":"黑猪肉灌制而成
     * 佐餐及零食佳品","Title":"哈尔滨农大风干肠300克","UserId":"8927449","UserName":"钱包妈","Weight":"300克"},
     * {"CartNum":0,"CoverUrl":"http://pimg1.hoto.cn/goods/2016/04/07/5676_5705dcd7d69a5_680_450
     * .jpg","DealPrice":"￥33.90","GoodsId":5676,"IsLike":0,"IsShippingFree":1,"Labels":[],
     * "LikeCount":184,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5676","Price":"￥49
     * .99","ShippingInfo":"全国快递","Stock":31,"StoreId":7161,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2016/03/21/56efbcd89b255.jpg","StoreTitle":"荤爷的店","SubTitle":"200ml.日本风味
     * .安全放心无添加","Title":"好豆金牌卖家热卖关东煮汤料200ml","UserId":"9049464","UserName":"斯坦福桥的破车",
     * "Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/10/16/312_5620372fe06ed_680_450.jpg","DealPrice":"￥35.00","GoodsId":312,
     * "IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":1541,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=312","Price":"￥38.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":25,"StoreId":166,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/08/09/55c6ba6389638.jpg","StoreTitle":"然妈烘焙","SubTitle":"纯手工制作健康无添加饼干",
     * "Title":"蔓越莓饼干（40片）","UserId":"20500","UserName":"尚志李波","Weight":"230克"},{"CartNum":0,
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/1967_568a662d8af89_680_450.jpg",
     * "DealPrice":"￥10.00","GoodsId":1967,"IsLike":0,"IsShippingFree":1,"Labels":[],
     * "LikeCount":150,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1967","Price":"￥30
     * .00","ShippingInfo":"配送上门/全国快递","Stock":539,"StoreId":3831,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
     * "SubTitle":"【店里零食任选3份赠50g，4份赠100g】","Title":"奶油爆米花","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/06/1968_56642eea04da4_680_450.jpg","DealPrice":"￥10.00","GoodsId":1968,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":82,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1968","Price":"￥30.00","ShippingInfo":"配送上门/全国快递","Stock":73,
     * "StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
     * "StoreTitle":"京味家常","SubTitle":"【店里零食任选3份赠50g，4份赠100g】","Title":"怪味香香豆",
     * "UserId":"8875479","UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/12/02/2402_565f0efb074d6_680_450.jpg",
     * "DealPrice":"￥12.50","GoodsId":2402,"IsLike":0,"IsShippingFree":1,"Labels":["活动价"],
     * "LikeCount":218,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2402","Price":"￥25
     * .00","ShippingInfo":"配送上门/全国快递","Stock":50,"StoreId":3712,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺",
     * "SubTitle":"好豆爆款，买5份赠送1份。","Title":"【限时促销】精品罐装秘制酒鬼花生","UserId":"8843844",
     * "UserName":"爱美食滴加菲猫","Weight":"250克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg","DealPrice":"￥49.00","GoodsId":1351,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":113,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1351","Price":"￥70.00","ShippingInfo":"配送上门/全国快递","Stock":64,
     * "StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
     * "StoreTitle":"京味家常","SubTitle":"赠零食","Title":"美味陈皮鸡","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg","DealPrice":"￥26.00","GoodsId":1136,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":243,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1136","Price":"￥50.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"香糯爽口
     * 腊味十足（满49包邮）","Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"640克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/01/04/1349_568a6571c14b8_680_450.jpg","DealPrice":"￥79.90","GoodsId":1349,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":100,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1349","Price":"￥149.00","ShippingInfo":"配送上门/全国快递","Stock":66,
     * "StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
     * "StoreTitle":"京味家常","SubTitle":"赠零食","Title":"【开工篇】秘制无骨酱肘子包邮","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"580克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/10/28/941_5630408a90dca_680_450.jpg","DealPrice":"￥50.00","GoodsId":941,
     * "IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":171,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=941","Price":"￥70.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":32,"StoreId":1975,"StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/09/14/55f66f76be97a.jpg","StoreTitle":"李记酱肉","SubTitle":"245g包邮",
     * "Title":"北平李记香辣牛肉干","UserId":"8554254","UserName":"北平李记","Weight":"245克"},{"CartNum":0,
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/08/2912_568f24b7907f3_680_450.jpg",
     * "DealPrice":"￥50.00","GoodsId":2912,"IsLike":0,"IsShippingFree":1,"Labels":[],
     * "LikeCount":82,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2912","Price":"￥80
     * .00","ShippingInfo":"配送上门/同城快递","Stock":64,"StoreId":3831,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
     * "SubTitle":"【店里零食任选3份赠50g】特价除外","Title":"防霾素什锦【赠送零食】","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/10/28/943_5630421a315e5_680_450.jpg","DealPrice":"￥50.00","GoodsId":943,
     * "IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":300,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=943","Price":"￥60.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":35,"StoreId":1975,"StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/09/14/55f66f76be97a.jpg","StoreTitle":"李记酱肉","SubTitle":"包邮。无添加剂，解馋、补钙！",
     * "Title":"北平李记香辣掌中宝245g","UserId":"8554254","UserName":"北平李记","Weight":"245克"},
     * {"CartNum":0,"CoverUrl":"http://pimg1.hoto.cn/goods/2015/11/10/1404_56416d1d04427_680_450
     * .jpg","DealPrice":"￥10.00","GoodsId":1404,"IsLike":0,"IsShippingFree":1,"Labels":[],
     * "LikeCount":46,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1404","Price":"￥25
     * .00","ShippingInfo":"配送上门/全国快递","Stock":136,"StoreId":3831,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
     * "SubTitle":"【店里零食任选3份赠50g，4份赠100g】","Title":"【开学篇】焦糖瓜子【零食任选2袋包邮】","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/05/2535_5662ece15690f_680_450.jpg","DealPrice":"￥27.00","GoodsId":2535,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":200,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2535","Price":"￥55.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":40,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"做腊肉就是做良心。",
     * "Title":"【限时促销】正宗四川农家烟熏腊肉｛买六包赠一包｝","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"300克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/11/17/1737_564ad59e5a8bc_680_450.jpg","DealPrice":"￥59.80","GoodsId":1737,
     * "IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":28,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1737","Price":"￥116.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":59,"StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常","SubTitle":"小肋排",
     * "Title":"【妈妈de味道】红烧排骨【赠零食】","UserId":"8875479","UserName":"京味家常D小满","Weight":"500克"},
     * {"CartNum":0,"CoverUrl":"http://pimg2.hoto.cn/goods/2016/03/07/2227_56dce0f24f766_680_450
     * .jpg","DealPrice":"￥82.50","GoodsId":2227,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],
     * "LikeCount":10,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2227","Price":"￥150
     * .00","ShippingInfo":"配送上门/全国快递","Stock":38,"StoreId":3831,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
     * "SubTitle":"文火慢炖，肉质酥软不塞牙","Title":"酱牛肉","UserId":"8875479","UserName":"京味家常D小满",
     * "Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/03/09/1969_56df96fdd7aa8_680_450.jpg","DealPrice":"￥19.90","GoodsId":1969,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":30,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1969","Price":"￥50.00","ShippingInfo":"配送上门/全国快递","Stock":66,
     * "StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
     * "StoreTitle":"京味家常","SubTitle":"组合最美","Title":"爆米花与倒蒸地瓜干","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"200克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/27/1075_56586c032c80e_680_450.jpg","DealPrice":"￥39.00","GoodsId":1075,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":157,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1075","Price":"￥60.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":40,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"卤香四溢，好吃停不下来！",
     * "Title":"【限时促销】特价包邮飘香独家秘制卤香干（750g） ","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"750克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/04/1178_563a1c31d2f0f_680_450.jpg","DealPrice":"￥29.00","GoodsId":1178,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":115,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1178","Price":"￥50.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"味道浓郁，爽口不腻",
     * "Title":"【限时促销】飘香老北京风味蒜肠 独家秘制 550g","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"550克"}],"tags":[{"Goods":{"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg","DealPrice":"69.00","GoodsId":"6278",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6278","Title":"【温州特产】猪油渣"},"Id":"38",
     * "Title":"猪肉","Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=猪肉&TagId=38"},
     * {"Goods":{"CoverUrl":"http://pimg3.hoto.cn/goods/2016/11/08/6281_5821a8fdc0ed1_336_336
     * .jpg","DealPrice":"79.00","GoodsId":"6281","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=6281","Title":"【Emily的美好时光】蛋黄酥 低糖白莲蓉味（六个礼盒装）"},"Id":"42",
     * "Title":"饼干","Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=饼干&TagId=42"},
     * {"Goods":{"CoverUrl":"http://pimg2.hoto.cn/goods/2016/11/17/1285_582d6d880edee_336_336
     * .jpg","DealPrice":"65.00","GoodsId":"1285","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1285","Title":"【2份包邮】限时促销精品罐装飘香秘制风味牙签牛肉"},"Id":"37","Title":"牛羊肉",
     * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=牛羊肉&TagId=37"},
     * {"Goods":{"CoverUrl":"http://pimg1.hoto.cn/goods/2016/10/12/6255_57fdd8d5ba1d3_336_336
     * .jpg","DealPrice":"25.80","GoodsId":"6255","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=6255","Title":"正宗重庆香辣红油"},"Id":"34","Title":"辣椒酱",
     * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=辣椒酱&TagId=34"},
     * {"Goods":{"CoverUrl":"http://pimg2.hoto.cn/goods/2016/10/30/2122_581581a266f86_336_336
     * .jpg","DealPrice":"45.00","GoodsId":"2122","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2122","Title":"醉血蛤"},"Id":"57","Title":"腌制品",
     * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=腌制品&TagId=57"},
     * {"Goods":{"CoverUrl":"http://pimg2.hoto.cn/goods/2016/10/13/6259_57ffa260a1659_336_336
     * .jpg","DealPrice":"35.00","GoodsId":"6259","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=6259","Title":"麻辣醉蟹钳"},"Id":"33","Title":"螃蟹",
     * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=螃蟹&TagId=33"},
     * {"Goods":{"CoverUrl":"http://pimg3.hoto.cn/goods/2016/11/18/1859_582ea2601acb4_336_336
     * .jpg","DealPrice":"45.00","GoodsId":"1859","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1859","Title":"川贝柠檬膏"},"Id":"64","Title":"养颜",
     * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=养颜&TagId=64"},
     * {"Goods":{"CoverUrl":"http://pimg2.hoto.cn/goods/2016/07/07/6145_577e060a41c3f_336_336
     * .jpg","DealPrice":"39.90","GoodsId":"6145","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=6145","Title":"厨鲜生 | 固城湖咸鸭蛋65g×20颗礼盒装"},"Id":"43","Title":"鸡鸭鱼肉",
     * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=鸡鸭鱼肉&TagId=43"}]}
     * status : 200
     */

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
        /**
         * BrandStore : {"ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2016/06/1466748684.jpg",
         * "InsertionUrl":"http://m.haodou.com/mall/index.php?r=wap/brand/home-page-recommend",
         * "OpenURL":"haodourecipe://haodou.com/opentopic/?id=471515&store_id=167",
         * "Title":"【夏日美食】一骑红尘荔枝蜜~"}
         * CartTotalNum : 0
         * CateList : [{"CateId":"58","CateName":"家传秘制","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438411987.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=58&CateName=家传秘制"},{"CateId":"59","CateName":"肉禽蛋类",
         * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412006.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=59&CateName=肉禽蛋类"},
         * {"CateId":"60","CateName":"烘焙面点","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412017.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=60&CateName=烘焙面点"},{"CateId":"61","CateName":"水产海鲜",
         * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412028.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=61&CateName=水产海鲜"},
         * {"CateId":"62","CateName":"腌腊制品","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412038.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=62&CateName=腌腊制品"},{"CateId":"63","CateName":"调味酱料",
         * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412074.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=63&CateName=调味酱料"},
         * {"CateId":"64","CateName":"养生养颜","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/08/1438412060.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=64&CateName=养生养颜"},{"CateId":"65","CateName":"小吃零嘴",
         * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/08/1438412048.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=65&CateName=小吃零嘴"},
         * {"CateId":"66","CateName":"冲调饮品","ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2015/11/1447986571.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/searchResult/?CateId=66&CateName=冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬",
         * "ImgUrl":"http://img1.hoto.cn/mall/mall_ad/2015/11/1448422666.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/searchResult/?CateId=67&CateName=生鲜果蔬"}]
         * DailyFirstGoods : {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/03/1457419342
         * .jpg","IsAuto":0,"Label":"美食研究所","OpenUrl":"haodourecipe://haodou
         * .com/goods/dailyfirst?type=new","Price":"￥0.00","Title":"新品推荐"}
         * DailySpecialGoods : {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460520351
         * .jpg","IsAuto":0,"Label":"","OpenUrl":"haodourecipe://haodou
         * .com/goods/subjectlist/?id=173","Price":"￥9.90","Title":"今日特价"}
         * FoodieFavoriteGoods : [{"CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460599417.jpg","GoodsId":5549,"HomePosition":1,"Price":"￥9
         * .90","Title":"日式汤料"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342044
         * .jpg","GoodsId":2786,"HomePosition":2,"Price":"￥89.90","Title":"阿胶糕"},
         * {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342069.jpg","GoodsId":556,
         * "HomePosition":3,"Price":"￥29.90","Title":"核桃曲奇"},{"CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460599176.jpg","GoodsId":1910,"HomePosition":4,"Price":"￥31
         * .90","Title":"红肠"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342883
         * .jpg","GoodsId":5268,"HomePosition":5,"Price":"￥16.90","Title":"糖蒜"},
         * {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342151.jpg","GoodsId":4364,
         * "HomePosition":6,"Price":"￥32.00","Title":"山楂果酱"},{"CoverUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460342322.jpg","GoodsId":1155,"HomePosition":7,"Price":"￥16
         * .80","Title":"酸角糕"},{"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342343
         * .jpg","GoodsId":5172,"HomePosition":8,"Price":"￥35.00","Title":"香蕉酥"},
         * {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460342371.jpg","GoodsId":985,
         * "HomePosition":9,"Price":"￥48.00","Title":"香辣腊肉干"}]
         * NewsRecommendGood : {"Content":"好豆到家","Goods":{"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg","DealPrice":"￥14.90",
         * "GoodsId":4786,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4786",
         * "Title":"买5冷面赠2凉皮한국냉면 매우맛있다"},"ImgUrl":"http://img1.hoto
         * .cn/mall/mall_ad/2016/04/1460341662.jpg",
         * "Info":"冷面，面条劲道且富有弹性，是看得见的Q
         * ，看得见的弹！！酸溜溜的，甜滋滋的汤汁，浓郁到让你的舌头欲罢不能，火红的油辣子带来了不仅是满满的诚意而且更多幸福感。真空包装，卫生和干净都看得见。",
         * "Tags":["好吃不贵"],"UserName":"好豆到家品鉴员"}
         * OneHourGoods : {"CoverUrl":"http://img1.hoto.cn/mall/mall_ad/2016/04/1460099180.jpg",
         * "IsAuto":2,"Label":"明星店铺","OpenUrl":"haodourecipe://haodou.com/store/?id=610",
         * "Price":"￥0.00","Title":"俊哥的小店儿"}
         * count : 200
         * list : [{"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/07/31/271_55bb72af0a680_680_450.jpg","DealPrice":"￥150.00",
         * "GoodsId":271,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":2485,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=271","Price":"￥168.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":100,"StoreId":149,"StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/07/31/55bb6ac68d05a.jpg","StoreTitle":"靓家货","SubTitle":"【肘爷】酱肘子，肉质细腻",
         * "Title":"【肘爷】酱肘子","UserId":"8190340","UserName":"Leslie靓靓","Weight":"1000克"},
         * {"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/11/25/1917_56551cf4d9142_680_450.jpg","DealPrice":"￥32.80",
         * "GoodsId":1917,"IsLike":0,"IsShippingFree":2,"Labels":["新人价","包邮"],"LikeCount":202,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1917","Price":"￥48.00",
         * "ShippingInfo":"全国快递","Stock":128,"StoreId":4174,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/19/564db750f35db.jpg","StoreTitle":"小钱包的美好生活","SubTitle":"黑猪肉灌制而成
         * 佐餐及零食佳品","Title":"哈尔滨农大风干肠300克","UserId":"8927449","UserName":"钱包妈","Weight":"300克"},
         * {"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/04/07/5676_5705dcd7d69a5_680_450.jpg","DealPrice":"￥33.90",
         * "GoodsId":5676,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":184,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=5676","Price":"￥49.99",
         * "ShippingInfo":"全国快递","Stock":31,"StoreId":7161,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/03/21/56efbcd89b255.jpg","StoreTitle":"荤爷的店","SubTitle":"200ml.日本风味
         * .安全放心无添加","Title":"好豆金牌卖家热卖关东煮汤料200ml","UserId":"9049464","UserName":"斯坦福桥的破车",
         * "Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/10/16/312_5620372fe06ed_680_450.jpg","DealPrice":"￥35.00",
         * "GoodsId":312,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":1541,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=312","Price":"￥38.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":25,"StoreId":166,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/08/09/55c6ba6389638.jpg","StoreTitle":"然妈烘焙","SubTitle":"纯手工制作健康无添加饼干",
         * "Title":"蔓越莓饼干（40片）","UserId":"20500","UserName":"尚志李波","Weight":"230克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/1967_568a662d8af89_680_450.jpg",
         * "DealPrice":"￥10.00","GoodsId":1967,"IsLike":0,"IsShippingFree":1,"Labels":[],
         * "LikeCount":150,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1967",
         * "Price":"￥30.00","ShippingInfo":"配送上门/全国快递","Stock":539,"StoreId":3831,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
         * "StoreTitle":"京味家常","SubTitle":"【店里零食任选3份赠50g，4份赠100g】","Title":"奶油爆米花",
         * "UserId":"8875479","UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/12/06/1968_56642eea04da4_680_450.jpg",
         * "DealPrice":"￥10.00","GoodsId":1968,"IsLike":0,"IsShippingFree":1,"Labels":[],
         * "LikeCount":82,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1968","Price":"￥30
         * .00","ShippingInfo":"配送上门/全国快递","Stock":73,"StoreId":3831,"StoreLogoUrl":"http://pimg3
         * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
         * "SubTitle":"【店里零食任选3份赠50g，4份赠100g】","Title":"怪味香香豆","UserId":"8875479",
         * "UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/02/2402_565f0efb074d6_680_450.jpg","DealPrice":"￥12.50",
         * "GoodsId":2402,"IsLike":0,"IsShippingFree":1,"Labels":["活动价"],"LikeCount":218,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2402","Price":"￥25.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":50,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺",
         * "SubTitle":"好豆爆款，买5份赠送1份。","Title":"【限时促销】精品罐装秘制酒鬼花生","UserId":"8843844",
         * "UserName":"爱美食滴加菲猫","Weight":"250克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg","DealPrice":"￥49.00",
         * "GoodsId":1351,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":113,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1351","Price":"￥70.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":64,"StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常","SubTitle":"赠零食",
         * "Title":"美味陈皮鸡","UserId":"8875479","UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg",
         * "DealPrice":"￥26.00","GoodsId":1136,"IsLike":0,"IsShippingFree":2,"Labels":["活动价",
         * "包邮"],"LikeCount":243,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1136",
         * "Price":"￥50.00","ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
         * "StoreTitle":"飘香美食铺","SubTitle":"香糯爽口 腊味十足（满49包邮）","Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）",
         * "UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"640克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/1349_568a6571c14b8_680_450.jpg",
         * "DealPrice":"￥79.90","GoodsId":1349,"IsLike":0,"IsShippingFree":1,"Labels":[],
         * "LikeCount":100,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1349",
         * "Price":"￥149.00","ShippingInfo":"配送上门/全国快递","Stock":66,"StoreId":3831,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
         * "StoreTitle":"京味家常","SubTitle":"赠零食","Title":"【开工篇】秘制无骨酱肘子包邮","UserId":"8875479",
         * "UserName":"京味家常D小满","Weight":"580克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/10/28/941_5630408a90dca_680_450.jpg","DealPrice":"￥50.00",
         * "GoodsId":941,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":171,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=941","Price":"￥70.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":32,"StoreId":1975,"StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/09/14/55f66f76be97a.jpg","StoreTitle":"李记酱肉","SubTitle":"245g包邮",
         * "Title":"北平李记香辣牛肉干","UserId":"8554254","UserName":"北平李记","Weight":"245克"},
         * {"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/01/08/2912_568f24b7907f3_680_450.jpg","DealPrice":"￥50.00",
         * "GoodsId":2912,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":82,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2912","Price":"￥80.00",
         * "ShippingInfo":"配送上门/同城快递","Stock":64,"StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
         * "SubTitle":"【店里零食任选3份赠50g】特价除外","Title":"防霾素什锦【赠送零食】","UserId":"8875479",
         * "UserName":"京味家常D小满","Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/10/28/943_5630421a315e5_680_450.jpg","DealPrice":"￥50.00",
         * "GoodsId":943,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":300,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=943","Price":"￥60.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":35,"StoreId":1975,"StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/09/14/55f66f76be97a.jpg","StoreTitle":"李记酱肉",
         * "SubTitle":"包邮。无添加剂，解馋、补钙！","Title":"北平李记香辣掌中宝245g","UserId":"8554254",
         * "UserName":"北平李记","Weight":"245克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/11/10/1404_56416d1d04427_680_450.jpg","DealPrice":"￥10.00",
         * "GoodsId":1404,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":46,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1404","Price":"￥25.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":136,"StoreId":3831,"StoreLogoUrl":"http://pimg3
         * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常",
         * "SubTitle":"【店里零食任选3份赠50g，4份赠100g】","Title":"【开学篇】焦糖瓜子【零食任选2袋包邮】","UserId":"8875479",
         * "UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/12/05/2535_5662ece15690f_680_450.jpg","DealPrice":"￥27.00",
         * "GoodsId":2535,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":200,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2535","Price":"￥55.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":40,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"做腊肉就是做良心。",
         * "Title":"【限时促销】正宗四川农家烟熏腊肉｛买六包赠一包｝","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "Weight":"300克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/11/17/1737_564ad59e5a8bc_680_450.jpg","DealPrice":"￥59.80",
         * "GoodsId":1737,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":28,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1737","Price":"￥116.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":59,"StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常","SubTitle":"小肋排",
         * "Title":"【妈妈de味道】红烧排骨【赠零食】","UserId":"8875479","UserName":"京味家常D小满","Weight":"500克"},
         * {"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/07/2227_56dce0f24f766_680_450.jpg","DealPrice":"￥82.50",
         * "GoodsId":2227,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":10,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2227","Price":"￥150.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":38,"StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常","SubTitle":"文火慢炖，肉质酥软不塞牙",
         * "Title":"酱牛肉","UserId":"8875479","UserName":"京味家常D小满","Weight":"500克"},{"CartNum":0,
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/03/09/1969_56df96fdd7aa8_680_450.jpg",
         * "DealPrice":"￥19.90","GoodsId":1969,"IsLike":0,"IsShippingFree":1,"Labels":[],
         * "LikeCount":30,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1969","Price":"￥50
         * .00","ShippingInfo":"配送上门/全国快递","Stock":66,"StoreId":3831,"StoreLogoUrl":"http://pimg3
         * .hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常","SubTitle":"组合最美",
         * "Title":"爆米花与倒蒸地瓜干","UserId":"8875479","UserName":"京味家常D小满","Weight":"200克"},
         * {"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/27/1075_56586c032c80e_680_450.jpg","DealPrice":"￥39.00",
         * "GoodsId":1075,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":157,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1075","Price":"￥60.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":40,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺",
         * "SubTitle":"卤香四溢，好吃停不下来！","Title":"【限时促销】特价包邮飘香独家秘制卤香干（750g） ","UserId":"8843844",
         * "UserName":"爱美食滴加菲猫","Weight":"750克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/04/1178_563a1c31d2f0f_680_450.jpg","DealPrice":"￥29.00",
         * "GoodsId":1178,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":115,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1178","Price":"￥50.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"味道浓郁，爽口不腻",
         * "Title":"【限时促销】飘香老北京风味蒜肠 独家秘制 550g","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "Weight":"550克"}]
         * tags : [{"Goods":{"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg","DealPrice":"69.00",
         * "GoodsId":"6278","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6278",
         * "Title":"【温州特产】猪油渣"},"Id":"38","Title":"猪肉","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=猪肉&TagId=38"},{"Goods":{"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/11/08/6281_5821a8fdc0ed1_336_336.jpg","DealPrice":"79.00",
         * "GoodsId":"6281","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6281",
         * "Title":"【Emily的美好时光】蛋黄酥 低糖白莲蓉味（六个礼盒装）"},"Id":"42","Title":"饼干",
         * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=饼干&TagId=42"},
         * {"Goods":{"CoverUrl":"http://pimg2.hoto.cn/goods/2016/11/17/1285_582d6d880edee_336_336
         * .jpg","DealPrice":"65.00","GoodsId":"1285","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1285","Title":"【2份包邮】限时促销精品罐装飘香秘制风味牙签牛肉"},"Id":"37",
         * "Title":"牛羊肉","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=牛羊肉&TagId=37"},{"Goods":{"CoverUrl":"http://pimg1
         * .hoto.cn/goods/2016/10/12/6255_57fdd8d5ba1d3_336_336.jpg","DealPrice":"25.80",
         * "GoodsId":"6255","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6255",
         * "Title":"正宗重庆香辣红油"},"Id":"34","Title":"辣椒酱","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=辣椒酱&TagId=34"},{"Goods":{"CoverUrl":"http://pimg2
         * .hoto.cn/goods/2016/10/30/2122_581581a266f86_336_336.jpg","DealPrice":"45.00",
         * "GoodsId":"2122","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2122",
         * "Title":"醉血蛤"},"Id":"57","Title":"腌制品","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=腌制品&TagId=57"},{"Goods":{"CoverUrl":"http://pimg2
         * .hoto.cn/goods/2016/10/13/6259_57ffa260a1659_336_336.jpg","DealPrice":"35.00",
         * "GoodsId":"6259","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6259",
         * "Title":"麻辣醉蟹钳"},"Id":"33","Title":"螃蟹","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=螃蟹&TagId=33"},{"Goods":{"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/11/18/1859_582ea2601acb4_336_336.jpg","DealPrice":"45.00",
         * "GoodsId":"1859","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1859",
         * "Title":"川贝柠檬膏"},"Id":"64","Title":"养颜","Url":"haodourecipe://haodou
         * .com/goods/searchResult/?tagName=养颜&TagId=64"},{"Goods":{"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/07/07/6145_577e060a41c3f_336_336.jpg","DealPrice":"39.90",
         * "GoodsId":"6145","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6145",
         * "Title":"厨鲜生 | 固城湖咸鸭蛋65g×20颗礼盒装"},"Id":"43","Title":"鸡鸭鱼肉",
         * "Url":"haodourecipe://haodou.com/goods/searchResult/?tagName=鸡鸭鱼肉&TagId=43"}]
         */

        private BrandStoreBean BrandStore;
        private int CartTotalNum;
        private DailyFirstGoodsBean DailyFirstGoods;
        private DailySpecialGoodsBean DailySpecialGoods;
        private NewsRecommendGoodBean NewsRecommendGood;
        private OneHourGoodsBean OneHourGoods;
        private int count;
        private List<CateListBean> CateList;
        private List<FoodieFavoriteGoodsBean> FoodieFavoriteGoods;
        private List<ListBean> list;
        private List<TagsBean> tags;

        public BrandStoreBean getBrandStore() {
            return BrandStore;
        }

        public void setBrandStore(BrandStoreBean BrandStore) {
            this.BrandStore = BrandStore;
        }

        public int getCartTotalNum() {
            return CartTotalNum;
        }

        public void setCartTotalNum(int CartTotalNum) {
            this.CartTotalNum = CartTotalNum;
        }

        public DailyFirstGoodsBean getDailyFirstGoods() {
            return DailyFirstGoods;
        }

        public void setDailyFirstGoods(DailyFirstGoodsBean DailyFirstGoods) {
            this.DailyFirstGoods = DailyFirstGoods;
        }

        public DailySpecialGoodsBean getDailySpecialGoods() {
            return DailySpecialGoods;
        }

        public void setDailySpecialGoods(DailySpecialGoodsBean DailySpecialGoods) {
            this.DailySpecialGoods = DailySpecialGoods;
        }

        public NewsRecommendGoodBean getNewsRecommendGood() {
            return NewsRecommendGood;
        }

        public void setNewsRecommendGood(NewsRecommendGoodBean NewsRecommendGood) {
            this.NewsRecommendGood = NewsRecommendGood;
        }

        public OneHourGoodsBean getOneHourGoods() {
            return OneHourGoods;
        }

        public void setOneHourGoods(OneHourGoodsBean OneHourGoods) {
            this.OneHourGoods = OneHourGoods;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<CateListBean> getCateList() {
            return CateList;
        }

        public void setCateList(List<CateListBean> CateList) {
            this.CateList = CateList;
        }

        public List<FoodieFavoriteGoodsBean> getFoodieFavoriteGoods() {
            return FoodieFavoriteGoods;
        }

        public void setFoodieFavoriteGoods(List<FoodieFavoriteGoodsBean> FoodieFavoriteGoods) {
            this.FoodieFavoriteGoods = FoodieFavoriteGoods;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class BrandStoreBean {
            /**
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2016/06/1466748684.jpg
             * InsertionUrl : http://m.haodou.com/mall/index.php?r=wap/brand/home-page-recommend
             * OpenURL : haodourecipe://haodou.com/opentopic/?id=471515&store_id=167
             * Title : 【夏日美食】一骑红尘荔枝蜜~
             */

            private String ImgUrl;
            private String InsertionUrl;
            private String OpenURL;
            private String Title;

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getInsertionUrl() {
                return InsertionUrl;
            }

            public void setInsertionUrl(String InsertionUrl) {
                this.InsertionUrl = InsertionUrl;
            }

            public String getOpenURL() {
                return OpenURL;
            }

            public void setOpenURL(String OpenURL) {
                this.OpenURL = OpenURL;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }
        }

        public static class DailyFirstGoodsBean {
            /**
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/03/1457419342.jpg
             * IsAuto : 0
             * Label : 美食研究所
             * OpenUrl : haodourecipe://haodou.com/goods/dailyfirst?type=new
             * Price : ￥0.00
             * Title : 新品推荐
             */

            private String CoverUrl;
            private int IsAuto;
            private String Label;
            private String OpenUrl;
            private String Price;
            private String Title;

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public int getIsAuto() {
                return IsAuto;
            }

            public void setIsAuto(int IsAuto) {
                this.IsAuto = IsAuto;
            }

            public String getLabel() {
                return Label;
            }

            public void setLabel(String Label) {
                this.Label = Label;
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

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }
        }

        public static class DailySpecialGoodsBean {
            /**
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460520351.jpg
             * IsAuto : 0
             * Label :
             * OpenUrl : haodourecipe://haodou.com/goods/subjectlist/?id=173
             * Price : ￥9.90
             * Title : 今日特价
             */

            private String CoverUrl;
            private int IsAuto;
            private String Label;
            private String OpenUrl;
            private String Price;
            private String Title;

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public int getIsAuto() {
                return IsAuto;
            }

            public void setIsAuto(int IsAuto) {
                this.IsAuto = IsAuto;
            }

            public String getLabel() {
                return Label;
            }

            public void setLabel(String Label) {
                this.Label = Label;
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

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }
        }

        public static class NewsRecommendGoodBean {
            /**
             * Content : 好豆到家
             * Goods : {"CoverUrl":"http://pimg2.hoto
             * .cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg","DealPrice":"￥14.90",
             * "GoodsId":4786,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4786",
             * "Title":"买5冷面赠2凉皮한국냉면 매우맛있다"}
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460341662.jpg
             * Info :
             * 冷面，面条劲道且富有弹性，是看得见的Q，看得见的弹！！酸溜溜的，甜滋滋的汤汁，浓郁到让你的舌头欲罢不能，火红的油辣子带来了不仅是满满的诚意而且更多幸福感。真空包装，卫生和干净都看得见。
             * Tags : ["好吃不贵"]
             * UserName : 好豆到家品鉴员
             */

            private String Content;
            private GoodsBean Goods;
            private String ImgUrl;
            private String Info;
            private String UserName;
            private List<String> Tags;

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public GoodsBean getGoods() {
                return Goods;
            }

            public void setGoods(GoodsBean Goods) {
                this.Goods = Goods;
            }

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getInfo() {
                return Info;
            }

            public void setInfo(String Info) {
                this.Info = Info;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public List<String> getTags() {
                return Tags;
            }

            public void setTags(List<String> Tags) {
                this.Tags = Tags;
            }

            public static class GoodsBean {
                /**
                 * CoverUrl : http://pimg2.hoto.cn/goods/2016/02/24/4786_56cda5464f937_336_336.jpg
                 * DealPrice : ￥14.90
                 * GoodsId : 4786
                 * OpenUrl : haodourecipe://haodou.com/goods/detail?id=4786
                 * Title : 买5冷面赠2凉皮한국냉면 매우맛있다
                 */

                private String CoverUrl;
                private String DealPrice;
                private int GoodsId;
                private String OpenUrl;
                private String Title;

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

                public int getGoodsId() {
                    return GoodsId;
                }

                public void setGoodsId(int GoodsId) {
                    this.GoodsId = GoodsId;
                }

                public String getOpenUrl() {
                    return OpenUrl;
                }

                public void setOpenUrl(String OpenUrl) {
                    this.OpenUrl = OpenUrl;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }
            }
        }

        public static class OneHourGoodsBean {
            /**
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460099180.jpg
             * IsAuto : 2
             * Label : 明星店铺
             * OpenUrl : haodourecipe://haodou.com/store/?id=610
             * Price : ￥0.00
             * Title : 俊哥的小店儿
             */

            private String CoverUrl;
            private int IsAuto;
            private String Label;
            private String OpenUrl;
            private String Price;
            private String Title;

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public int getIsAuto() {
                return IsAuto;
            }

            public void setIsAuto(int IsAuto) {
                this.IsAuto = IsAuto;
            }

            public String getLabel() {
                return Label;
            }

            public void setLabel(String Label) {
                this.Label = Label;
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

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }
        }

        public static class CateListBean {
            /**
             * CateId : 58
             * CateName : 家传秘制
             * ImgUrl : http://img1.hoto.cn/mall/mall_ad/2015/08/1438411987.jpg
             * OpenUrl : haodourecipe://haodou.com/goods/searchResult/?CateId=58&CateName=家传秘制
             */

            private String CateId;
            private String CateName;
            private String ImgUrl;
            private String OpenUrl;

            public String getCateId() {
                return CateId;
            }

            public void setCateId(String CateId) {
                this.CateId = CateId;
            }

            public String getCateName() {
                return CateName;
            }

            public void setCateName(String CateName) {
                this.CateName = CateName;
            }

            public String getImgUrl() {
                return ImgUrl;
            }

            public void setImgUrl(String ImgUrl) {
                this.ImgUrl = ImgUrl;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;

                CateListBean that = (CateListBean) o;

                if (CateId != null ? !CateId.equals(that.CateId) : that.CateId != null)
                    return false;
                if (CateName != null ? !CateName.equals(that.CateName) : that.CateName != null)
                    return false;
                if (ImgUrl != null ? !ImgUrl.equals(that.ImgUrl) : that.ImgUrl != null)
                    return false;
                return OpenUrl != null ? OpenUrl.equals(that.OpenUrl) : that.OpenUrl == null;

            }

            @Override
            public int hashCode() {
                int result = CateId != null ? CateId.hashCode() : 0;
                result = 31 * result + (CateName != null ? CateName.hashCode() : 0);
                result = 31 * result + (ImgUrl != null ? ImgUrl.hashCode() : 0);
                result = 31 * result + (OpenUrl != null ? OpenUrl.hashCode() : 0);
                return result;
            }

            @Override
            public String toString() {
                return "CateListBean{" +
                        "CateId='" + CateId + '\'' +
                        ", CateName='" + CateName + '\'' +
                        ", ImgUrl='" + ImgUrl + '\'' +
                        ", OpenUrl='" + OpenUrl + '\'' +
                        '}';
            }
        }

        public static class FoodieFavoriteGoodsBean {
            /**
             * CoverUrl : http://img1.hoto.cn/mall/mall_ad/2016/04/1460599417.jpg
             * GoodsId : 5549
             * HomePosition : 1
             * Price : ￥9.90
             * Title : 日式汤料
             */

            private String CoverUrl;
            private int GoodsId;
            private int HomePosition;
            private String Price;
            private String Title;

            public String getCoverUrl() {
                return CoverUrl;
            }

            public void setCoverUrl(String CoverUrl) {
                this.CoverUrl = CoverUrl;
            }

            public int getGoodsId() {
                return GoodsId;
            }

            public void setGoodsId(int GoodsId) {
                this.GoodsId = GoodsId;
            }

            public int getHomePosition() {
                return HomePosition;
            }

            public void setHomePosition(int HomePosition) {
                this.HomePosition = HomePosition;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;

                FoodieFavoriteGoodsBean that = (FoodieFavoriteGoodsBean) o;

                if (GoodsId != that.GoodsId)
                    return false;
                if (HomePosition != that.HomePosition)
                    return false;
                if (CoverUrl != null ? !CoverUrl.equals(that.CoverUrl) : that.CoverUrl != null)
                    return false;
                if (Price != null ? !Price.equals(that.Price) : that.Price != null)
                    return false;
                return Title != null ? Title.equals(that.Title) : that.Title == null;

            }

            @Override
            public int hashCode() {
                int result = CoverUrl != null ? CoverUrl.hashCode() : 0;
                result = 31 * result + GoodsId;
                result = 31 * result + HomePosition;
                result = 31 * result + (Price != null ? Price.hashCode() : 0);
                result = 31 * result + (Title != null ? Title.hashCode() : 0);
                return result;
            }
        }

        public static class ListBean {
            /**
             * CartNum : 0
             * CoverUrl : http://pimg2.hoto.cn/goods/2015/07/31/271_55bb72af0a680_680_450.jpg
             * DealPrice : ￥150.00
             * GoodsId : 271
             * IsLike : 0
             * IsShippingFree : 1
             * Labels : []
             * LikeCount : 2485
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=271
             * Price : ￥168.00
             * ShippingInfo : 配送上门/全国快递
             * Stock : 100
             * StoreId : 149
             * StoreLogoUrl : http://pimg2.hoto.cn/store/2015/07/31/55bb6ac68d05a.jpg
             * StoreTitle : 靓家货
             * SubTitle : 【肘爷】酱肘子，肉质细腻
             * Title : 【肘爷】酱肘子
             * UserId : 8190340
             * UserName : Leslie靓靓
             * Weight : 1000克
             */

            private int CartNum;
            private String CoverUrl;
            private String DealPrice;
            private int GoodsId;
            private int IsLike;
            private int IsShippingFree;
            private int LikeCount;
            private String OpenUrl;
            private String Price;
            private String ShippingInfo;
            private int Stock;
            private int StoreId;
            private String StoreLogoUrl;
            private String StoreTitle;
            private String SubTitle;
            private String Title;
            private String UserId;
            private String UserName;
            private String Weight;
            private List<?> Labels;

            public int getCartNum() {
                return CartNum;
            }

            public void setCartNum(int CartNum) {
                this.CartNum = CartNum;
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

            public int getIsShippingFree() {
                return IsShippingFree;
            }

            public void setIsShippingFree(int IsShippingFree) {
                this.IsShippingFree = IsShippingFree;
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

            public String getShippingInfo() {
                return ShippingInfo;
            }

            public void setShippingInfo(String ShippingInfo) {
                this.ShippingInfo = ShippingInfo;
            }

            public int getStock() {
                return Stock;
            }

            public void setStock(int Stock) {
                this.Stock = Stock;
            }

            public int getStoreId() {
                return StoreId;
            }

            public void setStoreId(int StoreId) {
                this.StoreId = StoreId;
            }

            public String getStoreLogoUrl() {
                return StoreLogoUrl;
            }

            public void setStoreLogoUrl(String StoreLogoUrl) {
                this.StoreLogoUrl = StoreLogoUrl;
            }

            public String getStoreTitle() {
                return StoreTitle;
            }

            public void setStoreTitle(String StoreTitle) {
                this.StoreTitle = StoreTitle;
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

            public String getWeight() {
                return Weight;
            }

            public void setWeight(String Weight) {
                this.Weight = Weight;
            }

            public List<?> getLabels() {
                return Labels;
            }

            public void setLabels(List<?> Labels) {
                this.Labels = Labels;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;

                ListBean listBean = (ListBean) o;

                if (CartNum != listBean.CartNum)
                    return false;
                if (GoodsId != listBean.GoodsId)
                    return false;
                if (IsLike != listBean.IsLike)
                    return false;
                if (IsShippingFree != listBean.IsShippingFree)
                    return false;
                if (LikeCount != listBean.LikeCount)
                    return false;
                if (Stock != listBean.Stock)
                    return false;
                if (StoreId != listBean.StoreId)
                    return false;
                if (CoverUrl != null ? !CoverUrl.equals(listBean.CoverUrl) : listBean.CoverUrl !=
                        null)
                    return false;
                if (DealPrice != null ? !DealPrice.equals(listBean.DealPrice) : listBean
                        .DealPrice != null)
                    return false;
                if (OpenUrl != null ? !OpenUrl.equals(listBean.OpenUrl) : listBean.OpenUrl != null)
                    return false;
                if (Price != null ? !Price.equals(listBean.Price) : listBean.Price != null)
                    return false;
                if (ShippingInfo != null ? !ShippingInfo.equals(listBean.ShippingInfo) : listBean
                        .ShippingInfo != null)
                    return false;
                if (StoreLogoUrl != null ? !StoreLogoUrl.equals(listBean.StoreLogoUrl) : listBean
                        .StoreLogoUrl != null)
                    return false;
                if (StoreTitle != null ? !StoreTitle.equals(listBean.StoreTitle) : listBean
                        .StoreTitle != null)
                    return false;
                if (SubTitle != null ? !SubTitle.equals(listBean.SubTitle) : listBean.SubTitle !=
                        null)
                    return false;
                if (Title != null ? !Title.equals(listBean.Title) : listBean.Title != null)
                    return false;
                if (UserId != null ? !UserId.equals(listBean.UserId) : listBean.UserId != null)
                    return false;
                if (UserName != null ? !UserName.equals(listBean.UserName) : listBean.UserName !=
                        null)
                    return false;
                if (Weight != null ? !Weight.equals(listBean.Weight) : listBean.Weight != null)
                    return false;
                return Labels != null ? Labels.equals(listBean.Labels) : listBean.Labels == null;

            }

            @Override
            public int hashCode() {
                int result = CartNum;
                result = 31 * result + (CoverUrl != null ? CoverUrl.hashCode() : 0);
                result = 31 * result + (DealPrice != null ? DealPrice.hashCode() : 0);
                result = 31 * result + GoodsId;
                result = 31 * result + IsLike;
                result = 31 * result + IsShippingFree;
                result = 31 * result + LikeCount;
                result = 31 * result + (OpenUrl != null ? OpenUrl.hashCode() : 0);
                result = 31 * result + (Price != null ? Price.hashCode() : 0);
                result = 31 * result + (ShippingInfo != null ? ShippingInfo.hashCode() : 0);
                result = 31 * result + Stock;
                result = 31 * result + StoreId;
                result = 31 * result + (StoreLogoUrl != null ? StoreLogoUrl.hashCode() : 0);
                result = 31 * result + (StoreTitle != null ? StoreTitle.hashCode() : 0);
                result = 31 * result + (SubTitle != null ? SubTitle.hashCode() : 0);
                result = 31 * result + (Title != null ? Title.hashCode() : 0);
                result = 31 * result + (UserId != null ? UserId.hashCode() : 0);
                result = 31 * result + (UserName != null ? UserName.hashCode() : 0);
                result = 31 * result + (Weight != null ? Weight.hashCode() : 0);
                result = 31 * result + (Labels != null ? Labels.hashCode() : 0);
                return result;
            }

        }

        public static class TagsBean {
            /**
             * Goods : {"CoverUrl":"http://pimg3.hoto.cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg","DealPrice":"69.00","GoodsId":"6278","OpenUrl":"haodourecipe://haodou.com/goods/detail?id=6278","Title":"【温州特产】猪油渣"}
             * Id : 38
             * Title : 猪肉
             * Url : haodourecipe://haodou.com/goods/searchResult/?tagName=猪肉&TagId=38
             */

            private GoodsBeanX Goods;
            private String Id;
            private String Title;
            private String Url;

            public GoodsBeanX getGoods() {
                return Goods;
            }

            public void setGoods(GoodsBeanX Goods) {
                this.Goods = Goods;
            }

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }

            @Override
            public String toString() {
                return "TagsBean{" +
                        "Goods=" + Goods +
                        ", Id='" + Id + '\'' +
                        ", Title='" + Title + '\'' +
                        ", Url='" + Url + '\'' +
                        '}';
            }

            public static class GoodsBeanX {
                /**
                 * CoverUrl : http://pimg3.hoto.cn/goods/2016/11/09/6278_582303b7c4313_336_336.jpg
                 * DealPrice : 69.00
                 * GoodsId : 6278
                 * OpenUrl : haodourecipe://haodou.com/goods/detail?id=6278
                 * Title : 【温州特产】猪油渣
                 */

                private String CoverUrl;
                private String DealPrice;
                private String GoodsId;
                private String OpenUrl;
                private String Title;

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

                public String getGoodsId() {
                    return GoodsId;
                }

                public void setGoodsId(String GoodsId) {
                    this.GoodsId = GoodsId;
                }

                public String getOpenUrl() {
                    return OpenUrl;
                }

                public void setOpenUrl(String OpenUrl) {
                    this.OpenUrl = OpenUrl;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }
            }
        }
    }
}