package com.company;

public class Main {

    private static int lineAge = 40;

    public static void main(String[] args) {
        Staff[] arrayStaff = new Staff[5];
        arrayStaff[0] = new Staff("Sergey", "director", "dr@email.com", 555123456, 100000, 32);
        arrayStaff[1] = new Staff("Vladimir", "programmer", "prog@email.com", 555010101, 150000, 41);
        arrayStaff[2] = new Staff("Natalia", "HR", "hr@email.com", 55534507, 50000, 40);
        arrayStaff[3] = new Staff("Anastasia", "secretary", "secret@email.com", 5558000, 20000, 23);
        arrayStaff[4] = new Staff("Lena", "accountant", "money@email.com", 555100000, 120000, 45);

        for (Staff staff : arrayStaff) {
            if (staff.getAge() >= lineAge) {
                staff.info();
            }
        }
    }


}