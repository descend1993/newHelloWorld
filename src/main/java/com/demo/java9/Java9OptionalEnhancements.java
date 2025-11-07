package com.demo.java9;

import java.util.Optional;
import java.util.stream.Stream;

public class Java9OptionalEnhancements {
    public static void demo() {
        System.out.println("\n4. Optional Enhancements:");
        
        System.out.println("  ifPresentOrElse():");
        Optional<String> value = Optional.of("Java 9");
        value.ifPresentOrElse(
            v -> System.out.println("    Present: " + v),
            () -> System.out.println("    Not present")
        );
        
        System.out.println("  or() - Provide alternative Optional:");
        Optional<String> empty = Optional.empty();
        Optional<String> result = empty.or(() -> Optional.of("Default Value"));
        System.out.println("    Result: " + result.get());
        
        System.out.println("  stream() - Convert Optional to Stream:");
        Stream<String> stream = Optional.of("Stream from Optional").stream();
        stream.forEach(s -> System.out.println("    " + s));
    }
}
