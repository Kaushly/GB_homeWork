package com.company;

public class Main {

    public static void main(String[] args) {
        replace();
        System.out.println();
        System.out.println("______________");
        massive();
        System.out.println();
        System.out.println("______________");
        increase();
        System.out.println();
        System.out.println("______________");
        twoArray();
        System.out.println();
        System.out.println("______________");
        searchMaxMin();
        System.out.println();
        System.out.println("______________");
        leftAndRight();
        System.out.println();
        System.out.println("______________");
        offsetArray();

    }

    static void replace() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        for (int b : a) {
            System.out.print(b + " ");
        }
    }

    static void massive() {
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
        for (int b : a) {
            System.out.print(b + " ");
        }
    }

    static void increase() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int b : a) {
            if (b < 6) {
                b = b * 2;
            }
            System.out.print(b + " ");
        }
    }

    static void twoArray() {
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
                a[i][a.length - 1 - i] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void searchMaxMin() {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.print(num[i] + " ");
        }
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println();
        System.out.println("Максимальное число: " + max + ", а минимальное число: " + min);
    }

    static void leftAndRight() {
        int[] num = {12, 23, 1, 5, 5, 1}; // false
//        int[] num = {1, 1, 1, 2, 1}; // true
//        int [] num = {1, 1, 1, 1, 1, 1, 1, 1, 1, 9}; // true
        System.out.println();
        boolean mas = method(num);
        System.out.println("Сумма левой и правой части массива равны? " + mas);

    }
    static boolean method(int[] num) {
        int p = 0;
        boolean bname = false;
        while (!bname) {
            int sumLeft = 0;
            int sumRight = 0;
            if (p < num.length - 1) {
                p++;
            } else
                break;
            for (int i = 0; i < num.length - (num.length - p); i++) {
                int left = num[i];
                sumLeft = sumLeft + left;
            }
            for (int k = p; k < num.length; k++) {
                int right = num[k];
                sumRight = sumRight + right;
            }
            bname = (sumLeft == sumRight) ? true : false;
            if (bname) {
                System.out.println("Сумма чисел слева: " + sumLeft);
                System.out.println("Сумма чисел справа: " + sumRight);
            }
        }
        return bname;
    }

    static void offsetArray() {
        int[] num = new int[5];
//        int offset = 7;
        int offset = -4;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.print(num[i] + " ");
        }
        num = offsetMethod(num, offset);
        System.out.println();
        for (int result : num) {
            System.out.print(result + " ");
        }
    }
    static int[] offsetMethod(int[] num, int offset) {
        int inter = 0;
        int first = 0;
        if (offset < 0) {
            inter = num.length + offset;
        } else {
            inter = offset;
        }
        for (int i = 0; i < inter; i++) {
            int buffer = num[first];
            num[first] = num[num.length - 1];
            for (int j = 1; j < num.length - 1; j++) {
                num[num.length - j] = num[num.length - j - 1];
            }
            num[1] = buffer;
        }

        return num;
    }
}

