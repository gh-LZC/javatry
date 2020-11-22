package com.integration.util;

import java.util.Base64;

/**
 * @class DecodeUtil
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/2/22 12:53
 * @Version 1.0
 */
public class EncryptUtil {
    private static volatile  EncryptUtil encryptUtil;
    private EncryptUtil(){}
    public static EncryptUtil getInstance(){
        if(encryptUtil == null)
        {
            synchronized (EncryptUtil.class){
                if (encryptUtil == null){
                    encryptUtil = new EncryptUtil();
                }
            }
        }
        return encryptUtil;
    }

    public String base64Encode(String value){
        return new String(Base64.getEncoder().encode(value.getBytes()));
    }

    public String base64Decode(String value){
        return new String(Base64.getDecoder().decode(value));
    }

    public static void main(String[] args){
        //String key = "123abcABC{}";
        String key = "123";
        String encodeKey = EncryptUtil.getInstance().base64Encode(key);
        System.out.println(encodeKey);
        System.out.println(EncryptUtil.getInstance().base64Decode(encodeKey));
    }
}
