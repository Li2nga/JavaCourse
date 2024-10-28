package tickets;

public class Ticket5 {
    public static int[] returnPartArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
        int length = 7 - 3 + 1;
        int[] finalArray = new int[length];
        System.arraycopy(array, 3, finalArray, 0, length);
        return finalArray;
    }
}
