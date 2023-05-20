package datastructure.primenumberanagram;

import java.util.Arrays;

public class PrimeAnagram {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // If the number is less than or equal to 1, it is not prime
        }
        for (int i = 2; i * i <= number; i++) {
            // Iterate from 2 to the square root of the number and check for divisibility
            if (number % i == 0) {
                return false; // If the number is divisible by any value in the range, it is not prime
            }
        }
        return true; // If the number is not divisible by any value in the range, it is prime
    }

    public static boolean areAnagrams(int num1, int num2) {
        // Convert the numbers to character arrays
        char[] arr1 = String.valueOf(num1).toCharArray();
        char[] arr2 = String.valueOf(num2).toCharArray();
        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Compare the sorted arrays to check if they are equal
        return Arrays.equals(arr1, arr2);
    }
}
