package Zoho.Round2.Arrays;

public class RemoveDuplicatesSortArr {
    public static  int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int i = 0;
        for(int j = 0; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return ++i;
    }

    public static void main(String[] args) {

        // int[] arr = {1, 1, 2};
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = removeDuplicates(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println(Arrays.toString(arr));
    }
}


/*

Remove Duplicates from Sorted Array:

Example 1:

Input: arr = [1,1,2]
Output: 2, arr = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of arr being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: arr = [0,0,1,1,1,2,2,3,3,4]
Output: 5, arr = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of arr being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */