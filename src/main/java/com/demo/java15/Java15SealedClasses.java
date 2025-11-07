package com.demo.java15;

sealed interface Shape permits Circle, Rectangle, Triangle {
    double area();
}

final class Circle implements Shape {
    private final double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String toString() {
        return "Circle(radius=" + radius + ")";
    }
}

final class Rectangle implements Shape {
    private final double width;
    private final double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
    
    @Override
    public String toString() {
        return "Rectangle(width=" + width + ", height=" + height + ")";
    }
}

final class Triangle implements Shape {
    private final double base;
    private final double height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    @Override
    public String toString() {
        return "Triangle(base=" + base + ", height=" + height + ")";
    }
}

public class Java15SealedClasses {
    public static void demo() {
        System.out.println("\n2. Sealed Classes (Preview):");
        
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0);
        
        System.out.println("  " + circle + " - Area: " + circle.area());
        System.out.println("  " + rectangle + " - Area: " + rectangle.area());
        System.out.println("  " + triangle + " - Area: " + triangle.area());
    }
}
