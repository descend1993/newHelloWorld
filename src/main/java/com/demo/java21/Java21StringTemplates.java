package com.demo.java21;

public class Java21StringTemplates {
    public static void demo() {
        System.out.println("\n3. String Templates (Preview):");
        System.out.println("  String Templates provide a safer way to compose strings");
        System.out.println("  with embedded expressions");
        
        String name = "Java";
        int version = 21;
        
        String message = String.format("Welcome to %s %d!", name, version);
        System.out.println("  Traditional: " + message);
        
        String formatted = "Welcome to %s %d!".formatted(name, version);
        System.out.println("  Using formatted(): " + formatted);
        
        String template = """
                Language: %s
                Version: %d
                LTS: %b
                """.formatted(name, version, true);
        System.out.println("  Multi-line template:");
        System.out.println(template);
    }
}
