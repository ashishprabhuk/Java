package Zoho.Round2.TwoDArrays;

public class MatrixSubSearch {
    public static void main(String[] args) {
        int[][] largerMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        int[][] smallerMatrix = {
            {6, 7},
            {10, 11}
        };
        boolean result = findMatrix(largerMatrix, smallerMatrix);
        
        if (result) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    
    public static boolean findMatrix(int[][] largerMatrix, int[][] smallerMatrix) {
        int n = largerMatrix.length; 
        int m = smallerMatrix.length; 
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {
                if (isSubMatrix(largerMatrix, smallerMatrix, i, j, m)) {
                    return true;
                }
            }
        }
        return false; 
    }
    
    public static boolean isSubMatrix(int[][] largerMatrix, int[][] smallerMatrix, int row, int col, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (largerMatrix[row + i][col + j] != smallerMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

