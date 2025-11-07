package com.demo.java10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java 10 局部变量类型推断（var关键字）演示
 * 
 * Java 8的限制：
 * - 必须显式声明所有局部变量的类型
 * - 对于复杂的泛型类型，代码会很冗长
 * - 例如：Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
 * 
 * Java 10的改进：
 * - 使用var关键字进行局部变量类型推断
 * - 编译器根据初始化表达式自动推断类型
 * - 只能用于局部变量（不能用于字段、方法参数、返回类型）
 * - 必须有初始化表达式（不能是null）
 * 
 * 注意事项：
 * - var不是新的关键字，只在局部变量声明时有特殊含义
 * - 仍然是强类型，编译时确定类型
 * - 不能用于 lambda 表达式参数（Java 11才支持）
 * - 代码可读性优先：如果类型不明显，最好还是显式声明
 * 
 * 对Java 8用户的价值：
 * - 减少样板代码，特别是复杂的泛型类型
 * - 提高代码可读性（在类型明显的情况下）
 * - 更容易重构（改变类型时不需要改变声明）
 */
public class Java10VarKeyword {
    public static void demo() {
        System.out.println("\n1. Local Variable Type Inference (var keyword):");
        
        // Java 8: String message = "Hello, Java 10!";
        // Java 10: 使用var，编译器推断为String类型
        var message = "Hello, Java 10!";
        System.out.println("  var message = " + message);
        
        // 编译器推断为int类型（不是Integer）
        var number = 42;
        System.out.println("  var number = " + number);
        
        // Java 8: ArrayList<String> list = new ArrayList<String>();
        // Java 10: 使用var避免重复类型声明
        // 推断类型为ArrayList<String>
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Kotlin");
        System.out.println("  var list = " + list);
        
        // 对于复杂的泛型类型，var特别有用
        // Java 8需要写两遍类型
        var map = new HashMap<String, Integer>();
        map.put("Java", 10);
        map.put("Kotlin", 1);
        System.out.println("  var map = " + map);
        
        // 在for-each循环中使用var
        // 编译器推断entry的类型为Map.Entry<String, Integer>
        for (var entry : map.entrySet()) {
            System.out.println("    " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
