package com.animax.demo.constants.old.xyzStarHealth;

/*
Given an array arr[] of n integers, construct a Product Array prod[] (of the same size) such
that prod[i] is equal to the product of all the elements of arr[] except arr[i].

Example :
Input: arr[]  = {10, 3, 5, 6, 2}Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array
elements except 10 is 180
10 * 5 * 6 * 2 product of other array
elements except 3 is 600
10 * 3 * 6 * 2 product of other array
elements except 5 is 360
10 * 3 * 5 * 2 product of other array
elements except 6 is 300
10 * 3 * 6 * 5 product of other array
elements except 2 is 900
 */

// 10,0,5,6,2
//    prod[] = {0,600, 0, 0}
//    10,0,0,6,2
//    prod[] = {0, 0, 0, 0, 0}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
      //  list = Arrays.asList(10, 3, 5, 6, 2);
        list = Arrays.asList(10,0,5,6,2);
        List<Integer> output = new ArrayList<>();
        int prod = 1;
        for(Integer num: list) {
            if(!list.contains(0)) {
                prod = prod*num;
            }
            else if(num==0) {
                list.remove(num);
                prod = prod*num;
            } else {
                prod =0;
            }

        }
        for (Integer integer : list) {
            if (integer != 0) {
                output.add(prod / integer);
            } else {
                if (integer == 0) {
                    output.add(prod);
                } else {
                    output.add(prod);
                }
            }
        }

        System.out.println(output);

    }

}
