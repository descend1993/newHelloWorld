package com.demo.java9;

public class Java9ProcessAPI {
    public static void demo() {
        System.out.println("\n5. Process API Enhancements:");
        
        ProcessHandle current = ProcessHandle.current();
        System.out.println("  Current Process ID: " + current.pid());
        
        ProcessHandle.Info info = current.info();
        info.command().ifPresent(cmd -> System.out.println("  Command: " + cmd));
        info.user().ifPresent(user -> System.out.println("  User: " + user));
        info.startInstant().ifPresent(start -> System.out.println("  Start Time: " + start));
    }
}
