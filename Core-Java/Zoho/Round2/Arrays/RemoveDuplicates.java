package Zoho.Round2.Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("Output:");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        System.arraycopy(uniqueArr, 0, result, 0, uniqueCount);

        return result;
    }
}