package algorithmprobles.binarysearch;
import java.io.*;
import java.util.*;
public class WordSearch {

    public static void main(String[] args) {
        // Read the list of words from a file
        List<String> wordList = readWordListFromFile("wordlist.txt");
        if (wordList == null) {
            System.out.println("Failed to read the word list from the file.");
            return;
        }

        // Sort the word list
        Collections.sort(wordList);

        // Prompt the user to enter a word to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.nextLine();

        // Perform binary search
        boolean found = binarySearch(wordList, searchWord);

        // Print the result
        if (found) {
            System.out.println("The word \"" + searchWord + "\" is found in the list.");
        } else {
            System.out.println("The word \"" + searchWord + "\" is not found in the list.");
        }
    }

    // Read the list of words from a file
    public static List<String> readWordListFromFile(String fileName) {
        List<String> wordList = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\MOURYA\\IdeaProjects\\DataStructureAndAlgorithm2\\src\\algorithmprobles.anagramdetection.binarysearch\\wordlist.txt"); // replace with the actual file path
            Scanner scanner = new Scanner(file);

            scanner.useDelimiter(",\\s*");
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordList.add(word);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return wordList;
    }

    // Perform binary search on the sorted word list
    public static boolean binarySearch(List<String> wordList, String searchWord) {
        int left = 0;
        int right = wordList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = searchWord.compareTo(wordList.get(mid));
            if (comparison == 0) {
                return true; // Word found
            } else if (comparison < 0) {
                right = mid - 1; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }
        return false; // Word not found
    }
}
