package com.yjlw.ddms.homeentity.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 到家标签详情页面的数据实体类
 * @Author: 原海忠
 * @CreateDate: 2016/11/21
 * @Version: [v1.0]
 */
public class LabelDetailsResult implements Serializable {

    /**
     * result : {"CartTotalNum":7,"CateInfos":[{"CateId":0,"CateName":"全部"},{"CateId":"58",
     * "CateName":"家传秘制"},{"CateId":"59","CateName":"肉禽蛋类"},{"CateId":"60","CateName":"烘焙面点"},
     * {"CateId":"61","CateName":"水产海鲜"},{"CateId":"62","CateName":"腌腊制品"},{"CateId":"63",
     * "CateName":"调味酱料"},{"CateId":"64","CateName":"养生养颜"},{"CateId":"65","CateName":"小吃零嘴"},
     * {"CateId":"66","CateName":"冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬"}],"count":200,
     * "list":[{"CartNum":0,"CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg","DealPrice":"￥49.00","GoodsId":1351,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":113,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1351","Price":"￥70.00","ShippingInfo":"配送上门/全国快递","Stock":64,
     * "StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
     * "StoreTitle":"京味家常","SubTitle":"赠零食","Title":"美味陈皮鸡","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg","DealPrice":"￥26.00","GoodsId":1136,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":243,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1136","Price":"￥50.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":29,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"香糯爽口
     * 腊味十足（满49包邮）","Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"640克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/01/04/1349_568a6571c14b8_680_450.jpg","DealPrice":"￥79.90","GoodsId":1349,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":100,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1349","Price":"￥149.00","ShippingInfo":"配送上门/全国快递","Stock":66,
     * "StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
     * "StoreTitle":"京味家常","SubTitle":"赠零食","Title":"【开工篇】秘制无骨酱肘子包邮","UserId":"8875479",
     * "UserName":"京味家常D小满","Weight":"580克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/05/2535_5662ece15690f_680_450.jpg","DealPrice":"￥27.00","GoodsId":2535,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":201,
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
     * .cn/goods/2015/11/27/1075_56586c032c80e_680_450.jpg","DealPrice":"￥39.00","GoodsId":1075,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":157,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1075","Price":"￥60.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":39,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"卤香四溢，好吃停不下来！",
     * "Title":"【限时促销】特价包邮飘香独家秘制卤香干（750g） ","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"750克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/04/1178_563a1c31d2f0f_680_450.jpg","DealPrice":"￥29.00","GoodsId":1178,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":115,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1178","Price":"￥50.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"味道浓郁，爽口不腻",
     * "Title":"【限时促销】飘香老北京风味蒜肠 独家秘制 550g","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"550克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/09/11/495_55f24e1fbc0c8_680_450.jpg","DealPrice":"￥118.00","GoodsId":495,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":28,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=495","Price":"￥138.00","ShippingInfo":"配送上门/全国快递","Stock":100,
     * "StoreId":1339,"StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/08/30/55e1df1674c4a.jpg",
     * "StoreTitle":"酷虾e族","SubTitle":"酥脆爽口，老少皆宜，补钙佳品","Title":"盐焗大虾","UserId":"8437901",
     * "UserName":"酷虾e族","Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/02/27/1314_56d16b7899ca4_680_450.jpg","DealPrice":"￥60.00","GoodsId":1314,
     * "IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":114,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1314","Price":"￥80.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"五香肘子肉质鲜美，香气四溢",
     * "Title":"【双11底价促销】特价金牌去骨五香肘子（650g）","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"650克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/09/11/491_55f2476481ce6_680_450.jpg","DealPrice":"￥78.00","GoodsId":491,
     * "IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":19,"OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=491","Price":"￥98.00","ShippingInfo":"配送上门/全国快递","Stock":100,
     * "StoreId":1339,"StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/08/30/55e1df1674c4a.jpg",
     * "StoreTitle":"酷虾e族","SubTitle":"每份500g，每只都在1两左右，每份12只，辣度可调","Title":"招牌秘制麻大",
     * "UserId":"8437901","UserName":"酷虾e族","Weight":"500克"},{"CartNum":0,
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/09/11/503_55f26e0f095ae_680_450.jpg",
     * "DealPrice":"￥58.00","GoodsId":503,"IsLike":0,"IsShippingFree":1,"Labels":[],
     * "LikeCount":15,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=503","Price":"￥88.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":100,"StoreId":1339,"StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2015/08/30/55e1df1674c4a.jpg","StoreTitle":"酷虾e族","SubTitle":"鲜香适口",
     * "Title":"辣炒蛏子","UserId":"8437901","UserName":"酷虾e族","Weight":"500克"},{"CartNum":0,
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/12/28/3632_568134259cf08_680_450.jpg",
     * "DealPrice":"￥12.50","GoodsId":3632,"IsLike":0,"IsShippingFree":1,"Labels":["活动价"],
     * "LikeCount":60,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3632","Price":"￥20
     * .00","ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"齿颊留香 回味无穷",
     * "Title":"【限时促销】小零嘴香脆豌豆炸黄金豆办公室休闲食品","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "Weight":"250克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/03/2409_565f1d82af65a_680_450.jpg","DealPrice":"￥29.00","GoodsId":2409,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":57,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2409","Price":"￥60.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"五香浓郁 片片入香",
     * "Title":"【限时促销】飘香风味排骨肠冷切肠600g","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"600克"},
     * {"CartNum":0,"CoverUrl":"http://pimg2.hoto.cn/goods/2015/11/14/1654_5646e1e1507ac_680_450
     * .jpg","DealPrice":"￥50.00","GoodsId":1654,"IsLike":0,"IsShippingFree":2,"Labels":["新人价",
     * "包邮"],"LikeCount":0,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1654",
     * "Price":"￥52.00","ShippingInfo":"配送上门/全国快递","Stock":500,"StoreId":4183,
     * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/11/10/5641aa288ee28.jpg",
     * "StoreTitle":"稀少健康美食厨房","SubTitle":"特制的梅干菜","Title":"梅干菜大肉粽","UserId":"8928755",
     * "UserName":"稀少健康美食厨房","Weight":"600克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/07/1316_563de5b71270b_680_450.jpg","DealPrice":"￥35.00","GoodsId":1316,
     * "IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":70,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1316","Price":"￥52.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"香脆可口，回味无穷",
     * "Title":"【双11底价促销】特价卤香猪耳200g","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"200克"},
     * {"CartNum":0,"CoverUrl":"http://pimg3.hoto.cn/goods/2015/12/26/2417_567dec0c40384_680_450
     * .jpg","DealPrice":"￥59.90","GoodsId":2417,"IsLike":0,"IsShippingFree":2,"Labels":["活动价",
     * "包邮"],"LikeCount":46,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2417",
     * "Price":"￥100.00","ShippingInfo":"配送上门/全国快递","Stock":20,"StoreId":3712,
     * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
     * "StoreTitle":"飘香美食铺","SubTitle":"正宗纯牛腱子肉，假一赔十","Title":"【限时促销】飘香招牌秘制酱牛肉纯牛腱子肉",
     * "UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"500克"},{"CartNum":0,
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/03/12/1785_56e42ea476267_680_450.jpg",
     * "DealPrice":"￥35.00","GoodsId":1785,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],
     * "LikeCount":43,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1785","Price":"￥60
     * .00","ShippingInfo":"配送上门/全国快递","Stock":29,"StoreId":3712,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"肉质细腻，劲道十足",
     * "Title":"【限时促销】正宗哈尔滨红肠","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"400克"},
     * {"CartNum":0,"CoverUrl":"http://pimg1.hoto.cn/goods/2016/01/20/4089_569f875a220b2_680_450
     * .jpg","DealPrice":"￥55.00","GoodsId":4089,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],
     * "LikeCount":33,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4089","Price":"￥99
     * .00","ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3
     * .hoto.cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺",
     * "SubTitle":"年货送年味，就送飘香味","Title":"[年货]飘香熟食中号年货礼盒大促销","UserId":"8843844",
     * "UserName":"爱美食滴加菲猫","Weight":"800克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/01/10/4097_5692721a5cff8_680_450.jpg","DealPrice":"￥69.90","GoodsId":4097,
     * "IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":45,
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4097","Price":"￥100.00",
     * "ShippingInfo":"配送上门/全国快递","Stock":20,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"柏丫烟熏，熏香入味",
     * "Title":"【限时促销】正宗四川麻辣香肠","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"800克"}]}
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
         * CartTotalNum : 7
         * CateInfos : [{"CateId":0,"CateName":"全部"},{"CateId":"58","CateName":"家传秘制"},
         * {"CateId":"59","CateName":"肉禽蛋类"},{"CateId":"60","CateName":"烘焙面点"},{"CateId":"61",
         * "CateName":"水产海鲜"},{"CateId":"62","CateName":"腌腊制品"},{"CateId":"63",
         * "CateName":"调味酱料"},{"CateId":"64","CateName":"养生养颜"},{"CateId":"65",
         * "CateName":"小吃零嘴"},{"CateId":"66","CateName":"冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬"}]
         * count : 200
         * list : [{"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg","DealPrice":"￥49.00",
         * "GoodsId":1351,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":113,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1351","Price":"￥70.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":64,"StoreId":3831,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","StoreTitle":"京味家常","SubTitle":"赠零食",
         * "Title":"美味陈皮鸡","UserId":"8875479","UserName":"京味家常D小满","Weight":"100克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg",
         * "DealPrice":"￥26.00","GoodsId":1136,"IsLike":0,"IsShippingFree":2,"Labels":["活动价",
         * "包邮"],"LikeCount":243,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1136",
         * "Price":"￥50.00","ShippingInfo":"配送上门/全国快递","Stock":29,"StoreId":3712,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
         * "StoreTitle":"飘香美食铺","SubTitle":"香糯爽口 腊味十足（满49包邮）","Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）",
         * "UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"640克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/01/04/1349_568a6571c14b8_680_450.jpg",
         * "DealPrice":"￥79.90","GoodsId":1349,"IsLike":0,"IsShippingFree":1,"Labels":[],
         * "LikeCount":100,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1349",
         * "Price":"￥149.00","ShippingInfo":"配送上门/全国快递","Stock":66,"StoreId":3831,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg",
         * "StoreTitle":"京味家常","SubTitle":"赠零食","Title":"【开工篇】秘制无骨酱肘子包邮","UserId":"8875479",
         * "UserName":"京味家常D小满","Weight":"580克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/12/05/2535_5662ece15690f_680_450.jpg","DealPrice":"￥27.00",
         * "GoodsId":2535,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":201,
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
         * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/11/27/1075_56586c032c80e_680_450.jpg",
         * "DealPrice":"￥39.00","GoodsId":1075,"IsLike":0,"IsShippingFree":2,"Labels":["活动价",
         * "包邮"],"LikeCount":157,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1075",
         * "Price":"￥60.00","ShippingInfo":"配送上门/全国快递","Stock":39,"StoreId":3712,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
         * "StoreTitle":"飘香美食铺","SubTitle":"卤香四溢，好吃停不下来！","Title":"【限时促销】特价包邮飘香独家秘制卤香干（750g） ",
         * "UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"750克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/04/1178_563a1c31d2f0f_680_450.jpg",
         * "DealPrice":"￥29.00","GoodsId":1178,"IsLike":0,"IsShippingFree":2,"Labels":["活动价",
         * "包邮"],"LikeCount":115,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1178",
         * "Price":"￥50.00","ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,
         * "StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7.jpg",
         * "StoreTitle":"飘香美食铺","SubTitle":"味道浓郁，爽口不腻","Title":"【限时促销】飘香老北京风味蒜肠 独家秘制 550g",
         * "UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"550克"},{"CartNum":0,
         * "CoverUrl":"http://pimg1.hoto.cn/goods/2015/09/11/495_55f24e1fbc0c8_680_450.jpg",
         * "DealPrice":"￥118.00","GoodsId":495,"IsLike":0,"IsShippingFree":1,"Labels":[],
         * "LikeCount":28,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=495","Price":"￥138
         * .00","ShippingInfo":"配送上门/全国快递","Stock":100,"StoreId":1339,
         * "StoreLogoUrl":"http://pimg1.hoto.cn/store/2015/08/30/55e1df1674c4a.jpg",
         * "StoreTitle":"酷虾e族","SubTitle":"酥脆爽口，老少皆宜，补钙佳品","Title":"盐焗大虾","UserId":"8437901",
         * "UserName":"酷虾e族","Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/02/27/1314_56d16b7899ca4_680_450.jpg","DealPrice":"￥60.00",
         * "GoodsId":1314,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":114,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1314","Price":"￥80.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺",
         * "SubTitle":"五香肘子肉质鲜美，香气四溢","Title":"【双11底价促销】特价金牌去骨五香肘子（650g）","UserId":"8843844",
         * "UserName":"爱美食滴加菲猫","Weight":"650克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/09/11/491_55f2476481ce6_680_450.jpg","DealPrice":"￥78.00",
         * "GoodsId":491,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":19,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=491","Price":"￥98.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":100,"StoreId":1339,"StoreLogoUrl":"http://pimg1
         * .hoto.cn/store/2015/08/30/55e1df1674c4a.jpg","StoreTitle":"酷虾e族",
         * "SubTitle":"每份500g，每只都在1两左右，每份12只，辣度可调","Title":"招牌秘制麻大","UserId":"8437901",
         * "UserName":"酷虾e族","Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/09/11/503_55f26e0f095ae_680_450.jpg","DealPrice":"￥58.00",
         * "GoodsId":503,"IsLike":0,"IsShippingFree":1,"Labels":[],"LikeCount":15,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=503","Price":"￥88.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":100,"StoreId":1339,"StoreLogoUrl":"http://pimg1
         * .hoto.cn/store/2015/08/30/55e1df1674c4a.jpg","StoreTitle":"酷虾e族","SubTitle":"鲜香适口",
         * "Title":"辣炒蛏子","UserId":"8437901","UserName":"酷虾e族","Weight":"500克"},{"CartNum":0,
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/12/28/3632_568134259cf08_680_450.jpg",
         * "DealPrice":"￥12.50","GoodsId":3632,"IsLike":0,"IsShippingFree":1,"Labels":["活动价"],
         * "LikeCount":60,"OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3632","Price":"￥20
         * .00","ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3
         * .hoto.cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"齿颊留香
         * 回味无穷","Title":"【限时促销】小零嘴香脆豌豆炸黄金豆办公室休闲食品","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "Weight":"250克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/12/03/2409_565f1d82af65a_680_450.jpg","DealPrice":"￥29.00",
         * "GoodsId":2409,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":57,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2409","Price":"￥60.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"五香浓郁 片片入香",
         * "Title":"【限时促销】飘香风味排骨肠冷切肠600g","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "Weight":"600克"},{"CartNum":0,"CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/14/1654_5646e1e1507ac_680_450.jpg","DealPrice":"￥50.00",
         * "GoodsId":1654,"IsLike":0,"IsShippingFree":2,"Labels":["新人价","包邮"],"LikeCount":0,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1654","Price":"￥52.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":500,"StoreId":4183,"StoreLogoUrl":"http://pimg1
         * .hoto.cn/store/2015/11/10/5641aa288ee28.jpg","StoreTitle":"稀少健康美食厨房",
         * "SubTitle":"特制的梅干菜","Title":"梅干菜大肉粽","UserId":"8928755","UserName":"稀少健康美食厨房",
         * "Weight":"600克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/07/1316_563de5b71270b_680_450.jpg","DealPrice":"￥35.00",
         * "GoodsId":1316,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":70,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1316","Price":"￥52.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"香脆可口，回味无穷",
         * "Title":"【双11底价促销】特价卤香猪耳200g","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "Weight":"200克"},{"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/26/2417_567dec0c40384_680_450.jpg","DealPrice":"￥59.90",
         * "GoodsId":2417,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":46,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2417","Price":"￥100.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":20,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺",
         * "SubTitle":"正宗纯牛腱子肉，假一赔十","Title":"【限时促销】飘香招牌秘制酱牛肉纯牛腱子肉","UserId":"8843844",
         * "UserName":"爱美食滴加菲猫","Weight":"500克"},{"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/03/12/1785_56e42ea476267_680_450.jpg","DealPrice":"￥35.00",
         * "GoodsId":1785,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":43,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1785","Price":"￥60.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":29,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"肉质细腻，劲道十足",
         * "Title":"【限时促销】正宗哈尔滨红肠","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"400克"},
         * {"CartNum":0,"CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/01/20/4089_569f875a220b2_680_450.jpg","DealPrice":"￥55.00",
         * "GoodsId":4089,"IsLike":0,"IsShippingFree":2,"Labels":["包邮"],"LikeCount":33,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4089","Price":"￥99.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":30,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"年货送年味，就送飘香味",
         * "Title":"[年货]飘香熟食中号年货礼盒大促销","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"800克"},
         * {"CartNum":0,"CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/01/10/4097_5692721a5cff8_680_450.jpg","DealPrice":"￥69.90",
         * "GoodsId":4097,"IsLike":0,"IsShippingFree":2,"Labels":["活动价","包邮"],"LikeCount":45,
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=4097","Price":"￥100.00",
         * "ShippingInfo":"配送上门/全国快递","Stock":20,"StoreId":3712,"StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","StoreTitle":"飘香美食铺","SubTitle":"柏丫烟熏，熏香入味",
         * "Title":"【限时促销】正宗四川麻辣香肠","UserId":"8843844","UserName":"爱美食滴加菲猫","Weight":"800克"}]
         */

