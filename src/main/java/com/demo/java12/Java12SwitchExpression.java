package com.demo.java12;

/**
 * Java 12 Switch表达式演示（预览特性）
 * 
 * Java 8的Switch语句限制：
 * - Switch是语句，不是表达式，不能直接赋值
 * - 需要使用break，容易忘记导致fall-through错误
 * - 每个case只能有一个值
 * - 代码冗长，需要中间变量
 * 
 * Java 12引入的Switch表达式（预览）：
 * - Switch可以作为表达式使用，直接返回值
 * - 使用箭头语法(->)，自动break，避免fall-through
 * - 支持多个case值用逗号分隔
 * - 代码更简洁，无需中间变量
 * 
 * 注意：
 * - Java 12/13是预览特性，需要--enable-preview
 * - Java 14正式发布为标准特性
 * 
 * 对Java 8用户的价值：
 * - 减少样板代码和潜在的bug
 * - 代码更简洁、可读性更好
 * - 函数式编程风格
 */
public class Java12SwitchExpression {
    public static void demo() {
        System.out.println("\n1. Switch Expression (Preview):");
        
        String day = "MONDAY";
        
        // Java 8写法（语句）：
        // int numLetters;
        // switch (day) {
        //     case "MONDAY":
        //     case "FRIDAY":
        //     case "SUNDAY":
        //         numLetters = 6;
        //         break;  // 容易忘记break
        //     case "TUESDAY":
        //         numLetters = 7;
        //         break;
        //     ...
        // }
        
        // Java 12写法（表达式）：
        // - 使用箭头(->)代替冒号(:)，自动break
        // - 多个case值用逗号分隔
        // - 直接赋值，无需中间变量
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> 0;
        };
        System.out.println("  " + day + " has " + numLetters + " letters");
        
        // Switch表达式可以直接在任何需要值的地方使用
        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("  " + day + " is a " + result);
    }
}
