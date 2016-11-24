package com.yjlw.ddms.common;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/16
 * @Version: [v1.0]
 */
public class Constant {
    //第一页
    public static String ONE_PAGE = "http://hop.haodou.com/hop/router/rest.json?action=front" + "" +
            ".get_index";
    /*
    params.addBodyParameter("_HOP_", "{\"sign\":\"3b92baa726f98229c2f8f6e12d87156c\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479478619," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        params.addBodyParameter("appid", "2");
        params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        params.addBodyParameter("channel", "anzhi_v6115");
        params.addBodyParameter("deviceid", "haodou864394010609719");
        params.addBodyParameter("from", "android");
        params.addBodyParameter("ip", "172.16.152.15");
        params.addBodyParameter("limit", "30");
        params.addBodyParameter("loguid", "0");
        params.addBodyParameter("network", "WIFI");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("vc", "105");
        params.addBodyParameter("virtual", "0");
        params.addBodyParameter("vn", "6.1.15");
     */
    /**
     * 热门菜谱——全部
     */
    public static String SECOND_PAGE_ALLPOPULARRECIPES = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479717441077&vc=105&vn=" +
            "6.1.15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Recipe" +
            ".getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=" +
            "1479721611&nonce=0.9624307813269698&appsign=4fbbb621ceeca881c7364dd24a0aa160";

    /*
    params.addBodyParameter("limit", "10");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8
    %E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81
    %E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4
    %BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96
    %B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84
    %E7%83%98%E7%84%99");
    params.addBodyParameter("type", "热门菜谱");
    */


    /**
     * 私人定制
     */
    public static String SECOND_PAGE_PERSONAL = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Recipe" +
            ".getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479281795&nonce=0" +
            ".04525211217014302&appsign=4fd8401267e12aa9f84830bf7d63ad1c";
/*

    params.addBodyParameter("limit", "10");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8
    %E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81
    %E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4
    %BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96
    %B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84
    %E7%83%98%E7%84%99");
    params.addBodyParameter("type", "私人定制");
*/

    /**
     * 时令佳肴
     */
    public static String SECOND_PAGE_SEASONALDELICACIES = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Recipe" +
            ".getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479281950&nonce=0" +
            ".3066288579344767&appsign=423c6ead5b1f3e56f16f5d74ba05ee41";
/*

    params.addBodyParameter("limit", "10");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8
    %E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81
    %E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4
    %BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96
    %B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84
    %E7%83%98%E7%84%99");
    params.addBodyParameter("type", "时令佳肴");
*/

    /**
     * 达人菜谱
     */
    public static String SECOND_PAGE_TALENTMENU = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Recipe" +
            ".getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479282011&nonce=0" +
            ".6522691127321063&appsign=a3e8d8843aeee6901d234befe824b04a";
/*

    params.addBodyParameter("limit", "10");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8
    %E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81
    %E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4
    %BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96
    %B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84
    %E7%83%98%E7%84%99");
    params.addBodyParameter("type", "达人菜谱");
*/

    /**
     * 最新
     */
    public static String SECOND_PAGE_NEWEST = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Recipe" +
            ".getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479282095&nonce=0" +
            ".1702502076398157&appsign=b37f725776234e75d34928c313f32d72";
/*

    params.addBodyParameter("limit", "10");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8
    %E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81
    %E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4
    %BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96
    %B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84
    %E7%83%98%E7%84%99");
    params.addBodyParameter("type", "快乐的烘焙");

*/

    /**
     * 烘焙
     */
    public static String SECOND_PAGE_BAKE = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Recipe" +
            ".getCollectRecomment&virtual=&signmethod=md5&v=3&timestamp=1479282162&nonce=0" +
            ".8487476487768089&appsign=43dc3dd2c5eacb274ac647e117c241c8";

  /*  params.addBodyParameter("limit", "10");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8
    %E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81
    %E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4
    %BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96
    %B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84
    %E7%83%98%E7%84%99");
    params.addBodyParameter("type", "快乐的烘焙");

*/

    /**
     * 看视频
     */
    public static String SECOND_PAGE_VIDEO = "http://api.haodou.com/index.php?appid=" +
            "2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=147997375" +
            "4144&vc=105&vn=6.1.15&loguid=10282642&deviceid=haodou864394010609719&uuid" +
            "=4d026196b079f72c6ee96157c0c65d62&channel=anzhi_v6115&method=Video.index&" +
            "virtual=&signmethod=md5&v=3&timestamp=1479974587&nonce=0.3768255077715191" +
            "3&appsign=3549e8ecc515ec606543607f7b2d8e35";
/*

    params.addBodyParameter("sign", "df04ef8cf3aab201ce09175f64129ac4");
    params.addBodyParameter("uid", "10282642");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/Video/index/");
*/

