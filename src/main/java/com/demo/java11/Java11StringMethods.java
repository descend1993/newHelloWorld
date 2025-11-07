package com.demo.java11;

public class Java11StringMethods {
    public static void demo() {
        System.out.println("\n1. New String Methods:");
        
        String text = "  Hello, Java 11!  ";
        System.out.println("  Original: '" + text + "'");
        System.out.println("  strip(): '" + text.strip() + "'");
        System.out.println("  stripLeading(): '" + text.stripLeading() + "'");
        System.out.println("  stripTrailing(): '" + text.stripTrailing() + "'");
        
        String blank = "   ";
        System.out.println("  isBlank() on '   ': " + blank.isBlank());
        
        String multiline = "Line 1\nLine 2\nLine 3";
        System.out.println("  lines():");
        multiline.lines().forEach(line -> System.out.println("    " + line));
        
        String repeated = "Java ".repeat(3);
        System.out.println("  repeat(3): " + repeated);
    }
}
