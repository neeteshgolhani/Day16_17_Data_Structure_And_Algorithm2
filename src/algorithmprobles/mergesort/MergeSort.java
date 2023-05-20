package algorithmprobles.anagramdetection.mergesort;

public class MergeSort {
    public static void merge(String[] arr, int lo, int mid, int hi) {
        int n1 = mid - lo + 1;  // Calculate the size of the left subarray
        int n2 = hi - mid;  // Calculate the size of the right subarray

        // Create temporary arrays for the left and right subarrays
        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        // Copy data to the temporary arrays
        System.arraycopy(arr, lo, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Merge the temporary arrays

        // Initial indexes of the subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = lo;

        // Merge the subarrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArr[], if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArr[], if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
