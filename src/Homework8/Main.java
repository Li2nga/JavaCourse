package Homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weight = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        long[] weights = {13, 1, 90, 3456789, 908975563};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] weight = new int[]{1, 2, 3};
        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ",");
        }
        System.out.println(weight[weight.length - 1]);

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(numbers[numbers.length - 1]);

        long[] weights = {13, 1, 90, 3456789, 908975563};
        for (int i = 0; i < weights.length - 1; i++) {
            System.out.print(weights[i] + ",");
        }
        System.out.println(weights[weights.length - 1]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weight = new int[]{1, 2, 3};
        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[weight.length - 1 - i] + ",");
        }
        System.out.println(weight[0]);

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[numbers.length - 1 - i] + ",");
        }
        System.out.println(numbers[0]);

        long[] weights = {13, 1, 90, 3456789, 908975563};
        for (int i = 0; i < weights.length - 1; i++) {
            System.out.print(weights[weights.length - 1 - i] + ",");
        }
        System.out.println(weights[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weight = {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 1) {
                weight[i]++;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}
