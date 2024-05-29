package Homework4;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println(" Если возраст человека равен " + age + ", нужно немного подождать.");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int outsideAirTemperature = 0;
        if (outsideAirTemperature < 5) {
            System.out.println(" На улице " + outsideAirTemperature + " градусов -  нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + outsideAirTemperature + " градусов -  можно идти без шапки ");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int carSpeed = 70;
        if (carSpeed > 60) {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то  придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то можно ездить спокойно ");
        }
    }

}
