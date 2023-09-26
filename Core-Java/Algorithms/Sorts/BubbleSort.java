package Algorithms.Sorts;
import java.util.Arrays;
/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping 
 * the adjacent elements if they are in the wrong order. 
 * This algorithm is not suitable for large data sets as its average and 
 * worst-case time complexity is quite high.
 */
public class BubbleSort {
    static void bubbleSort(int[] arr){ // void return type as bubble sort modifies the original array.
        for(int i = arr.length-1; i>0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j]>arr[j+1]){ // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Bubble sort is a simple sorting algorithm that repeatedly steps through the input list 
 * element by element, comparing the current element with the one after it, 
 * swapping their values if needed. These passes through the list are repeated 
 * until no swaps had to be performed during a pass, meaning that the list has become fully sorted. 
*/
