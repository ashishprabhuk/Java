package Zoho.Round2.Arrays;
import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        
        int[] mergedArray = mergeArrays(arr1, arr2);
        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];
        
        int i = 0, j = 0, k = 0;
        
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                mergedArray[k++] = arr2[j++];
            } else {
                mergedArray[k++] = arr1[i++];
                j++;
            }
        }
        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
}
