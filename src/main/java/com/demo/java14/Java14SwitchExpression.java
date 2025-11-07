package com.demo.java14;

/**
 * Java 14 Switch表达式演示（标准特性）
 * 
 * Java 12/13是预览特性，Java 14正式成为标准
 * 
 * 新增yield关键字：
 * - 用于从switch表达式的代码块中返回值
 * - 类似return，但专门用于switch表达式
 * - 当case分支需要多条语句时使用
 * 
 * 对Java 8用户的价值：
 * - 这是Java 14中最重要的语法改进之一
 * - 从此告别冗长易错的switch语句
 */
public class Java14SwitchExpression {
    public static void demo() {
        System.out.println("\n1. Switch Expression (Standard):");
        
        // 简单的switch表达式：箭头后直接是值
        int dayNumber = 3;
        String dayType = switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> "Weekday";  // 多个case值用逗号分隔
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("  Day " + dayNumber + " is a " + dayType);
        
        // 复杂的switch表达式：使用代码块和yield关键字
        // yield用于从代码块中返回值（类似return，但专用于switch）
        String season = "SUMMER";
        String activity = switch (season) {
            case "SPRING" -> {
                System.out.println("    Spring is here!");
                yield "Planting flowers";  // yield返回值
            }
            case "SUMMER" -> {
                System.out.println("    Summer time!");
                yield "Going to the beach";
            }
            case "FALL" -> {
                System.out.println("    Fall colors!");
                yield "Hiking in the woods";
            }
            case "WINTER" -> {
                System.out.println("    Winter wonderland!");
                yield "Building a snowman";
            }
            default -> "Unknown season";
        };
        System.out.println("  Activity: " + activity);
    }
}
