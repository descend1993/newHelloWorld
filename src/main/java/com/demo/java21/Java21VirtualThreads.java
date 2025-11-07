package com.demo.java21;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Java21VirtualThreads {
    public static void demo() {
        System.out.println("\n4. Virtual Threads (Standard):");
        
        System.out.println("  Creating 10,000 virtual threads:");
        Instant start = Instant.now();
        
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10000).forEach(i -> {
                executor.submit(() -> {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return i;
                });
            });
        }
        
        Duration duration = Duration.between(start, Instant.now());
        System.out.println("  Completed in: " + duration.toMillis() + "ms");
        
        Thread virtualThread = Thread.startVirtualThread(() -> {
            System.out.println("  Running in virtual thread: " + Thread.currentThread());
        });
        
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
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
