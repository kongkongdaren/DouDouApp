package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：视频实体类 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月26  15:19
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class LookVideoData {

    /**
     * status : 200
     * result : {"Duration":143,"Size":2000,"Url":"http://v.hoto.cn/d3/07/853971.mp4?v=4","Steps":[{"Stepid":3488093,"Content":"首先将去皮土豆切成块，泡入清水，火腿肠切粒。","Image":"http://recipe0.hoto.cn/pic/step/m/5d/39/3488093.jpg","Point":31240,"StepDuration":5},{"Stepid":3488094,"Content":"将土豆放入蒸锅，隔水蒸十分钟，取出。","Image":"http://recipe0.hoto.cn/pic/step/m/5e/39/3488094.jpg","Point":66754,"StepDuration":5},{"Stepid":3488095,"Content":"将玉米粒、青豆，放入蒸锅，隔水蒸十分钟，取出。","Image":"http://recipe0.hoto.cn/pic/step/m/5f/39/3488095.jpg","Point":75885,"StepDuration":5},{"Stepid":3488096,"Content":"将土豆压成泥，放入火腿、青豆、玉米粒，挤入适量沙拉酱，再淋入少量牛奶，放入半勺盐，搅拌均匀，用模具压成心形，就可以享用了。","Image":"http://recipe0.hoto.cn/pic/step/m/60/39/3488096.jpg","Point":85882,"StepDuration":5}]}
     * request_id : 2423a314b9994fc56104be8f433394e1
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
         * Duration : 143
         * Size : 2000
         * Url : http://v.hoto.cn/d3/07/853971.mp4?v=4
         * Steps : [{"Stepid":3488093,"Content":"首先将去皮土豆切成块，泡入清水，火腿肠切粒。","Image":"http://recipe0.hoto.cn/pic/step/m/5d/39/3488093.jpg","Point":31240,"StepDuration":5},{"Stepid":3488094,"Content":"将土豆放入蒸锅，隔水蒸十分钟，取出。","Image":"http://recipe0.hoto.cn/pic/step/m/5e/39/3488094.jpg","Point":66754,"StepDuration":5},{"Stepid":3488095,"Content":"将玉米粒、青豆，放入蒸锅，隔水蒸十分钟，取出。","Image":"http://recipe0.hoto.cn/pic/step/m/5f/39/3488095.jpg","Point":75885,"StepDuration":5},{"Stepid":3488096,"Content":"将土豆压成泥，放入火腿、青豆、玉米粒，挤入适量沙拉酱，再淋入少量牛奶，放入半勺盐，搅拌均匀，用模具压成心形，就可以享用了。","Image":"http://recipe0.hoto.cn/pic/step/m/60/39/3488096.jpg","Point":85882,"StepDuration":5}]
         */

        private int Duration;
        private int Size;
        private String Url;
        private List<StepsBean> Steps;

        public int getDuration() {
            return Duration;
        }

        public void setDuration(int Duration) {
            this.Duration = Duration;
        }

        public int getSize() {
            return Size;
        }

        public void setSize(int Size) {
            this.Size = Size;
        }

        public String getUrl() {
            return Url;
        }

        public void setUrl(String Url) {
            this.Url = Url;
        }

        public List<StepsBean> getSteps() {
            return Steps;
        }

        public void setSteps(List<StepsBean> Steps) {
            this.Steps = Steps;
        }

        public static class StepsBean {
            /**
             * Stepid : 3488093
             * Content : 首先将去皮土豆切成块，泡入清水，火腿肠切粒。
             * Image : http://recipe0.hoto.cn/pic/step/m/5d/39/3488093.jpg
             * Point : 31240
             * StepDuration : 5
             */

            private int Stepid;
            private String Content;
            private String Image;
            private int Point;
            private int StepDuration;

            public int getStepid() {
                return Stepid;
            }

            public void setStepid(int Stepid) {
                this.Stepid = Stepid;
            }

            public String getContent() {
                return Content;
            }

            public void setContent(String Content) {
                this.Content = Content;
            }

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public int getPoint() {
                return Point;
            }

            public void setPoint(int Point) {
                this.Point = Point;
            }

            public int getStepDuration() {
                return StepDuration;
            }

            public void setStepDuration(int StepDuration) {
                this.StepDuration = StepDuration;
            }
        }
    }
}
