package datastructure.findprimenumer;

import static datastructure.findprimenumer.PrimeNumberRange.isPrime;

public class PrimeNumberMain {
    public static void main(String[] args) {
        int rangeSize = 100;
        int[][] primes = new int[10][];
        int currentRange = 0;

        // Iterate 10 times for 10 ranges
        for (int i = 0; i < 10; i++) {
            int start = currentRange * rangeSize; // Calculate the start of the current range
            int end = start + rangeSize; // Calculate the end of the current range
            int count = 0; // Counter to keep track of the number of prime numbers in the current range

            // Count the number of prime numbers in the current range
            for (int number = start; number < end; number++) {
                if (isPrime(number)) {
                    count++;
                }
            }

            primes[i] = new int[count]; // Create an array to store the prime numbers in the current range
            int index = 0; // Index to keep track of the current position in the primes array

            // Store the prime numbers in the current range in the primes array
            for (int number = start; number < end; number++) {
                if (isPrime(number)) {
                    primes[i][index] = number;
                    index++;
                }
            }

            currentRange++; // Move to the next range
        }

        // Print the prime numbers in the 2D array
        for (int i = 0; i < 10; i++) {
            System.out.println("Range " + (i * rangeSize) + " - " + ((i * rangeSize) + rangeSize - 1) + ":");
            for (int j = 0; j < primes[i].length; j++) {
                System.out.print(primes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
