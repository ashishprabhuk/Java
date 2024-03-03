package Zoho.Round2.Strings;
import java.util.ArrayList;
import java.util.HashSet;

public class MismatchedElements {
    public static void main(String[] args) {
        // Define two character arrays
        char[] arr1 = {'a','b','c','d','e','f','g','h','i'};
        char[] arr2 = {'a','b','d','e','e','g','g','i','i'};
        findMismatchedElements1(arr1, arr2);
    }

    public static void findMismatchedElements1(char[] arr1, char[] arr2) {
        int i = 0, j = 0;

        // Iterate through both arrays to find mismatched elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.println("Mismatched Element: " + arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.println("Mismatched Element: " + arr2[j]);
                j++;
            } else {
                // If elements are equal, move to the next elements in both arrays
                i++;
                j++;
            }
        }

        // Print remaining elements from arr1, if any
        while (i < arr1.length) {
            System.out.println("Mismatched Element: " + arr1[i]);
            i++;
        }

        // Print remaining elements from arr2, if any
        while (j < arr2.length) {
            System.out.println("Mismatched Element: " + arr2[j]);
            j++;
        }
    }
}
