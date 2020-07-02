package com.company;

public class Main {

    public static void main(String[] args) {
        initAnimal();
    }

    public static void initAnimal(){
        Cat cat = new Cat("Vasay", 10, 200, 0);
        Dog dog = new Dog("Barbos", 4, 500, 200);
        Dog dog2 = new Dog("Tod", 5, 500, 200);
        Dog dog3 = new Dog("Dey", 4, 500, 200);
        cat.run(2000);
        cat.swim(200);
        dog.run(4000);
        dog2.swim(600);
        dog3.run(400);
        dog3.swim(199);
        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего котов: " + Cat.catCount);
        System.out.println("Всего собак: " + Dog.dogCount);
    }
}