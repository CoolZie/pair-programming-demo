package com.tiktok.debutant;

public class StringUtil {

    public static String reverseString(String string) {
        /* https://stackoverflow.com/questions/7569335/reverse-a-string-in-java */
        return new StringBuilder(string).reverse().toString();
    }
    
}
