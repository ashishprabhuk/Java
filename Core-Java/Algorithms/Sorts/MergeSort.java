package Algorithms.Sorts;
import java.util.Arrays;

/*
 * works by dividing an array into smaller sub-arrays, sorting each sub-array, and 
 * then merging the sorted sub-arrays back together to form the final sorted array.
*/

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1, 9, 4, 7, 6};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}

/*
* Advantages of Merge Sort:
 *  Merge sort has a worst-case time complexity of O(N logN),
 * which means it performs well even on large datasets.

 *  Drawbacks of Merge Sort:
 * Merge sort requires additional memory to store the merged sub-arrays during the sorting process. 
*/