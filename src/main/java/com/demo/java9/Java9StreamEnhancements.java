package com.demo.java9;

import java.util.stream.Stream;

public class Java9StreamEnhancements {
    public static void demo() {
        System.out.println("\n3. Stream API Enhancements:");
        
        System.out.println("  takeWhile() - Take elements while condition is true:");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .takeWhile(n -> n < 6)
            .forEach(n -> System.out.print("    " + n + " "));
        System.out.println();
        
        System.out.println("  dropWhile() - Drop elements while condition is true:");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .dropWhile(n -> n < 6)
            .forEach(n -> System.out.print("    " + n + " "));
        System.out.println();
        
        System.out.println("  iterate() with predicate:");
        Stream.iterate(0, n -> n < 10, n -> n + 2)
            .forEach(n -> System.out.print("    " + n + " "));
        System.out.println();
        
        System.out.println("  ofNullable() - Create stream from nullable value:");
        String value = "Hello";
        Stream.ofNullable(value).forEach(v -> System.out.println("    Value: " + v));
    }
}