        private int CartTotalNum;
        private int count;
        private List<CateInfosBean> CateInfos;
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

        public List<CateInfosBean> getCateInfos() {
            return CateInfos;
        }

        public void setCateInfos(List<CateInfosBean> CateInfos) {
            this.CateInfos = CateInfos;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class CateInfosBean {
            /**
             * CateId : 0
             * CateName : 全部
             */

            private int CateId;
            private String CateName;

            public int getCateId() {
                return CateId;
            }

            public void setCateId(int CateId) {
                this.CateId = CateId;
            }

            public String getCateName() {
                return CateName;
            }

            public void setCateName(String CateName) {
                this.CateName = CateName;
            }

            @Override
            public String toString() {
                return "CateInfosBean{" +
                        "CateId=" + CateId +
                        ", CateName='" + CateName + '\'' +
                        '}';
            }
        }

        public static class ListBean {
            /**
             * CartNum : 0
             * CoverUrl : http://pimg2.hoto.cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg
             * DealPrice : ￥49.00
             * GoodsId : 1351
             * IsLike : 0
             * IsShippingFree : 1
             * Labels : []
             * LikeCount : 113
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=1351
             * Price : ￥70.00
             * ShippingInfo : 配送上门/全国快递
             * Stock : 64
             * StoreId : 3831
             * StoreLogoUrl : http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b.jpg
             * StoreTitle : 京味家常
             * SubTitle : 赠零食
             * Title : 美味陈皮鸡
             * UserId : 8875479
             * UserName : 京味家常D小满
             * Weight : 100克
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
            public String toString() {
                return "ListBean{" +
                        "CartNum=" + CartNum +
                        ", CoverUrl='" + CoverUrl + '\'' +
                        ", DealPrice='" + DealPrice + '\'' +
                        ", GoodsId=" + GoodsId +
                        ", IsLike=" + IsLike +
                        ", IsShippingFree=" + IsShippingFree +
                        ", LikeCount=" + LikeCount +
                        ", OpenUrl='" + OpenUrl + '\'' +
                        ", Price='" + Price + '\'' +
                        ", ShippingInfo='" + ShippingInfo + '\'' +
                        ", Stock=" + Stock +
                        ", StoreId=" + StoreId +
                        ", StoreLogoUrl='" + StoreLogoUrl + '\'' +
                        ", StoreTitle='" + StoreTitle + '\'' +
                        ", SubTitle='" + SubTitle + '\'' +
                        ", Title='" + Title + '\'' +
                        ", UserId='" + UserId + '\'' +
                        ", UserName='" + UserName + '\'' +
                        ", Weight='" + Weight + '\'' +
                        ", Labels=" + Labels +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "LabelDetailsResult{" +
                "result=" + result +
                ", status=" + status +
                '}';
    }
}