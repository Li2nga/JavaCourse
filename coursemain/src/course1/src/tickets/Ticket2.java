package tickets;

public class Ticket2 {
    public static Boolean checkPalindrome(String myString) {
        String reversed = new StringBuilder(myString).reverse().toString();
        return myString.equalsIgnoreCase(reversed);
    }
}