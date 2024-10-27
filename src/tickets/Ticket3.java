package tickets;

public class Ticket3 {
    public static String[] splitStringInHalf(String str) {
        int midIndex = str.length() / 2;
        String half1 = str.substring(0, midIndex);
        String half2 = str.substring(midIndex);
        return new String[]{half1, half2};
    }
}
