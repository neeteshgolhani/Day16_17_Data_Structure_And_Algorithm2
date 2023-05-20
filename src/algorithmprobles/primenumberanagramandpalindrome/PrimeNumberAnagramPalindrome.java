package algorithmprobles.anagramdetection.primenumberanagramandpalindrome;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class PrimeNumberAnagramPalindrome {
    public static List<Integer> findPrimeAnagramPalindromes(int lowerRange, int upperRange) {
        List<Integer> primeAnagramPalindromeList = new ArrayList<>();

        // Iterate through each number in the range
        for (int number = lowerRange; number <= upperRange; number++) {
            // Check if the number is prime, anagram, and palindrome
            if (isPrime(number) && isAnagram(String.valueOf(number)) && isPalindrome(String.valueOf(number))) {
                primeAnagramPalindromeList.add(number);
            }
        }

        return primeAnagramPalindromeList;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram(String str) {
        // Convert the string to character array and sort it
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        // Convert the sorted character array back to string
        String sortedStr = new String(charArray);

        // Check if the sorted string is equal to the original string
        return str.equals(sortedStr);
    }

    public static boolean isPalindrome(String str) {
        // Compare characters from the start and end of the string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
