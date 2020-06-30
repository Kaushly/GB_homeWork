package com.company;

public class Cat extends Animal {
    public static int catCount;

    public Cat(String name, int age, int runing, int swimming) {
        super(name, age, runing, swimming);
        catCount++;
    }

    @Override
    public void swim(int i) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    @Override
    public String getType() {
        return "Кот";
    }
}
