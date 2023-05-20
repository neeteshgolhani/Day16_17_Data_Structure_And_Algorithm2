package algorithmprobles.genericsearchsort;
import java.util.Arrays;
import java.util.List;

import static algorithmprobles.genericsearchsort.GenericSearchSort.binarySearch;
import static algorithmprobles.genericsearchsort.GenericSearchSort.insertionSort;

public class GenericSearchSortMain {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 1, 9, 4, 7, 6);
        int searchKey = 8;

        System.out.println("Original list: " + numbers);

        // Sort the list using insertion sort
        insertionSort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Perform binary search on the sorted list
        int index = binarySearch(numbers, searchKey);
        if (index != -1) {
            System.out.println(searchKey + " found at index " + index);
        } else {
            System.out.println(searchKey + " not found in the list");
        }
    }
}
