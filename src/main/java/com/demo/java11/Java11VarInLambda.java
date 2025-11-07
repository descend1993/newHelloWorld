package com.demo.java11;

import java.util.List;
import java.util.function.Function;

/**
 * Java 11 Lambda参数使用var演示
 * 
 * Java 8和Java 10的限制：
 * - Java 8: lambda参数必须显式声明类型，或完全省略类型（让编译器推断）
 *   例如：(String s) -> ... 或 (s) -> ...
 * - Java 10: var只能用于局部变量，不能用于lambda参数
 * 
 * Java 11的改进：
 * - 允许在lambda参数中使用var
 * - 主要用途：为lambda参数添加注解
 * - 保持代码风格一致性（如果项目中大量使用var）
 * 
 * 使用场景：
 * - 需要为lambda参数添加注解时：(@NonNull var x) -> ...
 * - 保持代码风格统一：如果局部变量都用var，lambda也可以用
 * 
 * 注意事项：
 * - 如果使用var，所有参数都必须使用var
 * - 不能混用：(var x, y) -> ... 是错误的
 * - 必须使用括号：var x -> ... 是错误的，必须是 (var x) -> ...
 * 
 * 对Java 8用户的价值：
 * - 主要是为了注解支持，实际使用场景较少
 * - 保持代码风格一致性
 */
public class Java11VarInLambda {
    public static void demo() {
        System.out.println("\n4. Var in Lambda Parameters:");
        
        List<String> names = List.of("Alice", "Bob", "Charlie");
        
        // Java 8写法: names.forEach((String name) -> ...) 或 names.forEach(name -> ...)
        // Java 11写法: 可以使用var（主要用于需要添加注解的场景）
        names.forEach((var name) -> {
            System.out.println("  Hello, " + name + "!");
        });
        
        // 在Function中使用var
        // 如果需要添加注解，var就很有用了
        // 例如：(@NonNull var s) -> s.toUpperCase()
        Function<String, String> toUpperCase = (var s) -> s.toUpperCase();
        System.out.println("  Uppercase: " + toUpperCase.apply("java 11"));
    }
}
