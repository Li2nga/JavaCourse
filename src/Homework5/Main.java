package Homework5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
//        task3();
//        task4();
//        task5();
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
            method2(-1,2015);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        method2(1, 2014);
        method2(1, 2015);
        method2(0, 2014);
        method2(0, 2015);

    }

    public static void method2(int clientOS, int clientDeviceYear) {
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
}
//        int clientOS = 1;
//        int clientDeviceYear = 2015;
//        if (clientOS == 0) {
//            if (clientDeviceYear < 2015) {
//                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//            } else {
//                System.out.println("Установите версию приложения для iOS по ссылке");
//            }
//        }
//        if (clientOS == 1) {
//            if (clientDeviceYear < 2015) {
//                System.out.println("Установите облегченную версию приложения для Android по ссылке");
//            } else {
//                System.out.println("Установите версию приложения для для Android по ссылке");
//            }
//        }
//    }
//
//    public static void task3() {
//        System.out.println("Задача 3");
//        int year = 2024;
//        int yearException = 400;
//        int yearException2 = 100;
//        int yearException3 = 4;
//
//
//        if (year % yearException == 0) {
//            System.out.println("год  является високосным");
//        } else if (year % yearException3 == 0 && year % yearException2 != 0) {
//            System.out.println("год  является  високосным");
//        } else {
//            System.out.println("год не является  високосным");
//        }
//    }
//
//    public static void task4() {
//        System.out.println("Задача 4");
//        int deliveryDistance = 10;
//        int deliveryTime = 0;
//
//        deliveryTime++;
//
//        if (deliveryDistance >= 20) {
//            deliveryTime++;
//        }
//        if (deliveryDistance >= 60) {
//            deliveryTime++;
//        }
//        if (deliveryDistance > 100) {
//            System.out.println("Доставки нет");
//        } else {
//            System.out.println("Потребуется дней: " + deliveryTime);
//        }
//    }
//
//    public static void task5() {
//        System.out.println("Задача 5");
//        int monthNumber = 12;
//        switch (monthNumber) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Зима");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Такого сезона не существует");
//        }
//    }
//}
