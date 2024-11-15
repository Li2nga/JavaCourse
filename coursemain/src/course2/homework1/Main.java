package course2.homework1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("---------------------------------------------");
        task2();
        System.out.println("---------------------------------------------");
        task3();
        System.out.println("---------------------------------------------");
        task4();
        System.out.println("---------------------------------------------");
        task5();
        System.out.println("---------------------------------------------");
        task6();
        System.out.println("---------------------------------------------");
    }

    static void task1() {
        System.out.println("Task 1:");

        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }

    /*
    Если распечатать переменную в методе main, то она будет равна 33.
    Так как в метод мы передаем не саму переменную, а ее значение
    */

    static void task2() {
        System.out.println("Task 2:");

        Integer value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }

    /*
    Если распечатать переменную в методе main, то она будет равна 33.
    Integer является неизменяемым классом. При попытке изменения значение переменной типа Integer,
    создается новая ссылка на другой объект, а не изменяется существующий.
     */

    static void task3() {
        System.out.println("Task 3:");

        Integer[] value = {3, 4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    /*
    Если распечатать массив в методе main, то распечатается изначальное значение value = [3, 4].
    Массив в метод передается по ссылке, если присвоить ссылке на массив новое значение,
    оригинальный массив останется без изменений, потому что мы не изменили содержимое оригинального массива,
    а создали новый массив внутри метода.
     */

    static void task4() {
        System.out.println("Task 4:");

        Integer[] value = {3, 4};
        changeValueAlt(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    /*
    Если распечатать массив в методе main, то распечатается измененное значение value = [99, 4].
    Массив передается по ссылке, что позволяет изменить значения элементов массива через его индекс, используя ссылку.
     */

    static void task5() {
        System.out.println("Task 5:");

        Person person = new Person();
        person.setName("Lyapis");
        person.setSurname("Trubetskoy");
        changePerson(person);
        System.out.println("person = " + person);
    }

    /*
    Если распечатать переменную в методе main, то у нее будет значение person = Lyapis Trubetskoy.
    Когда мы передаем объект в метод, передается ссылка на этот объект.
    Если внутри метода создать новый объект и присвоить его параметру, это не изменит ссылку на объект,
    который был передан в метод. Вместо этого изменится ссылка внутри этого метода, а исходный объект останется без изменений.
     */

    static void task6() {
        System.out.println("Task 6:");

        Person person = new Person();
        person.setName("Lyapis");
        person.setSurname("Trubetskoy");
        changePersonAlt(person);
        System.out.println("person = " + person);
    }

    /*
    Если распечатать переменную в методе main, то у нее будет значение person = Ilya Lagutenko.
    В этом случае, когда мы изменяем поля объекта внутри метода, изменения окажут влияние на оригинальный объект.

    Объекты в Java передаются по ссылке, но если просто присваиваем новую ссылку, это не изменяет оригинал.
    А если мы меняем поля объекта внутри метода, это уже будет отражено на оригинальном объекте.
     */

    static void changeValue(int value) {
        value = 22;
    }

    static void changeValue(Integer value) {
        value = 22;
    }

    static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    static void changeValueAlt(Integer[] value) {
        value[0] = 99;
    }

    static void changePerson(Person person) {
        person = new Person();
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }

    static void changePersonAlt(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}