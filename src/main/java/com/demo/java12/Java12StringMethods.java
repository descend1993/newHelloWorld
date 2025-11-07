package com.demo.java12;

/**
 * Java 12 String新方法演示
 * 
 * Java 8的字符串操作限制：
 * - 调整缩进需要手动分割、处理、拼接
 * - 链式转换需要创建中间变量或嵌套调用
 * 
 * Java 12的改进：
 * - indent(n): 调整每行的缩进（正数增加，负数减少）
 * - transform(): 对字符串应用函数转换，支持链式调用
 * 
 * 对Java 8用户的价值：
 * - 更方便的文本格式化
 * - 更流畅的函数式转换
 */
public class Java12StringMethods {
    public static void demo() {
        System.out.println("\n2. String Methods:");
        
        // indent(n): 为每一行添加n个空格的缩进
        // n为负数时减少缩进
        String text = "Hello\nJava\n12";
        System.out.println("  indent(4):");
        System.out.println(text.indent(4));
        
        // transform(): 对字符串应用函数转换
        // Java 8需要: String transformed = function.apply("java 12");
        // 或者嵌套调用，可读性差
        String transformed = "java 12".transform(s -> s.toUpperCase() + "!");
        System.out.println("  transform(): " + transformed);
    }
}
