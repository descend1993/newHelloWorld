package com.demo.java14;

/**
 * Java 14 instanceof的模式匹配演示（预览特性）
 * 
 * Java 8的instanceof使用方式：
 * - 先用instanceof检查类型
 * - 然后显式强制转换
 * - 需要声明新变量接收转换结果
 * - 代码冗长，重复变量名
 * 
 * Java 14引入的模式匹配（预览）：
 * - instanceof检查和类型转换合并为一步
 * - 自动创建转换后的变量
 * - 减少样板代码，提高可读性
 * - 变量作用域自动限定在条件成立的分支
 * 
 * 注意：
 * - Java 14/15是预览特性，需要--enable-preview
 * - Java 16正式发布为标准特性
 * - 模式变量的作用域由编译器智能确定
 * 
 * 对Java 8用户的价值：
 * - 消除冗余的类型转换代码
 * - 减少潜在的ClassCastException
 * - 代码更简洁、更安全
 * - 为未来更强大的模式匹配特性奠定基础
 */
public class Java14PatternMatching {
    public static void demo() {
        System.out.println("\n4. Pattern Matching for instanceof (Preview):");
        
        Object obj = "Hello, Java 14!";
        
        // Java 8写法：
        // if (obj instanceof String) {
        //     String s = (String) obj;  // 需要显式转换
        //     System.out.println("String length: " + s.length());
        //     System.out.println("Uppercase: " + s.toUpperCase());
        // }
        
        // Java 14写法：模式匹配
        // instanceof检查通过后，s变量自动创建并赋值
        // s的作用域自动限定在if块内
        if (obj instanceof String s) {
            System.out.println("  String length: " + s.length());
            System.out.println("  Uppercase: " + s.toUpperCase());
        }
        // 注意：这里s变量不可用，作用域已结束
        
        // 另一个例子
        Object number = 42;
        if (number instanceof Integer i) {
            // i已经是Integer类型，可以直接使用
            System.out.println("  Integer value: " + i);
            System.out.println("  Double value: " + (i * 2));
        }
    }
}
