package Zoho.Round2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generatePascalTriangle(numRows);
        List<List<Integer>> possibleTriangles = findPossibleTriangles(triangle);

        System.out.println("Possible Triangles:");
        for (List<Integer> triangleRow : possibleTriangles) {
            System.out.println(triangleRow);
        }
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (i > 0) {
                List<Integer> prevRow = triangle.get(i - 1);

                for (int j = 1; j < i; j++) {
                    int num = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(num);
                }

                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static List<List<Integer>> findPossibleTriangles(List<List<Integer>> triangle) {
        List<List<Integer>> possibleTriangles = new ArrayList<>();

        for (int i = 0; i < triangle.size() - 1; i++) {
            List<Integer> row = triangle.get(i);

            for (int j = 0; j < row.size(); j++) {
                int num = row.get(j);

                if (num > 0 && num <= 9) {
                    List<Integer> triangleRow = new ArrayList<>();
                    triangleRow.add(num);
                    triangleRow.add(triangle.get(i + 1).get(j));
                    triangleRow.add(triangle.get(i + 1).get(j + 1));
                    possibleTriangles.add(triangleRow);
                }
            }
        }

        return possibleTriangles;
    }
}