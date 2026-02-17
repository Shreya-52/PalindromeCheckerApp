import java.util.Scanner;

public class UC2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
