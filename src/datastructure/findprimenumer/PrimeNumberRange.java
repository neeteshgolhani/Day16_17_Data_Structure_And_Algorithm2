package datastructure.findprimenumer;

public class PrimeNumberRange {
    public static boolean isPrime(int number) {
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            return false;
        }
        // Iterate from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                // If it is divisible, the number is not prime
                return false;
            }
        }
        // If the number is not divisible by any smaller number, it is prime
        return true;
    }
}
