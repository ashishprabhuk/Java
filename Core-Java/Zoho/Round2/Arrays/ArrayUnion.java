package Zoho.Round2.Arrays;
import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,3};
        int[] arr2 = {1,2,5,7};
        findAndPrintUnion(arr1, arr2);
    }

    public static void findAndPrintUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>(); 

        for (int num : arr1) {
            unionSet.add(num);
        }

        for (int num : arr2) {
            unionSet.add(num);
        }

        System.out.print("Number of elements after union operation: " + unionSet.size() + "\n");
        System.out.println("The union set of both arrays is : ");
        System.out.print(unionSet.toString() + " ");
        System.out.print(unionSet);
        for (int n : unionSet) {
            System.out.print(n+" ");
        }
    }
    public static int[] findUnion(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int m = arr1.length;
        int n = arr2.length;
        
        int i = 0, j = 0, k = 0;
        int[] unionArray = new int[m + n];

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                unionArray[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                unionArray[k++] = arr2[j++];
            } else { // If both elements are equal
                unionArray[k++] = arr1[i++];
                j++;
            }
        }

        while (i < m) {
            unionArray[k++] = arr1[i++];
        }

        while (j < n) {
            unionArray[k++] = arr2[j++];
        }

        // Create a new array with correct size and copy elements
        int[] result = new int[k];
        for (i = 0; i < k; i++) {
            result[i] = unionArray[i];
        }
        return result;
    }
    
}



/*  
 * Given two arrays. Find its union.
Input :
Enter size of first array : 6
Enter the elements : 1 2 3 4 5 3
Enter size of second array : 4
Enter the elements : 1 2 7 5
OUTPUT :
1 2 3 4 5 7
 */
