package com.demo.java9;

import java.util.*;

public class Java9CollectionFactory {
    public static void demo() {
        System.out.println("\n1. Collection Factory Methods:");
        
        List<String> immutableList = List.of("Java", "Python", "Go", "Rust");
        System.out.println("  Immutable List: " + immutableList);
        
        Set<Integer> immutableSet = Set.of(1, 2, 3, 4, 5);
        System.out.println("  Immutable Set: " + immutableSet);
        
        Map<String, Integer> immutableMap = Map.of(
            "Java", 9,
            "Python", 3,
            "Go", 1
        );
        System.out.println("  Immutable Map: " + immutableMap);
        
        Map<String, String> largeMap = Map.ofEntries(
            Map.entry("feature1", "Collection Factory"),
            Map.entry("feature2", "Private Interface Methods"),
            Map.entry("feature3", "Stream API Enhancements")
        );
        System.out.println("  Large Map (using ofEntries): " + largeMap);
    }
}
