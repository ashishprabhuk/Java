package Zoho.Round2.TwoDArrays;

public class RectangleSum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 6},
            {5, 3, 8, 1, 2},
            {4, 6, 7, 5, 5},
            {2, 4, 8, 9, 4}
        };

        int row1 = 2;
        int col1 = 0;
        int row2 = 3;
        int col2 = 4;

        int sum = calculateRectangleSum(mat, row1, col1, row2, col2);
        System.out.println("Sum: " + sum);
    }

    public static int calculateRectangleSum(int[][] mat, int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
