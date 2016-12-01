package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：xx <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年12月01  19:11
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class FoodData {

    /**
     * status : 200
     * result : {"food":{"Id":0,"Name":"","Intro":"","Cover":""},"count":782,"list":[{"RecipeId":880831,"Title":"椒香土豆丝","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/bf/70/880831_080e0a.jpg","ViewCount":259421,"LikeCount":2568,"FavoriteCount":13336,"Stuff":"土豆、青椒、紫甘蓝、胡萝卜、干辣椒、花椒粒、生抽、白糖、盐、陈醋、麻油","HasVideo":1,"Duration":"播放时长 03:52","Collection":"播放时长 03:52"},{"RecipeId":849372,"Title":"晶心土豆泥","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/dc/f5/849372_fcf60b.jpg","ViewCount":36511,"LikeCount":851,"FavoriteCount":4503,"Stuff":"土豆、盐、胡萝卜、黄瓜、番茄酱、生抽、白糖、水淀粉","HasVideo":1,"Duration":"播放时长 03:24","Collection":"播放时长 03:24"},{"RecipeId":1009914,"Title":"苹果小天鹅","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/fa/68/1009914_6c7a5e.jpg","ViewCount":30781,"LikeCount":463,"FavoriteCount":2239,"Stuff":"苹果、无","HasVideo":1,"Duration":"播放时长 00:49","Collection":"播放时长 00:49"},{"RecipeId":329708,"Title":"胭脂冬瓜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/ec/07/329708_7497cc.jpg","ViewCount":1148433,"LikeCount":24905,"FavoriteCount":39864,"Stuff":"冬瓜、苋菜、蜂蜜","HasVideo":0,"Duration":"","Collection":"39864收藏   1148433浏览"},{"RecipeId":283006,"Title":"香菇油菜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/7e/51/283006_840d14.jpg","ViewCount":606905,"LikeCount":20205,"FavoriteCount":44712,"Stuff":"油菜、香菇、猪肉、大蒜、姜、老抽、精盐、味精","HasVideo":0,"Duration":"","Collection":"44712收藏   606905浏览"},{"RecipeId":326177,"Title":"蜂蜜柠檬水","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/21/fa/326177_9ca03f.jpg","ViewCount":652478,"LikeCount":19503,"FavoriteCount":45464,"Stuff":"蜂蜜、柠檬、盐","HasVideo":0,"Duration":"","Collection":"45464收藏   652478浏览"},{"RecipeId":290812,"Title":"金针菇海带汤","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/fc/6f/290812_9ffed0.jpg","ViewCount":691921,"LikeCount":17293,"FavoriteCount":43758,"Stuff":"海带丝、金针菇、胡萝卜、油、盐、鲜辣粉、鸡精、香菜","HasVideo":0,"Duration":"","Collection":"43758收藏   691921浏览"},{"RecipeId":306478,"Title":"减肥茶","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/2e/ad/306478_94f05b.jpg","ViewCount":280896,"LikeCount":14496,"FavoriteCount":28187,"Stuff":"洛神花、干山楂、荷叶、普洱茶、开水","HasVideo":0,"Duration":"","Collection":"28187收藏   280896浏览"},{"RecipeId":281501,"Title":"苹果酱","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/9d/4b/281501_284df4.jpg","ViewCount":207101,"LikeCount":13464,"FavoriteCount":23108,"Stuff":"苹果、柠檬","HasVideo":0,"Duration":"","Collection":"23108收藏   207101浏览"},{"RecipeId":295136,"Title":"苹果小米粥","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/e0/80/295136_cf398a.jpg","ViewCount":334647,"LikeCount":13130,"FavoriteCount":26262,"Stuff":"苹果、小米、水","HasVideo":0,"Duration":"","Collection":"26262收藏   334647浏览"},{"RecipeId":269047,"Title":"苹果莲子炖银耳","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/f7/1a/269047_581f41.jpg","ViewCount":250740,"LikeCount":10774,"FavoriteCount":15584,"Stuff":"银耳、苹果、莲子、枸杞子、黄冰糖","HasVideo":0,"Duration":"","Collection":"15584收藏   250740浏览"},{"RecipeId":336444,"Title":"芹菜炒鸡蛋","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/3c/22/336444_1e7234.jpg","ViewCount":238172,"LikeCount":9631,"FavoriteCount":22319,"Stuff":"芹菜、鸡蛋、油、盐、小辣椒、料酒、糖、葱、花椒、香油","HasVideo":0,"Duration":"","Collection":"22319收藏   238172浏览"},{"RecipeId":297431,"Title":"柠檬茶","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/d7/89/297431_f454da.jpg","ViewCount":206430,"LikeCount":9330,"FavoriteCount":18519,"Stuff":"立顿红茶、柠檬、冰糖、水、冰块","HasVideo":0,"Duration":"","Collection":"18519收藏   206430浏览"},{"RecipeId":277311,"Title":"酸辣黑木耳","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/3f/3b/277311_6ddf62.jpg","ViewCount":207446,"LikeCount":9199,"FavoriteCount":20166,"Stuff":"黑木耳、油、盐、青辣椒、红辣椒、生姜、酱油、陈醋、料酒、白糖","HasVideo":0,"Duration":"","Collection":"20166收藏   207446浏览"},{"RecipeId":326179,"Title":"苹果豆浆","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/23/fa/326179_5f6909.jpg","ViewCount":291579,"LikeCount":8928,"FavoriteCount":18290,"Stuff":"黄豆、苹果、白砂糖","HasVideo":0,"Duration":"","Collection":"18290收藏   291579浏览"},{"RecipeId":310605,"Title":"炝拌海带丝","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/4d/bd/310605_385523.jpg","ViewCount":261554,"LikeCount":8173,"FavoriteCount":22982,"Stuff":"海带、油、盐、红辣椒、蒜籽、芝麻、老抽、白糖、芝麻油、香醋","HasVideo":0,"Duration":"","Collection":"22982收藏   261554浏览"},{"RecipeId":322806,"Title":"花生拌芹菜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/f6/ec/322806_05639b.jpg","ViewCount":306439,"LikeCount":7954,"FavoriteCount":17413,"Stuff":"花生仁、芹菜、香油、盐、蒸鱼豉油、香醋、白糖、鸡精、大料、生姜汁","HasVideo":0,"Duration":"","Collection":"17413收藏   306439浏览"},{"RecipeId":290048,"Title":"酸辣黄瓜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/00/6d/290048_4e2c44.jpg","ViewCount":154254,"LikeCount":7988,"FavoriteCount":15398,"Stuff":"黄瓜、盐、白醋、花椒油、剁椒","HasVideo":0,"Duration":"","Collection":"15398收藏   154254浏览"},{"RecipeId":336949,"Title":"苹果汤","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/35/24/336949_4e3728.jpg","ViewCount":248167,"LikeCount":7482,"FavoriteCount":17216,"Stuff":"苹果、蜂蜜、枸杞","HasVideo":0,"Duration":"","Collection":"17216收藏   248167浏览"},{"RecipeId":325196,"Title":"紫薯木瓜布丁","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/4c/f6/325196_04dad5.jpg","ViewCount":126351,"LikeCount":6787,"FavoriteCount":13575,"Stuff":"木瓜、紫薯、牛奶、白砂糖、吉利丁片","HasVideo":0,"Duration":"","Collection":"13575收藏   126351浏览"}]}
     * request_id : d02442e1c9c40888f334f993bfda574c
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
         * food : {"Id":0,"Name":"","Intro":"","Cover":""}
         * count : 782
         * list : [{"RecipeId":880831,"Title":"椒香土豆丝","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/bf/70/880831_080e0a.jpg","ViewCount":259421,"LikeCount":2568,"FavoriteCount":13336,"Stuff":"土豆、青椒、紫甘蓝、胡萝卜、干辣椒、花椒粒、生抽、白糖、盐、陈醋、麻油","HasVideo":1,"Duration":"播放时长 03:52","Collection":"播放时长 03:52"},{"RecipeId":849372,"Title":"晶心土豆泥","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/dc/f5/849372_fcf60b.jpg","ViewCount":36511,"LikeCount":851,"FavoriteCount":4503,"Stuff":"土豆、盐、胡萝卜、黄瓜、番茄酱、生抽、白糖、水淀粉","HasVideo":1,"Duration":"播放时长 03:24","Collection":"播放时长 03:24"},{"RecipeId":1009914,"Title":"苹果小天鹅","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/fa/68/1009914_6c7a5e.jpg","ViewCount":30781,"LikeCount":463,"FavoriteCount":2239,"Stuff":"苹果、无","HasVideo":1,"Duration":"播放时长 00:49","Collection":"播放时长 00:49"},{"RecipeId":329708,"Title":"胭脂冬瓜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/ec/07/329708_7497cc.jpg","ViewCount":1148433,"LikeCount":24905,"FavoriteCount":39864,"Stuff":"冬瓜、苋菜、蜂蜜","HasVideo":0,"Duration":"","Collection":"39864收藏   1148433浏览"},{"RecipeId":283006,"Title":"香菇油菜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/7e/51/283006_840d14.jpg","ViewCount":606905,"LikeCount":20205,"FavoriteCount":44712,"Stuff":"油菜、香菇、猪肉、大蒜、姜、老抽、精盐、味精","HasVideo":0,"Duration":"","Collection":"44712收藏   606905浏览"},{"RecipeId":326177,"Title":"蜂蜜柠檬水","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/21/fa/326177_9ca03f.jpg","ViewCount":652478,"LikeCount":19503,"FavoriteCount":45464,"Stuff":"蜂蜜、柠檬、盐","HasVideo":0,"Duration":"","Collection":"45464收藏   652478浏览"},{"RecipeId":290812,"Title":"金针菇海带汤","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/fc/6f/290812_9ffed0.jpg","ViewCount":691921,"LikeCount":17293,"FavoriteCount":43758,"Stuff":"海带丝、金针菇、胡萝卜、油、盐、鲜辣粉、鸡精、香菜","HasVideo":0,"Duration":"","Collection":"43758收藏   691921浏览"},{"RecipeId":306478,"Title":"减肥茶","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/2e/ad/306478_94f05b.jpg","ViewCount":280896,"LikeCount":14496,"FavoriteCount":28187,"Stuff":"洛神花、干山楂、荷叶、普洱茶、开水","HasVideo":0,"Duration":"","Collection":"28187收藏   280896浏览"},{"RecipeId":281501,"Title":"苹果酱","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/9d/4b/281501_284df4.jpg","ViewCount":207101,"LikeCount":13464,"FavoriteCount":23108,"Stuff":"苹果、柠檬","HasVideo":0,"Duration":"","Collection":"23108收藏   207101浏览"},{"RecipeId":295136,"Title":"苹果小米粥","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/e0/80/295136_cf398a.jpg","ViewCount":334647,"LikeCount":13130,"FavoriteCount":26262,"Stuff":"苹果、小米、水","HasVideo":0,"Duration":"","Collection":"26262收藏   334647浏览"},{"RecipeId":269047,"Title":"苹果莲子炖银耳","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/f7/1a/269047_581f41.jpg","ViewCount":250740,"LikeCount":10774,"FavoriteCount":15584,"Stuff":"银耳、苹果、莲子、枸杞子、黄冰糖","HasVideo":0,"Duration":"","Collection":"15584收藏   250740浏览"},{"RecipeId":336444,"Title":"芹菜炒鸡蛋","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/3c/22/336444_1e7234.jpg","ViewCount":238172,"LikeCount":9631,"FavoriteCount":22319,"Stuff":"芹菜、鸡蛋、油、盐、小辣椒、料酒、糖、葱、花椒、香油","HasVideo":0,"Duration":"","Collection":"22319收藏   238172浏览"},{"RecipeId":297431,"Title":"柠檬茶","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/d7/89/297431_f454da.jpg","ViewCount":206430,"LikeCount":9330,"FavoriteCount":18519,"Stuff":"立顿红茶、柠檬、冰糖、水、冰块","HasVideo":0,"Duration":"","Collection":"18519收藏   206430浏览"},{"RecipeId":277311,"Title":"酸辣黑木耳","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/3f/3b/277311_6ddf62.jpg","ViewCount":207446,"LikeCount":9199,"FavoriteCount":20166,"Stuff":"黑木耳、油、盐、青辣椒、红辣椒、生姜、酱油、陈醋、料酒、白糖","HasVideo":0,"Duration":"","Collection":"20166收藏   207446浏览"},{"RecipeId":326179,"Title":"苹果豆浆","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/23/fa/326179_5f6909.jpg","ViewCount":291579,"LikeCount":8928,"FavoriteCount":18290,"Stuff":"黄豆、苹果、白砂糖","HasVideo":0,"Duration":"","Collection":"18290收藏   291579浏览"},{"RecipeId":310605,"Title":"炝拌海带丝","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/4d/bd/310605_385523.jpg","ViewCount":261554,"LikeCount":8173,"FavoriteCount":22982,"Stuff":"海带、油、盐、红辣椒、蒜籽、芝麻、老抽、白糖、芝麻油、香醋","HasVideo":0,"Duration":"","Collection":"22982收藏   261554浏览"},{"RecipeId":322806,"Title":"花生拌芹菜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/f6/ec/322806_05639b.jpg","ViewCount":306439,"LikeCount":7954,"FavoriteCount":17413,"Stuff":"花生仁、芹菜、香油、盐、蒸鱼豉油、香醋、白糖、鸡精、大料、生姜汁","HasVideo":0,"Duration":"","Collection":"17413收藏   306439浏览"},{"RecipeId":290048,"Title":"酸辣黄瓜","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/00/6d/290048_4e2c44.jpg","ViewCount":154254,"LikeCount":7988,"FavoriteCount":15398,"Stuff":"黄瓜、盐、白醋、花椒油、剁椒","HasVideo":0,"Duration":"","Collection":"15398收藏   154254浏览"},{"RecipeId":336949,"Title":"苹果汤","Cover":"http://recipe1.hoto.cn/pic/recipe/g_230/35/24/336949_4e3728.jpg","ViewCount":248167,"LikeCount":7482,"FavoriteCount":17216,"Stuff":"苹果、蜂蜜、枸杞","HasVideo":0,"Duration":"","Collection":"17216收藏   248167浏览"},{"RecipeId":325196,"Title":"紫薯木瓜布丁","Cover":"http://recipe0.hoto.cn/pic/recipe/g_230/4c/f6/325196_04dad5.jpg","ViewCount":126351,"LikeCount":6787,"FavoriteCount":13575,"Stuff":"木瓜、紫薯、牛奶、白砂糖、吉利丁片","HasVideo":0,"Duration":"","Collection":"13575收藏   126351浏览"}]
         */

        private FoodBean food;
        private int count;
        private List<ListBean> list;

        public FoodBean getFood() {
            return food;
        }

        public void setFood(FoodBean food) {
            this.food = food;
        }

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

        public static class FoodBean {
            /**
             * Id : 0
             * Name :
             * Intro :
             * Cover :
             */

            private int Id;
            private String Name;
            private String Intro;
            private String Cover;

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

            public String getIntro() {
                return Intro;
            }

            public void setIntro(String Intro) {
                this.Intro = Intro;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
            }
        }

        public static class ListBean {
            /**
             * RecipeId : 880831
             * Title : 椒香土豆丝
             * Cover : http://recipe1.hoto.cn/pic/recipe/g_230/bf/70/880831_080e0a.jpg
             * ViewCount : 259421
             * LikeCount : 2568
             * FavoriteCount : 13336
             * Stuff : 土豆、青椒、紫甘蓝、胡萝卜、干辣椒、花椒粒、生抽、白糖、盐、陈醋、麻油
             * HasVideo : 1
             * Duration : 播放时长 03:52
             * Collection : 播放时长 03:52
             */

            private int RecipeId;
            private String Title;
            private String Cover;
            private int ViewCount;
            private int LikeCount;
            private int FavoriteCount;
            private String Stuff;
            private int HasVideo;
            private String Duration;
            private String Collection;

            public int getRecipeId() {
                return RecipeId;
            }

            public void setRecipeId(int RecipeId) {
                this.RecipeId = RecipeId;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
            }

            public int getViewCount() {
                return ViewCount;
            }

            public void setViewCount(int ViewCount) {
                this.ViewCount = ViewCount;
            }

            public int getLikeCount() {
                return LikeCount;
            }

            public void setLikeCount(int LikeCount) {
                this.LikeCount = LikeCount;
            }

            public int getFavoriteCount() {
                return FavoriteCount;
            }

            public void setFavoriteCount(int FavoriteCount) {
                this.FavoriteCount = FavoriteCount;
            }

            public String getStuff() {
                return Stuff;
            }

            public void setStuff(String Stuff) {
                this.Stuff = Stuff;
            }

            public int getHasVideo() {
                return HasVideo;
            }

            public void setHasVideo(int HasVideo) {
                this.HasVideo = HasVideo;
            }

            public String getDuration() {
                return Duration;
            }

            public void setDuration(String Duration) {
                this.Duration = Duration;
            }

            public String getCollection() {
                return Collection;
            }

            public void setCollection(String Collection) {
                this.Collection = Collection;
            }
        }
    }
}
