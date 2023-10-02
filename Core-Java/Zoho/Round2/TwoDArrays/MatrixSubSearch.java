package Zoho.Round2.TwoDArrays;

public class MatrixSubSearch {
    public static void main(String[] args) {
        // Define the larger matrix
        int[][] largerMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        // Define the smaller matrix to search for
        int[][] smallerMatrix = {
            {6, 7},
            {10, 11}
        };
        
        // Call the findMatrix function to check if the smaller matrix exists within the larger matrix
        boolean result = findMatrix(largerMatrix, smallerMatrix);
        
        // Print the result
        if (result) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    
    // Function to find the smaller matrix within the larger matrix
    public static boolean findMatrix(int[][] largerMatrix, int[][] smallerMatrix) {
        int n = largerMatrix.length; // Number of rows in the larger matrix
        int m = smallerMatrix.length; // Number of rows in the smaller matrix
        
        // Iterate through possible starting positions for the smaller matrix within the larger matrix
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {
                // Check if the smaller matrix exists starting from position (i, j)
                if (isSubMatrix(largerMatrix, smallerMatrix, i, j, m)) {
                    return true; // Return true if a match is found
                }
            }
        }
        
        return false; // Return false if no match is found
    }
    
    // Function to check if the smaller matrix exists starting from a particular position in the larger matrix
    public static boolean isSubMatrix(int[][] largerMatrix, int[][] smallerMatrix, int row, int col, int size) {
        // Iterate through the elements of both matrices
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Compare elements of the larger matrix and the smaller matrix
                if (largerMatrix[row + i][col + j] != smallerMatrix[i][j]) {
                    return false; // Return false if any element doesn't match
                }
            }
        }
        return true; // Return true if all elements match, indicating that the smaller matrix exists
    }
}

