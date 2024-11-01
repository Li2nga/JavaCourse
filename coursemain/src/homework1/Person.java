package homework1;

public class Person {
    String name;
    String surname;

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}