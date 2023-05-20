package datastructure.siulatebankingcashcounter;
import java.util.Scanner;
public class BankingMain {
    public static void main(String[] args) {
        CashCounter cashCounter = new CashCounter(); // Create an instance of CashCounter
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        int choice;

        do {
            System.out.println("Banking Cash Counter");
            System.out.println("1. Add person to queue");
            System.out.println("2. Process queue");
            System.out.println("3. Check cash balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read the user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter person's name: ");
                    String name = scanner.next(); // Read the person's name
                    System.out.print("Enter amount: ");
                    int amount = scanner.nextInt(); // Read the transaction amount
                    System.out.print("Deposit or Withdraw? (d/w): ");
                    String transactionType = scanner.next(); // Read the transaction type
                    boolean isDeposit = transactionType.equalsIgnoreCase("d");
                    // Determine if it's a deposit or withdrawal
                    Person person = new Person(name, amount, isDeposit); // Create a Person object
                    cashCounter.enqueue(person); // Add the person to the queue
                    break;
                case 2:
                    cashCounter.processQueue(); // Process the queue of people
                    break;
                case 3:
                    System.out.println("Cash balance: " + cashCounter.getCashBalance());
                    // Display the cash balance
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}