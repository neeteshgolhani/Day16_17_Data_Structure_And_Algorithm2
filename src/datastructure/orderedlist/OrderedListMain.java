package datastructure.orderedlist;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OrderedListMain {
    public static void main(String[] args) {
        OrderedList<Integer> orderedList = new OrderedList<>();

        // Read the list of numbers from the file and insert them into the ordered list
        try (Scanner scanner = new Scanner(new File("numbers.txt"))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                orderedList.insert(number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Take user input for a new number
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a new number: ");
        int newNumber = inputScanner.nextInt();

        // Check if the new number is already in the list, and remove it if found; otherwise, insert it
        if (orderedList.search(newNumber)) {
            orderedList.remove(newNumber);
        } else {
            orderedList.insert(newNumber);
        }

        // Save the updated list to a file
        orderedList.saveToFile("output.txt");

        System.out.println("List of numbers saved to output.txt");
    }
}
