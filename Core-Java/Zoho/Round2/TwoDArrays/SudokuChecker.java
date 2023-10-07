package Zoho.Round2.TwoDArrays;

public class SudokuChecker {

    // Function to check if a row, column, or sub-grid contains duplicate values
    private static boolean hasDuplicates(int[] arr) {
        boolean[] seen = new boolean[10]; // We use an array to keep track of seen values (1-9)
        for (int num : arr) {
            if (num != 0) { // Ignore empty cells
                if (seen[num]) {
                    return true; // Found a duplicate
                }
                seen[num] = true;
            }
        }
        return false;
    }

    // Function to check the correctness of a 9x9 Sudoku grid
    public static boolean isSudokuValid(int[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (hasDuplicates(board[i])) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            int[] column = new int[9];
            for (int i = 0; i < 9; i++) {
                column[i] = board[i][j];
            }
            if (hasDuplicates(column)) {
                return false;
            }
        }

        // Check subgrids (3x3 regions)
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] subgrid = new int[9];
                int index = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        subgrid[index++] = board[x][y];
                    }
                }
                if (hasDuplicates(subgrid)) {
                    return false;
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


/*  
 * Certainly, let's go through the code and explain it step by step:

1. **SudokuChecker Class**:
    - The code defines a Java class called `SudokuChecker`.

2. **hasDuplicates Function**:
    - `private static boolean hasDuplicates(int[] arr)` is a helper function that checks whether an array of integers has any duplicates.
    - It uses a boolean array `seen` to keep track of numbers from 1 to 9. It initializes all elements of `seen` to `false`.
    - It then iterates through the input array `arr`. If a number is encountered (not equal to 0), it checks whether it has been seen before (indicated by `seen[num]`). If yes, it returns `true`, indicating duplicates. If not, it marks `num` as seen and continues the loop.
    - If the loop completes without finding any duplicates, it returns `false`.

3. **isSudokuValid Function**:
    - `public static boolean isSudokuValid(int[][] board)` is the main function for checking the correctness of a 9x9 Sudoku grid.
    - It takes a 2D array `board` as input, which represents the Sudoku grid.

4. **Checking Rows**:
    - The function first checks each row of the Sudoku grid for duplicates by iterating through the rows (i) and calling `hasDuplicates` on each row. If any row contains duplicates, it returns `false`.

5. **Checking Columns**:
    - Next, the function checks each column of the Sudoku grid for duplicates by iterating through the columns (j).
    - For each column, it creates an array `column` containing the values of that column by iterating through the rows (i).
    - It then calls `hasDuplicates` on `column`. If any column contains duplicates, it returns `false`.

6. **Checking Subgrids (3x3 Regions)**:
    - Finally, the function checks each of the 3x3 subgrids (regions) of the Sudoku grid.
    - It uses nested loops to iterate through the subgrids.
    - For each subgrid, it creates an array `subgrid` containing the values of that subgrid.
    - It calls `hasDuplicates` on `subgrid`. If any subgrid contains duplicates, it returns `false`.

7. **Returning the Result**:
    - If the code completes all the checks without finding any duplicates 
    in rows, columns, or subgrids, it returns `true`, indicating that the Sudoku is valid.

8. **Main Function**:
    - The `main` function is where you can input your Sudoku puzzle.
    - It initializes a 2D array `sudokuGrid` with the Sudoku puzzle you want to evaluate.
    - It then calls `isSudokuValid(sudokuGrid)` to check the validity of the Sudoku puzzle.
    - Depending on the result, it prints either "Sudoku is valid." or "Sudoku is not valid."

You can modify the `sudokuGrid` array with your Sudoku puzzle, and the code will check 
if it's a valid Sudoku puzzle, both in terms of row/column correctness and 3x3 subgrid correctness.
 */