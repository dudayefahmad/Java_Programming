package com.ahmaddudayef.section7.composition;

public class Car extends Vehicle {

    private int doors;
    private int capacity;

    public Car(String name, int doors, int capacity) {
        super(name);
        this.doors = doors;
        this.capacity = capacity;
    }
}
