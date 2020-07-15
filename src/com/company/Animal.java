package com.company;

public abstract class Animal {
    protected String name;
    protected int runing;
    protected int swimming;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        this.runing = runing;
        this.swimming = swimming;
        count++;
    }

    public void run(int i) {
        if (i > runing) {
            System.out.println(getType() + " " + name + " пробежал " + runing + " метров и оставшиеся " +
                    (i - runing) + " метров прошел пешком");
        } else if (i < runing) {
            System.out.println(getType() + " " + name + " пробежал " + i + " метров");
        } else {
            System.out.println(getType() + " " + name + " пробежал " + runing + " метров");
        }
    }

    public void swim(int i) {
        if (i > swimming) {
            System.out.println(getType() + " " + name + " проплыл " + swimming + " и утонул!");
        } else if (i < swimming) {
            System.out.println(getType() + " " + name + " проплыл " + i + " метров");
        } else {
            System.out.println(getType() + " " + name + " проплыл " + swimming + " метров");
        }

    }

    public abstract String getType();
}
