package com.yourname.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExamples {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Use a lambda expression with the Predicate functional interface to filter a list of strings
        Predicate<String> startsWithB = s -> s.startsWith("b");
        words.stream()
                .filter(startsWithB)
                .forEach(System.out::println);
        
        // Use a lambda expression to define a Runnable
        Runnable runnable = () -> System.out.println("Hello from a Runnable using lambda");
        runnable.run();
        
        // Use a lambda expression to create a thread
        new Thread(() -> System.out.println("Hello from a thread using lambda")).start();
    }
}
