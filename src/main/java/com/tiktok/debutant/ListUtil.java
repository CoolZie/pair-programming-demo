package com.tiktok.debutant;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtil {
    public static List<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> duplacate = new HashSet<>();
        Set<Integer> unique = new HashSet<>();
        for (Integer n : numbers) {
            if(!unique.add(n)){
                duplacate.add(n);
            }
        }
        return duplacate.stream().toList();
        
    }
    
}
