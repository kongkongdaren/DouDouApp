package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：厨房名称 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月22  11:02
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class KitchenTitle {

    /**
     * status : 200
     * result : {"count":8,"list":[{"Id":"0","Name":"全部"},{"Id":"1","Name":"食材处理"},{"Id":"2","Name":"烹饪技巧"},{"Id":"3","Name":"厨房清洁"},{"Id":"4","Name":"自制类"},{"Id":"5","Name":"烘焙类"},{"Id":"6","Name":"白案类"},{"Id":"9999","Name":"其他"}]}
     * request_id : 573f5d566c612cec4ac94ab8ee9b1adf
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
         * count : 8
         * list : [{"Id":"0","Name":"全部"},{"Id":"1","Name":"食材处理"},{"Id":"2","Name":"烹饪技巧"},{"Id":"3","Name":"厨房清洁"},{"Id":"4","Name":"自制类"},{"Id":"5","Name":"烘焙类"},{"Id":"6","Name":"白案类"},{"Id":"9999","Name":"其他"}]
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
             * Id : 0
             * Name : 全部
             */

            private String Id;
            private String Name;

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
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
