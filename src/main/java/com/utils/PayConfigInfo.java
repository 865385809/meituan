package com.utils;

import java.util.ResourceBundle;
//读取支付的配置信息
public class PayConfigInfo {
    private static ResourceBundle cache = null;
    static {
        try{
            cache = ResourceBundle.getBundle("merchantInfo");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public static String getValue(String key){
        return cache.getString(key);
    }
}
