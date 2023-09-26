package Algorithms.Sorts;
import java.util.Arrays;

/*
 *  iterating through the array and comparing each element to the elements before it. 
 * If an element is less than the element before it, it is swapped with the element before it. 
 * This process is continued until the array is sorted.
 * it is faster than other sorting algorithms, such as quicksort and merge sort.O(n^2)
*/
public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i]; // Store the current element in a temporary variable
            int j = i - 1; // Initialize the index of the previous element
            
            // Compare arr[j] with temp, and move elements of arr[0..i-1] that are greater than temp
            // one position ahead of their current position
            while(j>=0 && arr[j]>temp){ 
                arr[j+1] = arr[j]; // Shift the element to the right
                arr[j] = temp; // Update the current position with temp
                j--; // Decrement the index to continue checking and shifting
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,69,0,29};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards 
 * in your hands. The array is virtually split into a sorted and an unsorted part. 
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
*/
