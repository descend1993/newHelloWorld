package com.demo.java16;

record Employee(String name, int age, String department) {
    public Employee {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    
    public Employee(String name, String department) {
        this(name, 0, department);
    }
}

public class Java16Records {
    public static void demo() {
        System.out.println("\n1. Records (Standard):");
        
        Employee emp1 = new Employee("Alice", 30, "Engineering");
        System.out.println("  Employee 1: " + emp1);
        System.out.println("  Name: " + emp1.name());
        System.out.println("  Age: " + emp1.age());
        System.out.println("  Department: " + emp1.department());
        
        Employee emp2 = new Employee("Bob", "Marketing");
        System.out.println("  Employee 2: " + emp2);
    }
}
