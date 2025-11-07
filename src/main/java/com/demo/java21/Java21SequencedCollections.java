package com.demo.java21;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Java21SequencedCollections {
    public static void demo() {
        System.out.println("\n2. Sequenced Collections:");
        
        var list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        System.out.println("  List: " + list);
        System.out.println("  First element: " + list.getFirst());
        System.out.println("  Last element: " + list.getLast());
        
        list.addFirst("Beginning");
        list.addLast("End");
        System.out.println("  After adding: " + list);
        
        System.out.println("  Reversed: " + list.reversed());
        
        var set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("  Set: " + set);
        System.out.println("  First: " + set.getFirst() + ", Last: " + set.getLast());
        
        var map = new LinkedHashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("  Map: " + map);
        System.out.println("  First entry: " + map.firstEntry());
        System.out.println("  Last entry: " + map.lastEntry());
    }
}
