package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：实体类<br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月25  20:39
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class HotRank {

    /**
     * status : 200
     * result : {"count":100,"list":[{"VideoId":"878407","Title":"芝心虾球","CommentCount":142,"DiggCount":2562,"PlayCount":66981,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/47/67/878407_3dd761.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=878407&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=878407&cid=0"},{"VideoId":"839025","Title":"番茄肉丸汤","CommentCount":146,"DiggCount":3239,"PlayCount":188925,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/71/cd/839025_7d57e2.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=839025&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=839025&cid=0"},{"VideoId":"853979","Title":"葱油藕片","CommentCount":201,"DiggCount":8441,"PlayCount":1040164,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/db/07/853979_70e76d.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=853979&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=853979&cid=0"},{"VideoId":"869935","Title":"炸素丸子","CommentCount":57,"DiggCount":1846,"PlayCount":146093,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/2f/46/869935_f709fb.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=869935&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=869935&cid=0"},{"VideoId":"886015","Title":"干锅千叶豆腐","CommentCount":56,"DiggCount":1179,"PlayCount":276624,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/ff/84/886015_4d6b30.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=886015&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=886015&cid=0"},{"VideoId":"837623","Title":"三汁排骨","CommentCount":174,"DiggCount":4502,"PlayCount":270430,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/f7/c7/837623_c0648b.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=837623&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=837623&cid=0"},{"VideoId":"867440","Title":"肉酿鸡蛋","CommentCount":85,"DiggCount":2272,"PlayCount":80454,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/70/3c/867440_c19628.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=867440&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=867440&cid=0"},{"VideoId":"943480","Title":"香脆油爆虾","CommentCount":62,"DiggCount":2217,"PlayCount":84124,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/78/65/943480_602cf7.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=943480&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=943480&cid=0"},{"VideoId":"900559","Title":"润肺止咳粥","CommentCount":67,"DiggCount":2768,"PlayCount":122386,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/cf/bd/900559_03fc1d.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=900559&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=900559&cid=0"},{"VideoId":"880831","Title":"椒香土豆丝","CommentCount":111,"DiggCount":2502,"PlayCount":160798,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/bf/70/880831_080e0a.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=880831&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=880831&cid=0"},{"VideoId":"853179","Title":"五味鸭","CommentCount":106,"DiggCount":1677,"PlayCount":291470,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/bb/04/853179_7be234.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=853179&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=853179&cid=0"},{"VideoId":"852925","Title":"素炒四宝","CommentCount":71,"DiggCount":1906,"PlayCount":202619,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/bd/03/852925_b768bc.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=852925&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=852925&cid=0"},{"VideoId":"878553","Title":"黄金腊味炒饭","CommentCount":67,"DiggCount":1062,"PlayCount":119701,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/d9/67/878553_b55d56.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=878553&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=878553&cid=0"},{"VideoId":"845143","Title":"酒鬼花生","CommentCount":69,"DiggCount":1184,"PlayCount":150372,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/57/e5/845143_941f30.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=845143&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=845143&cid=0"},{"VideoId":"900008","Title":"麻辣香锅","CommentCount":70,"DiggCount":1597,"PlayCount":98428,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/a8/bb/900008_8b3814.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=900008&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=900008&cid=0"},{"VideoId":"900610","Title":"白露黄金粥","CommentCount":41,"DiggCount":1461,"PlayCount":125877,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/02/be/900610_ba142b.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=900610&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=900610&cid=0"},{"VideoId":"938540","Title":"酸菜鱼","CommentCount":76,"DiggCount":1422,"PlayCount":115845,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/2c/52/938540_36e577.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=938540&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=938540&cid=0"},{"VideoId":"848694","Title":"拔丝香蕉","CommentCount":117,"DiggCount":1505,"PlayCount":102662,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/36/f3/848694_636971.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=848694&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=848694&cid=0"},{"VideoId":"851921","Title":"翠竹报春","CommentCount":126,"DiggCount":2198,"PlayCount":155322,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/d1/ff/851921_bca8ea.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=851921&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=851921&cid=0"},{"VideoId":"880741","Title":"佛手茄子","CommentCount":150,"DiggCount":2913,"PlayCount":257574,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/65/70/880741_449553.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=880741&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=880741&cid=0"}]}
     * request_id : 8dc3751366768740c53a41c83a6b6cbf
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
         * list : [{"VideoId":"878407","Title":"芝心虾球","CommentCount":142,"DiggCount":2562,"PlayCount":66981,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/47/67/878407_3dd761.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=878407&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=878407&cid=0"},{"VideoId":"839025","Title":"番茄肉丸汤","CommentCount":146,"DiggCount":3239,"PlayCount":188925,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/71/cd/839025_7d57e2.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=839025&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=839025&cid=0"},{"VideoId":"853979","Title":"葱油藕片","CommentCount":201,"DiggCount":8441,"PlayCount":1040164,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/db/07/853979_70e76d.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=853979&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=853979&cid=0"},{"VideoId":"869935","Title":"炸素丸子","CommentCount":57,"DiggCount":1846,"PlayCount":146093,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/2f/46/869935_f709fb.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=869935&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=869935&cid=0"},{"VideoId":"886015","Title":"干锅千叶豆腐","CommentCount":56,"DiggCount":1179,"PlayCount":276624,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/ff/84/886015_4d6b30.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=886015&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=886015&cid=0"},{"VideoId":"837623","Title":"三汁排骨","CommentCount":174,"DiggCount":4502,"PlayCount":270430,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/f7/c7/837623_c0648b.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=837623&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=837623&cid=0"},{"VideoId":"867440","Title":"肉酿鸡蛋","CommentCount":85,"DiggCount":2272,"PlayCount":80454,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/70/3c/867440_c19628.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=867440&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=867440&cid=0"},{"VideoId":"943480","Title":"香脆油爆虾","CommentCount":62,"DiggCount":2217,"PlayCount":84124,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/78/65/943480_602cf7.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=943480&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=943480&cid=0"},{"VideoId":"900559","Title":"润肺止咳粥","CommentCount":67,"DiggCount":2768,"PlayCount":122386,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/cf/bd/900559_03fc1d.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=900559&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=900559&cid=0"},{"VideoId":"880831","Title":"椒香土豆丝","CommentCount":111,"DiggCount":2502,"PlayCount":160798,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/bf/70/880831_080e0a.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=880831&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=880831&cid=0"},{"VideoId":"853179","Title":"五味鸭","CommentCount":106,"DiggCount":1677,"PlayCount":291470,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/bb/04/853179_7be234.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=853179&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=853179&cid=0"},{"VideoId":"852925","Title":"素炒四宝","CommentCount":71,"DiggCount":1906,"PlayCount":202619,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/bd/03/852925_b768bc.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=852925&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=852925&cid=0"},{"VideoId":"878553","Title":"黄金腊味炒饭","CommentCount":67,"DiggCount":1062,"PlayCount":119701,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/d9/67/878553_b55d56.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=878553&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=878553&cid=0"},{"VideoId":"845143","Title":"酒鬼花生","CommentCount":69,"DiggCount":1184,"PlayCount":150372,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/57/e5/845143_941f30.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=845143&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=845143&cid=0"},{"VideoId":"900008","Title":"麻辣香锅","CommentCount":70,"DiggCount":1597,"PlayCount":98428,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/a8/bb/900008_8b3814.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=900008&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=900008&cid=0"},{"VideoId":"900610","Title":"白露黄金粥","CommentCount":41,"DiggCount":1461,"PlayCount":125877,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/02/be/900610_ba142b.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=900610&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=900610&cid=0"},{"VideoId":"938540","Title":"酸菜鱼","CommentCount":76,"DiggCount":1422,"PlayCount":115845,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/2c/52/938540_36e577.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=938540&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=938540&cid=0"},{"VideoId":"848694","Title":"拔丝香蕉","CommentCount":117,"DiggCount":1505,"PlayCount":102662,"Cover":"http://recipe0.hoto.cn/pic/recipe/l/36/f3/848694_636971.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=848694&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=848694&cid=0"},{"VideoId":"851921","Title":"翠竹报春","CommentCount":126,"DiggCount":2198,"PlayCount":155322,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/d1/ff/851921_bca8ea.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=851921&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=851921&cid=0"},{"VideoId":"880741","Title":"佛手茄子","CommentCount":150,"DiggCount":2913,"PlayCount":257574,"Cover":"http://recipe1.hoto.cn/pic/recipe/l/65/70/880741_449553.jpg","IsDigg":0,"VideoUrl":"haodourecipe://haodou.com/recipe/info/?id=880741&video=1","Type":1,"CommentUrl":"haodourecipe://haodou.com/comment/list/?type=0&itemid=880741&cid=0"}]
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
             * VideoId : 878407
             * Title : 芝心虾球
             * CommentCount : 142
             * DiggCount : 2562
             * PlayCount : 66981
             * Cover : http://recipe1.hoto.cn/pic/recipe/l/47/67/878407_3dd761.jpg
             * IsDigg : 0
             * VideoUrl : haodourecipe://haodou.com/recipe/info/?id=878407&video=1
             * Type : 1
             * CommentUrl : haodourecipe://haodou.com/comment/list/?type=0&itemid=878407&cid=0
             */

            private String VideoId;
            private String Title;
            private int CommentCount;
            private int DiggCount;
            private int PlayCount;
            private String Cover;
            private int IsDigg;
            private String VideoUrl;
            private int Type;
            private String CommentUrl;

            public String getVideoId() {
                return VideoId;
            }

            public void setVideoId(String VideoId) {
                this.VideoId = VideoId;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public int getCommentCount() {
                return CommentCount;
            }

            public void setCommentCount(int CommentCount) {
                this.CommentCount = CommentCount;
            }

            public int getDiggCount() {
                return DiggCount;
            }

            public void setDiggCount(int DiggCount) {
                this.DiggCount = DiggCount;
            }

            public int getPlayCount() {
                return PlayCount;
            }

            public void setPlayCount(int PlayCount) {
                this.PlayCount = PlayCount;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
            }

            public int getIsDigg() {
                return IsDigg;
            }

            public void setIsDigg(int IsDigg) {
                this.IsDigg = IsDigg;
            }

            public String getVideoUrl() {
                return VideoUrl;
            }

            public void setVideoUrl(String VideoUrl) {
                this.VideoUrl = VideoUrl;
            }

            public int getType() {
                return Type;
            }

            public void setType(int Type) {
                this.Type = Type;
            }

            public String getCommentUrl() {
                return CommentUrl;
            }

            public void setCommentUrl(String CommentUrl) {
                this.CommentUrl = CommentUrl;
            }
        }
    }
}
