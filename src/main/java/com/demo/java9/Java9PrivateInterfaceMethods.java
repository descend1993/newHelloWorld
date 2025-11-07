package com.demo.java9;

/**
 * Java 9 接口私有方法演示
 * 
 * Java 8引入的限制：
 * - 接口可以有default方法和static方法
 * - 但不能有private方法，导致default方法之间无法共享代码
 * - 只能在default方法中重复代码，或者使用public static方法（但这会暴露实现细节）
 * 
 * Java 9的改进：
 * - 允许接口中定义private方法和private static方法
 * - 可以在多个default方法之间共享代码，避免重复
 * - 不会暴露给实现类，保持接口的封装性
 * 
 * 使用场景：
 * - 当多个default方法需要共享通用逻辑时
 * - 需要将复杂的default方法拆分成更小的辅助方法时
 */
interface Logger {
    // Java 8的default方法 - 公共接口方法
    default void logInfo(String message) {
        // 调用private方法来复用代码逻辑
        log("INFO", message);
    }
    
    default void logWarning(String message) {
        // 在Java 8中，这里的代码会重复
        // Java 9可以提取到private方法中
        log("WARNING", message);
    }
    
    default void logError(String message) {
        log("ERROR", message);
    }
    
    // Java 9新特性: 接口的private方法
    // 用于在多个default方法之间共享代码，不暴露给实现类
    // Java 8中这是不允许的
    private void log(String level, String message) {
        System.out.println("  [" + level + "] " + message);
    }
}

/**
 * 实现Logger接口的类
 * 注意：实现类无法访问接口的private方法，只能使用public的default方法
 */
public class Java9PrivateInterfaceMethods implements Logger {
    public static void demo() {
        System.out.println("\n2. Private Interface Methods:");
        Java9PrivateInterfaceMethods demo = new Java9PrivateInterfaceMethods();
        
        // 使用从接口继承的default方法
        demo.logInfo("This is an info message");
        demo.logWarning("This is a warning message");
        demo.logError("This is an error message");
        // 注意：demo.log()无法调用，因为log()是private的
    }
}
