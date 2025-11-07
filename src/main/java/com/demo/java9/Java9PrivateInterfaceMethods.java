package com.demo.java9;

interface Logger {
    default void logInfo(String message) {
        log("INFO", message);
    }
    
    default void logWarning(String message) {
        log("WARNING", message);
    }
    
    default void logError(String message) {
        log("ERROR", message);
    }
    
    private void log(String level, String message) {
        System.out.println("  [" + level + "] " + message);
    }
}

public class Java9PrivateInterfaceMethods implements Logger {
    public static void demo() {
        System.out.println("\n2. Private Interface Methods:");
        Java9PrivateInterfaceMethods demo = new Java9PrivateInterfaceMethods();
        demo.logInfo("This is an info message");
        demo.logWarning("This is a warning message");
        demo.logError("This is an error message");
    }
}
