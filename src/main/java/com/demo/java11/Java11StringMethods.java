package com.demo.java11;

/**
 * Java 11 String新方法演示
 * 
 * Java 8的限制：
 * - trim()只能删除ASCII空格，不能处理Unicode空白字符
 * - 检查空白字符串需要：str.trim().isEmpty()
 * - 处理多行文本需要手动split("\n")或BufferedReader
 * - 重复字符串需要循环或第三方库
 * 
 * Java 11的改进：
 * - strip(): 正确处理Unicode空白字符（比trim()更强大）
 * - stripLeading()/stripTrailing(): 只删除前导/尾随空白
 * - isBlank(): 直接检查是否为空白字符串
 * - lines(): 返回Stream<String>，方便处理多行文本
 * - repeat(n): 重复字符串n次
 * 
 * 对Java 8用户的价值：
 * - 更好的国际化支持（Unicode空白字符）
 * - 更简洁的字符串验证和处理
 * - 与Stream API无缝集成
 */
public class Java11StringMethods {
    public static void demo() {
        System.out.println("\n1. New String Methods:");
        
        // strip()系列方法：正确处理Unicode空白字符
        // Java 8的trim()只能处理ASCII空格（\u0020及以下）
        // strip()能处理所有Unicode空白字符（如全角空格）
        String text = "  Hello, Java 11!  ";
        System.out.println("  Original: '" + text + "'");
        System.out.println("  strip(): '" + text.strip() + "'");          // 删除前后空白
        System.out.println("  stripLeading(): '" + text.stripLeading() + "'");   // 只删除前导空白
        System.out.println("  stripTrailing(): '" + text.stripTrailing() + "'"); // 只删除尾随空白
        
        // isBlank(): 检查是否为空白字符串
        // Java 8需要: blank.trim().isEmpty()
        String blank = "   ";
        System.out.println("  isBlank() on '   ': " + blank.isBlank());
        
        // lines(): 将字符串分割成行，返回Stream<String>
        // Java 8需要: Arrays.stream(multiline.split("\\R"))
        // 注意：lines()正确处理所有换行符（\n, \r, \r\n）
        String multiline = "Line 1\nLine 2\nLine 3";
        System.out.println("  lines():");
        multiline.lines().forEach(line -> System.out.println("    " + line));
        
        // repeat(n): 重复字符串n次
        // Java 8需要循环或使用String.join()
        String repeated = "Java ".repeat(3);
        System.out.println("  repeat(3): " + repeated);
    }
}
