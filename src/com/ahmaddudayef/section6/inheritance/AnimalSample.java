package com.ahmaddudayef.section6.inheritance;

public class AnimalSample {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1, 5,5);

        Dog dog = new Dog("Yorke", 8, 28, 2, 4, 1, 20, "long silky");
//        dog.eat();
        dog.walk();
//        dog.run();

    }
}
