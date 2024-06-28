package Homework13;

public class Main {
    public static void main(String[] args) {

        Author a1 = new Author("Имя1", "Фамилия1");
        Author a2 = new Author("Имя2", "Фамилия2");

        System.out.println("a1.getName() = " + a1.getName());
        System.out.println("a2.getName() = " + a2.getName());
        System.out.println("a1.getSurname() = " + a1.getSurname());
        System.out.println("a2.getSurname() = " + a2.getSurname());

        Book b1 = new Book("Название1", a1, 1911);
        Book b2 = new Book("Название2", a2, 1956);

        System.out.println("b1.getTitle() = " + b1.getTitle());
        System.out.println("b1.getAuthor() = " + b1.getAuthor());

        System.out.println("b1.getPublishingYear() = " + b1.getPublishingYear());
        b1.setPublishingYear(1800);
        System.out.println("b1.getPublishingYear() = " + b1.getPublishingYear());
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
    }
}