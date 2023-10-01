package DSA.Arrays.TwoDArray;

public class LargeSubMatrixOnes {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };

        int maxSize = findLargestSubmatrix(matrix);
        System.out.println("Size of the largest submatrix with all ones: " + maxSize);
    }

    public static int findLargestSubmatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Initialize an auxiliary matrix to store the maximum height of 1s ending at each cell
        int[][] heightMatrix = new int[numRows][numCols];

        // Initialize the first row of the auxiliary matrix
        for (int i = 0; i < numCols; i++) {
            heightMatrix[0][i] = matrix[0][i];
        }

        // Fill the auxiliary matrix for the remaining rows
        for (int i = 1; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == 1) {
                    heightMatrix[i][j] = heightMatrix[i - 1][j] + 1;
                }
            }
        }

        // Calculate the largest area using the "Largest Rectangle in Histogram" approach
        int maxSize = 0;
        for (int i = 0; i < numRows; i++) {
            int rowMaxSize = LargestRectangleInHistogram.findLargestRectangle(heightMatrix[i]);
            if (rowMaxSize > maxSize) {
                maxSize = rowMaxSize;
            }
        }

        return maxSize;
    }
}

class LargestRectangleInHistogram {
    public static int findLargestRectangle(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int[] stack = new int[n + 1];
        int top = -1;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (top >= 0 && h < heights[stack[top]]) {
                int height = heights[stack[top--]];
                int width = (top >= 0) ? i - stack[top] - 1 : i;
                maxArea = Math.max(maxArea, height * width);
            }
            stack[++top] = i;
        }

        return maxArea;
    }
}

