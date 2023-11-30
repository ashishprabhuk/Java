package Zoho.Round2.Arrays;
import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        findAndPrintUnion(arr1, arr2);

        scanner.close();
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