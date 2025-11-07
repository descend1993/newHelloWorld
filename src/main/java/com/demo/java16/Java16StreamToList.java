package com.demo.java16;

import java.util.List;
import java.util.stream.Stream;

/**
 * Java 16 Stream.toList()方法演示
 * 
 * Java 8收集Stream到List的方式：
 * - 使用collect(Collectors.toList())：冗长
 * - 返回的是可变List（ArrayList）
 * - 如果需要不可变List，还要用Collections.unmodifiableList()包装
 * 
 * Java 16的改进：
 * - 新增Stream.toList()方法，更简洁
 * - 直接返回不可变List，更安全
 * - 性能更好（JVM可以优化）
 * 
 * 注意：
 * - toList()返回的是不可变List
 * - 如果需要可变List，仍然使用collect(Collectors.toList())
 * 
 * 对Java 8用户的价值：
 * - 减少样板代码
 * - 默认不可变，更安全
 * - 代码意图更清晰
 */
public class Java16StreamToList {
    public static void demo() {
        System.out.println("\n3. Stream.toList():");
        
        // Java 8写法：.collect(Collectors.toList())
        // Java 16写法：.toList() - 更简洁，返回不可变List
        List<String> list = Stream.of("Java", "Python", "Go", "Rust")
            .filter(s -> s.length() > 3)
            .map(String::toUpperCase)
            .toList();  // 简洁！
        
        System.out.println("  Filtered and transformed list: " + list);
        // 注意：list.add("C++") 会抛出UnsupportedOperationException
        
        // 另一个例子：平方数列表
        List<Integer> numbers = Stream.iterate(1, n -> n <= 5, n -> n + 1)
            .map(n -> n * n)
            .toList();  // [1, 4, 9, 16, 25]
        
        System.out.println("  Squared numbers: " + numbers);
    }
}
