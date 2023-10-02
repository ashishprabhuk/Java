package Zoho.Round2;

import java.util.*;

/*
 * // using DepthFirstSearch method:
 * import java.util.*;
 * 
 * public class WordSearch {
 * public static void main(String[] args) {
 * char[][] grid = {
 * { 'a', 'z', 'o', 'l' },
 * { 'n', 'x', 'h', 'o' },
 * { 'v', 'y', 'i', 'v' },
 * { 'o', 'r', 's', 'e' }
 * };
 * Set<String> dictionary = new HashSet<>(Arrays.asList("van", "zoho", "love",
 * "are", "is"));
 * findWords(grid, dictionary);
 * }
 * 
 * public static void findWords(char[][] grid, Set<String> dictionary) {
 * int rows = grid.length;
 * int cols = grid[0].length;
 * boolean[][] visited = new boolean[rows][cols];
 * String str = "";
 * for (int i = 0; i < rows; i++) {
 * for (int j = 0; j < cols; j++) {
 * findWordsUtil(grid, visited, i, j, str, dictionary);
 * }
 * }
 * }
 * 
 * public static void findWordsUtil(char[][] grid, boolean[][] visited, int i,
 * int j, String str,
 * Set<String> dictionary) {
 * int rows = grid.length;
 * int cols = grid[0].length;
 * if (i >= rows || j >= cols) {
 * return;
 * }
 * visited[i][j] = true;
 * str = str + grid[i][j];
 * if (dictionary.contains(str)) {
 * System.out.println(str);
 * }
 * for (int row = i; row <= i + 1 && row < rows; row++) {
 * for (int col = j; col <= j + 1 && col < cols; col++) {
 * if (row != i || col != j) {
 * if (!visited[row][col]) {
 * findWordsUtil(grid, visited, row, col, str, dictionary);
 * }
 * }
 * }
 * }
 * str = "" + str.charAt(str.length() - 1);
 * visited[i][j] = false;
 * }
 * }
 */

public class WordSearch {
    public static void main(String[] args) {
        // char[][] matrix = {
        // { 'A', 'B', 'C', 'D' },
        // { 'E', 'F', 'G', 'H' },
        // { 'I', 'J', 'K', 'L' },
        // { 'M', 'N', 'O', 'P' }
        // };

        char[][] matrix = {
                { 'a', 'z', 'o', 'l' },
                { 'n', 'x', 'h', 'o' },
                { 'v', 'y', 'i', 'v' },
                { 'o', 'r', 's', 'e' }
        };

        // String[] words = { "ABCD", "AFKP", "MPO", "AEIM", "CFKO" };
        String[] words = { "van", "zoho", "love", "are", "is" };

        for (String word : words) {
            if (isWordPresent(matrix, word)) {
                System.out.println(word + " is present in the matrix.");
            } else {
                System.out.println(word + " is not present in the matrix.");
            }
        }
    }

    public static boolean isWordPresent(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check left to right
        for (int i = 0; i < rows; i++) {
            String row = new String(matrix[i]);
            if (row.contains(word)) {
                return true;
            }
        }

        // Check top to bottom
        for (int j = 0; j < cols; j++) {
            StringBuilder column = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                column.append(matrix[i][j]);
            }
            if (column.toString().contains(word)) {
                return true;
            }
        }

        // Check diagonals (top to bottom)
        for (int k = 0; k < rows + cols - 1; k++) {
            StringBuilder diagonal = new StringBuilder();
            int i = Math.max(0, k - cols + 1);
            int j = Math.max(0, cols - k - 1);
            while (i < rows && j < cols) {
                diagonal.append(matrix[i][j]);
                i++;
                j++;
            }
            if (diagonal.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }
}