    /**
     * 热门排行榜
     */
    public static String SECOND_PAGE_BILLBOARD = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Video" +
            ".getHotRankList&virtual=&signmethod=md5&v=3&timestamp=1479283741&nonce=0" +
            ".3839005293377159&appsign=6d46ac40e20c13334e1cb9917ee29808";

   /*
   params.addBodyParameter("limit", "20");

    params.addBodyParameter("offset", "0");
*/

    /**
     * 新手课堂
     */
    public static String SECOND_PAGE_FRESHCLASSROOM = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Video" +
            ".getNoviceVideoList&virtual=&signmethod=md5&v=3&timestamp=1479283861&nonce=0" +
            ".13536424168014372&appsign=1735cd899c6cd8755528adbd7ebc4ebd";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("type", "");
*/
    /**
     * 全部
     */
    public static String AllKitchen = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479783090186&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010609719&uuid=4d026196b079f72c6ee96157c0c65d62" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getTagList&virtual=&signmethod=md5&v=3&timestamp=1479783266&nonce=0" +
            ".32540721725438126&appsign=a34e4df8cffc46c1da23c1e731d12fb2";

    /**
     * 厨房宝典--全部
     */
    public static String SECOND_PAGE_KITCHEN = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479282330&nonce=0" +
            ".49691559467466084&appsign=da71a43ce024fa0c6da20020d6239f0e";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("tagid", "0");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
    params.addBodyParameter("type", "");
*/


    /**
     * 厨房宝典--食材处理
     */
    public static String SECOND_PAGE_FOODPROCESSING = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479284558&nonce=0" +
            ".9067188543176985&appsign=a714273c0e69eb37f1efdfeeae2daae3";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("tagid", "1");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
    params.addBodyParameter("type", "1");

*/

    /**
     * 厨房宝典--烹饪技巧
     */
    public static String SECOND_PAGE_COOKINGSKILL = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479284680&nonce=0" +
            ".6202078794991929&appsign=1fdd27ef6a469d888b4350f6a1ab6072";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("tagid", "2");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
    params.addBodyParameter("type", "1");
*/


    /**
     * 厨房宝典--厨房清洁
     */
    public static String SECOND_PAGE_KITCHENCLEAN = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479284930&nonce=0" +
            ".5113618157616097&appsign=f2f28baf2ef287b787405d4dfe8a2657";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("tagid", "3");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
    params.addBodyParameter("type", "1");
*/


    /**
     * 厨房宝典--自制类
     */
    public static String SECOND_PAGE_HOMEMADE = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479284973&nonce=0" +
            ".9680693844881205&appsign=7c5369155a8921e35a8feb65d6997ef9";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("tagid", "4");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
    params.addBodyParameter("type", "1");

*/

    /**
     * 厨房宝典--烘焙类
     */
    public static String SECOND_PAGE_BAKERY = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479285013&nonce=0" +
            ".4259961679999549&appsign=671810ed0aed949b0a549821199db2e1";
/*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("tagid", "5");
    params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
    params.addBodyParameter("type", "1");
*/

    //（7）白案类
    public static String ONE_PAGE_KITCHEN_CABBAGE = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479285054&nonce=0" +
            ".5357170187133216&appsign=7b873bcbcaac739ab4772778203c3529";
    /*
    params.addBodyParameter("limit", "20");
      params.addBodyParameter("tagid", "6");
      params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
      params.addBodyParameter("offset", "0");
      params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
     params.addBodyParameter("type", "1");

     */

    //(8)其他
    public static String ONE_PAGE_KITCHEN_REST = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Wiki" +
            ".getListByType&virtual=&signmethod=md5&v=3&timestamp=1479285114&nonce=0" +
            ".6397189639810812&appsign=716baef7fbba4789e33ae7c0df4ec54a";
    /*
    params.addBodyParameter("limit", "20");
      params.addBodyParameter("tagid", "9999");
      params.addBodyParameter("uuid", "b3b08f17bca548949af2ddc9c88e65f5");
      params.addBodyParameter("offset", "0");
      params.addBodyParameter("appqs", "haodourecipe://haodou.com/wiki/list/");
     params.addBodyParameter("type", "1");


     */

