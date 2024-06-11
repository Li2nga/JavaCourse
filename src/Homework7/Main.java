package Homework7;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int savingsMonth = 15000;
        int total = 0;
        int accumulationPeriod = 0;
        while (total < 2459000) {
            total += savingsMonth;
            accumulationPeriod++;
        }
        System.out.println("Месяц " + accumulationPeriod + " сумма накоплений равна " + total + "рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        long population = 12_000_000;
        double birthRate = 0.017;
        double populationMortality = 0.008;
        double populationGrowth = birthRate - populationMortality;
        for (int i = 1; i <= 10; i++) {
            population += Math.round(population * populationGrowth);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        long total = 15_000_00;
        double percentageMonth = 0.07;
        for (int i = 1; total < 12_000_000_00; i++) {
            total += Math.round(total * percentageMonth);
            System.out.println(i + " " + total / 100);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        long total = 15_000_00;
        double percentageMonth = 0.07;
        int i = 1;
        for (; total < 12_000_000_00; i++) {
            total += Math.round(total * percentageMonth);
            if (i % 6 == 0 && total < 12_000_000_00)
                System.out.println(i + " " + total / 100);
        }
        System.out.println("Итоговый месяц накоплений - " + (i - 1) + "\n" + "Итоговая сумма накоплений - " + total / 100);
    }

    public static void task6() {
        System.out.println("Задача 6");
        long total = 15_000_00;
        double percentageMonth = 0.07;
        int savingsPeriod = 9 * 12;
        int i = 1;
        for (; i <= savingsPeriod - 1; i++) {
            total += Math.round(total * percentageMonth);
            if (i % 6 == 0)
                System.out.println(i + " " + total / 100);
        }
        total += Math.round(total * percentageMonth);
        System.out.println("Итоговый месяц накоплений - " + i);
        System.out.println("Итоговая сумма накоплений - " + total / 100);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFridayMonth = 6;
        for (int i = firstFridayMonth; i <= 31; i += 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int thisYear = 2024;
        int pastPeriod = 200;
        int futurePeriod = 100;
        int i = thisYear - pastPeriod;
        for (; i <= thisYear + futurePeriod; i++) {
            if (i % 79 == 0) {
                break;
            }
        }
        for (; i <= thisYear + futurePeriod; i += 79) {
            System.out.println(i);
        }
    }
}