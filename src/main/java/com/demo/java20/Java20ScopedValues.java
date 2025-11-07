package com.demo.java20;

public class Java20ScopedValues {
    public static void demo() {
        System.out.println("\n1. Scoped Values (Preview):");
        System.out.println("  Scoped Values provide a way to share immutable data");
        System.out.println("  within a thread and its child threads");
        System.out.println("  (Simpler alternative to ThreadLocal)");
        
        ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "Thread Local Value");
        System.out.println("  ThreadLocal value: " + threadLocal.get());
        threadLocal.remove();
    }
}
