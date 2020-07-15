package com.company;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            System.out.println("Не хватает " + (n - food) + " еды");
        } else {
            food -= n;
            return true;
        }
        return false;
    }

    public void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите добавить еды в миску? \ny - yes/ n - no");
        String answer = scanner.nextLine();
        switch (answer) {
            case "y":
                System.out.println("Сколько еды добавите?");
                int dopFood = scanner.nextInt();
                if (dopFood > 0) {
                    System.out.println("Теперь в тарелке: " + (food += dopFood) + " еды");
                } else {
                    System.out.println("А Вы негодник=) \nНо мы не станем отнимать еду, а оставим как было!");
                    System.out.println(String.format("В тарелке осталось %s еды", food));
                }
                System.out.println("====================================");
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "В тарелке осталось: " + food + " еды \n====================================";
    }
}
