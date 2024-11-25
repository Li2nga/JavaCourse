package course2.homework2;

public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String name, int spellPower, int apparitionDistance, int nobility, int honor, int courage) {
        super(name, spellPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return
                "Gryffindor" + super.toString() + "{" +
                        "nobility=" + nobility +
                        ", honor=" + honor +
                        ", courage=" + courage +
                        '}';
    }

    public void comparisonGryffindorStudents(Gryffindor gryffindor) {
        if (sumPoints() > gryffindor.sumPoints()) {
            System.out.println("Лучший ученик - " + getName());
        } else if (sumPoints() == gryffindor.sumPoints()) {
            System.out.println("Силы учеников " + gryffindor.getName() + " и " + getName() + " равны");
        } else {
            System.out.println("Лучший ученик - " + gryffindor.getName());
        }
    }

    private int sumPoints() {
        return nobility + honor + courage;
    }
}
