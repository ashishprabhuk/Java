package Zoho.Round2.Arrays;
import java.util.Arrays;

public class AlternateSorting {
    // public static void bubble(int[] arr){
    //     for(int i=arr.length-1; i>=0; i--){
    //         for(int j=0; j<i;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    public static int[] alternateSort(int[] arr) {
        // Sort the input array in ascending order
        Arrays.sort(arr);
        // bubble(arr);

        int n = arr.length;
        int[] result = new int[n];
        int start = 0; // Pointer for the minimum element
        int end = n - 1; // Pointer for the maximum element
        boolean flag = true; // Flag to alternate between max and min

        // Iterate through the sorted array and pick max and min alternately
        for (int i = 0; i < n; i++) {
            if (flag) {
                result[i] = arr[end];
                end--;
            } else {
                result[i] = arr[start];
                start++;
            }
            flag = !flag; // Toggle the flag
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {10,20,100,50,70,90,40,30};
        int[] resultArray = alternateSort(inputArray);
        System.out.println("Input Array: " + Arrays.toString(inputArray));

        System.out.println("Output Array: " + Arrays.toString(resultArray));
    }
}

/*
Alternate sorting: Given an array of integers,
rearrange the array in such a way that the first
element is first maximum and second element is
first minimum.
Eg.) Input : {1, 2, 3, 4, 5, 6, 7}
Output : {7, 1, 6, 2, 5, 3, 4}
 */