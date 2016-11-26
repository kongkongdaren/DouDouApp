package com.yjlw.ddms.homeentity.entity;

import java.util.List;

/**
 * Simple to Introduction
 *
 * @Description: 商品评论实体类
 * @Author: 原海忠
 * @CreateDate: 2016/11/26
 * @Version: [v1.0]
 */
public class ProductCommentData {
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
             * Cid : 64758
             * UserId : 9763111
             * Avatar : http://avatar1.hoto.cn/27/f9/9763111_185.jpg?v=1
             * UserName : haodou9602630813
             * AtUserId : 0
             * AtUserName :
             * Content : 非常好吃，下次再来！
             * AtContent :
             * CreateTime : 6天前
             * Mark : 10
             * Gender : 2
             */

            private String Cid;
            private int UserId;
            private String Avatar;
            private String UserName;
            private String AtUserId;
            private String AtUserName;
            private String Content;
            private String AtContent;
            private String CreateTime;
            private String Mark;
            private int Gender;

            public String getCid() {
                return Cid;
            }

            public void setCid(String Cid) {
                this.Cid = Cid;
            }

            public int getUserId() {
                return UserId;
            }

            public void setUserId(int UserId) {
                this.UserId = UserId;
            }

            public String getAvatar() {
                return Avatar;
            }

            public void setAvatar(String Avatar) {
                this.Avatar = Avatar;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public String getAtUserId() {
                return AtUserId;
            }

            public void setAtUserId(String AtUserId) {
                this.AtUserId = AtUserId;
            }

            public String getAtUserName() {
                return AtUserName;
            }

            public void setAtUserName(String AtUserName) {
                this.AtUserName = AtUserName;
            }

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getAtContent() {
                return AtContent;
            }

            public void setAtContent(String AtContent) {
                this.AtContent = AtContent;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public String getMark() {
                return Mark;
            }

            public void setMark(String Mark) {
                this.Mark = Mark;
            }

            public int getGender() {
                return Gender;
            }

            public void setGender(int Gender) {
                this.Gender = Gender;
            }
        }
    }
}