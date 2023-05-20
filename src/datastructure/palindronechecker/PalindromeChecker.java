package datastructure.palindronechecker;
import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Create a deque to store the characters of the string
        Deque<Character> deque = new ArrayDeque<>();

        // Process the string from left to right
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            deque.addLast(ch); // Add each character to the rear of the deque
        }

        // Check if the string is a palindrome
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                return false; // If any characters don't match, it's not a palindrome
            }
        }

        return true; // All characters match, it's a palindrome
    }
}


