package Zoho.Round2.Arrays;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,0,0,3};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
        int n = removeDuplicatesOP(arr);
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }

        return uniqueArr;
    }
    public static int removeDuplicatesOP(int arr[]){
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        } 
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        // arr[j++] = arr[n - 1];
        return j;
    }
}