    //热门活动Popular activities
    public static String ONE_PAGE_POPLAR_ACTIVITIES = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Event" +
            ".getOfficialList&virtual=&signmethod=md5&v=3&timestamp=1479282449&nonce=0" +
            ".9288975154485442&appsign=699c550889ded47ea747a729c1c8e0e3";
    /*
      params.addBodyParameter("limit", "20");
      params.addBodyParameter("offset", "0");
      params.addBodyParameter("appqs", "haodourecipe://haodou.com/latestactive/official/");
     */
    //菜谱分类MenuTypeTbl
    public static String ONE_PAGE_MENU_TYPE_TB = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format" +
            "=json&sessionid=1479805147084&vc=105&vn=6.1.15&loguid=10282642&deviceid=" +
            "haodou864394010609719&uuid=4d026196b079f72c6ee96157c0c65d62&channel=anzhi_v6115&" +
            "method=Search.getCateList&virtual=&signmethod=md5&v=3&timestamp=1479807284&nonce" +
            "=0.43069921176733694&appsign=06e76e126a8252a7362cf1490f69a65d";

    //第二页
    public static String SECOND_PAGE = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479396927723&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010208983&uuid=9ea70fa9356586ff23fc31785f735cf1" +
            "&channel=anzhi_v6115&method=idx" +
            ".index&virtual=&signmethod=md5&v=3&timestamp=1479396959&nonce=0" +
            ".30644972952250704&appsign=f0780f99aced145e3c4a4f7b1b740cd9";
    /*
        params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("sign", "");
        params.addBodyParameter("uid", "0");
        params.addBodyParameter("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        params.addBodyParameter("Latitude", "39.913249");
        params.addBodyParameter("Longitude", "116.403625");*/

    //每日特价
    public static String SECOND_PAGE_EVERY_MONEY = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277035882&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010208983&uuid=9ea70fa9356586ff23fc31785f735cf1" +
            "&channel=anzhi_v6115&method=collect" +
            ".goodslist&virtual=&signmethod=md5&v=3&timestamp=1479277828&nonce=0" +
            ".8308872100883995&appsign=4a9636f464f1c68ef7ce9baef071e62e";
    /*
      params.addBodyParameter("limit", "20");
        params.addBodyParameter("offset", "0");
         params.addBodyParameter("appqs", "haodourecipe://haodou.com/goods/subjectlist/?id=173");
          params.addBodyParameter("Id", "173");
   */

    //美食研究所
    public static String SECOND_PAGE_CATE = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479279033687&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010208983&uuid=9ea70fa9356586ff23fc31785f735cf1" +
            "&channel=anzhi_v6115&method=idx" +
            ".recommend-goods-list&virtual=&signmethod=md5&v=3&timestamp=1479279048&nonce=0" +
            ".5151553328171652&appsign=42d9ffdfdcff1d0697b93b5e26eeb193";
    /*
    params.addBodyParameter("limit", "20");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("appqs", "haodourecipe://haodou.com/goods/dailyfirst?type=new");
    params.addBodyParameter("Latitude", "39.913249");
    params.addBodyParameter("Longitude", "116.403625");
    params.addBodyParameter("offset", "0");
     params.addBodyParameter("type", "new");

*/
    //家传秘制The family secret
    public static String SECOND_PAGE_THE_FAMILY_SECRET = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479870087749&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010208983&uuid=9ea70fa9356586ff23fc31785f735cf1" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479870188&nonce=0" +
            ".4716946057340825&appsign=50bc09b3a509aca7bfb3d63f84e5d191";


