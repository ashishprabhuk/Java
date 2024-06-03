package Zoho.Round2.TwoDArrays;
import java.util.*;

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
        String word ="lhyo";

        // String[] words = { "ABCD", "AFKP", "MPO", "AEIM", "CFKO" };
        // String[] words = { "van", "zoho", "love", "are", "is" };
        if (isWordPresent(matrix, word)) {
                System.out.println(word + " is present in the matrix.");
            } else {
                System.out.println(word + " is not present in the matrix.");
            }
    }

    public static boolean isWordPresent(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check left to right
        for (int i = 0; i < rows; i++) {
            String row = new String(matrix[i]);
            // System.out.println(row);
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
            // System.out.println(column);
            if (column.toString().contains(word)) {
                return true;
            }
        }

        // Check diagonals (top-left to bottom-right)
        for (int k = 0; k < rows + cols - 1; k++) {
            StringBuilder diagonal = new StringBuilder();
            int i = Math.max(0, k - cols + 1);
            int j = Math.max(0, cols - k - 1);
            while (i < rows && j < cols) {
                diagonal.append(matrix[i][j]);
                i++;
                j++;
            }
            System.out.println(diagonal);
            if (diagonal.toString().contains(word)) {
                return true;
            }
        }

        // Check diagonals (top-right to bottom-left)
        for (int k = 0; k < rows + cols - 1; k++) {
            StringBuilder diagonal = new StringBuilder();
            int i = Math.max(0, k - cols + 1);
            int j = Math.min(cols - 1, k);
            while (i < rows && j >= 0) {
                diagonal.append(matrix[i][j]);
                i++;
                j--;
            }
            System.out.println(diagonal);
            if (diagonal.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }
}