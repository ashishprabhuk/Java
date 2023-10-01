package DSA.Arrays.TwoDArray;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        // Create and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print the 2D array
        System.out.println("2D Array:");
        printMatrix(matrix);
        
        // Search for an element in the 2D array
        int target = 5;
        boolean found = searchElement(matrix, target);
        System.out.println("Element " + target + " found: " + found);
        
        // Iterate through the 2D array
        System.out.println("Iterating through the 2D array:");
        iterateMatrix(matrix);
        
        // Find the number of rows and columns
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        System.out.println("Number of rows: " + numRows);
        System.out.println("Number of columns: " + numCols);
        
        // Find the sum of all elements
        int sum = calculateSum(matrix);
        System.out.println("Sum of all elements: " + sum);
        
        // Find the maximum element and minimum element
        findMaxMinElements(matrix);

    // Find the element indices in the 2d array
        int target1 = 5;
        int[] indices = findElementIndices(matrix, target1);
        
        if (indices != null) {
            System.out.println("Element " + target1 + " found at row " + indices[0] + " and column " + indices[1]);
        } else {
            System.out.println("Element " + target1 + " not found in the 2D array.");
        }
    }
    
    // Function to print the 2D array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // ( or )
        System.out.println("2D Array:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    // Function to search for an element in the 2D array
    public static boolean searchElement(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Function to iterate through the 2D array
    public static void iterateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at row " + i + " and column " + j + ": " + matrix[i][j]);
            }
        }
    }
    
    // Function to calculate the sum of all elements in the 2D array
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }
    
    // Function to find the maximum element in the 2D array
    public static void findMaxMinElements(int[][] matrix) {
        int maxElement = matrix[0][0];
        int minElement = matrix[0][0];
    
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > maxElement) {
                    maxElement = num;
                }
                if (num < minElement) {
                    minElement = num;
                }
            }
        }
    
        System.out.println("Maximum element: " + maxElement);
        System.out.println("Minimum element: " + minElement);
    }

    // Function to find the element indices in the 2D array
    public static int[] findElementIndices(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // Element not found
    }
}
