package algorithmprobles.anagramdetection.primenumber;

import static algorithmprobles.anagramdetection.primenumber.PrimeNumberRange.isPrime;

public class PrimeNumberRangeMain {
    public static void main(String[] args) {
        int lowerRange = 0;
        int upperRange = 1000;

        System.out.println("Prime numbers between " + lowerRange + " and " + upperRange + ":");

        // Call the method to print prime numbers within the given range
        printPrimeNumbers(lowerRange, upperRange);
    }

    public static void printPrimeNumbers(int lowerRange, int upperRange) {
        // Iterate through each number in the range
        for (int number = lowerRange; number <= upperRange; number++) {
            // Check if the number is prime
            if (isPrime(number)) {
                // Print the prime number
                System.out.print(number + " ");
            }
        }
    }
}
