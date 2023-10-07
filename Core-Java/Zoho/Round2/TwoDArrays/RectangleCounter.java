package Zoho.Round2.TwoDArrays;

import java.util.Stack;

public class RectangleCounter {
    static int calculateMaxRectangleArea(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;
        int[] heights = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, calculateMaxHistogramArea(heights));
        }
        return maxArea;
    }

    static int calculateMaxHistogramArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.print("Area of the largest rectangle is " + calculateMaxRectangleArea(matrix));
    }
}








/*
in a matrix find the number of rectangles filled
with 1s.

Input: 
0 1 1 0
1 1 1 0
0 0 1 1
0 0 1 1
Output: 2.
 */