package Homework3;

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
        int A = 1000;
        byte B = 100;
        short C = 10000;
        long D = 100000000;
        float E = 1.11f;
        double F = 1.11111111111;
        System.out.println("Значение переменной A с типом int равно " + A);
        System.out.println("Значение переменной B с типом byte равно " + B);
        System.out.println("Значение переменной C с типом short равно " + C);
        System.out.println("Значение переменной  D типом long равно " + D);
        System.out.println("Значение переменной  E типом float равно " + E);
        System.out.println("Значение переменной  F типом double равно " + F);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float A = 27.12f;
        long B = 987678965549L;
        float C = 2.786f;
        short D = 569;
        short E = -159;
        short F = 27897;
        byte I = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        short totalSheets = 480;
        byte studentsIn1Grade = 23;
        byte studentsIn2Grade = 27;
        byte studentsIn3Grade = 30;
        byte totalStudents = (byte) (studentsIn1Grade + studentsIn2Grade + studentsIn3Grade);
        int SheetsOfPaperPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + SheetsOfPaperPerStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int productivityIn2Minutes = 16;
        int productivityIn1Minutes = productivityIn2Minutes / 2;
        int productivityIn20Minutes = productivityIn1Minutes * 20;
        int productivityPerDay = productivityIn1Minutes * 60 * 24;
        int productivityIn3Days = productivityIn1Minutes * 60 * 24 * 3;
        int productivityPerMonth = productivityIn1Minutes * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte wholeCansOfPaint = 120;
        byte consumptionWhitePerClass = 2;
        byte consumptionBrownPerClass = 4;
        byte totalClassesSchool = (byte) (wholeCansOfPaint / (consumptionWhitePerClass + consumptionBrownPerClass));
        byte totalWhitePaint = (byte) (totalClassesSchool * consumptionWhitePerClass);
        byte totalBrownPaint = (byte) (totalClassesSchool * consumptionBrownPerClass);
        System.out.println("В школе, где " + totalClassesSchool + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");

        byte totalBanana = 5;
        byte totalMilk100Ml = 2;
        byte totaliIceCream = 2;
        byte totalEggsRaw = 4;

        byte BananaWeight = 80;
        byte WeightMilk100Ml = 105;
        byte iceCreamBarWeight = 100;
        byte weightOneEgg = 70;
        int breakfastWeightGrams = totalBanana * BananaWeight + totalMilk100Ml * WeightMilk100Ml + totaliIceCream * iceCreamBarWeight + totalEggsRaw * weightOneEgg;
        float breakfastWeightKilograms = breakfastWeightGrams / 1000f;
        System.out.println("Вес спортзавтрака " + breakfastWeightGrams + " грамм. ");
        System.out.println("Вес спортзавтрака " + breakfastWeightKilograms + " килограмм. ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte needLoseKilo = 7;
        short easyDietLossGramsDay = 250;
        short heavyDietLossGramsDay = 500;
        int loseLightDiet = needLoseKilo * 1000 / easyDietLossGramsDay;
        int loseHeavyDiet = needLoseKilo * 1000 / heavyDietLossGramsDay;
        int daysAverageLose = needLoseKilo * 1000 / ((easyDietLossGramsDay + heavyDietLossGramsDay) / 2);
        System.out.println(loseLightDiet);
        System.out.println(loseHeavyDiet);
        System.out.println(daysAverageLose);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760_00;
        int denisSalary = 83690_00;
        int christinaSalary = 76230_00;
        double promotion = 0.1;
        int yearIncomeMasha = mashaSalary * 12;
        int yearIncomeDenis = denisSalary * 12;
        int yearIncomeChristina = christinaSalary * 12;

        mashaSalary += Math.round(mashaSalary * promotion);
        denisSalary += Math.round(denisSalary * promotion);
        christinaSalary += Math.round(christinaSalary * promotion);

        int yearIncomeMashaAfterPromotion = mashaSalary * 12;
        int yearIncomeDenisAfterPromotion = denisSalary * 12;
        int yearIncomeChristinaAfterPromotion = christinaSalary * 12;

        System.out.println("Маша теперь получает " + (mashaSalary / 100) + " рублей. Годовой доход вырос на " + (yearIncomeMashaAfterPromotion - yearIncomeMasha) / 100 + " руб. " + (yearIncomeMashaAfterPromotion - yearIncomeMasha) % 100 + " коп. ");
        System.out.println("Денис теперь получает " + (denisSalary / 100) + " рублей. Годовой доход вырос на " + (yearIncomeDenisAfterPromotion - yearIncomeDenis) / 100 + " руб. " + (yearIncomeDenisAfterPromotion - yearIncomeDenis) % 100 + " коп. ");
        System.out.println("Кристина теперь получает " + (christinaSalary / 100) + " рублей. Годовой доход вырос на " + ((yearIncomeChristinaAfterPromotion - yearIncomeChristina) / 100) + " руб. " + (yearIncomeChristinaAfterPromotion - yearIncomeChristina) % 100 + " коп. ");

    }

}
