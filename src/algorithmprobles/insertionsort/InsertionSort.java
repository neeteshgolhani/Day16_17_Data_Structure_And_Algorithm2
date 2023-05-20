package algorithmprobles.insertionsort;

public class InsertionSort {
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        // Iterate over the array starting from the second element
        for (int i = 1; i < n; i++) {
            String key = arr[i]; // Store the current element
            int j = i - 1;
            // Shift elements greater than the key to the right
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key in its correct position
        }
    }
}
