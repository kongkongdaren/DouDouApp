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


    private static final long serialVersionUID = 1L;
    /**
     * status : 200
     * result : {"count":200,"list":[{"StoreId":3976,"StoreTitle":"淼冉妈七彩面点手工坊",
     * "StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/11/05/563afb18a8936.jpg",
     * "UserId":"8111886","UserName":"淼冉妈","GoodsId":1309,"Title":"纯手工空心面手工挂面500克",
     * "SubTitle":"百年工艺纯手工制作空心面","DealPrice":"￥20.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/01/19/1309_569ded18ecc46_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1309","LikeCount":389,"Stock":4242,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"500克","Price":"￥40
     * .00"},{"StoreId":1645,"StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
     * "GoodsId":705,"Title":"【窝窝侠】麻辣面2份/盒","SubTitle":"凑合？滚粗！","DealPrice":"￥25.80",
     * "ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/06/17/705_57635906f3689_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=705","LikeCount":1413,"Stock":299,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"470克","Price":"￥39.00"},{"StoreId":3976,
     * "StoreTitle":"淼冉妈七彩面点手工坊","StoreLogoUrl":"http://pimg2.hoto
     * .cn/store/2015/11/05/563afb18a8936.jpg","UserId":"8111886","UserName":"淼冉妈",
     * "GoodsId":1346,"Title":"淼冉妈手工蔬菜面条7种口味混合装","SubTitle":"七种口味混合装，七彩面宝宝面条宝宝副食",
     * "DealPrice":"￥19.90","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/09/1346_563ffd64c8c91_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1346","LikeCount":387,"Stock":178,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥41.00"},{"StoreId":610,
     * "StoreTitle":"俊哥的小店儿","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/03/25/56f54ab590ccb
     * .jpg","UserId":"8307326","UserName":"俊哥黄瓜","GoodsId":360,"Title":"【爆款】俊哥牌俊少脆皮黄瓜（荐）（400克）",
     * "SubTitle":"吃了俊哥瓜、忘了那个他（她）！","DealPrice":"￥25.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg1.hoto.cn/goods/2016/01/05/360_568aa7f3db62c_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=360","LikeCount":1882,"Stock":28,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"400克","Price":"￥35.00"},
     * {"StoreId":4269,"StoreTitle":"乡下家源","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/07/21/57902a0260183.jpg","UserId":"8931711","UserName":"乡下家源",
     * "GoodsId":1643,"Title":"自制腐竹段原价38元","SubTitle":"非转基因黄豆自制腐竹段全国包邮（新疆、海南、西藏除外）",
     * "DealPrice":"￥31.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/14/1643_5646c85a9318e_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1643","LikeCount":133,"Stock":300,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"370克","Price":"￥38.00"},{"StoreId":4269,
     * "StoreTitle":"乡下家源","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/07/21/57902a0260183
     * .jpg","UserId":"8931711","UserName":"乡下家源","GoodsId":1656,
     * "Title":"农家自制纯红薯粉条全国包邮（除新疆海南西藏）","SubTitle":"红薯富含糖分、蛋白质、粗纤维、多种氨基酸和维生素，被誉为纯天",
     * "DealPrice":"￥40.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/11/14/1656_5647002592a12_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1656","LikeCount":143,"Stock":1767,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"1400克","Price":"￥75.00"},{"StoreId":3712,
     * "StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7
     * .jpg","UserId":"8843844","UserName":"爱美食滴加菲猫","GoodsId":1136,
     * "Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）","SubTitle":"香糯爽口 腊味十足（满49包邮）","DealPrice":"￥26.00",
     * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1136","LikeCount":244,"Stock":30,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"640克","Price":"￥50.00"},{"StoreId":1645,
     * "StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/01/08/568f2605e81bd
     * .jpg","UserId":"8466351","UserName":"华曜餐饮","GoodsId":539,"Title":"麻辣小面",
     * "SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥39.90","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2016/04/11/539_570b0b59ad5f2_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=539","LikeCount":1215,"Stock":388,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"880克","Price":"￥59
     * .00"},{"StoreId":8641,"StoreTitle":"杨老师家养生特产","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2016/03/29/56fa3bd462f22.jpg","UserId":"8924673","UserName":"杨老师家",
     * "GoodsId":5720,"Title":"杨老师家新鲜现磨纯山药粉","SubTitle":"山药粉具有降血糖、健脾养胃、益志安神、瘦身、丰胸的功效",
     * "DealPrice":"￥159.00","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
     * .cn/goods/2016/08/27/5720_57c07e9eb7dca_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=5720","LikeCount":34,"Stock":2706,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":["新人价"],"Weight":"260克","Price":"￥179.00"},{"StoreId":3872,
     * "StoreTitle":"颜大叔","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/03/5638a32b7ea6c
     * .jpg","UserId":"8879952","UserName":"颜大叔","GoodsId":1139,"Title":"颜大叔|宁波水磨年糕 1斤",
     * "SubTitle":"百搭食材，口感柔嫩Q弹","DealPrice":"￥7.90","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/04/1139_56396b3c5b251_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1139","LikeCount":625,"Stock":303,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"500克","Price":"￥15.90"},
     * {"StoreId":1645,"StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
     * "GoodsId":706,"Title":"【年货】麻辣小面2盒/礼包","SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥79.80",
     * "ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2016/05/06/706_572c40c59f8d3_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=706","LikeCount":524,"Stock":137,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"1760克","Price":"￥118.00"},{"StoreId":4987,
     * "StoreTitle":"舌尖上的延边","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/30/565bbaf65e7e7
     * .jpg","UserId":"9066100","UserName":"舌尖上的延边","GoodsId":2554,"Title":"香甜豆丝",
     * "SubTitle":"吃一次就上瘾的朝鲜族美食","DealPrice":"￥36.00","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2015/12/06/2554_5663e382317b4_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=2554","LikeCount":208,"Stock":17,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥40
     * .00"},{"StoreId":3712,"StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "GoodsId":2535,"Title":"【限时促销】正宗四川农家烟熏腊肉｛买六包赠一包｝","SubTitle":"做腊肉就是做良心。","DealPrice":"￥27
     * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2015/12/05/2535_5662ece15690f_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=2535","LikeCount":202,"Stock":40,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"300克","Price":"￥55.00"},{"StoreId":3831,
     * "StoreTitle":"京味家常","StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b
     * .jpg","UserId":"8875479","UserName":"京味家常D小满","GoodsId":1351,"Title":"美味陈皮鸡",
     * "SubTitle":"赠零食","DealPrice":"￥49.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2
     * .hoto.cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1351","LikeCount":114,"Stock":64,"IsShippingFree":1,"IsLike":0,
     * "CartNum":1,"Labels":[],"Weight":"100克","Price":"￥70.00"},{"StoreId":172,
     * "StoreTitle":"菜男烧小菜","StoreLogoUrl":"http://pimg2.hoto.cn/store/2015/08/04/55c029e473b12
     * .jpg","UserId":"2045354","UserName":"菜男烧小菜","GoodsId":3187,"Title":"秘制卤料包 五包家庭装",
     * "SubTitle":"买2送1 买4送3 送卤料秘籍","DealPrice":"￥22.50","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg2.hoto.cn/goods/2016/03/15/3187_56e7b64c4e221_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=3187","LikeCount":82,"Stock":1000,
     * "IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"175克","Price":"￥45.00"},
     * {"StoreId":1645,"StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
     * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
     * "GoodsId":1392,"Title":"【包邮】酱香酸辣拌面39.9四人份/盒","SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥39
     * .90","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
     * .cn/goods/2016/05/07/1392_572da6e83fc98_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1392","LikeCount":369,"Stock":265,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["包邮"],"Weight":"960克","Price":"￥64.00"},{"StoreId":3831,
     * "StoreTitle":"京味家常","StoreLogoUrl":"http://pimg3.hoto.cn/store/2016/02/25/56ce7334b3c9b
     * .jpg","UserId":"8875479","UserName":"京味家常D小满","GoodsId":1349,"Title":"【开工篇】秘制无骨酱肘子包邮",
     * "SubTitle":"赠零食","DealPrice":"￥79.90","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3
     * .hoto.cn/goods/2016/01/04/1349_568a6571c14b8_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1349","LikeCount":100,"Stock":66,"IsShippingFree":1,"IsLike":0,
     * "CartNum":0,"Labels":[],"Weight":"580克","Price":"￥149.00"},{"StoreId":1645,
     * "StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto.cn/store/2016/01/08/568f2605e81bd
     * .jpg","UserId":"8466351","UserName":"华曜餐饮","GoodsId":629,"Title":"【美食盛宴】酸辣粉",
     * "SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥39.90","ShippingInfo":"全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/12/29/629_56826cdbdbcbc_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=629","LikeCount":198,"Stock":87,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["包邮"],"Weight":"1040克","Price":"￥59
     * .00"},{"StoreId":3712,"StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto
     * .cn/store/2015/10/30/56338e99214c7.jpg","UserId":"8843844","UserName":"爱美食滴加菲猫",
     * "GoodsId":1075,"Title":"【限时促销】特价包邮飘香独家秘制卤香干（750g） ","SubTitle":"卤香四溢，好吃停不下来！",
     * "DealPrice":"￥39.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
     * .cn/goods/2015/11/27/1075_56586c032c80e_680_450.jpg","OpenUrl":"haodourecipe://haodou
     * .com/goods/detail?id=1075","LikeCount":157,"Stock":40,"IsShippingFree":2,"IsLike":0,
     * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"750克","Price":"￥60.00"},{"StoreId":3712,
     * "StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/10/30/56338e99214c7
     * .jpg","UserId":"8843844","UserName":"爱美食滴加菲猫","GoodsId":1178,"Title":"【限时促销】飘香老北京风味蒜肠 独家秘制
     * 550g","SubTitle":"味道浓郁，爽口不腻","DealPrice":"￥29.00","ShippingInfo":"配送上门/全国快递",
     * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/04/1178_563a1c31d2f0f_680_450.jpg",
     * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1178","LikeCount":115,"Stock":30,
     * "IsShippingFree":2,"IsLike":0,"CartNum":0,"Labels":["活动价","包邮"],"Weight":"550克",
     * "Price":"￥50.00"}],"CartTotalNum":8,"CateInfos":[{"CateId":0,"CateName":"全部"},
     * {"CateId":"58","CateName":"家传秘制"},{"CateId":"59","CateName":"肉禽蛋类"},{"CateId":"60",
     * "CateName":"烘焙面点"},{"CateId":"61","CateName":"水产海鲜"},{"CateId":"62","CateName":"腌腊制品"},
     * {"CateId":"63","CateName":"调味酱料"},{"CateId":"64","CateName":"养生养颜"},{"CateId":"65",
     * "CateName":"小吃零嘴"},{"CateId":"66","CateName":"冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬"}]}
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
         * count : 200
         * list : [{"StoreId":3976,"StoreTitle":"淼冉妈七彩面点手工坊","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/11/05/563afb18a8936.jpg","UserId":"8111886","UserName":"淼冉妈",
         * "GoodsId":1309,"Title":"纯手工空心面手工挂面500克","SubTitle":"百年工艺纯手工制作空心面","DealPrice":"￥20
         * .00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/01/19/1309_569ded18ecc46_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1309","LikeCount":389,"Stock":4242,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"500克","Price":"￥40.00"},{"StoreId":1645,
         * "StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
         * "GoodsId":705,"Title":"【窝窝侠】麻辣面2份/盒","SubTitle":"凑合？滚粗！","DealPrice":"￥25.80",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/06/17/705_57635906f3689_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=705","LikeCount":1413,"Stock":299,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"470克","Price":"￥39.00"},{"StoreId":3976,
         * "StoreTitle":"淼冉妈七彩面点手工坊","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/11/05/563afb18a8936.jpg","UserId":"8111886","UserName":"淼冉妈",
         * "GoodsId":1346,"Title":"淼冉妈手工蔬菜面条7种口味混合装","SubTitle":"七种口味混合装，七彩面宝宝面条宝宝副食",
         * "DealPrice":"￥19.90","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/09/1346_563ffd64c8c91_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1346","LikeCount":387,"Stock":178,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥41.00"},{"StoreId":610,
         * "StoreTitle":"俊哥的小店儿","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/03/25/56f54ab590ccb.jpg","UserId":"8307326","UserName":"俊哥黄瓜",
         * "GoodsId":360,"Title":"【爆款】俊哥牌俊少脆皮黄瓜（荐）（400克）","SubTitle":"吃了俊哥瓜、忘了那个他（她）！",
         * "DealPrice":"￥25.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/01/05/360_568aa7f3db62c_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=360","LikeCount":1882,"Stock":28,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"400克","Price":"￥35.00"},{"StoreId":4269,
         * "StoreTitle":"乡下家源","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/07/21/57902a0260183.jpg","UserId":"8931711","UserName":"乡下家源",
         * "GoodsId":1643,"Title":"自制腐竹段原价38元","SubTitle":"非转基因黄豆自制腐竹段全国包邮（新疆、海南、西藏除外）",
         * "DealPrice":"￥31.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/14/1643_5646c85a9318e_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1643","LikeCount":133,"Stock":300,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"370克","Price":"￥38.00"},{"StoreId":4269,
         * "StoreTitle":"乡下家源","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/07/21/57902a0260183.jpg","UserId":"8931711","UserName":"乡下家源",
         * "GoodsId":1656,"Title":"农家自制纯红薯粉条全国包邮（除新疆海南西藏）",
         * "SubTitle":"红薯富含糖分、蛋白质、粗纤维、多种氨基酸和维生素，被誉为纯天","DealPrice":"￥40.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/11/14/1656_5647002592a12_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1656","LikeCount":143,"Stock":1767,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"1400克","Price":"￥75.00"},{"StoreId":3712,
         * "StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "GoodsId":1136,"Title":"【限时促销】湖南特色猪血丸子包邮（640g左右）","SubTitle":"香糯爽口 腊味十足（满49包邮）",
         * "DealPrice":"￥26.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/03/1136_5638d2788a847_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1136","LikeCount":244,"Stock":30,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"640克","Price":"￥50.00"},{"StoreId":1645,
         * "StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
         * "GoodsId":539,"Title":"麻辣小面","SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥39.90",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/04/11/539_570b0b59ad5f2_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=539","LikeCount":1215,"Stock":388,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"880克","Price":"￥59.00"},{"StoreId":8641,
         * "StoreTitle":"杨老师家养生特产","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/03/29/56fa3bd462f22.jpg","UserId":"8924673","UserName":"杨老师家",
         * "GoodsId":5720,"Title":"杨老师家新鲜现磨纯山药粉","SubTitle":"山药粉具有降血糖、健脾养胃、益志安神、瘦身、丰胸的功效",
         * "DealPrice":"￥159.00","ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/08/27/5720_57c07e9eb7dca_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=5720","LikeCount":34,"Stock":2706,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":["新人价"],"Weight":"260克","Price":"￥179.00"},{"StoreId":3872,
         * "StoreTitle":"颜大叔","StoreLogoUrl":"http://pimg3.hoto.cn/store/2015/11/03/5638a32b7ea6c
         * .jpg","UserId":"8879952","UserName":"颜大叔","GoodsId":1139,"Title":"颜大叔|宁波水磨年糕 1斤",
         * "SubTitle":"百搭食材，口感柔嫩Q弹","DealPrice":"￥7.90","ShippingInfo":"配送上门/全国快递",
         * "CoverUrl":"http://pimg3.hoto.cn/goods/2015/11/04/1139_56396b3c5b251_680_450.jpg",
         * "OpenUrl":"haodourecipe://haodou.com/goods/detail?id=1139","LikeCount":625,
         * "Stock":303,"IsShippingFree":1,"IsLike":0,"CartNum":0,"Labels":[],"Weight":"500克",
         * "Price":"￥15.90"},{"StoreId":1645,"StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1
         * .hoto.cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
         * "GoodsId":706,"Title":"【年货】麻辣小面2盒/礼包","SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥79
         * .80","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/05/06/706_572c40c59f8d3_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=706","LikeCount":524,"Stock":137,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"1760克","Price":"￥118.00"},{"StoreId":4987,
         * "StoreTitle":"舌尖上的延边","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/11/30/565bbaf65e7e7.jpg","UserId":"9066100","UserName":"舌尖上的延边",
         * "GoodsId":2554,"Title":"香甜豆丝","SubTitle":"吃一次就上瘾的朝鲜族美食","DealPrice":"￥36.00",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/12/06/2554_5663e382317b4_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2554","LikeCount":208,"Stock":17,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"250克","Price":"￥40.00"},{"StoreId":3712,
         * "StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "GoodsId":2535,"Title":"【限时促销】正宗四川农家烟熏腊肉｛买六包赠一包｝","SubTitle":"做腊肉就是做良心。",
         * "DealPrice":"￥27.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2015/12/05/2535_5662ece15690f_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=2535","LikeCount":202,"Stock":40,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"300克","Price":"￥55.00"},{"StoreId":3831,
         * "StoreTitle":"京味家常","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","UserId":"8875479","UserName":"京味家常D小满",
         * "GoodsId":1351,"Title":"美味陈皮鸡","SubTitle":"赠零食","DealPrice":"￥49.00",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/12/06/1351_56642f2a08b5e_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1351","LikeCount":114,"Stock":64,"IsShippingFree":1,"IsLike":0,
         * "CartNum":1,"Labels":[],"Weight":"100克","Price":"￥70.00"},{"StoreId":172,
         * "StoreTitle":"菜男烧小菜","StoreLogoUrl":"http://pimg2.hoto
         * .cn/store/2015/08/04/55c029e473b12.jpg","UserId":"2045354","UserName":"菜男烧小菜",
         * "GoodsId":3187,"Title":"秘制卤料包 五包家庭装","SubTitle":"买2送1 买4送3 送卤料秘籍","DealPrice":"￥22
         * .50","ShippingInfo":"全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2016/03/15/3187_56e7b64c4e221_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=3187","LikeCount":82,"Stock":1000,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"175克","Price":"￥45.00"},{"StoreId":1645,
         * "StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
         * "GoodsId":1392,"Title":"【包邮】酱香酸辣拌面39.9四人份/盒","SubTitle":"中国美食博大精深，我们专注面。",
         * "DealPrice":"￥39.90","ShippingInfo":"全国快递","CoverUrl":"http://pimg1.hoto
         * .cn/goods/2016/05/07/1392_572da6e83fc98_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1392","LikeCount":369,"Stock":265,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"960克","Price":"￥64.00"},{"StoreId":3831,
         * "StoreTitle":"京味家常","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2016/02/25/56ce7334b3c9b.jpg","UserId":"8875479","UserName":"京味家常D小满",
         * "GoodsId":1349,"Title":"【开工篇】秘制无骨酱肘子包邮","SubTitle":"赠零食","DealPrice":"￥79.90",
         * "ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2016/01/04/1349_568a6571c14b8_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1349","LikeCount":100,"Stock":66,"IsShippingFree":1,"IsLike":0,
         * "CartNum":0,"Labels":[],"Weight":"580克","Price":"￥149.00"},{"StoreId":1645,
         * "StoreTitle":"麻辣小面","StoreLogoUrl":"http://pimg1.hoto
         * .cn/store/2016/01/08/568f2605e81bd.jpg","UserId":"8466351","UserName":"华曜餐饮",
         * "GoodsId":629,"Title":"【美食盛宴】酸辣粉","SubTitle":"中国美食博大精深，我们专注面。","DealPrice":"￥39.90",
         * "ShippingInfo":"全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/12/29/629_56826cdbdbcbc_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=629","LikeCount":198,"Stock":87,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["包邮"],"Weight":"1040克","Price":"￥59.00"},{"StoreId":3712,
         * "StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "GoodsId":1075,"Title":"【限时促销】特价包邮飘香独家秘制卤香干（750g） ","SubTitle":"卤香四溢，好吃停不下来！",
         * "DealPrice":"￥39.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg2.hoto
         * .cn/goods/2015/11/27/1075_56586c032c80e_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1075","LikeCount":157,"Stock":40,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"750克","Price":"￥60.00"},{"StoreId":3712,
         * "StoreTitle":"飘香美食铺","StoreLogoUrl":"http://pimg3.hoto
         * .cn/store/2015/10/30/56338e99214c7.jpg","UserId":"8843844","UserName":"爱美食滴加菲猫",
         * "GoodsId":1178,"Title":"【限时促销】飘香老北京风味蒜肠 独家秘制 550g","SubTitle":"味道浓郁，爽口不腻",
         * "DealPrice":"￥29.00","ShippingInfo":"配送上门/全国快递","CoverUrl":"http://pimg3.hoto
         * .cn/goods/2015/11/04/1178_563a1c31d2f0f_680_450.jpg","OpenUrl":"haodourecipe://haodou
         * .com/goods/detail?id=1178","LikeCount":115,"Stock":30,"IsShippingFree":2,"IsLike":0,
         * "CartNum":0,"Labels":["活动价","包邮"],"Weight":"550克","Price":"￥50.00"}]
         * CartTotalNum : 8
         * CateInfos : [{"CateId":0,"CateName":"全部"},{"CateId":"58","CateName":"家传秘制"},
         * {"CateId":"59","CateName":"肉禽蛋类"},{"CateId":"60","CateName":"烘焙面点"},{"CateId":"61",
         * "CateName":"水产海鲜"},{"CateId":"62","CateName":"腌腊制品"},{"CateId":"63",
         * "CateName":"调味酱料"},{"CateId":"64","CateName":"养生养颜"},{"CateId":"65",
         * "CateName":"小吃零嘴"},{"CateId":"66","CateName":"冲调饮品"},{"CateId":"67","CateName":"生鲜果蔬"}]
         */

        private int count;
        private int CartTotalNum;
        private List<ListBean> list;
        private List<CateInfosBean> CateInfos;

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

        public List<CateInfosBean> getCateInfos() {
            return CateInfos;
        }

        public void setCateInfos(List<CateInfosBean> CateInfos) {
            this.CateInfos = CateInfos;
        }

        public static class ListBean {
            /**
             * StoreId : 3976
             * StoreTitle : 淼冉妈七彩面点手工坊
             * StoreLogoUrl : http://pimg2.hoto.cn/store/2015/11/05/563afb18a8936.jpg
             * UserId : 8111886
             * UserName : 淼冉妈
             * GoodsId : 1309
             * Title : 纯手工空心面手工挂面500克
             * SubTitle : 百年工艺纯手工制作空心面
             * DealPrice : ￥20.00
             * ShippingInfo : 配送上门/全国快递
             * CoverUrl : http://pimg2.hoto.cn/goods/2016/01/19/1309_569ded18ecc46_680_450.jpg
             * OpenUrl : haodourecipe://haodou.com/goods/detail?id=1309
             * LikeCount : 389
             * Stock : 4242
             * IsShippingFree : 2
             * IsLike : 0
             * CartNum : 0
             * Labels : ["包邮"]
             * Weight : 500克
             * Price : ￥40.00
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

        @Override
        public String toString() {
            return "ResultBean{" +
                    "count=" + count +
                    ", CartTotalNum=" + CartTotalNum +
                    ", list=" + list +
                    ", CateInfos=" + CateInfos +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LabelDetailsResult{" +
                "status=" + status +
                ", result=" + result +
                '}';
    }
}