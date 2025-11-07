package com.demo.java19;

public class Java19PatternMatching {
    
    sealed interface Animal permits Dog, Cat, Bird {}
    record Dog(String name, int age) implements Animal {}
    record Cat(String name, boolean indoor) implements Animal {}
    record Bird(String name, boolean canFly) implements Animal {}
    
    public static void demo() {
        System.out.println("\n2. Pattern Matching Enhancements (Preview):");
        
        Animal dog = new Dog("Buddy", 5);
        Animal cat = new Cat("Whiskers", true);
        Animal bird = new Bird("Tweety", true);
        
        System.out.println("  " + describeAnimal(dog));
        System.out.println("  " + describeAnimal(cat));
        System.out.println("  " + describeAnimal(bird));
    }
    
    private static String describeAnimal(Animal animal) {
        return switch (animal) {
            case Dog d -> "Dog named " + d.name() + ", age " + d.age();
            case Cat c -> "Cat named " + c.name() + ", indoor: " + c.indoor();
            case Bird b -> "Bird named " + b.name() + ", can fly: " + b.canFly();
        };
    }
}
