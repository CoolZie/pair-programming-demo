package com.tiktok.debutant;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListMergeUtil {

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());
        return Stream.concat(list1.stream(), list2.stream())
        .sorted()
        .toList();
    }
    
}
