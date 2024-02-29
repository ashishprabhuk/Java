package Zoho.Round2.Patterns;


import java.util.*;

public class ZohoPatterns {
    static void pattern_1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int top = row;
                int bottom = col;
                int right = n - col + 1;
                int left = n - row + 1;
                System.out.print(Math.max(Math.max(right, left), Math.max(top, bottom)) + "");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int top = row;
                int bottom = col;
                int right = (2 * n - 2) - col;
                int left = (2 * n - 2) - row;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)) + " ");
            }
            System.out.println();
        }
    }

    static void pattern_3(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            int j = len - 1 - i;
            for (int k = 0; k < len; k++) {
                if (k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern_4(int row, int col) {
        char[][] matrix = new char[row][col];
        char c = 'X'; // Start with 'X' character

        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;

        while (left <= right && top <= bottom) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = c;
            }
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = c;
            }
            right--;

            // Check if there are more rows or columns to fill
            if (top <= bottom) {
                // Fill bottom row
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = c;
                }
                bottom--;
            }

            if (left <= right) {
                // Fill left column
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = c;
                }
                left++;
            }

            // Toggle 'X' and 'O'
            c = (c == 'X') ? 'O' : 'X';
        }

        // Print the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    static void pattern_5() {

        int n = 6;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int currentNum = num;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(currentNum + " ");
                currentNum += (n - j + 1);
            }
            System.out.println();
            num++;
        }
    }

    static void printFromMiddle(String str) { 
        int len = str.length();
        for (int i = 0; i < len; i++) { 
            for (int j = 0; j < len; j++) { 
                if ((i == j) || (i + j == len - 1)) 
                    System.out.print(str.charAt(j)); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(); 
        } 
    } 

    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int col = 1; col <= rows - i; col++) {
                System.out.print(" "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_1(4);
        pattern_2(4);
        pattern_3("12345");
        pattern_4(5,5);
        pattern_5();
        printFromMiddle("PROGRAM");
        printPascalTriangle(7);
    }
}