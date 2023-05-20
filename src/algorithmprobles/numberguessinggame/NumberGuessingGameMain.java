package algorithmprobles.anagramdetection.numberguessinggame;
import java.util.Scanner;
public class NumberGuessingGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Calculate the number of questions required (log base 2 of N)
        int numQuestions = (int) (Math.log(n) / Math.log(2));

        System.out.println("Think of a number between 0 and " + (n - 1) + ".");
        System.out.println("I will ask you " + numQuestions + " yes/no questions to guess the number.");

        // Perform binary search to guess the number
        int low = 0;
        int high = n - 1;
        int guessCount = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.print("Is the number between " + low + " and " + mid + "? (yes/no): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                high = mid - 1;
            } else if (response.equalsIgnoreCase("no")) {
                low = mid + 1;
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                continue;
            }

            guessCount++;
        }

        int finalGuess = (low + high) / 2;
        System.out.println("The number you were thinking of is " + finalGuess + ".");
        System.out.println("I guessed the number in " + guessCount + " question(s).");

        scanner.close();
    }
}
