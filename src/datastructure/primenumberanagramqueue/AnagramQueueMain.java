package datastructure.primenumberanagramqueue;

import static datastructure.primenumberanagramqueue.AnagramPrimeQueue.areAnagrams;
import static datastructure.primenumberanagramqueue.AnagramPrimeQueue.isPrime;

public class AnagramQueueMain {
    public static void main(String[] args) {
        Queue<Integer> anagramQueue = new Queue<>();

        for (int num1 = 0; num1 <= 1000; num1++) {
            if (isPrime(num1)) {
                for (int num2 = num1 + 1; num2 <= 1000; num2++) {
                    if (isPrime(num2) && areAnagrams(num1, num2)) {
                        anagramQueue.enqueue(num1);
                        anagramQueue.enqueue(num2);
                    }
                }
            }
        }

        // Print the anagrams from the queue
        System.out.println("Anagrams from the Queue:");
        while (!anagramQueue.isEmpty()) {
            int anagram = anagramQueue.dequeue();
            System.out.print(anagram + " ");
        }
    }
}
