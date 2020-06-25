package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int size = 3;
    public static int sizeWin = 3;
    private static char map[][] = new char[size][size];

    private static final char EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        indentMap();
        drawMap();
        while (fullMap()) {
            if (Player()) break;
            if (AI()) break;
        }
    }

    private static boolean Player() {
        goPlayer();
        drawMap();
        if (checkWin(DOT_X)) {
            System.out.println("Выиграли - " + DOT_X);
            return true;
        }

        if(!fullMap()){
            return true;
        }
        return false;
    }

    private static boolean AI() {
        goAI();
        System.out.println("Ход компьютера");
        drawMap();
        if (checkWin(DOT_O)) {
            System.out.println("Выиграли - " + DOT_O);
            return true;
        }
        return false;
    }

    public static void indentMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public static void drawMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void goPlayer() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты через пробел");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!errorCoordinate(x, y));

        map[y][x] = DOT_X;
    }
    public static void goAI() {
        int x;
        int y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!errorCoordinate(x, y));

        map[y][x] = DOT_O;
    }

    private static boolean errorCoordinate(int x, int y) {
        boolean result = true;
        if (x < 0 || x >= size || y < 0 || y >= size) {
            System.out.println("Вы вышли за границы поля");
            result = false;
        } else if (map[y][x] != EMPTY) {
            result = false;
        }
        return result;
    }



    public static boolean fullMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == EMPTY) {
                    return true;
                }
            }
        }
        System.out.println("Ничья!");
        return false;
    }

    public static boolean checkWin(char symbol) {
        int diagonal = 0;
        int diagonal2 = 0;
        int row;
        int vert;
        for (int i = 0; i < size; i++) {
            row = 0;
            vert = 0;
            if (map[i][i] == symbol) {
                diagonal++;
                if(diagonal == sizeWin){
                    return true;
                }
            }
            if (map[i][size - i - 1] == symbol) {
                diagonal2++;
                if(diagonal2 == sizeWin){
                    return true;
                }
            }
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symbol) {
                    row++;
                    if(row == sizeWin){
                        return true;
                    }
                }
                if (map[j][i] == symbol) {
                    vert++;
                    if(vert == sizeWin){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}