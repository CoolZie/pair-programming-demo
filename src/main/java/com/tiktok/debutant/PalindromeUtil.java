package com.tiktok.debutant;

import java.util.function.BooleanSupplier;

public class PalindromeUtil {

    public static boolean isPalindrome(String string) {
        int gauche = 0;
        int droite = string.length() - 1;
        if(string.length() == 0){
            return true;
        }
        while (gauche < droite) {
             if(string.charAt(droite) !=  string.charAt(gauche)){
                 return false;
             }
             gauche++;
             droite--;
        }
        return true;
    }
    
}
