package Zoho.Round2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        int[] union = findUnion(arr1, arr2);

        System.out.println("Output:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        for (int num : arr1) {
            unionSet.add(num);
        }

        for (int num : arr2) {
            unionSet.add(num);
        }

        int[] union = new int[unionSet.size()];
        int index = 0;

        for (int num : unionSet) {
            union[index++] = num;
        }

        return union;
    }
}