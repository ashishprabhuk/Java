package Zoho.Round2.TwoDArrays;

public class PascalTriangleCombinations {
    public static void main(String[] args) {
        int numRows = 5;
        int[][] triangle = generatePascalTriangle(numRows);
        findPossibleTriangles(triangle, numRows);
    }

    public static int[][] generatePascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            int value = 1;
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = value;
                value = value * (i - j) / (j + 1);
            }
        }
        // Print the triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        return triangle;
    }

    public static void findPossibleTriangles(int[][] triangle, int numRows) {
        System.out.println("Possible Triangles:");
        for (int i = 0; i < numRows - 1; i++) {
            for (int j = 0; j <= i; j++) {
                int num = triangle[i][j];
                if (num > 0 && num <= 9) {
                    System.out.println(num + " " + triangle[i + 1][j] + " " + triangle[i + 1][j + 1]);
                }
            }
        }
    }
}
