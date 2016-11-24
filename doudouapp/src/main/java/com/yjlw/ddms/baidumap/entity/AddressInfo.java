package com.yjlw.ddms.baidumap.entity;

/**
 * Simple to Introduction
 *
 * @Description: 地理位置信息实体类
 * @Author: 原海忠
 * @CreateDate: 2016/11/24
 * @Version: [v1.0]
 */
public class AddressInfo {

    /**
     * error_code : 0
     * reason : 成功
     * result : {"correctlongitude":116.403624,"correctlatitude":39.913248,
     * "Address":"北京市东城区普渡寺西巷东华门街道东华门东厂社区,北京税务博物馆西90米,普渡寺西巷西50米","province":"直辖市","city":"北京市",
     * "dist":"东城区","area":"普渡寺西巷","town":"东华门街道","village":"东华门东厂社区","poi":"北京税务博物馆",
     * "poitype":"博物馆/展览馆","direction":"西","distance":"90米","roadname":"普渡寺西巷",
     * "roadDirection":"西","roadDistance":"50米"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * correctlongitude : 116.403624
         * correctlatitude : 39.913248
         * Address : 北京市东城区普渡寺西巷东华门街道东华门东厂社区,北京税务博物馆西90米,普渡寺西巷西50米
         * province : 直辖市
         * city : 北京市
         * dist : 东城区
         * area : 普渡寺西巷
         * town : 东华门街道
         * village : 东华门东厂社区
         * poi : 北京税务博物馆
         * poitype : 博物馆/展览馆
         * direction : 西
         * distance : 90米
         * roadname : 普渡寺西巷
         * roadDirection : 西
         * roadDistance : 50米
         */

        private double correctlongitude;
        private double correctlatitude;
        private String Address;
        private String province;
        private String city;
        private String dist;
        private String area;
        private String town;
        private String village;
        private String poi;
        private String poitype;
        private String direction;
        private String distance;
        private String roadname;
        private String roadDirection;
        private String roadDistance;

        public double getCorrectlongitude() {
            return correctlongitude;
        }

        public void setCorrectlongitude(double correctlongitude) {
            this.correctlongitude = correctlongitude;
        }

        public double getCorrectlatitude() {
            return correctlatitude;
        }

        public void setCorrectlatitude(double correctlatitude) {
            this.correctlatitude = correctlatitude;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDist() {
            return dist;
        }

        public void setDist(String dist) {
            this.dist = dist;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getVillage() {
            return village;
        }

        public void setVillage(String village) {
            this.village = village;
        }

        public String getPoi() {
            return poi;
        }

        public void setPoi(String poi) {
            this.poi = poi;
        }

        public String getPoitype() {
            return poitype;
        }

        public void setPoitype(String poitype) {
            this.poitype = poitype;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getRoadname() {
            return roadname;
        }

        public void setRoadname(String roadname) {
            this.roadname = roadname;
        }

        public String getRoadDirection() {
            return roadDirection;
        }

        public void setRoadDirection(String roadDirection) {
            this.roadDirection = roadDirection;
        }

        public String getRoadDistance() {
            return roadDistance;
        }

        public void setRoadDistance(String roadDistance) {
            this.roadDistance = roadDistance;
        }
    }
}