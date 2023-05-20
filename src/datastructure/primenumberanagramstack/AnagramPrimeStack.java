package datastructure.primenumberanagramstack;

import java.util.Arrays;

public class AnagramPrimeStack {
    public static boolean areAnagrams(int num1, int num2) {
        // Convert numbers to strings
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        // Sort the characters in the strings
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted strings
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}