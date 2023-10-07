package Zoho.Round2.TwoDArrays;

import java.util.Scanner;

public class MatrixPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of N
        int N = scanner.nextInt();

        // Read the matrix
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if a path exists
        boolean result = canReachEnd(matrix);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean canReachEnd(int[][] matrix) {
        int N = matrix.length;
        boolean[][] visited = new boolean[N][N];

        // Start DFS from (0, 0)
        return dfs(matrix, 0, 0, visited);
    }

    static boolean dfs(int[][] matrix, int row, int col, boolean[][] visited) {
        int N = matrix.length;

        // Check if we have reached the destination
        if (row == N - 1 && col == N - 1) {
            return true;
        }

        // Mark the current cell as visited
        visited[row][col] = true;

        // Check right and down neighbors
        if (isValid(row + 1, col, N) && matrix[row + 1][col] == 1 && !visited[row + 1][col]) {
            if (dfs(matrix, row + 1, col, visited)) {
                return true;
            }
        }

        if (isValid(row, col + 1, N) && matrix[row][col + 1] == 1 && !visited[row][col + 1]) {
            if (dfs(matrix, row, col + 1, visited)) {
                return true;
            }
        }

        // If no path found from this cell, backtrack
        visited[row][col] = false;
        return false;
    }

    static boolean isValid(int row, int col, int N) {
        return row >= 0 && col >= 0 && row < N && col < N;
    }
}
