package com.demo.java12;

public class Java12StringMethods {
    public static void demo() {
        System.out.println("\n2. String Methods:");
        
        String text = "Hello\nJava\n12";
        System.out.println("  indent(4):");
        System.out.println(text.indent(4));
        
        String transformed = "java 12".transform(s -> s.toUpperCase() + "!");
        System.out.println("  transform(): " + transformed);
    }
}
