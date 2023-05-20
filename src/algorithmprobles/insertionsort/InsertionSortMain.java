package algorithmprobles.insertionsort;

import static algorithmprobles.insertionsort.InsertionSort.insertionSort;

public class InsertionSortMain {
    public static void main(String[] args) {
        // Read the list of words
        String[] words = {"banana", "apple", "cherry", "date", "grape", "honey", "jackfruit"};

        // Sort the words using Insertion Sort
        insertionSort(words);

        // Print the sorted list
        System.out.println("Sorted List:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
