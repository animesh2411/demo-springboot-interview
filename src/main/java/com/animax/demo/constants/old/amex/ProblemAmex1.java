package com.animax.demo.constants.old.amex;

import java.util.*;

//Number of times a Digit appear in a Number, for example in number 7537427, 7 appeared 3 times.
public class ProblemAmex1 {
    public static void main(String[] args) {
        List<Integer> x = countDigits(7537427);
        System.out.println(x);
    }

    public static List<Integer> countDigits(int num) {
        List<Integer> digits = new ArrayList<>();
        Map<Integer, Integer> mapOfCount = new HashMap<>();

        //7537427
        while (num > 0) {
            int d = num % 10;
            digits.add(d);
            num = num / 10;
        }

        for (Integer digit : digits) {
            if (mapOfCount.containsKey(digit)) {
                mapOfCount.put(digit, mapOfCount.get(digit) + 1);
            } else
                mapOfCount.put(digit, 1);
        }
        List<Integer> digitOccurrences = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mapOfCount.entrySet()) {
            if (entry.getValue() > 1) { // Only add digits with occurrences > 1
                digitOccurrences.add(entry.getKey());
            }
        }

        return digitOccurrences;


    }
}
