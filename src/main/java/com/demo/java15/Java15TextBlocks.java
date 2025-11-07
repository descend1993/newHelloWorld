package com.demo.java15;

public class Java15TextBlocks {
    public static void demo() {
        System.out.println("\n1. Text Blocks (Standard):");
        
        String sql = """
                SELECT id, name, email
                FROM users
                WHERE status = 'active'
                ORDER BY name
                """;
        
        System.out.println("  SQL Query:");
        System.out.println(sql);
        
        String formattedText = """
                Name: %s
                Age: %d
                City: %s
                """.formatted("Alice", 30, "New York");
        
        System.out.println("  Formatted Text Block:");
        System.out.println(formattedText);
    }
}
