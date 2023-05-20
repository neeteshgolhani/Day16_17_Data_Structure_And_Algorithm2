package algorithmprobles.genericsearchsort;

import java.util.List;

public class GenericSearchSort {
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(list.get(mid));

            if (comparison == 0) {
                return mid; // Found the key
            } else if (comparison < 0) {
                high = mid - 1; // Key is in the lower half
            } else {
                low = mid + 1; // Key is in the upper half
            }
        }

        return -1; // Key not found
    }

    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }
    }
}
