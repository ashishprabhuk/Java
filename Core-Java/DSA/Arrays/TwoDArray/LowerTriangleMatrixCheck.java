package DSA.Arrays.TwoDArray;

public class LowerTriangleMatrixCheck {    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {1, 1, 0},
            {1, 1, 1}
        };

        boolean isLowerTriangular = isLowerTriangularMatrix(matrix);

        if (isLowerTriangular) {
            System.out.println("The matrix is a lower triangular matrix.");
        } else {
            System.out.println("The matrix is not a lower triangular matrix.");
        }
    }

    static boolean isLowerTriangularMatrix(int[][] matrix) {
        // Check if the matrix is square
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;
        }

        // Check the condition for lower triangular matrix
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        // If all conditions are met, it is a lower triangular matrix
        return true;
    }
}
