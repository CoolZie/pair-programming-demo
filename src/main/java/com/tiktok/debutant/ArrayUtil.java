package com.tiktok.debutant;

public class ArrayUtil {

    public static Integer findMax(int[] is) {
        Integer max = is[0];
        for (int i = 1; i < is.length; i++) {
            if(is[i]>max){
                max = is[i];
            }
        }
        return max;
    }
    
}
