package Homework11;

import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
        //task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        try {
            leapYearSearch(1200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        leapYearSearch(2023);
        leapYearSearch(2024);
        leapYearSearch(2000);
        leapYearSearch(1900);
        leapYearSearch(2030);
    }

    public static void
    leapYearSearch(int year) {
        if (year < 1584) {
            throw new IllegalArgumentException("Неподходящее значение");
        }
        System.out.println(
                year % 400 == 0 || year % 4 == 0 && year % 100 != 0
                        ? "год является високосным"
                        : "год не является високосным");
    }

    public static void task2() {
        System.out.println("Задача 2");
        try {
            selectingOS(-1, 2015);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            selectingOS(1, 2030);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            selectingOS(1, 1999);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        selectingOS(1, 2014);
        selectingOS(1, 2015);
        selectingOS(0, 2014);
        selectingOS(0, 2015);
        selectingOS(0, 2000);
    }

    public static void selectingOS(int clientOS, int clientDeviceYear) {
        int yearNow = YearMonth.now().getYear();
        if (clientDeviceYear > yearNow || clientDeviceYear < 2000) {
            throw new IllegalArgumentException("Неподходящее значение, выберите существующий год производства вашего устройства");
        }
        if (clientOS != 0 && clientOS != 1) {
            throw new IllegalArgumentException("Неподходящее значение, выберите 0 или 1");
        }
        String versionOS = clientDeviceYear < 2015 ? "облегченную " : "";
        String oS = clientOS == 0 ? "iOS" : "Android";
        System.out.println("Установитe " + versionOS + "версию приложения для " + oS + " по ссылке");
//        if (clientOS == 0) {
//            System.out.println(clientDeviceYear < 2015
//                    ? "Установите облегченную версию приложения для iOS по ссылке"
//                    : "Установите версию приложения для iOS по ссылке");
//        } else {
//            System.out.println(clientDeviceYear < 2015
//                    ? "Установите облегченную версию приложения для Android по ссылке"
//                    : "Установите версию приложения для Android по ссылке");
//        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        deliveryDaysCalculation(0);
        deliveryDaysCalculation(10);
        deliveryDaysCalculation(20);
        deliveryDaysCalculation(30);
        deliveryDaysCalculation(60);
        deliveryDaysCalculation(80);
        deliveryDaysCalculation(100);
        deliveryDaysCalculation(110);
    }

    public static void
    deliveryDaysCalculation(int deliveryDistance) {
        int deliveryTime = 1;
        System.out.println(deliveryDistance + " км");
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}