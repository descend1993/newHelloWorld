package com.demo.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Java 10 集合copyOf()方法演示
 * 
 * Java 8/9的限制：
 * - Java 9的List.of()等只能从元素创建不可变集合
 * - 要从现有集合创建不可变副本，需要：new ArrayList<>(original) + Collections.unmodifiableList()
 * - 或者使用流：original.stream().collect(Collectors.toUnmodifiableList())
 * 
 * Java 10的改进：
 * - List.copyOf(), Set.copyOf(), Map.copyOf() 直接从集合创建不可变副本
 * - 语法简洁，意图明确
 * - 创建的是真正的副本，原集合的修改不会影响副本
 * 
 * copyOf() vs of()的区别：
 * - of(): 从单个元素创建不可变集合 - List.of(1, 2, 3)
 * - copyOf(): 从现有集合创建不可变副本 - List.copyOf(existingList)
 * - copyOf()如果参数本身是不可变的，可能直接返回原对象（性能优化）
 * 
 * 对Java 8用户的价值：
 * - 更简洁的防御性复制
 * - 清晰的语义：一看就知道是在创建不可变副本
 * - 减少出错的可能（忘记调用unmodifiable）
 */
public class Java10CollectionCopyOf {
    public static void demo() {
        System.out.println("\n2. Collection copyOf() Methods:");
        
        // 创建一个可变的原始列表
        var originalList = new ArrayList<String>();
        originalList.add("One");
        originalList.add("Two");
        originalList.add("Three");
        
        // Java 8写法:
        // List<String> immutableCopy = Collections.unmodifiableList(new ArrayList<>(originalList));
        // Java 10写法: 使用copyOf()一步完成
        var immutableCopy = List.copyOf(originalList);
        System.out.println("  Original List: " + originalList);
        System.out.println("  Immutable Copy: " + immutableCopy);
        
        // 修改原始列表，不会影响不可变副本
        originalList.add("Four");
        System.out.println("  After modifying original: " + originalList);
        System.out.println("  Immutable copy unchanged: " + immutableCopy);
        
        // 注意：immutableCopy.add("Five") 会抛出 UnsupportedOperationException
    }
}
