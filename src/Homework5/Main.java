package Homework5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
            method2(-1, 2015);
        } catch (IllegalArgumentException e) {
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
        int yearException = 400;
        int yearException2 = 100;
        int yearException3 = 4;
        if (year < 1584) {
            throw new IllegalArgumentException("Неподходящее значение");
        }
        System.out.println(
                year % yearException == 0 ? "год  является високосным" :
                        (year % yearException3 == 0 && year % yearException2 != 0) ?
                                "год  является високосным" : "год не является  високосным");
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
        if (deliveryDistance > 20) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        }  if (deliveryDistance > 60) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        } if (deliveryDistance > 100) {
            System.out.println("Потребуется дней: " + deliveryTime++);
        }else {
            System.out.println("Доставки нет");
              };

    }

}


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
