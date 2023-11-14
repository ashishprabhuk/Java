package Zoho.Round2.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleGetRow {
    public static List<Integer> getRow_OP(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;
        ans.add(1);
        for(int i = 1; i <= rowIndex; i++){
            res = (res * (rowIndex - (i - 1)))/i;
            ans.add((int)res);
        }
        return ans;
    }

    public static void main(String[] args) {
        int rowIndex1 = 3;
        System.out.println("Output: " + getRow_OP(rowIndex1));
    }
}


/*
Given an integer rowIndex, return the rowIndex-th (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]


Example 2:

Input: rowIndex = 0
Output: [1]


Example 3:

Input: rowIndex = 1
Output: [1,1]

*/