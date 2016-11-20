package com.yjlw.ddms.squareentity.fragment.entity;

import java.util.List;

/**
 * Description：实体类<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 9:33
 *
 * @author 李磊
 * @version : 1.0
 */

public class Result {


    /**
     * ad : [{"Img":"http://img1.hoto.cn/haodou/center/ad/3fb9a2da.jpg","Url":"haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fgroup.haodou.com%2Ftopic-497390.html&id=497390"}]
     * group : [{"CateId":33,"Desc":"家常味道，幸福滋味","Img":"http://img4.hoto.cn/res/images/public/group/33.jpg?v=10000","Name":"家常菜","Url":"haodourecipe://haodou.com/httopic/?id=33","ViewDesc":"今日围观 44208"},{"CateId":32,"Desc":"爱在发酵，甜蜜起烘","Img":"http://img4.hoto.cn/res/images/public/group/32.jpg?v=10000","Name":"烘焙甜点","Url":"haodourecipe://haodou.com/httopic/?id=32","ViewDesc":"今日围观 14190"},{"CateId":31,"Desc":"幸福人生，享受每一餐","Img":"http://img4.hoto.cn/res/images/public/group/31.jpg?v=10000","Name":"享受餐桌","Url":"haodourecipe://haodou.com/httopic/?id=31","ViewDesc":"今日围观 24503"},{"CateId":34,"Desc":"听说，喜欢唠嗑的人更快乐!","Img":"http://img4.hoto.cn/res/images/public/group/34.jpg?v=10000","Name":"好好生活","Url":"haodourecipe://haodou.com/httopic/?id=34","ViewDesc":"今日围观 36174"},{"CateId":35,"Desc":"带上心旅行，拿着相机走天下。","Img":"http://img4.hoto.cn/res/images/public/group/35.jpg?v=10000","Name":"行摄天下","Url":"haodourecipe://haodou.com/httopic/?id=35","ViewDesc":"今日围观 19344"},{"CateId":6,"Desc":"美食巧搭配，食在有营养","Img":"http://img4.hoto.cn/res/images/public/group/6.jpg?v=10000","Name":"营养健康","Url":"haodourecipe://haodou.com/httopic/?id=6","ViewDesc":"今日围观 22058"},{"CateId":8,"Desc":"每个私家小妙招的分享，都是热爱生活的态度。","Img":"http://img4.hoto.cn/res/images/public/group/8.jpg?v=10000","Name":"厨房宝典","Url":"haodourecipe://haodou.com/httopic/?id=8","ViewDesc":"今日围观 34558"},{"CateId":23,"Desc":"大手牵小手，迈步向前走！","Img":"http://img4.hoto.cn/res/images/public/group/23.jpg?v=10000","Name":"亲子乐园","Url":"haodourecipe://haodou.com/httopic/?id=23","ViewDesc":"今日围观 6431"},{"CateId":38,"Desc":"在这里，总能找到你的所爱和同伴。","Img":"http://img4.hoto.cn/res/images/public/group/38.jpg?v=10000","Name":"兴趣集市","Url":"haodourecipe://haodou.com/httopic/?id=38","ViewDesc":"今日围观 8191"},{"CateId":30,"Desc":"好货集聚地，抢购进行时","Img":"http://img4.hoto.cn/res/images/public/group/30.jpg?v=10000","Name":"豆购联盟","Url":"haodourecipe://haodou.com/httopic/?id=30","ViewDesc":"今日围观 2278"},{"CateId":28,"Desc":"好豆网用户美食线下美食交流互动活动，包括但不限于厨艺交流、美食摄影、亲子旅游等等活动内容。","Img":"http://img4.hoto.cn/res/images/public/group/28.jpg?v=10000","Name":"豆友会","Url":"haodourecipe://haodou.com/httopic/?id=28","ViewDesc":"今日围观 2319"}]
     * groupTitle : 话题小组
     * groupUrl : haodourecipe://haodou.com/Topic/getCateList/
     * hot : [{"Avatar":"http://avatar1.hoto.cn/31/67/1664817_185.jpg","CommentCount":8,"DigCount":2,"Img":"http://img3.hoto.cn/group/201611/12/1664817_88011083.mobile.jpg","PreviewContent":"迷你潜艇堡是【烘焙甜点】11月第1课的作业，老师是柔蓝水晶。请看老师的教学帖子：http://group.haodou.com/topic-495497.html我","TagId":0,"TagName":"","Title":"烘焙甜点+迷你潜艇堡","TopicId":496494,"Url":"haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fm.haodou.com%2Ftopic-496494.html%3F_v%3Dnohead&id=496494","UserId":1664817,"UserName":"幸福点心","Vip":1},{"Avatar":"http://avatar1.hoto.cn/ab/03/132011_185.jpg?v=37","CommentCount":22,"DigCount":8,"Img":"http://img3.hoto.cn/group/201611/18/132011_01514247.mobile.jpg","PreviewContent":"馅饼在我的印象中一直是一种非常美味的食品，它带有明显的北方美食的特征，从小到大我都非常非常爱吃馅饼。传统的馅饼是","TagId":0,"TagName":"","Title":"馅饼盒子","TopicId":498071,"Url":"haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fm.haodou.com%2Ftopic-498071.html%3F_v%3Dnohead&id=498071","UserId":132011,"UserName":"沙漠蓝湖","Vip":1},{"Avatar":"http://avatar0.hoto.cn/f6/16/4921078_185.jpg?v=5","CommentCount":72,"DigCount":13,"Img":"http://img3.hoto.cn/group/201611/18/113473_49901578.mobile.jpg","PreviewContent":"米发糕用大米磨粉制作，是传统的发酵面点。米发糕色泽洁白，绵软甜润，是大家比较喜欢的小吃之一。每当走在街上，看到街边面点铺子里那一块块白白绵软，热气腾腾的发糕，实在太诱人。其实，大米","TagId":0,"TagName":"","Title":"好问豆答：米发糕的制作技巧","TopicId":498130,"Url":"haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fm.haodou.com%2Ftopic-498130.html%3F_v%3Dnohead&id=498130","UserId":4921078,"UserName":"开心姥姥","Vip":1}]
     * hotTitle : 实时热点
     * hotUrl : haodourecipe://haodou.com/Topic/getHotTopicList/
     * todayStar : [{"Avatar":"http://avatar1.hoto.cn/49/79/1997129_185.jpg","Url":"haodourecipe://haodou.com/user/wo/?id=1997129&name=%E7%95%AA%E8%8C%84%E5%B0%8F%E7%9F%B3%E5%A4%B4&avatar=http://avatar1.hoto.cn/49/79/1997129_185.jpg","UserId":1997129,"UserName":"番茄小石头"},{"Avatar":"http://avatar1.hoto.cn/43/e0/8708163_185.jpg?v=1","Url":"haodourecipe://haodou.com/user/wo/?id=8708163&name=%E6%BD%87%E5%AE%9D%E9%A2%9D%E5%A8%98131425&avatar=http://avatar1.hoto.cn/43/e0/8708163_185.jpg?v=1","UserId":8708163,"UserName":"潇宝额娘131425"},{"Avatar":"http://avatar0.hoto.cn/3c/0a/3476028_185.jpg","Url":"haodourecipe://haodou.com/user/wo/?id=3476028&name=%E5%87%8C%E4%BA%91hh&avatar=http://avatar0.hoto.cn/3c/0a/3476028_185.jpg","UserId":3476028,"UserName":"凌云hh"},{"Avatar":"http://avatar1.hoto.cn/b9/30/9777337_185.jpg?v=52","Url":"haodourecipe://haodou.com/user/wo/?id=9777337&name=%E7%81%AC%E4%B8%A8%E6%B5%85%E5%94%B1&avatar=http://avatar1.hoto.cn/b9/30/9777337_185.jpg?v=52","UserId":9777337,"UserName":"灬丨浅唱"},{"Avatar":"http://avatar1.hoto.cn/65/13/9966437_185.jpg","Url":"haodourecipe://haodou.com/user/wo/?id=9966437&name=HYL%E6%99%93%E7%8E%B2&avatar=http://avatar1.hoto.cn/65/13/9966437_185.jpg","UserId":9966437,"UserName":"HYL晓玲"}]
     * todayStarTitle : 活跃豆亲
     * todayStarUrl : haodourecipe://haodou.com/Topic/getTodayStarList/
     */

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * Img : http://img1.hoto.cn/haodou/center/ad/3fb9a2da.jpg
         * Url : haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fgroup.haodou.com%2Ftopic-497390.html&id=497390
         */

