package com.demo.java9;

import java.util.stream.Stream;

/**
 * Java 9 Stream API增强演示
 * 
 * Java 8的Stream API限制：
 * - filter()会处理所有元素，无法在条件改变时立即停止
 * - iterate()只有两个参数，无法设置终止条件，容易产生无限流
 * - 无法直接从可能为null的值创建Stream
 * 
 * Java 9的改进：
 * - takeWhile(): 获取元素直到条件不满足，类似"有条件的limit"
 * - dropWhile(): 跳过元素直到条件不满足，类似"有条件的skip"
 * - iterate()增加了终止条件参数，类似传统for循环
 * - ofNullable(): 安全地从可能为null的值创建Stream
 * 
 * 对Java 8用户的价值：
 * - 更直观的条件过滤，性能更好（可以提前终止）
 * - 更安全的null处理
 * - 代码更简洁，可读性更强
 */
public class Java9StreamEnhancements {
    public static void demo() {
        System.out.println("\n3. Stream API Enhancements:");
        
        // takeWhile(): 获取元素直到条件不满足为止
        // Java 8的filter()会检查所有元素，takeWhile()遇到第一个不满足条件的就停止
        // 适用于有序的Stream，可以提高性能
        System.out.println("  takeWhile() - Take elements while condition is true:");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .takeWhile(n -> n < 6)  // 遇到6就停止，不再处理后面的元素
            .forEach(n -> System.out.print("    " + n + " "));
        System.out.println();
        
        // dropWhile(): 跳过元素直到条件不满足为止
        // 与takeWhile()相反，丢弃开头满足条件的元素，保留其余所有元素
        System.out.println("  dropWhile() - Drop elements while condition is true:");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .dropWhile(n -> n < 6)  // 跳过1-5，从6开始保留
            .forEach(n -> System.out.print("    " + n + " "));
        System.out.println();
        
        // iterate()的新重载版本：增加了终止条件（第二个参数）
        // Java 8: Stream.iterate(0, n -> n + 2) - 无限流，需要配合limit()
        // Java 9: Stream.iterate(0, n -> n < 10, n -> n + 2) - 类似for循环
        System.out.println("  iterate() with predicate:");
        Stream.iterate(0, n -> n < 10, n -> n + 2)  // 类似: for(int n=0; n<10; n+=2)
            .forEach(n -> System.out.print("    " + n + " "));
        System.out.println();
        
        // ofNullable(): 从可能为null的单个值创建Stream
        // Java 8需要: value == null ? Stream.empty() : Stream.of(value)
        // Java 9: 直接使用Stream.ofNullable(value)
        System.out.println("  ofNullable() - Create stream from nullable value:");
        String value = "Hello";
        Stream.ofNullable(value).forEach(v -> System.out.println("    Value: " + v));
    }
}
