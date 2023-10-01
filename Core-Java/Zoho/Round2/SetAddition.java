package Zoho.Round2;
import java.util.Scanner;

public class SetAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of elements sc set1: ");
        int size1 = sc.nextInt();
        
        int[] arr1 = new int[size1];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size1; i++)
            arr1[i] = sc.nextInt();
        
        System.out.print("Number of elements sc set2: ");
        int size2 = sc.nextInt();
        
        int[] arr2 = new int[size2];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size2; i++)
            arr2[i] = sc.nextInt();
        
        int maxLength = Math.max(size1, size2);
        int[] result = new int[maxLength];
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int sum = carry;
            if (i < size1)
                sum += arr1[size1 - i - 1];
            if (i < size2)
                sum += arr2[size2 - i - 1];

            result[maxLength - i - 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            System.out.print(carry + ",");
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(result[i]);
            if (i < maxLength - 1) {
                System.out.print(",");
            }
        }
        sc.close();
    }
}
