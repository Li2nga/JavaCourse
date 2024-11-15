### Задача 1*
Переписать задачу 5 с новыми возможностями switch. Предварительно ознакомиться со статьёй:

https://www.baeldung.com/java-switch
<details>
  <summary>Главная выдержка</summary>

```java
var result = switch(month) {
    case JANUARY, JUNE, JULY -> 3;
    case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
    case MARCH, MAY, APRIL, AUGUST -> 2;
    default -> 0; 
};
```
</details>

---
### Задача 2*
Написать сканер, который принимает из консоли целое число от 0 до 100,
если введено не целое число сканер требует ввести число повторно,
если число не в заданном диапазоне, выбрасывается ошибка.
В тексте ошибки пишется какое число было введено, 
если введено правильное число, в консоль выводится текст с этим числом.

Желательно сделать задание опираясь только на приведённый пример:
```java
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int number = sc.nextInt();

        System.out.println("Thank you! You entered a number" + number);

        sc.close();
    }
}
```
---
### Задача 3*
Изменить 3ю задачу, поместив условие високосности в одно выражение.
```java
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
    if (year < 1584) {
        throw new IllegalArgumentException("Неподходящее значение");
    }
    System.out.println(
            year % 400 == 0 ? "год является високосным" :
                    year % 4 == 0 && year % 100 != 0 ?
                            "год является високосным" : "год не является високосным");
}
```