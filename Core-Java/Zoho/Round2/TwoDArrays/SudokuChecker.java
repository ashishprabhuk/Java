package Zoho.Round2.TwoDArrays;

public class SudokuChecker {
    public static boolean isSudokuValid(int[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowSeen = new boolean[10];
            boolean[] colSeen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                // Check rows
                if (rowSeen[board[i][j]]) {
                    return false;
                }
                rowSeen[board[i][j]] = true;

                // Check columns
                if (colSeen[board[j][i]]) {
                    return false;
                }
                colSeen[board[j][i]] = true;
            }
        }

        // Check subgrids (3x3 regions)
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] seen = new boolean[10];
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (seen[board[i][j]]) {
                            return false;
                        }
                        seen[board[i][j]] = true;
                    }
                }
            }
        }

        return true; // Sudoku is valid
    }

    public static void main(String[] args) {
        int[][] sudokuGrid = {
            {5, 1, 3, 6, 8, 7, 2, 4, 9},
            {8, 4, 9, 5, 2, 1, 6, 3, 7},
            {2, 6, 7, 3, 4, 9, 5, 8, 1},
            {1, 5, 8, 4, 6, 3, 9, 7, 2},
            {9, 7, 4, 2, 1, 8, 3, 6, 5},
            {3, 2, 6, 7, 9, 5, 4, 1, 8},
            {7, 8, 2, 9, 3, 4, 1, 5, 6},
            {6, 3, 5, 1, 7, 2, 8, 9, 4},
            {4, 9, 1, 8, 5, 6, 7, 2, 3}
        };

        if (isSudokuValid(sudokuGrid)) {
            System.out.println("Sudoku is valid.");
        } else {
            System.out.println("Sudoku is not valid.");
        }
    }
}
