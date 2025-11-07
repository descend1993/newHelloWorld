package com.demo.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Java 11 Files新方法演示
 * 
 * Java 8读写文件的方式：
 * - 读取文件：Files.readAllLines()返回List<String>，然后String.join()
 *   或使用BufferedReader逐行读取
 * - 写入文件：Files.write()接受byte[]或List<String>
 *   需要先将String转换为byte[]：str.getBytes(charset)
 * 
 * Java 11的改进：
 * - Files.readString(): 直接读取文件内容为String
 * - Files.writeString(): 直接将String写入文件
 * - 默认使用UTF-8编码（也可指定其他编码）
 * - 方法签名更简洁，代码更易读
 * 
 * 对Java 8用户的价值：
 * - 减少样板代码，不需要手动处理编码和换行符
 * - 更直观的API，一看就懂
 * - 与Java 11的String新方法配合使用效果更好
 */
public class Java11FileMethods {
    public static void demo() {
        System.out.println("\n2. File Methods:");
        
        try {
            Path tempFile = Files.createTempFile("demo", ".txt");
            String content = "Hello from Java 11!\nNew file methods are great!";
            
            // Java 8写法: Files.write(tempFile, content.getBytes(StandardCharsets.UTF_8))
            // Java 11写法: 直接写入String，默认UTF-8编码
            Files.writeString(tempFile, content);
            System.out.println("  Written to file: " + tempFile);
            
            // Java 8写法: new String(Files.readAllBytes(tempFile), StandardCharsets.UTF_8)
            // 或者: String.join("\n", Files.readAllLines(tempFile, StandardCharsets.UTF_8))
            // Java 11写法: 一行搞定
            String readContent = Files.readString(tempFile);
            System.out.println("  Read from file:");
            System.out.println("    " + readContent.replace("\n", "\n    "));
            
            // 清理临时文件
            Files.deleteIfExists(tempFile);
            System.out.println("  Temporary file deleted");
        } catch (IOException e) {
            System.out.println("  Error: " + e.getMessage());
        }
    }
}
