package com.demo.java16;

import java.util.List;
import java.util.stream.Stream;

public class Java16StreamToList {
    public static void demo() {
        System.out.println("\n3. Stream.toList():");
        
        List<String> list = Stream.of("Java", "Python", "Go", "Rust")
            .filter(s -> s.length() > 3)
            .map(String::toUpperCase)
            .toList();
        
        System.out.println("  Filtered and transformed list: " + list);
        
        List<Integer> numbers = Stream.iterate(1, n -> n <= 5, n -> n + 1)
            .map(n -> n * n)
            .toList();
        
        System.out.println("  Squared numbers: " + numbers);
    }
}
