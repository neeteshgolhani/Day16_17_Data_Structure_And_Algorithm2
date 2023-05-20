package algorithmprobles.anagramdetection.mergesort;

import static algorithmprobles.anagramdetection.mergesort.MergeSort.merge;

public class MergeSortMain {
    public static void main(String[] args) {
        // Read the list of strings
        String[] strings = {"banana", "apple", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "jackfruit"};

        // Sort the strings using Merge Sort
        mergeSort(strings, 0, strings.length - 1);

        // Print the sorted list
        System.out.println("Sorted List:");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void mergeSort(String[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;  // Calculate the midpoint of the array
            mergeSort(arr, lo, mid);  // Sort the left subarray recursively
            mergeSort(arr, mid + 1, hi);  // Sort the right subarray recursively
            merge(arr, lo, mid, hi);  // Merge the sorted subarrays
        }
    }
}

