package com.demo.java19;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Java19VirtualThreads {
    public static void demo() {
        System.out.println("\n1. Virtual Threads (Preview):");
        
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 5).forEach(i -> {
                executor.submit(() -> {
                    System.out.println("  Virtual Thread " + i + ": " + Thread.currentThread());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return i;
                });
            });
        }
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
