package com.demo.java12;

import java.util.List;
import java.util.stream.Collectors;

public class Java12CollectionTeeing {
    public static void demo() {
        System.out.println("\n3. Teeing Collector:");
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        var result = numbers.stream()
            .collect(Collectors.teeing(
                Collectors.summingInt(Integer::intValue),
                Collectors.counting(),
                (sum, count) -> "Sum: " + sum + ", Count: " + count + ", Average: " + (sum / count)
            ));
        
        System.out.println("  " + result);
    }
}
