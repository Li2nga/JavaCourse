package Homework2;

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
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var weight1Fighter = 78.2;
        var weight2Fighter = 82.7;
        var totalWeightFighters = weight1Fighter + weight2Fighter;
        System.out.println("общий вес бойцов составляет " + totalWeightFighters + " кг");
        var fightersWeightDifference = weight2Fighter - weight1Fighter;
        System.out.println("разница между весами бойцов составляет " + fightersWeightDifference + " кг");

    }

    public static void task7() {
        System.out.println("Задача 7");
        var weight1Fighter = 78.2;
        var weight2Fighter = 82.7;
        var fightersWeightDifference = weight2Fighter - weight1Fighter;
        System.out.println(fightersWeightDifference);
        var fightersWeightDifference2 = weight2Fighter % weight1Fighter;
        System.out.println(fightersWeightDifference2);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalEmployees = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании " + totalEmployees + " человек ");
        var NewTotalEmployees = totalEmployees + 94;
        var NewTotalHours = NewTotalEmployees * hoursPerPerson;
        System.out.println("Если в компании работает " + NewTotalEmployees + " человек, то всего " + NewTotalHours + " часа работы может быть поделено между сотрудниками");
    }
}