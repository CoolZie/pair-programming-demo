package com.tiktok.debutant;


public class PrimeUtil {

    public static boolean isPrime(int i) {
        if(i == 0 || i == 1| i % 2 == 0) return false;
        if(i == 2) return true;
        for (int j = 3; j <= Math.sqrt(i); j+=2) {
            if((j % i) == 0){
                return false;
            } 
        }
        return true;
    }
    
}
