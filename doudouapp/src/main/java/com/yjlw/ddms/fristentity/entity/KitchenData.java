package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：厨房数据实体类 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  13:36
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class KitchenData {

    /**
     * status : 200
     * result : {"count":"19","list":[{"Title":"5个必要方法 ，速成烘焙大师","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=270439&_wt=1","ItemId":270439,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/9ac96a8.jpg","Content":"烘焙是一件令人愉悦的事，你可以轻易地从赖淑萍身上看出这一点。在个性上，赖淑萍是个活泼开朗的自信女孩，在工作上，她则是个自我要求甚高的完美主义者。","Collection":"Q猪宝宝   2014-04-10 11:22","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=270439&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270439.html%3F_v%3Dnohead"},{"Title":"怎样徒手给蛋糕脱模","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=319564&_wt=1","ItemId":319564,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/b24dbfe7.jpg","Content":"很多烘焙新手面对蛋糕脱模会有些迷糊，朵云在初入烘焙时也常把蛋糕给脱破，甚至脱模刀都弄断，后面换了不锈钢的脱模刀又把模具给划给划出很多印子。直到后来在网上看到了徒手脱模，试过后还真的不错，比脱模刀好用多了，这下连脱模刀也省下了，有兴趣的小伙伴儿们可以试试看。","Collection":"朵云美食   2014-12-20 17:57","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=319564&url=http%3A%2F%2Fm.haodou.com%2Ftopic-319564.html%3F_v%3Dnohead"},{"Title":"圣诞可可饼屋，在家做一个","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=177070&_wt=1","ItemId":177070,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/243867076.jpg","Content":"这也算是狂欢之宴上的主角了吧！因为今天它是送给囡宝班里的小朋友们共享得，事先想过烤个小院子、二屋滴，可最后还是懒性让我做了这款最最简单却又十足大滴圣诞可可饼屋。","Collection":"牛妈厨房   2012-12-25 09:56","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=177070&url=http%3A%2F%2Fm.haodou.com%2Ftopic-177070.html%3F_v%3Dnohead"},{"Title":"做烘焙必知的制作要诀","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=270417&_wt=1","ItemId":270417,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/dcc6e76d.jpg","Content":"小西饼的重要性可由其现身的频繁而窥之，不论是由一般的面包店，饭店的宴会场所，其均扮演小兵立大功的重要角色。饼干的制作较其他西点来得简易，但仍有甚多须加留意之处，在您欲一享自制自吃的乐趣前，这些信息您不能不知。\n类别","Collection":"Q猪宝宝   2014-04-10 10:15","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=270417&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270417.html%3F_v%3Dnohead"},{"Title":"教你做零失败的电饭锅蛋糕","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=194241&_wt=1","ItemId":194241,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/133601097.jpg","Content":"很多豆子都喜欢电饭锅蛋糕，所以决定分享一下我电饭锅蛋糕之旅，让大家也了解一下，有兴趣的也可以试验试验。很多人都不相信电饭锅能做得这么棒，那我就细细记录一下。","Collection":"Flyer菲儿   2013-04-15 22:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=194241&url=http%3A%2F%2Fm.haodou.com%2Ftopic-194241.html%3F_v%3Dnohead"},{"Title":"披萨如何拉出诱人的拉丝","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=307533&_wt=1","ItemId":307533,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/14e19ac80.jpg","Content":"也曾经买过这家的外卖披萨，到手后，焦暗的饼边，硬硬的咯牙，浅少的芝士，切开都不会拉丝，广告太美好，现实太残酷啊！","Collection":"柔蓝水晶   2014-10-16 23:20","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=307533&url=http%3A%2F%2Fm.haodou.com%2Ftopic-307533.html%3F_v%3Dnohead"},{"Title":"烘焙新手必知的13个知识","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=305234&_wt=1","ItemId":305234,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/1c55716ad.jpg","Content":"新手们在烘焙路上，由于种种的不了解，引发了很多笑话。我曾经看过一篇微信文章写道：准备给老公做这样的一个蛋糕（图片很漂亮很漂亮的），结果成了一坨乌黑的\u201c牛粪\u201d\u2026\u2026相信很多新手也曾有过相似的情景，真是哭笑不得。所以，请花3分钟，认真看看以下13点烘焙小知识吧，记着：磨刀不误砍柴工哦！","Collection":"Q猪宝宝   2014-10-08 15:36","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=305234&url=http%3A%2F%2Fm.haodou.com%2Ftopic-305234.html%3F_v%3Dnohead"},{"Title":"甜蜜七夕礼：心形曲奇饼干","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=288484&_wt=1","ItemId":288484,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/176b5ceff.jpg","Content":"甜蜜七夕礼：心形曲奇饼干","Collection":"浅小朵   2014-07-29 10:03","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=288484&url=http%3A%2F%2Fm.haodou.com%2Ftopic-288484.html%3F_v%3Dnohead"},{"Title":"烤箱使用入学小窍门","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=175988&_wt=1","ItemId":175988,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/22c705804.jpg","Content":"烤箱烘焙入学小窍门","Collection":"茗月Hemichy   2012-12-14 23:13","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=175988&url=http%3A%2F%2Fm.haodou.com%2Ftopic-175988.html%3F_v%3Dnohead"},{"Title":"妙方：没有烤箱也能做饼干呦！","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=127569&_wt=1","ItemId":127569,"Type":1,"Image":"http://img2.hoto.cn/attachment/forum/201110/26/151826vzodd4vvcck46j4n.jpg","Content":"","Collection":"烩烩小厨   2011-10-26 15:27","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=127569&url=http%3A%2F%2Fm.haodou.com%2Ftopic-127569.html%3F_v%3Dnohead"},{"Title":"简单几招，成就超完美戚风蛋糕","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=282937&_wt=1","ItemId":282937,"Type":1,"Image":"http://recipe1.hoto.cn/pic/recipe/l/c1/93/431041_6e1abf.thumb.jpg","Content":"","Collection":"优谜糖藕   2014-06-24 12:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=282937&url=http%3A%2F%2Fm.haodou.com%2Ftopic-282937.html%3F_v%3Dnohead"},{"Title":"烘焙：达人帮你了解烤箱的脾性","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=280749&_wt=1","ItemId":280749,"Type":1,"Image":"http://img3.hoto.cn/group/201406/11/1207951_49357554.thumb.jpg","Content":"","Collection":"Q猪宝宝   2014-06-11 09:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=280749&url=http%3A%2F%2Fm.haodou.com%2Ftopic-280749.html%3F_v%3Dnohead"},{"Title":"烘焙入门二:新手必备工具","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=215043&_wt=1","ItemId":215043,"Type":1,"Image":"http://recipe1.hoto.cn/pic/recipe/l/59/58/415833_4f379e.thumb.jpg","Content":"","Collection":"籣草児   2013-08-05 15:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=215043&url=http%3A%2F%2Fm.haodou.com%2Ftopic-215043.html%3F_v%3Dnohead"},{"Title":"烘焙入门一：必知基础知识","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=270423&_wt=1","ItemId":270423,"Type":1,"Image":"http://img3.hoto.cn/group/201404/17/693652_06339254.thumb.jpg","Content":"","Collection":"Q猪宝宝   2014-04-10 10:31","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=270423&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270423.html%3F_v%3Dnohead"},{"Title":"做面包不用揉也可出膜的绝招","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=261446&_wt=1","ItemId":261446,"Type":1,"Image":"http://img3.hoto.cn/group/201402/07/141772_03066874.thumb.jpg","Content":"","Collection":"梅依旧   2014-02-07 00:23","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=261446&url=http%3A%2F%2Fm.haodou.com%2Ftopic-261446.html%3F_v%3Dnohead"},{"Title":"烘焙新手须知的小技巧","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=223374&_wt=1","ItemId":223374,"Type":1,"Image":"http://img3.hoto.cn/group/201308/26/113473_24710748.thumb.jpg","Content":"","Collection":"籣草児   2013-08-26 21:46","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=223374&url=http%3A%2F%2Fm.haodou.com%2Ftopic-223374.html%3F_v%3Dnohead"},{"Title":"手工揉面小技巧","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=251959&_wt=1","ItemId":251959,"Type":1,"Image":"http://img3.hoto.cn/group/201312/30/2760423_09247366.thumb.jpg","Content":"","Collection":"羊羊的厨房   2013-12-30 21:23","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=251959&url=http%3A%2F%2Fm.haodou.com%2Ftopic-251959.html%3F_v%3Dnohead"},{"Title":"如何做出零食败的嫩滑蛋挞","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=242559&_wt=1","ItemId":242559,"Type":1,"Image":"http://img3.hoto.cn/group/201311/15/1207951_87042185.jpg","Content":"","Collection":"Q猪宝宝   2013-11-15 15:00","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=242559&url=http%3A%2F%2Fm.haodou.com%2Ftopic-242559.html%3F_v%3Dnohead"},{"Title":"烘培中那些决定成败却容易被忽略的小细节","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=127010&_wt=1","ItemId":127010,"Type":1,"Image":"","Content":"","Collection":"坨坨妈   2011-10-20 10:37","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=127010&url=http%3A%2F%2Fm.haodou.com%2Ftopic-127010.html%3F_v%3Dnohead"}]}
     * request_id : a35b6e05055250b88f6970e7b2058a66
     */

    private int status;
    private ResultBean result;
    private String request_id;

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

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public static class ResultBean {
        /**
         * count : 19
         * list : [{"Title":"5个必要方法 ，速成烘焙大师","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=270439&_wt=1","ItemId":270439,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/9ac96a8.jpg","Content":"烘焙是一件令人愉悦的事，你可以轻易地从赖淑萍身上看出这一点。在个性上，赖淑萍是个活泼开朗的自信女孩，在工作上，她则是个自我要求甚高的完美主义者。","Collection":"Q猪宝宝   2014-04-10 11:22","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=270439&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270439.html%3F_v%3Dnohead"},{"Title":"怎样徒手给蛋糕脱模","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=319564&_wt=1","ItemId":319564,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/b24dbfe7.jpg","Content":"很多烘焙新手面对蛋糕脱模会有些迷糊，朵云在初入烘焙时也常把蛋糕给脱破，甚至脱模刀都弄断，后面换了不锈钢的脱模刀又把模具给划给划出很多印子。直到后来在网上看到了徒手脱模，试过后还真的不错，比脱模刀好用多了，这下连脱模刀也省下了，有兴趣的小伙伴儿们可以试试看。","Collection":"朵云美食   2014-12-20 17:57","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=319564&url=http%3A%2F%2Fm.haodou.com%2Ftopic-319564.html%3F_v%3Dnohead"},{"Title":"圣诞可可饼屋，在家做一个","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=177070&_wt=1","ItemId":177070,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/243867076.jpg","Content":"这也算是狂欢之宴上的主角了吧！因为今天它是送给囡宝班里的小朋友们共享得，事先想过烤个小院子、二屋滴，可最后还是懒性让我做了这款最最简单却又十足大滴圣诞可可饼屋。","Collection":"牛妈厨房   2012-12-25 09:56","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=177070&url=http%3A%2F%2Fm.haodou.com%2Ftopic-177070.html%3F_v%3Dnohead"},{"Title":"做烘焙必知的制作要诀","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=270417&_wt=1","ItemId":270417,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/dcc6e76d.jpg","Content":"小西饼的重要性可由其现身的频繁而窥之，不论是由一般的面包店，饭店的宴会场所，其均扮演小兵立大功的重要角色。饼干的制作较其他西点来得简易，但仍有甚多须加留意之处，在您欲一享自制自吃的乐趣前，这些信息您不能不知。\n类别","Collection":"Q猪宝宝   2014-04-10 10:15","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=270417&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270417.html%3F_v%3Dnohead"},{"Title":"教你做零失败的电饭锅蛋糕","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=194241&_wt=1","ItemId":194241,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/133601097.jpg","Content":"很多豆子都喜欢电饭锅蛋糕，所以决定分享一下我电饭锅蛋糕之旅，让大家也了解一下，有兴趣的也可以试验试验。很多人都不相信电饭锅能做得这么棒，那我就细细记录一下。","Collection":"Flyer菲儿   2013-04-15 22:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=194241&url=http%3A%2F%2Fm.haodou.com%2Ftopic-194241.html%3F_v%3Dnohead"},{"Title":"披萨如何拉出诱人的拉丝","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=307533&_wt=1","ItemId":307533,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/14e19ac80.jpg","Content":"也曾经买过这家的外卖披萨，到手后，焦暗的饼边，硬硬的咯牙，浅少的芝士，切开都不会拉丝，广告太美好，现实太残酷啊！","Collection":"柔蓝水晶   2014-10-16 23:20","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=307533&url=http%3A%2F%2Fm.haodou.com%2Ftopic-307533.html%3F_v%3Dnohead"},{"Title":"烘焙新手必知的13个知识","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=305234&_wt=1","ItemId":305234,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/1c55716ad.jpg","Content":"新手们在烘焙路上，由于种种的不了解，引发了很多笑话。我曾经看过一篇微信文章写道：准备给老公做这样的一个蛋糕（图片很漂亮很漂亮的），结果成了一坨乌黑的\u201c牛粪\u201d\u2026\u2026相信很多新手也曾有过相似的情景，真是哭笑不得。所以，请花3分钟，认真看看以下13点烘焙小知识吧，记着：磨刀不误砍柴工哦！","Collection":"Q猪宝宝   2014-10-08 15:36","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=305234&url=http%3A%2F%2Fm.haodou.com%2Ftopic-305234.html%3F_v%3Dnohead"},{"Title":"甜蜜七夕礼：心形曲奇饼干","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=288484&_wt=1","ItemId":288484,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/176b5ceff.jpg","Content":"甜蜜七夕礼：心形曲奇饼干","Collection":"浅小朵   2014-07-29 10:03","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=288484&url=http%3A%2F%2Fm.haodou.com%2Ftopic-288484.html%3F_v%3Dnohead"},{"Title":"烤箱使用入学小窍门","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=175988&_wt=1","ItemId":175988,"Type":1,"Image":"http://img1.hoto.cn/haodou/recipev4/wiki/22c705804.jpg","Content":"烤箱烘焙入学小窍门","Collection":"茗月Hemichy   2012-12-14 23:13","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=175988&url=http%3A%2F%2Fm.haodou.com%2Ftopic-175988.html%3F_v%3Dnohead"},{"Title":"妙方：没有烤箱也能做饼干呦！","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=127569&_wt=1","ItemId":127569,"Type":1,"Image":"http://img2.hoto.cn/attachment/forum/201110/26/151826vzodd4vvcck46j4n.jpg","Content":"","Collection":"烩烩小厨   2011-10-26 15:27","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=127569&url=http%3A%2F%2Fm.haodou.com%2Ftopic-127569.html%3F_v%3Dnohead"},{"Title":"简单几招，成就超完美戚风蛋糕","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=282937&_wt=1","ItemId":282937,"Type":1,"Image":"http://recipe1.hoto.cn/pic/recipe/l/c1/93/431041_6e1abf.thumb.jpg","Content":"","Collection":"优谜糖藕   2014-06-24 12:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=282937&url=http%3A%2F%2Fm.haodou.com%2Ftopic-282937.html%3F_v%3Dnohead"},{"Title":"烘焙：达人帮你了解烤箱的脾性","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=280749&_wt=1","ItemId":280749,"Type":1,"Image":"http://img3.hoto.cn/group/201406/11/1207951_49357554.thumb.jpg","Content":"","Collection":"Q猪宝宝   2014-06-11 09:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=280749&url=http%3A%2F%2Fm.haodou.com%2Ftopic-280749.html%3F_v%3Dnohead"},{"Title":"烘焙入门二:新手必备工具","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=215043&_wt=1","ItemId":215043,"Type":1,"Image":"http://recipe1.hoto.cn/pic/recipe/l/59/58/415833_4f379e.thumb.jpg","Content":"","Collection":"籣草児   2013-08-05 15:54","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=215043&url=http%3A%2F%2Fm.haodou.com%2Ftopic-215043.html%3F_v%3Dnohead"},{"Title":"烘焙入门一：必知基础知识","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=270423&_wt=1","ItemId":270423,"Type":1,"Image":"http://img3.hoto.cn/group/201404/17/693652_06339254.thumb.jpg","Content":"","Collection":"Q猪宝宝   2014-04-10 10:31","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=270423&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270423.html%3F_v%3Dnohead"},{"Title":"做面包不用揉也可出膜的绝招","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=261446&_wt=1","ItemId":261446,"Type":1,"Image":"http://img3.hoto.cn/group/201402/07/141772_03066874.thumb.jpg","Content":"","Collection":"梅依旧   2014-02-07 00:23","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=261446&url=http%3A%2F%2Fm.haodou.com%2Ftopic-261446.html%3F_v%3Dnohead"},{"Title":"烘焙新手须知的小技巧","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=223374&_wt=1","ItemId":223374,"Type":1,"Image":"http://img3.hoto.cn/group/201308/26/113473_24710748.thumb.jpg","Content":"","Collection":"籣草児   2013-08-26 21:46","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=223374&url=http%3A%2F%2Fm.haodou.com%2Ftopic-223374.html%3F_v%3Dnohead"},{"Title":"手工揉面小技巧","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=251959&_wt=1","ItemId":251959,"Type":1,"Image":"http://img3.hoto.cn/group/201312/30/2760423_09247366.thumb.jpg","Content":"","Collection":"羊羊的厨房   2013-12-30 21:23","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=251959&url=http%3A%2F%2Fm.haodou.com%2Ftopic-251959.html%3F_v%3Dnohead"},{"Title":"如何做出零食败的嫩滑蛋挞","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=242559&_wt=1","ItemId":242559,"Type":1,"Image":"http://img3.hoto.cn/group/201311/15/1207951_87042185.jpg","Content":"","Collection":"Q猪宝宝   2013-11-15 15:00","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=242559&url=http%3A%2F%2Fm.haodou.com%2Ftopic-242559.html%3F_v%3Dnohead"},{"Title":"烘培中那些决定成败却容易被忽略的小细节","Url":"http://m.haodou.com/app/recipe/topic/view.php?id=127010&_wt=1","ItemId":127010,"Type":1,"Image":"","Content":"","Collection":"坨坨妈   2011-10-20 10:37","OpenUrl":"haodourecipe://haodou.com/opentopic/?id=127010&url=http%3A%2F%2Fm.haodou.com%2Ftopic-127010.html%3F_v%3Dnohead"}]
         */

        private String count;
        private List<ListBean> list;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * Title : 5个必要方法 ，速成烘焙大师
             * Url : http://m.haodou.com/app/recipe/topic/view.php?id=270439&_wt=1
             * ItemId : 270439
             * Type : 1
             * Image : http://img1.hoto.cn/haodou/recipev4/wiki/9ac96a8.jpg
             * Content : 烘焙是一件令人愉悦的事，你可以轻易地从赖淑萍身上看出这一点。在个性上，赖淑萍是个活泼开朗的自信女孩，在工作上，她则是个自我要求甚高的完美主义者。
             * Collection : Q猪宝宝   2014-04-10 11:22
             * OpenUrl : haodourecipe://haodou.com/opentopic/?id=270439&url=http%3A%2F%2Fm.haodou.com%2Ftopic-270439.html%3F_v%3Dnohead
             */

            private String Title;
            private String Url;
            private int ItemId;
            private int Type;
            private String Image;
            private String Content;
            private String Collection;
            private String OpenUrl;

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

            public int getItemId() {
                return ItemId;
            }

            public void setItemId(int ItemId) {
                this.ItemId = ItemId;
            }

            public int getType() {
                return Type;
            }

            public void setType(int Type) {
                this.Type = Type;
            }

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getCollection() {
                return Collection;
            }

            public void setCollection(String Collection) {
                this.Collection = Collection;
            }

            public String getOpenUrl() {
                return OpenUrl;
            }

            public void setOpenUrl(String OpenUrl) {
                this.OpenUrl = OpenUrl;
            }
        }
    }
}
