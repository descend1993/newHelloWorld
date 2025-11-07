package com.demo.java17;

sealed interface Vehicle permits Car, Motorcycle, Truck {
    String getType();
}

final class Car implements Vehicle {
    private final String model;
    
    Car(String model) {
        this.model = model;
    }
    
    @Override
    public String getType() {
        return "Car: " + model;
    }
}

final class Motorcycle implements Vehicle {
    private final String brand;
    
    Motorcycle(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String getType() {
        return "Motorcycle: " + brand;
    }
}

final class Truck implements Vehicle {
    private final int capacity;
    
    Truck(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public String getType() {
        return "Truck with capacity: " + capacity + " tons";
    }
}

public class Java17SealedClasses {
    public static void demo() {
        System.out.println("\n1. Sealed Classes (Standard):");
        
        Vehicle car = new Car("Tesla Model 3");
        Vehicle motorcycle = new Motorcycle("Harley Davidson");
        Vehicle truck = new Truck(10);
        
        System.out.println("  " + car.getType());
        System.out.println("  " + motorcycle.getType());
        System.out.println("  " + truck.getType());
    }
}
