package datastructure.palindronechecker;

import java.util.Scanner;

import static datastructure.palindronechecker.PalindromeChecker.isPalindrome;

public class PalindroneCheckerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
