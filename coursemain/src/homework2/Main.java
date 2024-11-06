package homework2;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 90, 85, 80, 85, 90);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 85, 80, 85, 90);
        Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли", 70, 60, 75, 70, 65);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronaldWeasley);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 70, 65, 70, 75, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 80, 75, 80, 85, 80);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 70, 65, 70, 75, 80);
        System.out.println(zachariasSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 80, 75, 75, 80, 75, 80);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 70, 75, 60, 70, 70, 70);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 75, 70, 60, 75, 75, 60);
        System.out.println(choChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 85, 80, 80, 85, 80, 80, 90);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 60, 55, 60, 65, 70, 60, 50);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 60, 55, 60, 65, 70, 60, 50);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Gryffindor");
        harryPotter.comparisonGryffindorStudents(hermioneGranger);
        harryPotter.comparisonGryffindorStudents(ronaldWeasley);
        ronaldWeasley.comparisonGryffindorStudents(hermioneGranger);
        System.out.println();
        System.out.println("Hufflepuff");

        zachariasSmith.comparisonHufflepuffStudents(cedricDiggory);
        cedricDiggory.comparisonHufflepuffStudents(justinFinchFletchley);
        justinFinchFletchley.comparisonHufflepuffStudents(zachariasSmith);
        System.out.println();

        System.out.println("Ravenclaw");
        choChang.comparisonRavenclawStudents(padmaPatil);
        padmaPatil.comparisonRavenclawStudents(marcusBelby);
        marcusBelby.comparisonRavenclawStudents(choChang);
        System.out.println();

        System.out.println("Slytherin");
        dracoMalfoy.comparisonSlytherinStudents(grahamMontague);
        grahamMontague.comparisonSlytherinStudents(gregoryGoyle);
        gregoryGoyle.comparisonSlytherinStudents(dracoMalfoy);
        System.out.println();

        System.out.println("Hogwarts");
        harryPotter.bestStudentHogwarts(dracoMalfoy);
    }
}