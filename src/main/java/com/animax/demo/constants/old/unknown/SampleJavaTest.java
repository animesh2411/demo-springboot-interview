package com.animax.demo.constants.old.unknown;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SampleJavaTest {
    public static void main(String[] args) {
        //Given the text: "New York City, the most populous city in the United States, located in the state of NEW YORK" .
        //Select only words which contains no more than 5 characters, convert them to uppercase.
        //Print converted words without duplicates.
        String text = "New York City, the most populous city in the United States, located in the state of NEW YORK";

        // Split the text into words, convert them to uppercase, filter words with length <= 5,
        // and collect them into a set to remove duplicates
        HashSet<String> uniqueWords = Arrays.stream(text.split("\\s+"))
                .map(String::toUpperCase)
                .map(word -> word.replaceAll("[^a-z A-Z]", "")) // Remove non-alphabetic characters
                .filter(word -> word.length() <= 5 && !word.isEmpty()) // Filter words with length <= 5 and non-empty
                .collect(Collectors.toCollection(HashSet::new));

        // Print the unique converted words
        uniqueWords.forEach(System.out::println);
    }
}
