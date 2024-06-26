package Zoho.Round2.TwoDArrays;

// import java.util.ArrayList;
// import java.util.List;

public class MaxPathSum2d {
    public static void main(String[] args) {
        // int[][] grid = {
        //     {10, 20},
        //     {21, 3},
        //     {1,6}
        // };
        int[][] grid = {
            {15,25,30},
            {45,25,60},
            {70,75,10}
        };    
        int maxPathSum = findMaxPathSum(grid, 0, 0);
        System.out.println("Maximum path sum: " + maxPathSum);
    }

    public static int findMaxPathSum(int[][] grid, int row, int col) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        // Base case: If we've reached the bottom-right corner, return the value
        if (row == numRows - 1 && col == numCols - 1) {
            return grid[row][col];
        }

        // Calculate the maximum path sum by moving right and down
        int rightSum = (col < numCols - 1) ? findMaxPathSum(grid, row, col + 1) : 0;
        int downSum = (row < numRows - 1) ? findMaxPathSum(grid, row + 1, col) : 0;

        // Choose the maximum path and add the current cell's value
        int maxPath = Math.max(rightSum, downSum) + grid[row][col];
        return maxPath;
    }
}
