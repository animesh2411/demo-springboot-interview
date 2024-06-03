package com.animax.demo.constants.old.logicprgm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DigitCountExample {

    public static void main(String[] args) {
        // Example List with random digits
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 7, 8, 9, 9);

        // Using Java 8 Streams to create a HashMap with digit counts
        Map<Integer, Long> digitCountMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        // Print the result
        System.out.println("Original List: " + numbers);
        System.out.println("Digit Counts: " + digitCountMap);
    }
}
