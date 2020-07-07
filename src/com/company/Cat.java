package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            hungry = false;
            System.out.println("Кот " + name + " съел " + appetite + " еды и наелся!");
            System.out.println("Кот " + name + " съел " + appetite + " еды и наелся!");
        } else
            System.out.println("Кот " + name + " голодный!");
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        return "Cat " + name + " hungry!";
    }

    public void info() {
        System.out.println("Cat " + name + " satisfied");
    }

}
