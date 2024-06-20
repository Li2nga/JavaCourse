package Homework10;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivan Ivanovich Ivanov";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 0; i <= 0b11111111_11111111; i++) {
            if (i % 75 == 0) {
                System.out.println();
                System.out.print(i + ": ");
            }
            System.out.print((char) i);
        }
    }
}