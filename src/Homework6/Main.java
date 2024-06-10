package Homework6;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int savingsMonth = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += savingsMonth;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int savingsMonth = 29_000_00;
        long total = 0;
        for (int i = 0; i < 12; i++) {
            total += Math.round(total * 0.01) + savingsMonth;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total / 100 + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 0; i < 10; i++) {
            System.out.println(2 + "*" + (i + 1) + "=" + 2 * (i + 1));
        }
    }
}
