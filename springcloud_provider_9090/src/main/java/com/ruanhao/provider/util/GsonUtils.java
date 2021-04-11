package com.ruanhao.provider.util;

/**
 * @author Ryan
 * @Date 2020/3/15 0015 17:05
 */

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** * @description: * @author: liujiwu771 * @date: 2020/1/20 **/
public class GsonUtils {
    //不用创建对象,直接使用Gson.就可以调用方法 //判断gson对象是否存在了,不存在则创建对象 static {
    private static Gson gson = null;
//gson = new Gson(); //当使用GsonBuilder方式时属性为空的时候输出来的json字符串是有键值key的,显示形式是"key":null，而直接new出来的就没有"key":null的 gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create(); }
//无参的私有构造方法 private GsonUtils() {

    /**
     * 将对象转成json格式 * * @param object * @return String
     */
    public static String GsonString(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }

    /**
     * 将json转成特定的cls的对象 * * @param gsonString * @param cls * @return
     */



    /** * json字符串转成list * * @param json * @param cls * @return */
    public static <T> List<T> jsonToList(String json, Class<T> cls) {
        ArrayList<T> mList = new ArrayList<T>(); JsonArray array = new JsonParser().parse(json).getAsJsonArray(); for (final JsonElement elem : array) {
            mList.add(gson.fromJson(elem, cls)); }
        return mList; }
    /** * json字符串转成list中有map的 * * @param gsonString * @return */
    public static <T> List<Map<String, T>> GsonToListMaps(String gsonString) {
        List<Map<String, T>> list = null; if (gson != null) {
            list = gson.fromJson(gsonString, new TypeToken<List<Map<String, T>>>() {
            }.getType()); }
        return list; }
    /** * json字符串转成map的 * * @param gsonString * @return */
    public static <T> Map<String, T> GsonToMaps(String gsonString) {
        Map<String, T> map = null; if (gson != null) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType()); }
        return map; }
}