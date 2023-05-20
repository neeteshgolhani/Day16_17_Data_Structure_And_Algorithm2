package datastructure.unorderedlist;
import java.util.*;
import java.io.*;
public class UnorderedListMain {
    public static void main(String[] args) {
        // Read the text file and split it into words
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as the delimiter
                String[] lineWords = line.split("\\s+");

                // Add the words to the list
                words.addAll(Arrays.asList(lineWords));
            }
        } catch (IOException e) {
            // If an exception occurs during file reading, print the stack trace
            e.printStackTrace();
        }

        // Create an unordered linked list and add the words to it
        UnorderedList<String> list = new UnorderedList<>();
        for (String word : words) {
            list.add(word);
        }

        // Take user input to search for a word
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.nextLine();

        // Search the word in the list and perform the required actions
        if (list.search(searchWord)) {
            list.remove(searchWord);
            System.out.println("Word found and removed from the list.");
        } else {
            list.add(searchWord);
            System.out.println("Word not found and added to the list.");
        }

        // Save the updated list to a file
        list.saveToFile("output.txt");

        System.out.println("List of words saved to 'output.txt' file.");
    }
}