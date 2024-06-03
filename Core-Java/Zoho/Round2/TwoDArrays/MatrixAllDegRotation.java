package Zoho.Round2.TwoDArrays;

public class MatrixAllDegRotation {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrixB = { 
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };//90 deg

        // int[][] matrixB = { 
        //     {9, 8, 7},
        //     {6, 5, 4},
        //     {3, 2, 1}
        // };//180 deg

        // int[][] matrixB = { 
        //     {3, 6, 9},
        //     {2, 5, 8},
        //     {1, 4, 7}
        // };//270 deg

        // int[][] matrixB = { 
        //     {3, 2, 1},
        //     {6, 5, 4},
        //     {9, 8, 7}
        // };//mirrorVertical

        // int[][] matrixB = { 
        //     {7, 8, 9},
        //     {4, 5, 6},
        //     {1, 2, 3}
        // };//mirrorHorizontal
        
        boolean result = canTransform(matrixA, matrixB);
        
        if (result) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    
    public static boolean canTransform(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        
        // Check if matrix B is equal to matrix A after a 90-degree rotation
        if (isEqual(matrixA, rotate90(matrixB, n))) {
            return true;
        }
        
        // Check if matrix B is equal to matrix A after a 180-degree rotation
        if (isEqual(matrixA, rotate180(matrixB, n))) {
            return true;
        }
        
        // Check if matrix B is equal to matrix A after a 270-degree rotation
        if (isEqual(matrixA, rotate270(matrixB, n))) {
            return true;
        }
        
        // Check if matrix B is equal to matrix A after mirroring vertically
        if (isEqual(matrixA, mirrorVertical(matrixB, n))) {
            return true;
        }
        
        // Check if matrix B is equal to matrix A after mirroring horizontally
        if (isEqual(matrixA, mirrorHorizontal(matrixB, n))) {
            return true;
        }
        
        return false; // Return false if none of the transformations match
    }
    
    public static int[][] rotate90(int[][] matrix, int n) {
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[n - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }
    
    public static int[][] rotate180(int[][] matrix, int n) {
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[n - 1 - i][n - 1 - j];
            }
        }
        return rotatedMatrix;
    }
    
    public static int[][] rotate270(int[][] matrix, int n) {
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[j][n - 1 - i];
            }
        }
        return rotatedMatrix;
    }
    
    public static boolean isEqual(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] mirrorVertical(int[][] matrix, int n) {
        int[][] mirroredMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mirroredMatrix[i][j] = matrix[i][n - 1 - j];
            }
        }
        return mirroredMatrix;
    }
    
    public static int[][] mirrorHorizontal(int[][] matrix, int n) {
        int[][] mirroredMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mirroredMatrix[i][j] = matrix[n - 1 - i][j];
            }
        }
        return mirroredMatrix;
    }
    
}


// Write a program to rotate an n*n matrix
// 90,180,270,360 degree.