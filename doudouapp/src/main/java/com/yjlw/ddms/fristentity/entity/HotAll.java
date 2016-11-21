package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月21  15:05
 *
 * @author 姜文莒
 * @version : 1.0
 */


public class HotAll {

    /**
     * status : 200
     * result : {"count":100,"list":[{"LikeCount":5,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/99/1f/1122201_f4bc07.jpg","Title":"电饼铛鸡蛋灌饼","UserName":"georgeanu","RecipeId":1122201,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"}],"UserId":9665935,"CreateTime":"2016-11-09 10:07:44"},{"LikeCount":3,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/44/1d/1121604_8f309e.jpg","Title":"香芹炒花生芽","UserName":"梦里之水乡","RecipeId":1121604,"HasVideo":0,"Tags":[{"Id":52261,"Name":"健脑益智"},{"Id":329,"Name":"健脾开胃"},{"Id":391,"Name":"儿童"},{"Id":49127,"Name":"增强免疫力"},{"Id":800,"Name":"孕妇"},{"Id":288,"Name":"家常菜"},{"Id":331,"Name":"延缓衰老"},{"Id":350,"Name":"排毒"},{"Id":2200,"Name":"滋阴润燥"},{"Id":298,"Name":"热菜"},{"Id":393,"Name":"老年人"},{"Id":341,"Name":"补血"},{"Id":21747,"Name":"补铁"},{"Id":432,"Name":"原味"},{"Id":582,"Name":"抗疲劳"},{"Id":479,"Name":"炒"},{"Id":411,"Name":"防癌"},{"Id":1265,"Name":"降血压"}],"UserId":1018910,"CreateTime":"2016-11-06 22:26:22"},{"LikeCount":107,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/e8/9b/1088488_579f2c.jpg","Title":"小羊鲜虾鱼板面#小虾创意料理#","UserName":"天使落凡尘","RecipeId":1088488,"HasVideo":0,"Tags":[{"Id":7203,"Name":"宝宝"},{"Id":391,"Name":"儿童"},{"Id":53055,"Name":"创意菜"},{"Id":842,"Name":"晚餐"}],"UserId":141692,"CreateTime":"2016-07-11 11:26:00"},{"LikeCount":6,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/fe/20/1122558_534aa1.jpg","Title":"枣泥戚风蛋糕","UserName":"明月燕子","RecipeId":1122558,"HasVideo":0,"Tags":[{"Id":1257,"Name":"下午茶"},{"Id":286,"Name":"早餐"},{"Id":835,"Name":"烤箱"},{"Id":292,"Name":"甜品"},{"Id":827,"Name":"蛋糕"}],"UserId":720733,"CreateTime":"2016-11-10 16:08:17"},{"LikeCount":3,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/7d/20/1122429_357bc5.jpg","Title":"牛肉蝴蝶结意面","UserName":"冬阳暖玉","RecipeId":1122429,"HasVideo":0,"Tags":[{"Id":829,"Name":"小吃"},{"Id":842,"Name":"晚餐"},{"Id":903,"Name":"面食"}],"UserId":3403406,"CreateTime":"2016-11-09 23:39:08"},{"LikeCount":15,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/0b/d8/1103883_aaae77.jpg","Title":"木瓜鸡尾酒冻","UserName":"elsa飞雪","RecipeId":1103883,"HasVideo":0,"Tags":[{"Id":292,"Name":"甜品"}],"UserId":6832026,"CreateTime":"2016-08-31 18:02:21"},{"LikeCount":28,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/a7/ad/1093031_2a8a54.jpg","Title":"咖喱肉松南瓜餐包","UserName":"籣草児","RecipeId":1093031,"HasVideo":0,"Tags":[{"Id":835,"Name":"烤箱"},{"Id":731,"Name":"面包"},{"Id":8187,"Name":"面包机"}],"UserId":113473,"CreateTime":"2016-07-25 14:45:57"},{"LikeCount":2,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/3d/16/1119805_123bc0.jpg","Title":"腰果西芹炒花枝","UserName":"平淡一生yan","RecipeId":1119805,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"},{"Id":479,"Name":"炒"},{"Id":298,"Name":"热菜"}],"UserId":2479581,"CreateTime":"2016-10-31 13:19:15"},{"LikeCount":7,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/ca/20/1122506_0a399c.jpg","Title":"蛋糕甜甜圈","UserName":"飘零星","RecipeId":1122506,"HasVideo":0,"Tags":[{"Id":391,"Name":"儿童"},{"Id":829,"Name":"小吃"},{"Id":292,"Name":"甜品"},{"Id":90742,"Name":"空气炸锅"}],"UserId":739120,"CreateTime":"2016-11-10 12:43:00"},{"LikeCount":9,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/fd/0a/1116925_8511ef.jpg","Title":"惠灵顿牛排","UserName":"旻朗","RecipeId":1116925,"HasVideo":0,"Tags":[{"Id":308,"Name":"私房菜"},{"Id":90535,"Name":"西餐"},{"Id":438,"Name":"咸香"},{"Id":489,"Name":"烤"}],"UserId":3161602,"CreateTime":"2016-10-20 19:54:06"}]}
     * request_id : 21515fbc31a87c82cf7c523c07e9d38a
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
         * count : 100
         * list : [{"LikeCount":5,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/99/1f/1122201_f4bc07.jpg","Title":"电饼铛鸡蛋灌饼","UserName":"georgeanu","RecipeId":1122201,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"}],"UserId":9665935,"CreateTime":"2016-11-09 10:07:44"},{"LikeCount":3,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/44/1d/1121604_8f309e.jpg","Title":"香芹炒花生芽","UserName":"梦里之水乡","RecipeId":1121604,"HasVideo":0,"Tags":[{"Id":52261,"Name":"健脑益智"},{"Id":329,"Name":"健脾开胃"},{"Id":391,"Name":"儿童"},{"Id":49127,"Name":"增强免疫力"},{"Id":800,"Name":"孕妇"},{"Id":288,"Name":"家常菜"},{"Id":331,"Name":"延缓衰老"},{"Id":350,"Name":"排毒"},{"Id":2200,"Name":"滋阴润燥"},{"Id":298,"Name":"热菜"},{"Id":393,"Name":"老年人"},{"Id":341,"Name":"补血"},{"Id":21747,"Name":"补铁"},{"Id":432,"Name":"原味"},{"Id":582,"Name":"抗疲劳"},{"Id":479,"Name":"炒"},{"Id":411,"Name":"防癌"},{"Id":1265,"Name":"降血压"}],"UserId":1018910,"CreateTime":"2016-11-06 22:26:22"},{"LikeCount":107,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/e8/9b/1088488_579f2c.jpg","Title":"小羊鲜虾鱼板面#小虾创意料理#","UserName":"天使落凡尘","RecipeId":1088488,"HasVideo":0,"Tags":[{"Id":7203,"Name":"宝宝"},{"Id":391,"Name":"儿童"},{"Id":53055,"Name":"创意菜"},{"Id":842,"Name":"晚餐"}],"UserId":141692,"CreateTime":"2016-07-11 11:26:00"},{"LikeCount":6,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/fe/20/1122558_534aa1.jpg","Title":"枣泥戚风蛋糕","UserName":"明月燕子","RecipeId":1122558,"HasVideo":0,"Tags":[{"Id":1257,"Name":"下午茶"},{"Id":286,"Name":"早餐"},{"Id":835,"Name":"烤箱"},{"Id":292,"Name":"甜品"},{"Id":827,"Name":"蛋糕"}],"UserId":720733,"CreateTime":"2016-11-10 16:08:17"},{"LikeCount":3,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/7d/20/1122429_357bc5.jpg","Title":"牛肉蝴蝶结意面","UserName":"冬阳暖玉","RecipeId":1122429,"HasVideo":0,"Tags":[{"Id":829,"Name":"小吃"},{"Id":842,"Name":"晚餐"},{"Id":903,"Name":"面食"}],"UserId":3403406,"CreateTime":"2016-11-09 23:39:08"},{"LikeCount":15,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/0b/d8/1103883_aaae77.jpg","Title":"木瓜鸡尾酒冻","UserName":"elsa飞雪","RecipeId":1103883,"HasVideo":0,"Tags":[{"Id":292,"Name":"甜品"}],"UserId":6832026,"CreateTime":"2016-08-31 18:02:21"},{"LikeCount":28,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/a7/ad/1093031_2a8a54.jpg","Title":"咖喱肉松南瓜餐包","UserName":"籣草児","RecipeId":1093031,"HasVideo":0,"Tags":[{"Id":835,"Name":"烤箱"},{"Id":731,"Name":"面包"},{"Id":8187,"Name":"面包机"}],"UserId":113473,"CreateTime":"2016-07-25 14:45:57"},{"LikeCount":2,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/3d/16/1119805_123bc0.jpg","Title":"腰果西芹炒花枝","UserName":"平淡一生yan","RecipeId":1119805,"HasVideo":0,"Tags":[{"Id":288,"Name":"家常菜"},{"Id":479,"Name":"炒"},{"Id":298,"Name":"热菜"}],"UserId":2479581,"CreateTime":"2016-10-31 13:19:15"},{"LikeCount":7,"IsLike":0,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/ca/20/1122506_0a399c.jpg","Title":"蛋糕甜甜圈","UserName":"飘零星","RecipeId":1122506,"HasVideo":0,"Tags":[{"Id":391,"Name":"儿童"},{"Id":829,"Name":"小吃"},{"Id":292,"Name":"甜品"},{"Id":90742,"Name":"空气炸锅"}],"UserId":739120,"CreateTime":"2016-11-10 12:43:00"},{"LikeCount":9,"IsLike":0,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/fd/0a/1116925_8511ef.jpg","Title":"惠灵顿牛排","UserName":"旻朗","RecipeId":1116925,"HasVideo":0,"Tags":[{"Id":308,"Name":"私房菜"},{"Id":90535,"Name":"西餐"},{"Id":438,"Name":"咸香"},{"Id":489,"Name":"烤"}],"UserId":3161602,"CreateTime":"2016-10-20 19:54:06"}]
         */

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

