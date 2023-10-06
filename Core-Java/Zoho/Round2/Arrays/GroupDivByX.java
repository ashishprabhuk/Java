package Zoho.Round2.Arrays;
import java.util.Scanner;

public class GroupDivByX {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.println("Enter the x value:");
        int x = sc.nextInt();

        generateGroups(array, x);

        sc.close();
    }

    public static void generateGroups(int[] array, int x) {
        int size = array.length;
        int powerset_size = (int) Math.pow(2, size);

        for (int counter = 0; counter < powerset_size; counter++) {
            int sum = 0, k = 0;
            int[] arrayb = new int[size]; // Temporary array to store elements of the current group

            for (int i = 0; i < size; i++) {
                int num = counter & (1 << i);
                if (num >= 1) {
                    sum += array[i];
                    arrayb[k] = array[i];
                    k++;
                }
            }

            if (sum % x == 0 && k >= 2 && k <= x) { // Check if sum is divisible by x and group size is within the range
                for (int i = 0; i < k; i++) {
                    System.out.print(arrayb[i]);
                    if (i < k - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
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