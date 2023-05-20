package datastructure.siulatebankingcashcounter;
import java.util.LinkedList;
import java.util.*;
public class CashCounter {
    private int cashBalance;
    private Queue<Person> queue;

    public CashCounter() {
        cashBalance = 0;
        queue = new LinkedList<>(); // Create a queue to hold the people in line
    }

    public void enqueue(Person person) {
        queue.add(person); // Add a person to the end of the queue
    }

    public Person dequeue() {
        return queue.poll(); // Remove and return the first person from the queue
    }

    public int getCashBalance() {
        return cashBalance;
    }

    public void processQueue() {
        while (!queue.isEmpty()) { // Continue processing until the queue is empty
            Person person = dequeue(); // Get the next person from the queue
            if (person.isDeposit()) { // If it's a deposit transaction
                System.out.println("Processing deposit for " + person.getName() + " - Amount: " + person.getAmount());
                cashBalance += person.getAmount(); // Add the amount to the cash balance
            } else { // If it's a withdrawal transaction
                System.out.println("Processing withdrawal for " + person.getName() + " - Amount: " + person.getAmount());
                if (person.getAmount() <= cashBalance) { // Check if there's sufficient balance
                    cashBalance -= person.getAmount(); // Subtract the amount from the cash balance
                } else {
                    System.out.println("Insufficient balance to process withdrawal for " + person.getName());
                }
            }
        }
    }
}