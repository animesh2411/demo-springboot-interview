package com.animax.demo.constants.old.pwc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 11, 22, 35, 41, 11, 35);
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        //    for(int i=0;i<list.size();i++)
        // System.out.print(arr[i]);

        int index = Integer.MIN_VALUE;
        int element = Integer.MIN_VALUE;
        //find first duplicate
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            boolean success = set.add(list.get(i));
            if (!success) {
                element = list.get(i);
                index = i;
                break;
            }
        }
        System.out.println("Element: " + element + " at index " + index);
    }
}
