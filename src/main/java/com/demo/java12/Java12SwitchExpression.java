package com.demo.java12;

public class Java12SwitchExpression {
    public static void demo() {
        System.out.println("\n1. Switch Expression (Preview):");
        
        String day = "MONDAY";
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> 0;
        };
        System.out.println("  " + day + " has " + numLetters + " letters");
        
        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("  " + day + " is a " + result);
    }
}
