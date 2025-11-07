package com.demo.java11;

import java.util.List;
import java.util.function.Function;

public class Java11VarInLambda {
    public static void demo() {
        System.out.println("\n4. Var in Lambda Parameters:");
        
        List<String> names = List.of("Alice", "Bob", "Charlie");
        
        names.forEach((var name) -> {
            System.out.println("  Hello, " + name + "!");
        });
        
        Function<String, String> toUpperCase = (var s) -> s.toUpperCase();
        System.out.println("  Uppercase: " + toUpperCase.apply("java 11"));
    }
}
