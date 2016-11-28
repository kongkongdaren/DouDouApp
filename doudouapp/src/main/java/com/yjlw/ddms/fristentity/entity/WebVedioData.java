package com.yjlw.ddms.fristentity.entity;

import java.util.List;

/**
 * Description：视频数据 <br/>
 * Copyright (c) 2016<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月28  16:52
 *
 * @author 姜文莒
 * @version : 1.0
 */

public class WebVedioData {

    /**
     * status : 200
     * result : {"Duration":123,"Size":2000,"Url":"http://v.hoto.cn/50/c1/901456.mp4?v=2","Steps":[{"Stepid":3755197,"Content":"首先将黄瓜切去头尾，隔一毫米连切五刀，第五刀切断，装入碗中，放两勺盐拌匀，腌制15分钟洗净。","Image":"http://recipe0.hoto.cn/pic/step/m/bd/4c/3755197.jpg","Point":20191,"StepDuration":5},{"Stepid":3755198,"Content":"干辣椒切节。","Image":"http://recipe0.hoto.cn/pic/step/m/be/4c/3755198.jpg","Point":49268,"StepDuration":5},{"Stepid":3755199,"Content":"锅中倒入油，下入花椒粒、干辣椒煸香，倒入适量清水，白醋，再加半勺白糖拌均匀，煮开后，倒入碗中，放凉。","Image":"http://recipe0.hoto.cn/pic/step/m/bf/4c/3755199.jpg","Point":58181,"StepDuration":5},{"Stepid":3755200,"Content":"准备好碟子，将切好的黄瓜装入碟中，淋入调好的碗汁，就制作完成啦！","Image":"http://recipe0.hoto.cn/pic/step/m/c0/4c/3755200.jpg","Point":88766,"StepDuration":5}]}
     * request_id : 34a68bb40872e008d0899546df8bf9b6
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
         * Duration : 123
         * Size : 2000
         * Url : http://v.hoto.cn/50/c1/901456.mp4?v=2
         * Steps : [{"Stepid":3755197,"Content":"首先将黄瓜切去头尾，隔一毫米连切五刀，第五刀切断，装入碗中，放两勺盐拌匀，腌制15分钟洗净。","Image":"http://recipe0.hoto.cn/pic/step/m/bd/4c/3755197.jpg","Point":20191,"StepDuration":5},{"Stepid":3755198,"Content":"干辣椒切节。","Image":"http://recipe0.hoto.cn/pic/step/m/be/4c/3755198.jpg","Point":49268,"StepDuration":5},{"Stepid":3755199,"Content":"锅中倒入油，下入花椒粒、干辣椒煸香，倒入适量清水，白醋，再加半勺白糖拌均匀，煮开后，倒入碗中，放凉。","Image":"http://recipe0.hoto.cn/pic/step/m/bf/4c/3755199.jpg","Point":58181,"StepDuration":5},{"Stepid":3755200,"Content":"准备好碟子，将切好的黄瓜装入碟中，淋入调好的碗汁，就制作完成啦！","Image":"http://recipe0.hoto.cn/pic/step/m/c0/4c/3755200.jpg","Point":88766,"StepDuration":5}]
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
             * Stepid : 3755197
             * Content : 首先将黄瓜切去头尾，隔一毫米连切五刀，第五刀切断，装入碗中，放两勺盐拌匀，腌制15分钟洗净。
             * Image : http://recipe0.hoto.cn/pic/step/m/bd/4c/3755197.jpg
             * Point : 20191
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
