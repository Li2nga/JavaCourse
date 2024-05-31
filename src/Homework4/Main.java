package Homework4;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        method1(20);
        method1(15);
    }

    public static void method1(int age) {
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println(" Если возраст человека равен " + age + ", нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        method2(0);
        method2(35);
    }

    public static void method2(int outsideAirTemperature) {
        if (outsideAirTemperature < 5) {
            System.out.println(" На улице " + outsideAirTemperature + " градусов -  нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + outsideAirTemperature + " градусов -  можно идти без шапки ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        method3(100);
        method3(59);
    }

    public static void method3(int carSpeed) {
        if (carSpeed > 60) {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то  придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то можно ездить спокойно ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        method4(1);
        method4(4);
        method4(10);
        method4(21);
        method4(29);
        method4(80);
    }

    public static void method4(int age) {
        if (age < 2) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно в детский сад");
        } else if (age >= 7 && age <= 18) {
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
        method5(3);
        method5(12);
        method5(16);
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
        method6(55);
        method6(90);
        method6(102);
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
        method7(7, 5, 10);
    }

    public static void method7(int one, int two, int three) {
        if (one > two && one > three) {
            System.out.println(one + " самое большое число ");
        } else if (two > three) {
            System.out.println(two + " самое большое число ");
        } else {
            System.out.println(three + " самое большое число ");
        }
    }
}


