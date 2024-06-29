package com.tiktok.debutant;

public class VowelUtil {

    public static Integer countVowels(String string) {
        String voyelles = "aeiouy";
        int count = 0;
       for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < voyelles.length(); j++) {
                if(string.charAt(i) == voyelles.charAt(j) || string.charAt(i) == voyelles.toUpperCase().charAt(j))
                count = count + 1;
            }
       }
       return count;
    }
    
}
