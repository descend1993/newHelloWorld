package com.demo.java21;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Java 21 顺序集合(Sequenced Collections)演示
 * 
 * Java 8的集合API问题：
 * - 缺少统一的方法访问有序集合的首尾元素
 * - List有get(0)和get(size()-1)，但语义不清晰
 * - Deque有getFirst()/getLast()，但不是所有集合都实现
 * - LinkedHashSet有顺序但无法访问首尾元素
 * - 没有统一的反转视图方法
 * 
 * Java 21引入的顺序集合：
 * - 新增SequencedCollection、SequencedSet、SequencedMap接口
 * - 提供统一的首尾元素访问方法：
 *   - getFirst() / getLast()
 *   - addFirst() / addLast()
 *   - removeFirst() / removeLast()
 * - reversed(): 返回反转视图（不是副本！）
 * - List、Deque、LinkedHashSet、LinkedHashMap都实现了对应接口
 * 
 * 关键特性：
 * - reversed()返回的是视图，不是副本，修改会影响原集合
 * - 为所有有序集合提供了一致的API
 * - 向后兼容，不会破坏现有代码
 * 
 * 对Java 8用户的价值：
 * - 更一致、更直观的集合API
 * - 减少样板代码
 * - 提高代码可读性
 * - 避免索引错误（如size()-1）
 */
public class Java21SequencedCollections {
    public static void demo() {
        System.out.println("\n2. Sequenced Collections:");
        
        // List现在实现了SequencedCollection接口
        var list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        System.out.println("  List: " + list);
        
        // Java 8: list.get(0) 和 list.get(list.size() - 1)
        // Java 21: getFirst() 和 getLast() - 更清晰
        System.out.println("  First element: " + list.getFirst());
        System.out.println("  Last element: " + list.getLast());
        
        // addFirst() 和 addLast() - 语义更清晰
        // Java 8: list.add(0, "Beginning") 和 list.add("End")
        list.addFirst("Beginning");
        list.addLast("End");
        System.out.println("  After adding: " + list);
        
        // reversed(): 返回反转视图（不是副本）
        // 对反转视图的修改会影响原集合
        System.out.println("  Reversed: " + list.reversed());
        
        // LinkedHashSet现在也有首尾元素访问方法
        // Java 8中无法直接获取LinkedHashSet的首尾元素
        var set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("  Set: " + set);
        System.out.println("  First: " + set.getFirst() + ", Last: " + set.getLast());
        
        // LinkedHashMap实现了SequencedMap接口
        var map = new LinkedHashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("  Map: " + map);
        System.out.println("  First entry: " + map.firstEntry());
        System.out.println("  Last entry: " + map.lastEntry());
    }
}
