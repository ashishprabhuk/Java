package Algorithms.Sorts;
import java.util.Arrays;

/*  
 *  It works by repeatedly finding the smallest element in the unsorted part of the array and 
 * swapping it with the first element. This process is repeated until the entire array is sorted.Selection sort is not the most efficient sorting algorithm, but it is often used for small arrays.
 */
public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {99,1,0,50,21,69};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
