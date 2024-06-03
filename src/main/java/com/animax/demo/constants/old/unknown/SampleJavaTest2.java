package com.animax.demo.constants.old.unknown;

import java.util.HashSet;

public class SampleJavaTest2 {

    public static void main(String[] args) {
        String text = "New York City, the most populous city in the United States, located in the state of NEW YORK";

        // Split the text into words
        String[] words = text.split("\\s+");

        // Initialize a set to store unique converted words
        HashSet<String> uniqueConvertedWords = new HashSet<>();

        // Iterate over the words
        for (String word : words) {
            // Remove non-alphabetic characters and convert the word to uppercase
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toUpperCase();

            // Check if the cleaned word contains no more than 5 characters
            if (cleanedWord.length() <= 5 && !cleanedWord.isEmpty()) {
                // Add the cleaned word to the set
                uniqueConvertedWords.add(cleanedWord);
            }
        }

        // Print the unique converted words
        for (String word : uniqueConvertedWords) {
            System.out.println(word);
        }
    }
}
