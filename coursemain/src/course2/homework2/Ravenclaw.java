package course2.homework2;

public class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int knowledge;
    private final int creativity;
    private final int wit;

    public Ravenclaw(String name, int spellPower, int apparitionDistance, int intelligence, int knowledge, int creativity, int wit) {
        super(name, spellPower, apparitionDistance);
        this.intelligence = intelligence;
        this.knowledge = knowledge;
        this.creativity = creativity;
        this.wit = wit;
    }

    @Override
    public String toString() {
        return "Ravenclaw" + super.toString() + "{" +
                "intelligence=" + intelligence +
                ", knowledge=" + knowledge +
                ", creativity=" + creativity +
                ", wit=" + wit +
                '}';
    }

    public void comparisonRavenclawStudents(Ravenclaw ravenclaw) {
        if (sumPoints() > ravenclaw.sumPoints()) {
            System.out.println("Лучший ученик - " + getName());
        } else if (sumPoints() == ravenclaw.sumPoints()) {
            System.out.println("Силы учеников " + ravenclaw.getName() + " и " + getName() + " равны");
        } else {
            System.out.println("Лучший ученик - " + ravenclaw.getName());
        }
    }

    private int sumPoints() {
        return intelligence + knowledge + creativity + wit;
    }
}
