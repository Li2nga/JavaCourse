package homework2;

public abstract class Hogwarts {
    private final String name;
    private final int spellPower;
    private final int apparitionDistance;

    public Hogwarts(String name, int spellPower, int apparitionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.apparitionDistance = apparitionDistance;
    }

    public String getName() {
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", spellPower=" + spellPower +
                ", apparitionDistance=" + apparitionDistance +
                '}';
    }

    public void bestStudentHogwarts(Hogwarts hogwarts) {
        if (spellPower + apparitionDistance > hogwarts.spellPower + hogwarts.apparitionDistance) {
            System.out.println("Ученик " + getName() + " сильнее ученика " + hogwarts.getName());
        } else if (spellPower + apparitionDistance < hogwarts.spellPower + hogwarts.apparitionDistance) {
            System.out.println("Ученик " + hogwarts.getName() + " сильнее ученика " + getName());
        } else {
            System.out.println("Силы учеников " + hogwarts.getName() + " и " + getName() + " равны ");
        }
    }
}