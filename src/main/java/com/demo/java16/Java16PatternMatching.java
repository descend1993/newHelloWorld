package com.demo.java16;

public class Java16PatternMatching {
    public static void demo() {
        System.out.println("\n2. Pattern Matching for instanceof (Standard):");
        
        Object[] objects = {"Hello", 42, 3.14, true};
        
        for (Object obj : objects) {
            String description = getDescription(obj);
            System.out.println("  " + obj + " -> " + description);
        }
    }
    
    private static String getDescription(Object obj) {
        if (obj instanceof String s) {
            return "String of length " + s.length();
        } else if (obj instanceof Integer i) {
            return "Integer with value " + i;
        } else if (obj instanceof Double d) {
            return "Double with value " + d;
        } else if (obj instanceof Boolean b) {
            return "Boolean with value " + b;
        }
        return "Unknown type";
    }
}
