package Homework4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
//        task4();
//        task5();
//        task6();
//        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        try {
            method1(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method1(0);
        method1(10);
        method1(18);
        method1(100);
    }

    public static void method1(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Невозможный возраст");
        } else if (age < 18) {
            System.out.println(" Если возраст человека равен " + age + ", нужно немного подождать.");
        } else {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        try {
            method2(-274);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method2(-50);
        method2(0);
        method2(5);
        method2(50);
    }

    public static void method2(int outsideAirTemperature) {
        if (outsideAirTemperature < -273) {
            throw new IllegalArgumentException("Несуществующая температура в градусах по Цельсию");
        } else if (outsideAirTemperature < 5) {
            System.out.println(" На улице " + outsideAirTemperature + " градусов -  нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + outsideAirTemperature + " градусов -  можно идти без шапки ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        try {
            method3(-45);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        method3(0);
        method3(50);
        method3(60);
        method3(200);
    }

    public static void method3(int carSpeed) {
        if (carSpeed < 0) {
            throw new IllegalArgumentException("Несуществующая скорость");
        }else if (carSpeed <= 60) {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то можно ездить спокойно ");
        } else {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то  придется заплатить штраф ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        method4(-1);
        method4(0);
        method4(1);
        method4(2);
        method4(4);
        method4(6);
        method4(7);
        method4(18);
        method4(21);
        method4(24);
        method4(33);
        method4(60);
        method4(200);
    }

    public static void method4(int age) {
        if (age < 2) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно в школу");
        } else if (age > 18 && age < 24) {
            System.out.println(" Если возраст человека равен " + age + ", то его место в университете");
        } else if (age >= 24 && age < 60) {
            System.out.println(" Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println(" Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        method5(-1);
        method5(0);
        method5(5);
        method5(7);
        method5(14);
        method5(16);
        method5(200);
    }

    public static void method5(int age) {
        if (age < 5) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему  нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему  можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему  можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        method6(-1);
        method6(0);
        method6(40);
        method6(60);
        method6(80);
        method6(102);
        method6(200);
    }

    public static void method6(int occupiedPlaces) {
        int wagonCapacity = 102;
        int seating = 60;
        if (occupiedPlaces < seating) {
            System.out.println("В вагоне есть сидячии места");
        } else if (occupiedPlaces >= seating && occupiedPlaces < wagonCapacity) {
            System.out.println("В вагоне есть стоячии места");
        } else {
            System.out.println("В вагоне мест нет");
        }
    }

    private static void task7() {
        System.out.println("Задача 7");
        method7(5, 7, 10);
        method7(10, 5, 7);
        method7(7, 10, 5);
    }

    public static void method7(int one, int two, int three) {
        if (one > two && one > three) {
            System.out.println(one + " самое большое первое число ");
        } else if (two > three) {
            System.out.println(two + " самое большое второе число ");
        } else {
            System.out.println(three + " самое большое третье число ");
        }
    }
}