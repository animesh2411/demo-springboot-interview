package com.animax.demo.constants.old.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
1 <- A
2 -> B
3 -> C
1 -> F
2 -> Y
1 -> H
O/P:

1 -> {A, F, H}
2 -> {B, Y}
3 -> {C}
 */
public class HashMapQuestion {
    public static void main(String[] args) {
        Map<Integer, List<String>> outListMap = new HashMap<>();
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("H", 1);


        for(Map.Entry<String, Integer> entry: inputMap.entrySet()) {
            if(outListMap.containsKey(entry.getValue())) {
                List<String> sList = outListMap.get(entry.getValue());
                sList.add(entry.getKey());
                outListMap.put(entry.getValue(), sList);
            } else {
                List<String> sList = new ArrayList<>();
                sList.add(entry.getKey());
                outListMap.put(entry.getValue(), sList);
            }
        }

            System.out.println(outListMap);


    }
}
