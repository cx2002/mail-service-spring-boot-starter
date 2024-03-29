package com.svwh.mailservice.util;


/**
 * @description
 * @Author cxk
 */
public class ParamAssert {

    public static void notNull(Object o,String message){
        if (o == null){
            throw new IllegalArgumentException(message);
        }
    }

    public static void stringNotNull(String s,String message){
        if (s == null){
            throw new IllegalArgumentException(message);
        }
    }

    public static void stringNotEmpty(String s,String message){
        if (s == null || s.isEmpty()){
            throw new IllegalArgumentException(message);
        }
    }

    public static void stringsNotEmpty(String message, String...strings){
        for (String string : strings) {
            stringNotEmpty(string,message);
        }
    }


}
