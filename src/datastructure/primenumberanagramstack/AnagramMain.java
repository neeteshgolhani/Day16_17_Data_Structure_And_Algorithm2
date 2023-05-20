package datastructure.primenumberanagramstack;

import static datastructure.primenumberanagramstack.AnagramPrimeStack.areAnagrams;
import static datastructure.primenumberanagramstack.AnagramPrimeStack.isPrime;

public class AnagramMain {
    public static void main(String[] args) {
        Stack<Integer> anagramStack = new Stack<>();

        for (int num1 = 0; num1 <= 1000; num1++) {
            if (isPrime(num1)) {
                for (int num2 = num1 + 1; num2 <= 1000; num2++) {
                    if (isPrime(num2) && areAnagrams(num1, num2)) {
                        anagramStack.push(num1);
                        anagramStack.push(num2);
                    }
                }
            }
        }

        // Print the anagrams in reverse order
        System.out.println("Anagrams in Reverse Order:");
        while (!anagramStack.isEmpty()) {
            int anagram = anagramStack.pop();
            System.out.print(anagram + " ");
        }
    }
}
