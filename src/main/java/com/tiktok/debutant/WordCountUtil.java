package com.tiktok.debutant;

public class WordCountUtil {

    public static Integer countWords(String string) {
        if(string.length() == 0){
            return 0;
        }
        return string.split(" ").length;
    }
    
}
