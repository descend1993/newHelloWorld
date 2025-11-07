package com.demo.java9;

/**
 * Java 9 进程API增强演示
 * 
 * Java 8的Process API限制：
 * - Process类功能有限，只能获取基本的输入输出流
 * - 无法获取进程ID（PID）
 * - 无法获取进程的详细信息（如用户、命令、启动时间等）
 * - 无法方便地管理进程树和子进程
 * 
 * Java 9的改进：
 * - 新增ProcessHandle接口，提供进程的完整控制
 * - 可以获取当前进程和其他进程的PID
 * - ProcessHandle.Info提供进程的详细元数据
 * - 可以遍历进程树，管理子进程和后代进程
 * - 支持进程生命周期监控（onExit()等）
 * 
 * 对Java 8用户的价值：
 * - 不再需要依赖平台特定的本地代码来管理进程
 * - 可以编写跨平台的进程管理代码
 * - 更容易监控和控制Java应用启动的外部进程
 */
public class Java9ProcessAPI {
    public static void demo() {
        System.out.println("\n5. Process API Enhancements:");
        
        // ProcessHandle.current(): 获取当前Java进程的句柄
        // Java 8无法直接获取当前进程信息
        ProcessHandle current = ProcessHandle.current();
        System.out.println("  Current Process ID: " + current.pid());
        
        // ProcessHandle.Info: 包含进程的详细信息
        // 所有信息都封装在Optional中，因为某些信息可能不可用（取决于操作系统和权限）
        ProcessHandle.Info info = current.info();
        info.command().ifPresent(cmd -> System.out.println("  Command: " + cmd));
        info.user().ifPresent(user -> System.out.println("  User: " + user));
        info.startInstant().ifPresent(start -> System.out.println("  Start Time: " + start));
    }
}
