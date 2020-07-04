package com.company;

import java.awt.*;
import java.util.Random;

public class Cat extends Animal {

    public static int catCount;

    public Cat(String name) {
        super(name);
        int minRun = 200;
        int maxRun = 400;
        Random random = new Random();
        this.runing = random.nextInt(maxRun - minRun) + minRun;
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
