package com.tiktok.debutant;

public class ArraySumUtil {

    public static Integer sumArray(int[] is) {
        int s = 0;
        for (int i : is) {
            s = s + i;
        }
        return s;
    }
    
}
