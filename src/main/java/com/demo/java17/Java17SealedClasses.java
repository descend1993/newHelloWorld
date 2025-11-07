package com.demo.java17;

/**
 * Java 17 密封类演示（标准特性）
 * 
 * Java 8的类继承控制限制：
 * - 只有两个极端：完全开放（可以被任何类继承）或完全封闭（final，不能被继承）
 * - 无法限制"只有特定的类可以继承"
 * - 在设计API时，无法精确控制类层次结构
 * 
 * Java 17引入的密封类（标准）：
 * - 使用sealed关键字声明密封类/接口
 * - 使用permits子句明确列出允许的子类
 * - 子类必须是final、sealed或non-sealed之一
 * - 提供了介于"完全开放"和"完全封闭"之间的选择
 * 
 * 三种子类修饰符：
 * - final: 不能再被继承（最常用）
 * - sealed: 继续密封，需要自己的permits子句
 * - non-sealed: 重新开放，可以被任意类继承
 * 
 * 使用场景：
 * - 定义有限的类型层次（如代数数据类型）
 * - 配合模式匹配使用（编译器可以检查完整性）
 * - API设计：精确控制扩展点
 * 
 * 注意：
 * - Java 15/16是预览特性
 * - Java 17正式发布为标准特性
 * - 与Records和Pattern Matching配合使用效果最佳
 * 
 * 对Java 8用户的价值：
 * - 更精确的继承控制
 * - 更好的API设计能力
 * - 与模式匹配结合，实现类型安全的多态
 */
sealed interface Vehicle permits Car, Motorcycle, Truck {
    String getType();
}

// final表示不能再被继承
final class Car implements Vehicle {
    private final String model;
    
    Car(String model) {
        this.model = model;
    }
    
    @Override
    public String getType() {
        return "Car: " + model;
    }
}

// final表示不能再被继承
final class Motorcycle implements Vehicle {
    private final String brand;
    
    Motorcycle(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String getType() {
        return "Motorcycle: " + brand;
    }
}

// final表示不能再被继承
final class Truck implements Vehicle {
    private final int capacity;
    
    Truck(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public String getType() {
        return "Truck with capacity: " + capacity + " tons";
    }
}

// 注意：任何其他类都不能实现Vehicle接口
// 这在编译时就会被检查，提供了类型安全保证

public class Java17SealedClasses {
    public static void demo() {
        System.out.println("\n1. Sealed Classes (Standard):");
        
        // 只能创建permits子句中列出的类的实例
        Vehicle car = new Car("Tesla Model 3");
        Vehicle motorcycle = new Motorcycle("Harley Davidson");
        Vehicle truck = new Truck(10);
        
        System.out.println("  " + car.getType());
        System.out.println("  " + motorcycle.getType());
        System.out.println("  " + truck.getType());
        
        // 配合模式匹配使用时，编译器可以检查是否覆盖了所有可能的类型
    }
}
