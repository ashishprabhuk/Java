package Zoho.Round2.TwoDArrays;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Row Size: ");
        int rows = scanner.nextInt();

        System.out.print("Enter Column Size: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Unique Matrix:");
        printUniqueMatrix(matrix);
    }

    public static void printUniqueMatrix(int[][] matrix) {
        HashSet<String> uniqueRows = new HashSet<>();

        for (int[] row : matrix) {
            StringBuilder rowString = new StringBuilder();
            for (int num : row) {
                rowString.append(num).append(" ");
            }
            if (uniqueRows.add(rowString.toString().trim())) {
                System.out.println(rowString.toString().trim());
            }
        }
    }
}

/*
 * 
 * Enter Row Size: 4
 * Enter Column Size: 3
 * Enter the matrix:
 * 1 0 1
 * 1 1 0
 * 1 1 1
 * 1 0 1
 * Unique Matrix:
 * 1 0 1
 * 1 1 0
 * 1 1 1
 */