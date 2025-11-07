package com.demo.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java10CollectionCopyOf {
    public static void demo() {
        System.out.println("\n2. Collection copyOf() Methods:");
        
        var originalList = new ArrayList<String>();
        originalList.add("One");
        originalList.add("Two");
        originalList.add("Three");
        
        var immutableCopy = List.copyOf(originalList);
        System.out.println("  Original List: " + originalList);
        System.out.println("  Immutable Copy: " + immutableCopy);
        
        originalList.add("Four");
        System.out.println("  After modifying original: " + originalList);
        System.out.println("  Immutable copy unchanged: " + immutableCopy);
    }
}
