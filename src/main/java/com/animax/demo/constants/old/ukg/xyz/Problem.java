package com.animax.demo.constants.old.ukg.xyz;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    public static void main(String[] args) {
        //[2:05 PM] Pawan Bhatt
        //[1,2,3,4]
        //[2:06 PM] Pawan Bhatt
        //[24,12,,8,6]

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> result = findProductExceptOne(list);
        System.out.println(result);
    }

    static List<Integer> findProductExceptOne(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int prod = 1;
        for(int i=0;i<list.size();i++) {
            prod = prod * list.get(i);
        }
        for(int i=0;i<list.size();i++) {
            result.add(prod/list.get(i));
        }
        return result;
    }
}
