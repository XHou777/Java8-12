package com.yourname.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        // Use stream to filter and collect results into a list
        List<String> filteredList = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);

        // Use stream to group words by their initial letter
        Map<Character, List<String>> groupedByInitial = words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Grouped by initial: " + groupedByInitial);

        // Use stream to find the longest word
        String longestWord = words.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("No words in the list");
        System.out.println("Longest word: " + longestWord);
    }
}
