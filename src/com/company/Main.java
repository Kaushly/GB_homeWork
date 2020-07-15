package com.company;

import java.util.Scanner;

public class Main {
    private static boolean repeat = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vasay", 120),
                new Cat("Kudablay", 10),
                new Cat("Komok", 20),
                new Cat("Ded", 60),
                new Cat("KOTOstrofa", 4),
                new Cat("Marshmelloy", 7),
        };

        menu(cats);
    }

    private static void menu(Cat[] cats) {
        while (repeat) {
            System.out.println("Как будем кормить котов? \n 1 - Каждому своя тарелка \n 2 - Одна тарелка на всех");
            int numMenu = scanner.nextInt();
            switch (numMenu) {
                case 1:
                    oneCatOnePlate(cats);
                    repeat = false;
                    break;
                case 2:
                    manyCatAndOnePlate(cats);
                    repeat = false;
                    break;
                default:
                    System.out.println("Не правильный выбор!");
                    break;
            }
        }
    }

    private static void manyCatAndOnePlate(Cat[] cats) {
        System.out.println();
        System.out.println("================ Много котов - одна тарелка ================");
        System.out.println();

        Plate plate;

        System.out.println("Сколько еды положить в тарелку на всех?");
        int food = scanner.nextInt();
        if (food > 0) {
            plate = new Plate(food);
        } else {
            System.out.println("Нельзя отбирать еду у котов! \nМы сами положили 100 еды");
            System.out.println("====================================");
            plate = new Plate(100);
        }

        for (Cat animal : cats) {
            animal.eat(plate);
            if (animal.isHungry()) {
                plate.addFood();
                animal.eat(plate);
            }
            System.out.println(plate.toString());
        }

        feedingResults(cats);
    }

    private static void oneCatOnePlate(Cat[] cats) {

        System.out.println();
        System.out.println("================ Один кот - одна тарелка ================");
        System.out.println();

        Plate[] plates = new Plate[cats.length];
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Сколько еды положить для " + cats[i].getName() + " с аппетитом : " + cats[i].getAppetite());
            int food = scanner.nextInt();
            if (food > 0) {
                plates[i] = new Plate(food);
            } else {
                System.out.println("Мы автоматически добавили " + cats[i].getAppetite() + " порций еды для кота " + cats[i].getName());
                plates[i] = new Plate(cats[i].getAppetite());
            }
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plates[i]);
            if(cats[i].isHungry()){
                plates[i].addFood();
                cats[i].eat(plates[i]);
            }
            System.out.println(plates[i].toString());
        }

        feedingResults(cats);

    }

    private static void feedingResults(Cat[] cats) {
        System.out.println("=============Голодные=============");
        for (Cat animal : cats) {
            if (animal.isHungry()) {
                System.out.println(animal.toString());
            }
        }
        System.out.println("==============Сытые===============");
        for (Cat animal : cats) {
            if (!animal.isHungry()) {
                animal.info();
            }
        }
    }
}