        private List<AdBean> ad;
        /**
         * CateId : 33
         * Desc : 家常味道，幸福滋味
         * Img : http://img4.hoto.cn/res/images/public/group/33.jpg?v=10000
         * Name : 家常菜
         * Url : haodourecipe://haodou.com/httopic/?id=33
         * ViewDesc : 今日围观 44208
         */

        private List<GroupBean> group;
        /**
         * Avatar : http://avatar1.hoto.cn/31/67/1664817_185.jpg
         * CommentCount : 8
         * DigCount : 2
         * Img : http://img3.hoto.cn/group/201611/12/1664817_88011083.mobile.jpg
         * PreviewContent : 迷你潜艇堡是【烘焙甜点】11月第1课的作业，老师是柔蓝水晶。请看老师的教学帖子：http://group.haodou.com/topic-495497.html我
         * TagId : 0
         * TagName :
         * Title : 烘焙甜点+迷你潜艇堡
         * TopicId : 496494
         * Url : haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fm.haodou.com%2Ftopic-496494.html%3F_v%3Dnohead&id=496494
         * UserId : 1664817
         * UserName : 幸福点心
         * Vip : 1
         */

        private List<HotBean> hot;

        public List<AdBean> getAd() {
            return ad;
        }

        public void setAd(List<AdBean> ad) {
            this.ad = ad;
        }

        public List<GroupBean> getGroup() {
            return group;
        }

        public void setGroup(List<GroupBean> group) {
            this.group = group;
        }

        public List<HotBean> getHot() {
            return hot;
        }

        public void setHot(List<HotBean> hot) {
            this.hot = hot;
        }

        public static class AdBean {
            private String Img;

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }
        }

        public static class GroupBean {
            private String Desc;
            private String Img;
            private String Name;
            private String ViewDesc;

            public String getDesc() {
                return Desc;
            }

            public void setDesc(String Desc) {
                this.Desc = Desc;
            }

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getViewDesc() {
                return ViewDesc;
            }

            public void setViewDesc(String ViewDesc) {
                this.ViewDesc = ViewDesc;
            }
        }

        public static class HotBean {
            private String Avatar;
            private int CommentCount;
            private int DigCount;
            private String Img;
            private String PreviewContent;
            private String Title;
            private String UserName;

            public String getAvatar() {
                return Avatar;
            }

            public void setAvatar(String Avatar) {
                this.Avatar = Avatar;
            }

            public int getCommentCount() {
                return CommentCount;
            }

            public void setCommentCount(int CommentCount) {
                this.CommentCount = CommentCount;
            }

            public int getDigCount() {
                return DigCount;
            }

            public void setDigCount(int DigCount) {
                this.DigCount = DigCount;
            }

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }

            public String getPreviewContent() {
                return PreviewContent;
            }

            public void setPreviewContent(String PreviewContent) {
                this.PreviewContent = PreviewContent;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }
        }
    }
}
