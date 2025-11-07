package com.demo.java14;

/**
 * Record类型示例
 * 
 * Records是不可变数据类的简洁表示方式
 * Java 8中，创建类似的不可变数据类需要：
 * - 声明final类
 * - 声明private final字段
 * - 编写构造函数
 * - 编写getter方法
 * - 重写equals()、hashCode()、toString()
 * 通常需要50+行代码！
 * 
 * Java 14+的Record只需一行：
 * record Point(int x, int y) {}
 * 
 * 自动生成：
 * - 所有字段都是private final
 * - 公共构造函数
 * - 访问器方法（x()、y()，而不是getX()、getY()）
 * - equals()、hashCode()、toString()
 */
record Point(int x, int y) {
    // Records可以添加自定义方法
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

/**
 * Java 14 Records演示（预览特性）
 * 
 * Java 8创建数据类的问题：
 * - 需要大量样板代码（字段、构造函数、getter、equals/hashCode/toString）
 * - 容易出错（忘记更新equals/hashCode）
 * - 维护成本高（添加字段需要修改多处）
 * 
 * Java 14引入的Records（预览）：
 * - 用于表示不可变数据的特殊类
 * - 声明时只需指定字段，其他自动生成
 * - 自动生成构造函数、访问器、equals/hashCode/toString
 * - 所有字段都是final，Records本身也是final
 * 
 * 注意：
 * - Java 14/15是预览特性，需要--enable-preview
 * - Java 16正式发布为标准特性
 * - Records不能继承其他类（但可以实现接口）
 * - 所有字段都是final，Records是不可变的
 * 
 * 对Java 8用户的价值：
 * - 极大减少样板代码（从50+行减少到1行）
 * - 清晰表达意图：这是一个数据载体
 * - 避免equals/hashCode错误
 * - 完美契合值语义和函数式编程
 */
public class Java14Records {
    public static void demo() {
        System.out.println("\n3. Records (Preview):");
        
        // 使用自动生成的构造函数
        Point p1 = new Point(3, 4);
        
        // toString()自动生成，格式：Point[x=3, y=4]
        System.out.println("  Point: " + p1);
        
        // 访问器方法：x() 和 y()（不是getX()和getY()）
        System.out.println("  X: " + p1.x() + ", Y: " + p1.y());
        
        // 可以添加自定义方法
        System.out.println("  Distance from origin: " + p1.distanceFromOrigin());
        
        // equals()和hashCode()基于所有字段自动生成
        Point p2 = new Point(3, 4);
        System.out.println("  p1.equals(p2): " + p1.equals(p2));  // true
        System.out.println("  p1.hashCode(): " + p1.hashCode());
    }
}
