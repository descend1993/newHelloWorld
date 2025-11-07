package com.demo.java15;

/**
 * Java 15 文本块演示（标准特性）
 * 
 * Java 13/14中是预览特性，Java 15正式成为标准
 * 
 * 文本块特别适合：
 * - SQL查询
 * - JSON/XML数据
 * - HTML模板
 * - 正则表达式
 * - 任何多行文本
 * 
 * 对Java 8用户的价值：
 * - 这是Java 15最重要的特性
 * - 极大提升代码可读性
 * - 与Java 13的文本块相同，但更稳定
 */
public class Java15TextBlocks {
    public static void demo() {
        System.out.println("\n1. Text Blocks (Standard):");
        
        // 文本块特别适合SQL查询
        // 不需要转义，不需要换行符拼接
        String sql = """
                SELECT id, name, email
                FROM users
                WHERE status = 'active'
                ORDER BY name
                """;
        
        System.out.println("  SQL Query:");
        System.out.println(sql);
        
        // 文本块可以配合String.formatted()使用（Java 15新增）
        // 类似String.format()，但作为实例方法更方便
        String formattedText = """
                Name: %s
                Age: %d
                City: %s
                """.formatted("Alice", 30, "New York");
        
        System.out.println("  Formatted Text Block:");
        System.out.println(formattedText);
    }
}
