package com.demo.java9;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Java 9 Optional增强演示
 * 
 * Java 8 Optional的限制：
 * - ifPresent()只能处理有值的情况，没有else分支
 * - orElse()/orElseGet()只能返回值，不能返回Optional
 * - Optional无法直接转换为Stream，在Stream操作中不够灵活
 * 
 * Java 9的改进：
 * - ifPresentOrElse(): 同时处理有值和无值的情况
 * - or(): 当Optional为空时，返回另一个Optional（延迟计算）
 * - stream(): 将Optional转换为Stream，方便与Stream API集成
 * 
 * 对Java 8用户的价值：
 * - 减少if-else分支，代码更函数式
 * - Optional链式调用更灵活
 * - 与Stream API无缝集成
 */
public class Java9OptionalEnhancements {
    public static void demo() {
        System.out.println("\n4. Optional Enhancements:");
        
        // ifPresentOrElse(): 提供值存在和不存在两种情况的处理
        // Java 8需要: if(value.isPresent()) {...} else {...}
        // Java 9可以用函数式风格处理两种情况
        System.out.println("  ifPresentOrElse():");
        Optional<String> value = Optional.of("Java 9");
        value.ifPresentOrElse(
            v -> System.out.println("    Present: " + v),      // 值存在时的操作
            () -> System.out.println("    Not present")        // 值不存在时的操作
        );
        
        // or(): 当Optional为空时，返回另一个Optional
        // 与orElse()不同，or()返回的是Optional，可以继续链式调用
        // 与orElseGet()不同，or()返回Optional而不是值本身
        System.out.println("  or() - Provide alternative Optional:");
        Optional<String> empty = Optional.empty();
        Optional<String> result = empty.or(() -> Optional.of("Default Value"));
        System.out.println("    Result: " + result.get());
        
        // stream(): 将Optional转换为包含0个或1个元素的Stream
        // 这在flatMap场景中特别有用，可以过滤掉空的Optional
        // Java 8需要: optional.isPresent() ? Stream.of(optional.get()) : Stream.empty()
        System.out.println("  stream() - Convert Optional to Stream:");
        Stream<String> stream = Optional.of("Stream from Optional").stream();
        stream.forEach(s -> System.out.println("    " + s));
    }
}
