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

        int powerset_size = (int) Math.pow(2, size);

        for (int counter = 0; counter < powerset_size; counter++) {
            int sum = 0, k = 0;
            int[] arrayb = new int[size]; // Temporary array to store elements sc the current group

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
        sc.close();
    }
}

