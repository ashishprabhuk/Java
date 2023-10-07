package Zoho.Round2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TowerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the heights of the blocks
        int[] heights = new int[6];
        for (int i = 0; i < 6; i++) {
            heights[i] = scanner.nextInt();
        }

        // Read the desired heights of the two towers
        int height1 = scanner.nextInt();
        int height2 = scanner.nextInt();

        // Sort the block heights in ascending order
        Arrays.sort(heights);

        // Find and print two sets of 3 blocks each for the two towers
        boolean found = findTowerBlocks(heights, height1) || findTowerBlocks(heights, height2);
        if (!found) {
            System.out.println("No valid towers found.");
        }
    }

    // Function to find and print three blocks for a tower
    static boolean findTowerBlocks(int[] heights, int targetHeight) {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int sum = heights[i] + heights[j] + heights[k];
                    if (sum == targetHeight) {
                        // Found a tower
                        printTower(heights[i], heights[j], heights[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Function to print a tower
    static void printTower(int a, int b, int c) {
        int[] tower = {a, b, c};
        Arrays.sort(tower);
        for (int i = 0; i < 3; i++) {
            System.out.print(tower[i] + " ");
        }
        System.out.println();
    }
}
