package com.tiktok.debutant;

public class ArrayMinUtil {

    public static Integer findMin(int[] is) {
        int min = is[0];
        for (int i = 0; i < is.length; i++) {
            if (min>is[i]) {
                min = is[i];
            }
        }
        return min;
    }
    
}
