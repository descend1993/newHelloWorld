package com.demo.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Java17RandomGenerator {
    public static void demo() {
        System.out.println("\n2. Enhanced Random Generator API:");
        
        RandomGenerator random = RandomGenerator.getDefault();
        
        System.out.println("  Random integers:");
        random.ints(5, 1, 100)
            .forEach(n -> System.out.print("    " + n));
        System.out.println();
        
        System.out.println("  Random doubles:");
        random.doubles(3, 0.0, 1.0)
            .forEach(d -> System.out.printf("    %.2f%n", d));
        
        System.out.println("  Available algorithms:");
        RandomGeneratorFactory.all()
            .limit(3)
            .forEach(factory -> System.out.println("    " + factory.name()));
    }
}
