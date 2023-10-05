package Zoho.Round2.Arrays;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] array = { 8, 3, 4, 7, 9 };
        int target = 7;
        findCombinations(array, target);
    }

    public static void findCombinations(int[] array, int target) {
        int n = array.length;

        // Iterate over all 2^n possible combinations
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> combination = new ArrayList<>();
            int sum = 0;

            // Check each bit of i
            for (int j = 0; j < n; j++) {
                // If the j-th bit of i is 1, include array[j] in the combination
                if ((i & (1 << j)) != 0) {
                    combination.add(array[j]);
                    sum += array[j];
                }
            }

            // If the sum of the combination is equal to the target, print the combination
            if (sum == target) {
                System.out.println(combination);
            }
        }
    }
}

/*  
Given unsorted array find all combination of the
element
for a given sum. Order should be maintained.
Input :
8 3 4 7 9 N=7
Output
{3 4 } {7}
 */