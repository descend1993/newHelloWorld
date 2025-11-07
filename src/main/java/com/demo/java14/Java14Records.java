package com.demo.java14;

record Point(int x, int y) {
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

public class Java14Records {
    public static void demo() {
        System.out.println("\n3. Records (Preview):");
        
        Point p1 = new Point(3, 4);
        System.out.println("  Point: " + p1);
        System.out.println("  X: " + p1.x() + ", Y: " + p1.y());
        System.out.println("  Distance from origin: " + p1.distanceFromOrigin());
        
        Point p2 = new Point(3, 4);
        System.out.println("  p1.equals(p2): " + p1.equals(p2));
        System.out.println("  p1.hashCode(): " + p1.hashCode());
    }
}
