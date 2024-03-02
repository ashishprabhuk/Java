// package Zoho.Round2.Arrays;

// import java.util.Arrays;
// import java.util.Scanner;

// public class TowerBlock {
//     public static void main(String[] args) {
//     int[] arr = {1, 2, 5, 4, 3, 6};
//     int h1 = 6, h2 = 15;
//     // Sort the block heights in ascending order
//     Arrays.sort(arr);
//     // Find and print two sets of 3 blocks each for the two towers
//     boolean found = findTowerBlocks(arr, h1) && findTowerBlocks(arr, h2);
//     if (!found) {
//         System.out.println("No valid towers found.");
//     }
// }

//     // Function to find and print three blocks for a tower
//     static boolean findTowerBlocks(int[] heights, int targetHeight) {
//         for (int i = 0; i < 6; i++) {
//             for (int j = i + 1; j < 6; j++) {
//                 for (int k = j + 1; k < 6; k++) {
//                     int sum = heights[i] + heights[j] + heights[k];
//                     if (sum == targetHeight) {
//                         // Found a tower
//                         printTower(heights[i], heights[j], heights[k]);
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }

//     // Function to print a tower
//     static void printTower(int a, int b, int c) {
//         int[] tower = {a, b, c};
//         Arrays.sort(tower);
//         for (int i = 0; i < 3; i++) {
//             System.out.print(tower[i] + " ");
//         }
//         System.out.println();
//     }
// }

package Zoho.Round2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TowerBlock {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 6};
        int h1 = 6, h2 = 15;
        // Sort the block heights in ascending order
        Arrays.sort(arr);

        // Find and print two sets of 3 blocks each for the two towers
        boolean found = findTowerBlocks(arr, h1) && findTowerBlocks(arr, h2);
        if (!found) {
            System.out.println("No valid towers found.");
        }
    }

    // Function to find and print three blocks for a tower
    static boolean findTowerBlocks(int[] arr, int height) {
        for (int i = 0; i < arr.length; i++) {
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == height) {
                    printTower(arr[i], arr[start], arr[end]);
                    return true;
                } else if (sum < height) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return false;
    }

    static void printTower(int a, int b, int c) {
        int[] tower = {a, b, c};
        Arrays.sort(tower);
        for (int i = 0; i < tower.length; i++) {
            System.out.print(tower[i] + " ");
        }
        System.out.println();
    }
}


/*
 * Given a 6 blocks, of different height h1, …, h6 .
Make 2 towers using 3 Blocks for each tower in
desired height h1, h2. Print the blocks to be used in
ascending order
Input:
1 2 5 4 3 6
height of tower: 6 15
Output :
1 2 3 & 4 5 6
 */