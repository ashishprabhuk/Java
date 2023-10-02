package Zoho.Round2;

public class RectangleCounter {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 0 },
                { 0, 0, 1, 1 },
                { 0, 0, 1, 1 }
        };
        int count = countRectangles(matrix);
        System.out.println("Number of Rectangles: " + count);
    }

    public static int countRectangles(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    count += countRectanglesFromCell(matrix, i, j);
                }
            }
        }

        return count;
    }

    public static int countRectanglesFromCell(int[][] matrix, int startRow, int startCol) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = startRow; i < rows; i++) {
            for (int j = startCol; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                } else {
                    return count;
                }
            }
        }

        return count;
    }
}