    /*
   params.addBodyParameter("limit", "20");
           params.addBodyParameter("sign", "");
           params.addBodyParameter("uid", "0");
           params.addBodyParameter("CateId", "58");
           params.addBodyParameter("Keyword", "");
           params.addBodyParameter("appqs", "haodourecipe://haodou.com/goods/searchResult/?CateId=58&CateName=家传秘制");
           params.addBodyParameter("Latitude", "38.945562");
           params.addBodyParameter("Longitude", "100.45229");
           params.addBodyParameter("offset", "0");
            params.addBodyParameter("TagId", "0");

    */
    //肉禽蛋类：meats
    public static String SECOND_PAGE_MEATS = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479279700&nonce=0" +
            ".14444144479268772&appsign=a36963770b0f8bdf6f653b829cbe3785";
    /*
      params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
              params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "59");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=59&CateName=肉禽蛋类");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
       */
    //烘焙面点：Baked pastry
    public static String SECOND_PAGE_BAKEDPASTRY = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479279968&nonce=0" +
            ".9878166233622162&appsign=05b873960dd2a15929c7edb79a141a7c";
    /*
   params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
              params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "60");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=60&CateName=烘焙面点");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
 */
    //水产海鲜：Aquaculture seafood
    public static String SECOND_PAGE_AQUACULTURE_SEAFOOD = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280048&nonce=0" +
            ".7792609414277955&appsign=155ac2b84c082d881399e7aadaa7df0d";
    /*
    params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
              params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "61");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=61&CateName=水产海鲜");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
     */
    //    腌腊制品：
    public static String SECOND_PAGE_GASES = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280135&nonce=0" +
            ".7317031904829395&appsign=de8b39c3d9198cd9639be2874162cd73";
    /*
             params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
             params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "62");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=62&CateName=腌腊制品");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
     */
    //调味酱料
    public static String SECOND_PAGE_SAUCE = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280237&nonce=0" +
            ".5630484971619425&appsign=013e53219e87c6bc91a5022a6ee2b8f1";
    /*
    params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
             params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "63");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=63&CateName=调味酱料");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
     */
    //养生养颜：
    public static String SECOND_PAGE_KEEPING = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280317&nonce=0" +
            ".28764542139279037&appsign=c8c15986357b0de9dcd3f976cc2d620f";
    /*
      params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
             params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "64");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=64&CateName=养生养颜");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
     */
    //小吃零嘴：
    public static String SECOND_PAGE_SMALL = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280391&nonce=0" +
            ".8310787587730922&appsign=bed45c6037ff057314f0998663b254c5";
    /*
     params.addBodyParameter("limit", "20");
              params.addBodyParameter("sign", "");
             params.addBodyParameter("uid", "0");
              params.addBodyParameter("CateId", "65");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=65&CateName=小吃零嘴");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
     */
    //冲调饮品Mixing drinks
    public static String SECOND_PAGE_MIXING_DRINKS = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280480&nonce=0" +
            ".05616985901922278&appsign=26dd30b9300e4acac942b5d5f0d9c420";
    /*
                params.addBodyParameter("sign", "");
                params.addBodyParameter("uid", "0");
               params.addBodyParameter("CateId", "66");
              params.addBodyParameter("Keyword", "");
              params.addBodyParameter("appqs", "haodourecipe://haodou
              .com/goods/searchResult/?CateId=66&CateName=冲调饮品");
              params.addBodyParameter("Latitude", "39.913249");
              params.addBodyParameter("Longitude", "116.403625");
               params.addBodyParameter("TagId", "0");
              params.addBodyParameter("offset", "0");
     */
    /**
     * 小吃零嘴
     */
    public static String SECOND_PAGE_SMALLNIBBLE = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280391&nonce=0" +
            ".8310787587730922&appsign=bed45c6037ff057314f0998663b254c5";
    /*

    params.addBodyParameter("limit", "20");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("CateId", "65");
    params.addBodyParameter("Keyword", "");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/goods/searchResult/?CateId=65&CateName=小吃零嘴");
    params.addBodyParameter("Latitude", "39.913249");
    params.addBodyParameter("Longitude", "116.403625");
    params.addBodyParameter("TagId", "0");
    params.addBodyParameter("offset", "0");
     */
    /**
     * 养生养颜
     */
    public static String SECOND_PAGE_RAISECOLOUR = "http://api.haodou.com/mall/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=dj-search" +
            ".search&virtual=&signmethod=md5&v=3&timestamp=1479280317&nonce=0" +
            ".28764542139279037&appsign=c8c15986357b0de9dcd3f976cc2d620f";
    /*
    params.addBodyParameter("limit", "20");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");
    params.addBodyParameter("CateId", "64");
    params.addBodyParameter("Keyword", "");
    params.addBodyParameter("appqs", "haodourecipe://haodou
    .com/goods/searchResult/?CateId=64&CateName=养生养颜");
    params.addBodyParameter("Latitude", "39.913249");
    params.addBodyParameter("Longitude", "116.403625");
    params.addBodyParameter("TagId", "0");
    params.addBodyParameter("offset", "0");
         */

