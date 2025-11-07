package com.demo.java20;

public class Java20RecordPatterns {
    
    record Point(int x, int y) {}
    record Circle(Point center, double radius) {}
    record Rectangle(Point topLeft, Point bottomRight) {}
    
    public static void demo() {
        System.out.println("\n2. Record Patterns (Preview):");
        
        Point point = new Point(10, 20);
        if (point instanceof Point(int x, int y)) {
            System.out.println("  Point coordinates: x=" + x + ", y=" + y);
        }
        
        Circle circle = new Circle(new Point(5, 5), 10.0);
        if (circle instanceof Circle(Point(int cx, int cy), double r)) {
            System.out.println("  Circle center: (" + cx + ", " + cy + "), radius: " + r);
        }
        
        Object shape = new Rectangle(new Point(0, 0), new Point(10, 10));
        String description = switch (shape) {
            case Rectangle(Point(int x1, int y1), Point(int x2, int y2)) ->
                "Rectangle from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")";
            default -> "Unknown shape";
        };
        System.out.println("  " + description);
    }
}
