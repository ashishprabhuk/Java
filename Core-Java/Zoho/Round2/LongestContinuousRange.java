package Zoho.Round2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestContinuousRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> longestRange = findLongestContinuousRange(arr);

        System.out.println("Output:");
        for (int num : longestRange) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findLongestContinuousRange(int[] arr) {
        List<Integer> longestRange = new ArrayList<>();
        List<Integer> currentRange = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (currentRange.isEmpty() || arr[i] == currentRange.get(currentRange.size() - 1) + 1) {
                currentRange.add(arr[i]);
            } else {
                if (currentRange.size() > longestRange.size()) {
                    longestRange = new ArrayList<>(currentRange);
                }
                currentRange.clear();
                currentRange.add(arr[i]);
            }
        }

        if (currentRange.size() > longestRange.size()) {
            longestRange = new ArrayList<>(currentRange);
        }

        return longestRange;
    }
}

/*
 * 
 * INPUT :
 * Enter array size : 8
 * Enter arryay elements : 1 3 10 7 9 2 4 6
 * OUTPUT :
 * 1 2 3 4
 * Ex. INPUT :
 * Enter array size : 8
 * Enter arryay elements : 1 3 9 7 8 2 4 6
 * OUTPUT :
 * 1 2 3 4
 * 6 7 8 9
 */