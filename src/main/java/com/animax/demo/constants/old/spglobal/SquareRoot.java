package com.animax.demo.constants.old.spglobal;
//square root, and find nearest round down
//4 -> 2
//5-> 2
//8-> 2
//9->3
//25/5 -> 5/5 ->1  // output 5
// 4*4 = 16<24 ->

//n>0, n<Integer.MAX_VALUE;
public class SquareRoot {
    public static void main(String[] args) {
        long squareNum = Integer.MAX_VALUE;
        long num = 1;
        while(squareNum > 1) {
            if (num*num == squareNum) {
                System.out.println(num);
                break;
            } else if (num*num > squareNum) {
                num--;
                break;
            } else {
                num++;
            }
        }
        System.out.println(num);
//        List<Integer> list = new ArrayList<>();
//        list.stream().filter(p->p>1).toList();
    }
}