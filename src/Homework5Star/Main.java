package Homework5Star;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        try {
            method1(13);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        method1(12);
        method1(4);
        method1(7);
        method1(10);
    }

    public static void method1(int monthNumber) {
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> throw new RuntimeException("Некорректный номер месяца");
        };
        System.out.println(season);
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Введите число:");
        int number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                sc.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите число повторно:");
            }
        }
        if (number >= 0 && number <= 100) {
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            throw new IllegalArgumentException(number + " - число не в заданном диапазоне");
        }
    }
}