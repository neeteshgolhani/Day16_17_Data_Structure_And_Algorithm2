package algorithmprobles.anagramdetection.primenumberanagramandpalindrome;
import java.util.List;

import static algorithmprobles.anagramdetection.primenumberanagramandpalindrome.PrimeNumberAnagramPalindrome.findPrimeAnagramPalindromes;

public class PrimeNumberPalindromeMain {
    public static void main(String[] args) {
        int lowerRange = 0;
        int upperRange = 1000;

        System.out.println("Prime numbers that are anagrams and palindromes between " + lowerRange + " and " + upperRange + ":");

        // Find the prime numbers that are anagrams and palindromes within the given range
        List<Integer> primeAnagramPalindromeList = findPrimeAnagramPalindromes(lowerRange, upperRange);

        // Print the prime numbers that are anagrams and palindromes
        for (int number : primeAnagramPalindromeList) {
            System.out.println(number);
        }
    }
}


