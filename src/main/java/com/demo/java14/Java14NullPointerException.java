package com.demo.java14;

/**
 * Java 14 增强的NullPointerException演示
 * 
 * Java 8的NPE问题：
 * - 错误信息模糊：只显示行号，不显示哪个变量为null
 * - 在复杂的链式调用中，很难定位具体哪个部分为null
 * - 例如：a.b.c.d，如果NPE，不知道是b、c还是d为null
 * 
 * Java 14的改进：
 * - 详细的NPE错误信息，精确指出哪个变量为null
 * - 显示完整的表达式和null的位置
 * - 极大提升调试效率
 * 
 * 示例对比：
 * Java 8: "java.lang.NullPointerException"
 * Java 14: "Cannot read field 'city' because 'person.address' is null"
 * 
 * 对Java 8用户的价值：
 * - 调试时间大幅减少
 * - 不再需要添加大量防御性日志
 * - 特别适合复杂的对象导航场景
 */
public class Java14NullPointerException {
    static class Person {
        String name;
        Address address;
        
        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }
    }
    
    static class Address {
        String city;
        
        Address(String city) {
            this.city = city;
        }
    }
    
    public static void demo() {
        System.out.println("\n2. Helpful NullPointerExceptions:");
        System.out.println("  Java 14+ provides more detailed NPE messages");
        System.out.println("  showing exactly which variable was null");
        
        try {
            // Java 8的NPE消息：java.lang.NullPointerException (无其他信息)
            // Java 14的NPE消息：Cannot read field "city" because "person.address" is null
            // 明确指出是address为null，而不是person或city
            Person person = new Person("John", null);
            String city = person.address.city;  // 这里会抛出NPE
        } catch (NullPointerException e) {
            System.out.println("  Caught NPE: " + e.getMessage());
            System.out.println("  (Java 8 would only show 'NullPointerException' without details)");
        }
    }
}
