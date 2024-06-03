package Zoho.Round2.TwoDArrays;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int sum = findMatrixSum(matrix);
        System.out.println("Sum of all elements in the matrix: " + sum);
    }

    public static int findMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }
}