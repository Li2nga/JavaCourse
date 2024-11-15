package tickets;

public class Ticket4 {
    public static String deleteDuplicatesAndConcat(String[] stringArr) {
        String[] outArr = new String[stringArr.length];
        int lastIndex = 0;
        for (String s : stringArr) {
            for (int i = 0; ; i++) {
                if (outArr[i] == null) {
                    outArr[i] = s;
                    lastIndex = i;
                    break;
                }
                if (outArr[i].equals(s)) {
                    break;
                }
            }
        }
        String[] finalArr = new String[lastIndex + 1];
        System.arraycopy(outArr, 0, finalArr, 0, lastIndex + 1);
        return String.join(", ", finalArr);
    }
}