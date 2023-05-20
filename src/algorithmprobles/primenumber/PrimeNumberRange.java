package algorithmprobles.anagramdetection.primenumber;

public class PrimeNumberRange {

    public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If the number is divisible, it is not prime
                return false;
            }
        }

        // If the number is not divisible by any number, it is prime
        return true;
    }
}
