public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("Version 1.0");

        int number = 121;  // Hardcoded number
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is NOT a Palindrome");
    }
}