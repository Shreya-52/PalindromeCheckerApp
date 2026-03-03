/**
 * =========================================================
 * MAIN CLASS — UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Utility-Based Palindrome Checker
 *
 * Description:
 * This implementation demonstrates palindrome validation
 * using a separate utility class with a static helper method.
 *
 * This approach improves:
 * - Code reusability
 * - Clean structure
 * - Centralized utility logic
 *
 * Author: Shreya
 * Version: 12.0
 */

public class PalindromeChecker {

    /**
     * Application entry point for UC12.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        System.out.println("Input : " + input);

        boolean result = PalindromeUtil.isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * Utility class containing static palindrome logic.
 */
class PalindromeUtil {

    /**
     * Checks whether a given string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {

        if (input == null || input.length() <= 1) {
            return true;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}