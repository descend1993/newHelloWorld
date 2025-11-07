package com.demo.java10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java10VarKeyword {
    public static void demo() {
        System.out.println("\n1. Local Variable Type Inference (var keyword):");
        
        var message = "Hello, Java 10!";
        System.out.println("  var message = " + message);
        
        var number = 42;
        System.out.println("  var number = " + number);
        
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Kotlin");
        System.out.println("  var list = " + list);
        
        var map = new HashMap<String, Integer>();
        map.put("Java", 10);
        map.put("Kotlin", 1);
        System.out.println("  var map = " + map);
        
        for (var entry : map.entrySet()) {
            System.out.println("    " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
