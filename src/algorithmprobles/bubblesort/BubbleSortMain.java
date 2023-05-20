package algorithmprobles.bubblesort;

import static algorithmprobles.bubblesort.BubbleSort.bubbleSort;

public class BubbleSortMain {

    public static void main(String[] args) {
        // Read the list of integers
        int[] numbers = { 9, 5, 1, 3, 8, 4, 2, 7, 6 };

        // Sort the numbers using Bubble Sort
        bubbleSort(numbers);

        // Print the sorted list
        System.out.println("Sorted List:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
