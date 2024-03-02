package Zoho.Round2.Arrays;

public class SortByFactors {

    public static int countFactors(int num) {
        int factorsCount = 0;
        // traverse i = 1 to num for checking valid factor
        for (int fact = 1; fact <= num; ++fact) {
            // True, if "fact" is a valid factor of "num"
            if (num % fact == 0)
                ++factorsCount;
        }
        // return the total number of factors of number "num"
        return factorsCount;
    }

    public static void swap(int array[], int pos1, int pos2) {
        int tempVar = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = tempVar;
    }

    public static void sort(int arr[], int n) {
        // create counter array for storing the number of factors
        // this is used for mapping the number with its factor-counts
        int[] counter = new int[n];
        for (int idx = 0; idx < n; ++idx)
            counter[idx] = countFactors(arr[idx]);

        // sort the "array" using the concept of "bubble sort"
        for (int pass = 0; pass < n; ++pass) {
            for (int idx = 0; idx < n - pass - 1; ++idx) {
                // if order is not correct, swap the elements
                if ((counter[idx] > counter[idx + 1]) || (counter[idx] == counter[idx + 1] && arr[idx] > arr[idx + 1])) {
                    swap(arr, idx, idx + 1);
                    swap(counter, idx, idx + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 16};
        int N = arr.length;

        sort(arr, N);

        // display the array after sorting
        System.out.print("Array after Sorting by Factor: ");
        for (int idx = arr.length-1; idx >=0; idx--) {
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}



/*
To find the factors of the numbers given in an
array and to sort the numbers in descending order
according to the factors present in it.
Input:
Given array : 8, 2, 3, 12, 16
Output: 12, 16, 8, 2, 3
 */