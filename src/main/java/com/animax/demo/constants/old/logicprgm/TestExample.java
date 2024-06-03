package com.animax.demo.constants.old.logicprgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExample {

    public static void main(String args[]) {

        //  {12, 34, 45, 9, 8, 90, 3}
        // pair sum is 54
        List<Integer> evenOdd = Arrays.asList(12, 34, 45, 9, 8, 90, 3);
        boolean isFound = false;
        for (int i = 0; i < evenOdd.size()-1; i++) {
            for (int j = i+1; j < evenOdd.size(); j++) {
                if (evenOdd.get(i)+evenOdd.get(j) == 80) {
                    isFound = true;
                    System.out.println("Pair:" + evenOdd.get(i) + ", " + evenOdd.get(j));
                }
            }
        }
        if (!isFound) {
            System.out.println("Pair not possible");
        }


//        List<Integer> evenList = new ArrayList<>();
//        List<Integer> oddList = new ArrayList<>();

//        for (int i = 0; i < evenOdd.size(); i++) {
//            if (evenOdd.get(i) % 2 == 0) {
//                evenList.add(evenOdd.get(i));
//            }
//            else {
//                oddList.add(evenOdd.get(i));
//            }
//        }
//        evenList.addAll(oddList);
//        System.out.println(evenList);
    }
}







        // {1,2,3,4,6,7,8,9,10}
//        int x =0;
//        List<Integer> list;
//        list = Arrays.asList(1,2,3,4,6,7,8,9,10);
//        for (int i = 0; i < list.size(); i++) {
//            for (int j= 1; j < list.size()-1; j++) {
//                if (list.get(i) + 1 != list.get(j)) {
//                    x = list.get(i) + 1;
//                    System.out.println(x);
//                    break;
//                    // 1+1 ! = 2
//                    // 2+1 ! = 3
//                    // 3+1 ! = 4
//                    // 4+1 ! = 6 true
//                }
//            }
//        }
//        System.out.println(x);
//    }
//}

//class Singleton {
//    private static Singleton obj = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return obj;
//    }
//
//  //  student/id/{id1}
//
//
//
//}