        public static class ListBean {
            /**
             * LikeCount : 5
             * IsLike : 0
             * Cover : http://recipe1.hoto.cn/pic/recipe/l/99/1f/1122201_f4bc07.jpg
             * Title : 电饼铛鸡蛋灌饼
             * UserName : georgeanu
             * RecipeId : 1122201
             * HasVideo : 0
             * Tags : [{"Id":288,"Name":"家常菜"}]
             * UserId : 9665935
             * CreateTime : 2016-11-09 10:07:44
             */

            private int LikeCount;
            private int IsLike;
            private String Cover;
            private String Title;
            private String UserName;
            private int RecipeId;
            private int HasVideo;
            private int UserId;
            private String CreateTime;
            private List<TagsBean> Tags;

            public int getLikeCount() {
                return LikeCount;
            }

            public void setLikeCount(int LikeCount) {
                this.LikeCount = LikeCount;
            }

            public int getIsLike() {
                return IsLike;
            }

            public void setIsLike(int IsLike) {
                this.IsLike = IsLike;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
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

            public int getRecipeId() {
                return RecipeId;
            }

            public void setRecipeId(int RecipeId) {
                this.RecipeId = RecipeId;
            }

            public int getHasVideo() {
                return HasVideo;
            }

            public void setHasVideo(int HasVideo) {
                this.HasVideo = HasVideo;
            }

            public int getUserId() {
                return UserId;
            }

            public void setUserId(int UserId) {
                this.UserId = UserId;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public List<TagsBean> getTags() {
                return Tags;
            }

            public void setTags(List<TagsBean> Tags) {
                this.Tags = Tags;
            }

            public static class TagsBean {
                /**
                 * Id : 288
                 * Name : 家常菜
                 */

                private int Id;
                private String Name;

                public int getId() {
                    return Id;
                }

                public void setId(int Id) {
                    this.Id = Id;
                }

                public String getName() {
                    return Name;
                }

                public void setName(String Name) {
                    this.Name = Name;
                }
            }
        }
    }
}
