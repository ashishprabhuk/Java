package Algorithms.Sorts;
import java.util.Arrays;

/*
 * works by dividing an array into smaller sub-arrays, sorting each sub-array, and 
 * then merging the sorted sub-arrays back together to form the final sorted array.
*/

public class MergeSort {

    // Merge two sorted arrays into a single sorted array
    static int[] merge(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[index] = arr1[i];
                index++;
                i++;
            } else {
                combined[index] = arr2[j];
                index++;
                j++;
            }
        }

        // Copy any remaining elements from arr1
        while (i < arr1.length) {
            combined[index] = arr1[i];
            index++;
            i++;
        }

        // Copy any remaining elements from arr2
        while (j < arr2.length) {
            combined[index] = arr2[j];
            index++;
            j++;
        }

        return combined;
    }

    // Recursively split and merge the array
    static int[] mergeSort(int[] arr){
        if (arr.length == 1) return arr; // Base case: Already sorted if there's 1 element
        int midIndex = arr.length / 2;
        
        // Split the array into left and right halves, then recursively sort them
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));
        
        // Merge the sorted halves
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] originalArr = {2,1,4,3,69,0,29};
        int[] sortedArr = mergeSort(originalArr);
        System.out.println("\nOriginal Array: " + Arrays.toString(originalArr));
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArr));
    }
}
/*
* Advantages of Merge Sort:
 *  Merge sort has a worst-case time complexity of O(N logN),
 * which means it performs well even on large datasets.

 *  Drawbacks of Merge Sort:
 * Merge sort requires additional memory to store the merged sub-arrays during the sorting process. 
*/