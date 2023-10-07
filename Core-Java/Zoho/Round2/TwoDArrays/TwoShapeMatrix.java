package Zoho.Round2.TwoDArrays;

public class TwoShapeMatrix  {
    public static void printZigZagMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0) { // Even rows
                for (int j = 0; j < numCols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else { // Odd rows
                for (int j = numCols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printZigZagMatrix(matrix);
    }
}
