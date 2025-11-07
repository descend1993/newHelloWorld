package com.demo.java12;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 12 Teeing收集器演示
 * 
 * Java 8的限制：
 * - 对同一个Stream进行多次聚合需要：
 *   1. 收集到中间集合，然后多次处理
 *   2. 或者使用多个Stream（重复数据源访问）
 * - 无法在一次遍历中执行多个收集操作并合并结果
 * 
 * Java 12引入的Teeing收集器：
 * - 同时应用两个收集器到同一个Stream
 * - 使用合并函数组合两个结果
 * - 只需遍历Stream一次，性能更好
 * 
 * 对Java 8用户的价值：
 * - 避免多次遍历或创建中间集合
 * - 更高效的多重聚合操作
 * - 代码更简洁明了
 */
public class Java12CollectionTeeing {
    public static void demo() {
        System.out.println("\n3. Teeing Collector:");
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Java 8需要两次操作：
        // int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        // long count = numbers.stream().count();
        // String result = "Sum: " + sum + ", Count: " + count + ...;
        
        // Java 12的teeing收集器：一次遍历完成两个聚合
        // 参数1: 第一个收集器（计算总和）
        // 参数2: 第二个收集器（计算数量）
        // 参数3: 合并函数，组合两个结果
        var result = numbers.stream()
            .collect(Collectors.teeing(
                Collectors.summingInt(Integer::intValue),  // 收集器1: 求和
                Collectors.counting(),                      // 收集器2: 计数
                (sum, count) -> "Sum: " + sum + ", Count: " + count + ", Average: " + (sum / count)
            ));
        
        System.out.println("  " + result);
    }
}
