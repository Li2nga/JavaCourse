package course2.homework2;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int leadership;

    public Slytherin(String name, int spellPower, int apparitionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int leadership) {
        super(name, spellPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLeadership() {
        return leadership;
    }

    @Override
    public String toString() {
        return "Slytherin" + super.toString() + "{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", leadership=" + leadership +
                '}';
    }

    public void comparisonSlytherinStudents(Slytherin slytherin) {
        if (sumPoints() > slytherin.sumPoints()) {
            System.out.println("Лучший ученик - " + getName());
        } else if (sumPoints() == slytherin.sumPoints()) {
            System.out.println("Силы учеников " + slytherin.getName() + " и " + getName() + " равны");
        } else {
            System.out.println("Лучший ученик - " + slytherin.getName());
        }

    }

    private int sumPoints() {
        return cunning + determination + ambition + resourcefulness + leadership;
    }
}
