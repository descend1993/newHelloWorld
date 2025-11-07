package com.demo.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Java 11 标准HTTP客户端演示
 * 
 * Java 8的HTTP请求方式：
 * - 使用HttpURLConnection：API老旧，使用复杂
 * - 或依赖第三方库：Apache HttpClient, OkHttp等
 * - 不支持HTTP/2
 * - 同步API为主，异步需要手动管理线程
 * 
 * Java 11的改进：
 * - 标准的java.net.http包，无需第三方依赖
 * - 现代化的Builder模式API，易于使用
 * - 原生支持HTTP/2和WebSocket
 * - 同时支持同步和异步请求
 * - 支持响应式流（Reactive Streams）
 * 
 * 主要组件：
 * - HttpClient: 发送请求和接收响应，可重用
 * - HttpRequest: 表示HTTP请求，不可变
 * - HttpResponse: 表示HTTP响应
 * 
 * 对Java 8用户的价值：
 * - 不再需要依赖第三方库处理HTTP请求
 * - 更好的性能（HTTP/2）
 * - 更简洁的API
 * - 更好的异步支持
 */
public class Java11HttpClient {
    public static void demo() {
        System.out.println("\n3. Standard HTTP Client:");
        
        try {
            // 创建HttpClient实例
            // 支持配置版本、超时、代理、重定向策略等
            HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)  // 使用HTTP/2（默认也是HTTP/2）
                .build();
            
            // 使用Builder模式创建请求
            // Java 8的HttpURLConnection需要多行代码配置
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get"))
                .GET()  // HTTP方法：GET, POST, PUT, DELETE等
                .build();
            
            // 同步发送请求
            // 也支持异步：client.sendAsync()返回CompletableFuture
            System.out.println("  Sending HTTP GET request to httpbin.org...");
            HttpResponse<String> response = client.send(request, 
                HttpResponse.BodyHandlers.ofString());  // 响应体处理器
            
            System.out.println("  Status Code: " + response.statusCode());
            System.out.println("  Response Body (first 200 chars): ");
            System.out.println("    " + response.body().substring(0, 
                Math.min(200, response.body().length())) + "...");
        } catch (Exception e) {
            System.out.println("  HTTP request failed (this is normal in offline environments): " + e.getMessage());
        }
    }
}
