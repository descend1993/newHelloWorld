package com.demo.java9;

import java.util.*;

/**
 * Java 9 集合工厂方法演示
 * 
 * Java 8中创建不可变集合的方式：
 * - List: Collections.unmodifiableList(Arrays.asList("a", "b", "c"))
 * - Set: Collections.unmodifiableSet(new HashSet<>(Arrays.asList("a", "b", "c")))
 * - Map: 需要创建Map并手动put，然后用Collections.unmodifiableMap()包装
 * 
 * Java 9引入的改进：
 * - List.of(), Set.of(), Map.of() 提供了更简洁的语法
 * - 直接返回不可变集合，无需包装
 * - 性能更好，内存占用更少
 * - 不允许null元素（与Java 8的Collections工具类不同）
 * 
 * 注意事项：
 * - 返回的集合是不可变的，任何修改操作都会抛出UnsupportedOperationException
 * - 不能包含null元素，否则会抛出NullPointerException
 * - Map.of()最多支持10个键值对，更多需要使用Map.ofEntries()
 */
public class Java9CollectionFactory {
    public static void demo() {
        System.out.println("\n1. Collection Factory Methods:");
        
        // Java 8写法: Collections.unmodifiableList(Arrays.asList("Java", "Python", "Go", "Rust"))
        // Java 9写法: 更简洁，性能更好
        List<String> immutableList = List.of("Java", "Python", "Go", "Rust");
        System.out.println("  Immutable List: " + immutableList);
        
        // Java 8写法: Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5)))
        // Java 9写法: 一行搞定
        Set<Integer> immutableSet = Set.of(1, 2, 3, 4, 5);
        System.out.println("  Immutable Set: " + immutableSet);
        
        // Java 8写法: 需要创建Map，多次put，然后用Collections.unmodifiableMap()包装
        // Java 9写法: Map.of() 直接创建，最多支持10个键值对
        Map<String, Integer> immutableMap = Map.of(
            "Java", 9,
            "Python", 3,
            "Go", 1
        );
        System.out.println("  Immutable Map: " + immutableMap);
        
        // 当需要超过10个键值对时，使用Map.ofEntries()和Map.entry()
        // 这种方式支持任意数量的键值对
        Map<String, String> largeMap = Map.ofEntries(
            Map.entry("feature1", "Collection Factory"),
            Map.entry("feature2", "Private Interface Methods"),
            Map.entry("feature3", "Stream API Enhancements")
        );
        System.out.println("  Large Map (using ofEntries): " + largeMap);
    }
}
