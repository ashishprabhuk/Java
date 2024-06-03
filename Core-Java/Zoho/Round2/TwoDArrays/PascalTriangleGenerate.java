package Zoho.Round2.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleGenerate {
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

    public static void generateOP(int numRows) {
        for (int i = 0; i < numRows; i++) {
            long value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateOP(n);
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