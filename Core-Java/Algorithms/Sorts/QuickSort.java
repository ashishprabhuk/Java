package Algorithms.Sorts;
/*
The key process in quickSort is a partition(). 
The target of partitions is to place the pivot (any element can be chosen to be a pivot) 
at its correct position in the sorted array and put all smaller elements to the left of the pivot, 
and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed 
in its correct position and this finally sorts the array.
*/ 

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the rightmost element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return the pivot index
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            // Recursively sort the two sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}