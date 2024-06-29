package com.tiktok.debutant;

public class MathUtil {

    public static Integer factorial(int i) {
        int res = 1;
        if(i == 0){
            return 1;
        }
        for (int j = 1; j <= i; j++) {
            res = res * j;
        }
        return res;
    }
    
}
