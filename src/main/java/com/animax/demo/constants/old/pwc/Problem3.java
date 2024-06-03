package com.animax.demo.constants.old.pwc;

import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("4", "8");
        String s = list.stream().reduce((s1, s2) -> s1.concat(s2)).get();
        System.out.println(s);
    }
}
