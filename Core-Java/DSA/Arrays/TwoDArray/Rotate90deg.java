package DSA.Arrays.TwoDArray;

import java.util.Arrays;

public class Rotate90deg {
    public static void main(String[] args) {
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // int[][] matrix = {
        //                 {1, 2, 3, 4},
        //                 {5, 6, 7, 8},
        //                 {9, 10, 11, 12},
        //                 {13, 14, 15, 16}
        //             };
    
        int[][] rotatedMatrix = rotateMatrix90Degrees(originalMatrix);
    
        System.out.println("Original Matrix:");
        printMatrix(originalMatrix);
    
        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(rotatedMatrix);
    }

    public static void printMatrix(int[][] Matrix){
        for (int[] row : Matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] rotateMatrix90Degrees(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] rotatedMatrix = new int[numCols][numRows];
    
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                rotatedMatrix[j][numRows - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
    
    
}
