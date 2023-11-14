package Zoho.Round2.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleGenerate {

    public static List<List<Integer>> generate_BF(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1); // First and last elements in a row are always 1
                } else {
                    // Calculate other elements using the binomial coefficient formula
                    int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    currentRow.add(value);
                }
            }
            result.add(currentRow);
        }
        return result;
    }

    public static List<List<Integer>> generate_OP(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            int value = 1;

            for (int j = 0; j <= i; j++) {
                currentRow.add(value);
                value = value * (i - j) / (j + 1);
            }
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Output: " + generate_BF(n));
        System.out.println("Output: " + generate_OP(n));
    }
}

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:
[
        [1]
       [1,1]
      [1,2,1]
     [1,3,3,1]
    [1,4,6,4,1]
]
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]


Example 2:

Input: numRows = 1
Output: [[1]]
*/