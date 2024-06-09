package Homework5Star;

public class Main {
    public static void main(String[] args) {
        task1();
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
}

