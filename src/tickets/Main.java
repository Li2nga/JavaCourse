package tickets;

import java.util.Arrays;

import static tickets.Ticket1.reverseArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,};
        int[] reversArr = reverseArray(arr);
        System.out.println(Arrays.toString(reversArr));
        System.out.println("Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})) = " + Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println("------------------------------------------------");
        String myString = "радар";
        System.out.println("Ticket2.checkPalindrome(myString) = " + Ticket2.checkPalindrome(myString));
        System.out.println("------------------------------------------------");
        String str = "1234567";
        System.out.println("Ticket3.splitStringInHalf() = " + Arrays.toString(Ticket3.splitStringInHalf(str)));
        System.out.println("------------------------------------------------");
        String[] stringsArr = {"абв", "где", "где"};
        System.out.println("Ticket4.deleteDuplicatesAndConcat(stringsArr) = " + Ticket4.deleteDuplicatesAndConcat(stringsArr));
        System.out.println("------------------------------------------------");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("Ticket5.returnPartArray(arr) = " + Arrays.toString(Ticket5.returnPartArray(array)));
        System.out.println("------------------------------------------------");
        long a = 900;
        System.out.println("Ticket6.squaring(a) = " + Ticket6.squaring(a));
    }
}
