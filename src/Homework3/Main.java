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
        int a = 1000;
        byte b = 100;
        short c = 10000;
        long d = 100000000;
        float e = 1.11f;
        double f = 1.11111111111;
        System.out.println("Значение переменной A с типом int равно " + a);
        System.out.println("Значение переменной B с типом byte равно " + b);
        System.out.println("Значение переменной C с типом short равно " + c);
        System.out.println("Значение переменной  D типом long равно " + d);
        System.out.println("Значение переменной  E типом float равно " + e);
        System.out.println("Значение переменной  F типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte i = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        short totalSheets = 480;
        byte studentsIn1Grade = 23;
        byte studentsIn2Grade = 27;
        byte studentsIn3Grade = 30;
        byte totalStudents = (byte) (studentsIn1Grade + studentsIn2Grade + studentsIn3Grade);
        short SheetsOfPaperPerStudent = (short) (totalSheets / totalStudents);
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
        short wholeCansOfPaint = 120;
        byte consumptionWhitePerClass = 2;
        byte consumptionBrownPerClass = 4;
        byte totalClassesSchool = (byte) (wholeCansOfPaint / (consumptionWhitePerClass + consumptionBrownPerClass));
        short totalWhitePaint = (short) (totalClassesSchool * consumptionWhitePerClass);
        short totalBrownPaint = (short) (totalClassesSchool * consumptionBrownPerClass);
        System.out.println("В школе, где " + totalClassesSchool + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");

        byte totalBanana = 5;
        byte totalMilk100Ml = 2;
        byte totalIceCream = 2;
        byte totalEggsRaw = 4;

        short BananaWeight = 80;
        short WeightMilk100Ml = 105;
        short iceCreamBarWeight = 100;
        short weightOneEgg = 70;
        int breakfastWeightGrams = totalBanana * BananaWeight + totalMilk100Ml * WeightMilk100Ml + totalIceCream * iceCreamBarWeight + totalEggsRaw * weightOneEgg;
        float breakfastWeightKilograms = breakfastWeightGrams / 1000f;
        System.out.println("Вес спортзавтрака " + breakfastWeightGrams + " грамм.");
        System.out.println("Вес спортзавтрака " + breakfastWeightKilograms + " килограмм.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte needLoseKilo = 7;
        short easyDietLossGramsDay = 250;
        short heavyDietLossGramsDay = 500;
        double loseLightDiet = (needLoseKilo * 1000) / (double)easyDietLossGramsDay;
        double loseHeavyDiet = (needLoseKilo * 1000) / (double)heavyDietLossGramsDay;
        double daysAverageLose = (needLoseKilo * 1000) / (double)((easyDietLossGramsDay + heavyDietLossGramsDay) / 2);
        System.out.println((int) Math.ceil(loseLightDiet) + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println((int) Math.ceil(loseHeavyDiet) + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(Math.round(daysAverageLose * Math.pow(10, 2)) / Math.pow(10, 2) + " дней в среднем уйдет на похудение");
    }

    public static void task8() {
        System.out.println("Задача 8");
        long mashaSalary = 67760_00;
        long denisSalary = 83690_00;
        long christinaSalary = 76230_00;
        double promotion = 0.1;
        long yearIncomeMasha = mashaSalary * 12;
        long yearIncomeDenis = denisSalary * 12;
        long yearIncomeChristina = christinaSalary * 12;

        mashaSalary += Math.round(mashaSalary * promotion);
        denisSalary += Math.round(denisSalary * promotion);
        christinaSalary += Math.round(christinaSalary * promotion);

        long yearIncomeMashaAfterPromotion = mashaSalary * 12;
        long yearIncomeDenisAfterPromotion = denisSalary * 12;
        long yearIncomeChristinaAfterPromotion = christinaSalary * 12;

        System.out.println("Маша теперь получает " + (mashaSalary / 100) + " руб. " + (mashaSalary % 100) + " коп. Годовой доход вырос на " + (yearIncomeMashaAfterPromotion - yearIncomeMasha) / 100 + " руб. " + (yearIncomeMashaAfterPromotion - yearIncomeMasha) % 100 + " коп. ");
        System.out.println("Денис теперь получает " + (denisSalary / 100) + " руб. " + (denisSalary % 100) + " коп. Годовой доход вырос на " + (yearIncomeDenisAfterPromotion - yearIncomeDenis) / 100 + " руб. " + (yearIncomeDenisAfterPromotion - yearIncomeDenis) % 100 + " коп. ");
        System.out.println("Кристина теперь получает " + (christinaSalary / 100) + " руб. " + (christinaSalary % 100) + " коп. Годовой доход вырос на " + ((yearIncomeChristinaAfterPromotion - yearIncomeChristina) / 100) + " руб. " + (yearIncomeChristinaAfterPromotion - yearIncomeChristina) % 100 + " коп. ");

    }
}
