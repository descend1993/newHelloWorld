package com.demo.java21;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Java 21 虚拟线程演示（标准特性）
 * 
 * Java 8的线程模型限制：
 * - 传统线程（平台线程）是操作系统线程的1:1映射
 * - 创建和维护线程的开销大（内存、上下文切换）
 * - 线程池限制了并发任务数量
 * - 高并发场景需要复杂的异步编程（CompletableFuture等）
 * - 创建10,000个平台线程几乎不可能
 * 
 * Java 21引入的虚拟线程（标准）：
 * - 轻量级线程，由JVM管理而非操作系统
 * - 可以轻松创建数百万个虚拟线程
 * - 使用简单的同步代码编写高并发应用
 * - 自动在平台线程上调度，无需线程池
 * - 内存占用极小（几KB vs 几MB）
 * 
 * 适用场景：
 * - I/O密集型应用（网络请求、数据库查询）
 * - 需要大量并发任务的场景
 * - 替代复杂的异步编程模式
 * 
 * 注意：
 * - Java 19/20是预览特性
 * - Java 21正式发布为标准特性
 * - 不适合CPU密集型任务（此场景仍用平台线程）
 * - 虚拟线程在阻塞时会自动让出平台线程
 * 
 * 对Java 8用户的价值：
 * - 革命性的并发编程简化
 * - 用同步代码实现异步性能
 * - 无需学习复杂的异步API
 * - 显著提升应用的可扩展性
 */
public class Java21VirtualThreads {
    public static void demo() {
        System.out.println("\n4. Virtual Threads (Standard):");
        
        // 演示：创建10,000个虚拟线程
        // Java 8中创建10,000个平台线程几乎不可能（会耗尽内存）
        // 虚拟线程可以轻松处理这种规模
        System.out.println("  Creating 10,000 virtual threads:");
        Instant start = Instant.now();
        
        // 创建虚拟线程执行器
        // Java 8需要：Executors.newFixedThreadPool(200)（无法支持10,000个并发）
        // 虚拟线程执行器会为每个任务创建一个新的虚拟线程
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10000).forEach(i -> {
                executor.submit(() -> {
                    try {
                        // 模拟I/O操作（如网络请求）
                        // 虚拟线程在sleep时会自动让出平台线程
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return i;
                });
            });
        }  // try-with-resources自动关闭并等待所有任务完成
        
        Duration duration = Duration.between(start, Instant.now());
        System.out.println("  Completed in: " + duration.toMillis() + "ms");
        
        // 方式1: 快速启动虚拟线程
        // Java 8需要：new Thread(() -> ...).start()（创建平台线程）
        Thread virtualThread = Thread.startVirtualThread(() -> {
            System.out.println("  Running in virtual thread: " + Thread.currentThread());
        });
        
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // 方式2: 使用Builder模式创建虚拟线程
        // 可以自定义名称、优先级等属性
        Thread.ofVirtual()
            .name("custom-virtual-thread")
            .start(() -> {
                System.out.println("  Custom named virtual thread: " + Thread.currentThread().getName());
            });
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
