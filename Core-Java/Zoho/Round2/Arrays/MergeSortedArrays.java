package Zoho.Round2.Arrays;
import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        
        int[] mergedArray = mergeArrays(arr1, arr2);
        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) { // only solution
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int len1 = arr1.length;
        int len2 = arr2.length;
        List<Integer> mergedList = new ArrayList<>();
        
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                mergedList.add(arr2[j]);
                j++;
            } else {
                // If both elements are equal, add one and move both pointers
                mergedList.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        // Add any remaining elements from arr1
        while (i < len1) {
            mergedList.add(arr1[i]);
            i++;
        }
        
        // Add any remaining elements from arr2
        while (j < len2) {
            mergedList.add(arr2[j]);
            j++;
        }
        
        // Convert the merged List to an array
        int[] mergedArray = new int[mergedList.size()];
        for (int k = 0; k < mergedList.size(); k++) {
            mergedArray[k] = mergedList.get(k);
        }
        
        return mergedArray;
    }
}

