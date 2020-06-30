package com.company;

public class Dog extends Animal {
    public static int dogCount;


    public Dog(String name, int age, int runing, int swimming) {
        super(name, age, runing, swimming);
        dogCount++;

    }

    @Override
    public String getType() {
        return "Пёс";
    }
}
