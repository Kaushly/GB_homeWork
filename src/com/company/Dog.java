package com.company;

public class Dog extends Animal {

    public static int dogCount;

    public Dog(String name) {
        super(name);
        this.runing = Math.random() <= 0.4 ? 400 : 600;     // бегает либо 400 либо 600
        this.swimming = (int) (Math.random() * 100 + 200);   // плавает от 200 до 300
        dogCount++;

    }

    @Override
    public String getType() {
        return "Пёс";
    }
}
