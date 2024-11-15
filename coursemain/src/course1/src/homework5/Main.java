package homework5;

import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        try {
            method1(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            method1(2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method1(0);
        method1(1);
    }

    public static void method1(int clientOS) {
        if (clientOS != 0 && clientOS != 1) {
            throw new IllegalArgumentException("Неподходящее значение, выберите 0 или 1");
        }
        System.out.print("Установите версию приложения для ");
        System.out.println(clientOS == 0
                ? "iOS по ссылке"
                : "Android по ссылке");
    }

    public static void task2() {
        System.out.println("Задача 2");
        try {
            method2(-1, 2015);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            method2(1, 2030);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            method2(1, 1999);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method2(1, 2014);
        method2(1, 2015);
        method2(0, 2014);
        method2(0, 2015);
        method2(0, 2000);
    }

    public static void method2(int clientOS, int clientDeviceYear) {
        int yearNow = YearMonth.now().getYear();
        if (clientDeviceYear > yearNow || clientDeviceYear < 2000) {
            throw new IllegalArgumentException("Неподходящее значение, выберите существующий год производства вашего устройства");
        }
        if (clientOS != 0 && clientOS != 1) {
            throw new IllegalArgumentException("Неподходящее значение, выберите 0 или 1");
        }
        if (clientOS == 0) {
            System.out.println(clientDeviceYear < 2015
                    ? "Установите облегченную версию приложения для iOS по ссылке"
                    : "Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println(clientDeviceYear < 2015
                    ? "Установите облегченную версию приложения для Android по ссылке"
                    : "Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        try {
            method3(1200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method3(2023);
        method3(2024);
        method3(2000);
        method3(1900);
        method3(2030);
    }

    public static void method3(int year) {
        if (year < 1584) {
            throw new IllegalArgumentException("Неподходящее значение");
        }
        System.out.println(
                year % 400 == 0 ? "год является високосным" :
                        year % 4 == 0 && year % 100 != 0 ?
                                "год является високосным" : "год не является високосным");
    }

    public static void task4() {
        System.out.println("Задача 4");
        method4(0);
        method4(10);
        method4(20);
        method4(30);
        method4(60);
        method4(80);
        method4(100);
        method4(110);
    }

    public static void method4(int deliveryDistance) {
        int deliveryTime = 1;
        System.out.println(deliveryDistance);
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

    public static void task5() {
        System.out.println("Задача 5");
        try {
            method5(13);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method5(12);
        method5(3);
        method5(7);
        method5(10);
    }

    public static void method5(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                throw new IllegalArgumentException("Такого сезона не существует");
        }
    }
}
