package homework2;

public class Ravenclaw extends Hogwarts{
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

    public int getIntelligence() {
        return intelligence;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWit() {
        return wit;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", knowledge=" + knowledge +
                ", creativity=" + creativity +
                ", wit=" + wit +
                '}';
    }
}