    //    第三页
    public static String THIRD_PAGE = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277035882&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010208983&uuid=9ea70fa9356586ff23fc31785f735cf1" +
            "&channel=anzhi_v6115&method=Topic" +
            ".indexTopic&virtual=&signmethod=md5&v=3&timestamp=1479277625&nonce=0" +
            ".8499517020990653&appsign=716c7f117b15727f3a6f34adf871fc02";
    /*
    params.addBodyParameter("offset", "0");
    params.addBodyParameter("sign", "");
    params.addBodyParameter("uid", "0");

    */
    //豆友
    public static String THIRD_PAGE_BEAN_FIREND = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=Topic" +
            ".indexPeople&virtual=&signmethod=md5&v=3&timestamp=1479279088&nonce=0" +
            ".42071334905883995&appsign=02347fca31399b9083e2b5ea4a5cabed";
    /*
     params.addBodyParameter("limit", "20");
      params.addBodyParameter("sign", "");
       params.addBodyParameter("uid	", "0");
       params.addBodyParameter("position", "中国北京市东城区西长安街");
        params.addBodyParameter("lng", "116.403625");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("lat", "39.913249");
     */
    //动态：
    public static String THIRD_PAGE_DYNAMIC = "http://api.haodou.com/index" +
            ".php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid" +
            "=1479277154256&vc=105&vn=6.1" +
            ".15&loguid=0&deviceid=haodou864394010224212&uuid=b3b08f17bca548949af2ddc9c88e65f5" +
            "&channel=anzhi_v6115&method=UserFeed" +
            ".getFollowUserFeed&virtual=&signmethod=md5&v=3&timestamp=1479279362&nonce=0" +
            ".34251052026632334&appsign=78e26fe3d4b4efc759392425ead6f978";
    /*
      params.addBodyParameter("limit", "10");
      params.addBodyParameter("offset", "0");
      params.addBodyParameter("sign", "");
       params.addBodyParameter("uid	", "0");
    */
    //图片1
    public static String page_guide_1 = "http://hop.haodou.com/hop/router/rest.json?action=cms" +
            ".feed.page";
    /*
       params.addBodyParameter("_HOP_", "{\"sign\":\"654f188bd2e1937b7e342083901d5799\"," +
                   "\"action\":\"cms.feed.page\",\"current_time\":1479736220," +
                   "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
           params.addBodyParameter("appid", "2");
           params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
           params.addBodyParameter("channel", "anzhi_v6115");
           params.addBodyParameter("deviceid", "haodou864394010609719");
           params.addBodyParameter("format", "1");
           params.addBodyParameter("from", "android");
           params.addBodyParameter("ip", "172.16.151.15");
           params.addBodyParameter("limit", "30");
           params.addBodyParameter("loguid", "0");
           params.addBodyParameter("name", "page_guide_1");
           params.addBodyParameter("network", "WIFI");
           params.addBodyParameter("offset", "0");
           params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
           params.addBodyParameter("vc", "105");
           params.addBodyParameter("virtual", "0");
           params.addBodyParameter("vn", "6.1.15");
        */
    //图片2
    public static String page_guide_2 = "http://hop.haodou.com/hop/router/rest.json?action=cms" +
            ".feed.page";
    /*
       params.addBodyParameter("_HOP_", "{\"sign\":\"3dea7b58888740052300d0fc7c67cfee\"," +
                   "\"action\":\"cms.feed.page\",\"current_time\":1479737427," +
                   "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
           params.addBodyParameter("appid", "2");
           params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
           params.addBodyParameter("channel", "anzhi_v6115");
           params.addBodyParameter("deviceid", "haodou864394010609719");
           params.addBodyParameter("format", "1");
           params.addBodyParameter("from", "android");
           params.addBodyParameter("ip", "172.16.151.15");
           params.addBodyParameter("limit", "30");
           params.addBodyParameter("loguid", "0");
           params.addBodyParameter("name", "page_guide_2");
           params.addBodyParameter("network", "WIFI");
           params.addBodyParameter("offset", "0");
           params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
           params.addBodyParameter("vc", "105");
           params.addBodyParameter("virtual", "0");
           params.addBodyParameter("vn", "6.1.15");
        */
    //图片3
    public static String page_guide_3 = "http://hop.haodou.com/hop/router/rest.json?action=cms" +
            ".feed.page";
 /*
    params.addBodyParameter("_HOP_", "{\"sign\":\"99079421ad40f6cb6b7568bb8425e873\"," +
                "\"action\":\"cms.feed.page\",\"current_time\":1479737701," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        params.addBodyParameter("appid", "2");
        params.addBodyParameter("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        params.addBodyParameter("channel", "anzhi_v6115");
        params.addBodyParameter("deviceid", "haodou864394010609719");
        params.addBodyParameter("format", "1");
        params.addBodyParameter("from", "android");
        params.addBodyParameter("ip", "172.16.151.15");
        params.addBodyParameter("limit", "30");
        params.addBodyParameter("loguid", "0");
        params.addBodyParameter("name", "page_guide_3");
        params.addBodyParameter("network", "WIFI");
        params.addBodyParameter("offset", "0");
        params.addBodyParameter("uuid", "4d026196b079f72c6ee96157c0c65d62");
        params.addBodyParameter("vc", "105");
        params.addBodyParameter("virtual", "0");
        params.addBodyParameter("vn", "6.1.15");
     */
}