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