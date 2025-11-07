package com.demo.java14;

public class Java14SwitchExpression {
    public static void demo() {
        System.out.println("\n1. Switch Expression (Standard):");
        
        int dayNumber = 3;
        String dayType = switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("  Day " + dayNumber + " is a " + dayType);
        
        String season = "SUMMER";
        String activity = switch (season) {
            case "SPRING" -> {
                System.out.println("    Spring is here!");
                yield "Planting flowers";
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
