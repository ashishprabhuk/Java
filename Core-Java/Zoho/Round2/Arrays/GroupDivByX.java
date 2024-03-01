// package Zoho.Round2.Arrays;
// import java.util.Scanner;

// public class GroupDivByX {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the array size: ");
//         int size = sc.nextInt();

//         int[] array = new int[size];

//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < size; i++)
//             array[i] = sc.nextInt();

//         System.out.println("Enter the x value:");
//         int x = sc.nextInt();

//         generateGroups(array, x);

//         sc.close();
//     }

//     public static void generateGroups(int[] array, int x) {
//         int size = array.length;
//         int powerset_size = (int) Math.pow(2, size);

//         for (int counter = 0; counter < powerset_size; counter++) {
//             int sum = 0, k = 0;
//             int[] arrayb = new int[size]; // Temporary array to store elements of the current group

//             for (int i = 0; i < size; i++) {
//                 int num = counter & (1 << i);
//                 if (num >= 1) {
//                     sum += array[i];
//                     arrayb[k] = array[i];
//                     k++;
//                 }
//             }

//             if (sum % x == 0 && k >= 2 && k <= x) { // Check if sum is divisible by x and group size is within the range
//                 for (int i = 0; i < k; i++) {
//                     System.out.print(arrayb[i]);
//                     if (i < k - 1) {
//                         System.out.print(", ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }


package Zoho.Round2.Arrays;
public class GroupDivByX {
    // Returns count of all possible groups that can be formed from elements
    // of a[].
    static int findGroups(int arr[], int n) {
        // Create an array C[3] to store counts of elements with remainder
        // 0, 1, and 2. c[i] would store the count of elements with remainder i
        int c[] = new int[]{0, 0, 0};
        int i;

        int res = 0; // To store the result

        // Count elements with remainder 0, 1, and 2
        for (i = 0; i < n; i++)
            c[arr[i] % 3]++;

        // Case 3.a: Count groups of size 2 from 0 remainder elements
        res += (c[0] * (c[0] - 1)) / 2;

        // Case 3.b: Count groups of size 2 with one element with 1
        // remainder and the other with 2 remainders
        res += c[1] * c[2];

        // Case 4: Count groups of size 3
        res += (c[0] * (c[0] - 1) * (c[0] - 2) + c[1] * (c[1] - 1) * (c[1] - 2)
                + c[2] * (c[2] - 1) * (c[2] - 2) + c[0] * c[1] * c[2]);

        // Return total count stored in res
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 2, 9};
        int n = arr.length;
        System.out.println("Required number of groups are " + findGroups(arr, n));
    }
}



/*
To find the number of groups and output the
groups:
Explanation: To find the sum of the elements in the
groups and that sum should be divisible by input X
and the groups should be limited to range with X
numbers.
If X is 3, then the group should have only 2
elements and 3 elements from the array whose
sum is divisible by 3.
Input:
Array: 3, 9, 7, 4, 6, 8
X: 3
Output:
3, 9
3, 6
9, 6
3, 9, 6
No of groups: 4
 */
