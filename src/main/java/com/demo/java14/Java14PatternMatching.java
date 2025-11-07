package com.demo.java14;

public class Java14PatternMatching {
    public static void demo() {
        System.out.println("\n4. Pattern Matching for instanceof (Preview):");
        
        Object obj = "Hello, Java 14!";
        
        if (obj instanceof String s) {
            System.out.println("  String length: " + s.length());
            System.out.println("  Uppercase: " + s.toUpperCase());
        }
        
        Object number = 42;
        if (number instanceof Integer i) {
            System.out.println("  Integer value: " + i);
            System.out.println("  Double value: " + (i * 2));
        }
    }
}
