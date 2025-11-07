package com.demo.java21;

public class Java21PatternMatching {
    
    sealed interface Result permits Success, Failure {}
    record Success(String data) implements Result {}
    record Failure(String error, int code) implements Result {}
    
    public static void demo() {
        System.out.println("\n1. Pattern Matching for switch (Standard):");
        
        Object obj = "Hello, Java 21!";
        String result = switch (obj) {
            case String s when s.length() > 10 -> "Long string: " + s.substring(0, 10) + "...";
            case String s -> "Short string: " + s;
            case Integer i when i > 0 -> "Positive integer: " + i;
            case Integer i -> "Non-positive integer: " + i;
            case null -> "Null value";
            default -> "Unknown type";
        };
        System.out.println("  " + result);
        
        Result success = new Success("Operation completed");
        Result failure = new Failure("Connection timeout", 500);
        
        System.out.println("  " + describeResult(success));
        System.out.println("  " + describeResult(failure));
    }
    
    private static String describeResult(Result result) {
        return switch (result) {
            case Success(String data) -> "✓ Success: " + data;
            case Failure(String error, int code) -> "✗ Failure: " + error + " (code: " + code + ")";
        };
    }
}
