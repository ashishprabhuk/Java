package Zoho.Round2.TwoDArrays;

public class MatrixRotation {
    static int numRows = 3;
    static int numCols = 3;

    // Function to rotate a matrix
    static void rotateMatrix(int m, int n, int mat[][]) {
        int numRows = 3;
        int numCols = 3;
        int row = 0, col = 0;
        int prev, curr;

        while (row < m && col < n) {
            // Store the first element of the next row
            prev = mat[row + 1][col];

            // Move elements of the first row to the right
            for (int i = col; i < n; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;

            // Move elements of the last column downwards
            for (int i = row; i < m; i++) {
                curr = mat[i][n - 1];
                mat[i][n - 1] = prev;
                prev = curr;
            }
            n--;

            // Move elements of the last row to the left
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat[m - 1][i];
                    mat[m - 1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            // Move elements of the first column upwards
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }

        // Print the rotated matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        rotateMatrix(numRows, numCols, matrix);
    }
}