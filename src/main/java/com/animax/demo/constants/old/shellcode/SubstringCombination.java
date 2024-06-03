package com.animax.demo.constants.old.shellcode;

import java.util.HashSet;
import java.util.Set;

public class SubstringCombination {
    public static void main(String[] args) {
        //Heyhowareyou
        // he, hey, heyh..etc
        // i=0; j=1 -> he
        //create all combinations of this string
        String input = "Heyhowareyou";
   //     StringBuilder sb = new StringBuilder();
        Set<String> hashSet = new HashSet<>();
        char[] array = input.toCharArray();
        int windowStart =0;
//        for(int windowEnd = 0; windowEnd< array.length; windowEnd++) {
//            StringBuilder sb = new StringBuilder();
//            int start = windowEnd;
//            while (start >= windowStart) {
//                sb.insert(0, input.charAt(start));
//                hashSet.add(sb.toString());
//                start--;
//            }
//        }
        for (int start = 0; start < input.length(); start++) {
            StringBuilder sb = new StringBuilder();
            for (int end = start; end < input.length(); end++) {
                sb.append(input.charAt(end));
                hashSet.add(sb.toString());
            }
        }
        System.out.println(hashSet);
    }
}
