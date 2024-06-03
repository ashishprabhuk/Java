// package Zoho.Round2.TwoDArrays;

// import java.util.Scanner;

// public class MatrixPath {
//     public static void main(String[] args) {
//         // Scanner scanner = new Scanner(System.in);

//         // int N = scanner.nextInt();

//         // int[][] matrix = new int[N][N];
//         // for (int i = 0; i < N; i++) {
//         //     for (int j = 0; j < N; j++) {
//         //         matrix[i][j] = scanner.nextInt();
//         //     }
//         // }

//         int[][] matrix = {
//             {1, 0, 0, 0},
//             {1, 1, 0, 1},
//             {0, 1, 0, 0},
//             {1, 1, 1, 1}
//         };

//         boolean result = canReachEnd(matrix);
//         if (result) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }

//     static boolean canReachEnd(int[][] matrix) {
//         return dfs(matrix, 0, 0);
//     }

//     static boolean dfs(int[][] matrix, int row, int col) {
//         int N = matrix.length;

//         // Check if we have reached the destination
//         if (row == N - 1 && col == N - 1) {
//             return true;
//         }

//         // Mark the current cell as visited by changing it to -1
//         matrix[row][col] = -1;

//         // Check right and down neighbors
//         if (isValid(row + 1, col, N) && matrix[row + 1][col] == 1) {
//             if (dfs(matrix, row + 1, col)) {
//                 return true;
//             }
//         }

//         if (isValid(row, col + 1, N) && matrix[row][col + 1] == 1) {
//             if (dfs(matrix, row, col + 1)) {
//                 return true;
//             }
//         }

//         // Restore the cell value if no path is found from this cell
//         matrix[row][col] = 1;
//         return false;
//     }

//     static boolean isValid(int row, int col, int N) {
//         return row >= 0 && col >= 0 && row < N && col < N;
//     }
// }

package Zoho.Round2.TwoDArrays;

import java.util.Scanner;

public class MatrixPath {
    public static void main(String[] args) {
        int[][] matrix = {
                        {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1}
                    };
        int N = matrix.length;

        // Check if a path exists
        boolean result = canReachEnd(matrix, N);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean canReachEnd(int[][] matrix, int N) {
        return dfs(matrix, 0, 0, N); // Start DFS from (0, 0)
    }

    static boolean dfs(int[][] matrix, int row, int col, int N) {
        // Check if the current position is valid
        if (!isValid(row, col, N) || matrix[row][col] != 1) {
            return false;
        }

        // Check if we have reached the destination
        if (row == N - 1 && col == N - 1) {
            return true;
        }

        // Mark the current cell as visited by setting it to a value other than 1
        matrix[row][col] = -1;

        // Check right and down neighbors
        if (dfs(matrix, row + 1, col, N) || dfs(matrix, row, col + 1, N)) {
            return true;
        }

        // If no path found from this cell, backtrack by resetting the cell value to 1
        matrix[row][col] = 1;

        return false;
    }

    static boolean isValid(int row, int col, int N) {
        return row >= 0 && col >= 0 && row < N && col < N;
    }
}
