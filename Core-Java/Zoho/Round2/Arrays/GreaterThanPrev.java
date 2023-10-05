package Zoho.Round2.Arrays;

public class GreaterThanPrev {
    public static void main(String[] args) {
        int[] array = {-4, -3, -4, 5, 9, 7, 8};
        printElements(array);
    }

    static void printElements(int arr[]) {
        int n = arr.length;
        
        // Check the first element separately as it doesn't have a previous element
        if (n > 0) {
            if(arr[0] > arr[1])
                System.out.print(arr[0] + " ");
        }

        // Traverse array from index 1 to n-1
        // and check if the current element is greater than the previous one
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


/*
You’re given an array. Print the elements of the
array which are greater than its previous elements
in the array.
Input : 2, -3, -4, 5, 9, 7, 8 
Output: 2 5 9
You should solve this question in O(n) time.
 */