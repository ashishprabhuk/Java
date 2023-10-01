package DSA.Arrays.TwoDArray;
import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
        int[][] transposedMatrix = transposeMatrix(originalMatrix);
    
        System.out.println("Original Matrix:");
        printMatrix(originalMatrix);
    
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }
    public static void printMatrix(int[][] Matrix){
        for(int[] row:Matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] transposedMatrix = new int[numCols][numRows];
    
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
    
}
