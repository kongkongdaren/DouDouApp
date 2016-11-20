package com.yjlw.ddms.squareentity.fragment.utils;

/**
 * Description：解析JSON数据的工具类<br/>
 * Copyright (c) 2016,JansonLi<br/>
 * This program is protected by copyright laws<br/>
 * Date:2016年11月19下午 7:29
 *
 * @author 李磊
 * @version : 1.0
 */

public class ParserJSONDataUtils {

//    public static List<Result.ResultBean> parserJSONDataMethod(byte[] bytes){
//
//        List<Result.ResultBean> ds=new LinkedList<>();
//        Result.ResultBean resultBean=new Result.ResultBean();
//        try {
//            JSONObject  obj=new JSONObject(new String(bytes));
//            JSONObject result = obj.getJSONObject("result");
//            JSONArray ad = result.getJSONArray("ad");
//            for(int i=0;i<ad.length();i++){
//                JSONObject object = ad.getJSONObject(i);
//                String img = object.getString("Img");
//                Log.i("log1",img);
//                Result.ResultBean.AdBean adBean=new Result.ResultBean.AdBean();
//                adBean.setImg(img);
//                resultBean.getAd().add(adBean);
//            }
//
//            JSONArray group = result.getJSONArray("group");
//            for(int i=0;i<group.length();i++){
//                JSONObject jsonObject = group.getJSONObject(i);
////                private String Desc;
////                private String Img;
////                private String Name;
////                private String ViewDesc;
//                String desc = jsonObject.getString("Desc");
//                String img = jsonObject.getString("Img");
//                String name = jsonObject.getString("Name");
//                String viewDesc = jsonObject.getString("ViewDesc");
//                Result.ResultBean.GroupBean groupBean=new Result.ResultBean.GroupBean();
//                resultBean.getGroup().add(groupBean);
//            }
//
//            JSONArray hot = result.getJSONArray("hot");
//            for(int i=0;i<hot.length();i++){
//                JSONObject jsonObject = hot.getJSONObject(i);
////                private String Avatar;
////                private int CommentCount;
////                private int DigCount;
////                private String Img;
////                private String PreviewContent;
////                private String Title;
////                private String UserName;
//                String avatar = jsonObject.getString("Avatar");
//                int commentCount = jsonObject.getInt("CommentCount");
//                int digCount = jsonObject.getInt("DigCount");
//                String img = jsonObject.getString("Img");
//                String previewContent = jsonObject.getString("PreviewContent");
//                String title = jsonObject.getString("Title");
//                String userName = jsonObject.getString("UserName");
//                Result.ResultBean.HotBean hotBean=new Result.ResultBean.HotBean();
//                hotBean.setAvatar(avatar);
//                hotBean.setCommentCount(commentCount);
//                hotBean.setDigCount(digCount);
//                hotBean.setImg(img);
//                hotBean.setPreviewContent(previewContent);
//                hotBean.setTitle(title);
//                hotBean.setUserName(userName);
//                resultBean.getHot().add(hotBean);
//            }
//            ds.add(resultBean);
//            return ds;
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
