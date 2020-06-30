package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Vasay", 10, 200, 0);
        Dog dog = new Dog("tod", 4, 500, 200);
        Dog dog2 = new Dog("tod1", 4, 500, 200);
        Dog dog3 = new Dog("tod2", 4, 500, 200);
        cat.run(2000);
        cat.swim(200);
        dog.run(4000);
        dog.swim(600);
        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего котов: " + Cat.catCount);
        System.out.println("Всего собак: " + Dog.dogCount);
    }
}