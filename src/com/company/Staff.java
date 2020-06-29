package com.company;

public class Staff {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Staff(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name + ", position: " + position + ", email:" + email
                + ", phone: " + phone + ", salary: " + salary + "$, age: " + age);
    }

    public int getAge() {
        return age;
    }


}