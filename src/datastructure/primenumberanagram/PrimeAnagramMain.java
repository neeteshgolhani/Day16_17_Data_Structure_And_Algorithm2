package datastructure.primenumberanagram;
import java.util.*;

import static datastructure.primenumberanagram.PrimeAnagram.areAnagrams;
import static datastructure.primenumberanagram.PrimeAnagram.isPrime;

public class PrimeAnagramMain {

    public static void main(String[] args) {
        int rangeSize = 100;
        int[][] anagramPrimes = new int[10][];
        int[][] nonAnagramPrimes = new int[10][];
        int currentRange = 0;

        for (int i = 0; i < 10; i++) {
            int start = currentRange * rangeSize;
            int end = start + rangeSize;

            List<Integer> anagramList = new ArrayList<>();
            List<Integer> nonAnagramList = new ArrayList<>();

            for (int num1 = start; num1 < end; num1++) {
                // Check if num1 is prime
                if (isPrime(num1)) {
                    for (int num2 = num1 + 1; num2 < end; num2++) {
                        // Check if num2 is prime and an anagram of num1
                        if (isPrime(num2) && areAnagrams(num1, num2)) {
                            // Add both num1 and num2 to the anagramList
                            anagramList.add(num1);
                            anagramList.add(num2);
                        }
                    }
                    // If num1 is not part of an anagram pair, add it to the nonAnagramList
                    if (!anagramList.contains(num1)) {
                        nonAnagramList.add(num1);
                    }
                }
            }

            // Convert the anagramList and nonAnagramList to arrays
            anagramPrimes[i] = listToArray(anagramList);
            nonAnagramPrimes[i] = listToArray(nonAnagramList);

            currentRange++;
        }

        // Print the prime numbers that are anagrams
        System.out.println("Prime Numbers that are Anagrams:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Range " + (i * rangeSize) + " - " + ((i * rangeSize) + rangeSize - 1) + ":");
            System.out.println(Arrays.toString(anagramPrimes[i]));
        }

        // Print the prime numbers that are not anagrams
        System.out.println("Prime Numbers that are not Anagrams:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Range " + (i * rangeSize) + " - " + ((i * rangeSize) + rangeSize - 1) + ":");
            System.out.println(Arrays.toString(nonAnagramPrimes[i]));
        }
    }

    public static int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
