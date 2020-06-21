package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Random;

public class Main {

    private static BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));;

    public static void main(String[] args) throws IOException {
        moreOrLess();
        searchByName();
    }

    public static void moreOrLess() throws IOException {
        int n = 3;
        int b;
        do {
            Random random = new Random();
            int num = random.nextInt(10);
            System.out.println("Компьютер загадал число!");
            System.out.println("Попробуйте отгадать его с " + n + " попыток.");
            for (int i = 0; i < n; i++) {
                System.out.print("Введите число: ");
                int a = Integer.parseInt(reader.readLine());
                if (a < num) {
                    System.out.println("Загаданное число больше!");
                    System.out.println("У вас осталось " + (n - i - 1) + " попыток!");
                } else if (a > num) {
                    System.out.println("Загаданное число меньше!");
                    System.out.println("У вас осталось " + (n - i - 1) + " попыток!");
                } else {
                    System.out.println("Вы угадали");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            BufferedReader repeat = new BufferedReader(new InputStreamReader(System.in));
            b = Integer.parseInt(repeat.readLine());
        } while (b == 1);

    }

    public static void searchByName() throws IOException {
        int size = 15;
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int x = random.nextInt(words.length);
        String selectedName = words[x];
        System.out.println(selectedName);
        char[] chars = selectedName.toCharArray();
        System.out.println("Компьютер загадал слово!");
        while (true) {
            String word = reader.readLine();
            if (word.equals(selectedName)) {
                System.out.println();
                System.out.println("Поздравляем, Вы выиграли!!!");
                break;
            }
            for (int i = 0; i < selectedName.length(); i++) {
                char str = word.charAt(i);
                if (chars[i] == str) {
                    System.out.print(str);
                } else {
                    System.out.print("#");
                }
            }
            for (int i = 0; i < size - selectedName.length(); i++) {
                System.out.print("#");
            }
            System.out.println();
            System.out.println("Попробуй еще, слово тоже!");
        }
    }
}
/*
   1) Написать программу, которая загадывает случайное число от 0 до 9 и
    пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
    чем загаданное, или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    2)    * Создать массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        При запуске программы компьютер загадывает слово,
        запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
        правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно можно пользоваться:
        String str = "apple";
        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово.
        Используем только маленькие буквы.
*/
