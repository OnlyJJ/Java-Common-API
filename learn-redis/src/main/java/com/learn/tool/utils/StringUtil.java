package com.learn.tool.utils;

public class StringUtil {
    public StringUtil() {
    }

    public static boolean isNullOrEmpty(Object obj) {
    	if(obj instanceof String) {
    		return null == obj || 0 == obj.toString().trim().length();
    	}
    	return null == obj;
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !"".equals(str.trim());
    }

    public static String formatLike(String str) {
        return isNotEmpty(str)?"%" + str + "%":null;
    }
}