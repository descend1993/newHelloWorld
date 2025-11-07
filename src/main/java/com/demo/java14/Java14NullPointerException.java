package com.demo.java14;

public class Java14NullPointerException {
    static class Person {
        String name;
        Address address;
        
        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }
    }
    
    static class Address {
        String city;
        
        Address(String city) {
            this.city = city;
        }
    }
    
    public static void demo() {
        System.out.println("\n2. Helpful NullPointerExceptions:");
        System.out.println("  Java 14+ provides more detailed NPE messages");
        System.out.println("  showing exactly which variable was null");
        
        try {
            Person person = new Person("John", null);
            String city = person.address.city;
        } catch (NullPointerException e) {
            System.out.println("  Caught NPE: " + e.getMessage());
        }
    }
}
