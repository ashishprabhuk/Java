package Zoho.Round2.Arrays;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] array = { 8, 3, 4, 7, 9 ,2, 5};
        int target = 7;
        findCombinations(array, target);
    }

    public static void findCombinations(int[] array, int target) {
        int n = array.length;

        // Iterate over all 2^n possible combinations
        for (int i = 0; i < (1 << n); i++) {  // left shifting(<<) value will increase
            List<Integer> combination = new ArrayList<>(); // create list for every new combinations...
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
The logic `for (int i = 0; i < (1 << n); i++)` is used to systematically iterate through 
all possible combinations or permutations of elements when you have a finite set of choices 
and want to explore every possible arrangement. It is commonly used in combinatorial problems, 
subset generation, and binary enumeration. However, it may not be practical for large input sizes 
due to exponential growth in possibilities.
 */

/*  
Given unsorted array find all combination of the
element
for a given sum. Order should be maintained.
Input :
8 3 4 7 9 N=7
Output
{3 4 } {7}
*/


/*
The line `for (int i = 0; i < (1 << n); i++)` is a for loop that is used to iterate through all possible combinations of elements from an array. 
Let me break it down for you:

1. `int i = 0;`: This initializes a variable `i` to 0. `i` will be used as a counter to represent different combinations.

2. `< (1 << n);`: This is the condition that determines when the loop should stop. `(1 << n)` is a bitwise left shift operation that effectively calculates 2^n. 
In other words, it generates a binary number with n bits, all set to 0. 
For example, if `n` is 3, `(1 << n)` would be equivalent to binary `1000` in decimal, which is 8. So, this condition ensures that the loop will run for `i` values from 0 to 2^n - 1.

3. `i++`: This is the increment part of the loop, which increases the value of `i` by 1 in each iteration.

Now, let's take an example to understand how this loop works with `n` equal to 3 (for simplicity):

- In the first iteration, `i` is 0, which in binary is `000`. This represents the absence of any elements from the array in the combination.

- In the second iteration, `i` is 1, which in binary is `001`. This means that the first element from the array is included in the combination.

- In the third iteration, `i` is 2, which in binary is `010`. This represents a combination with the second element from the array.

- In the fourth iteration, `i` is 3, which in binary is `011`. This represents a combination with both the first and second elements from the array.

- And so on, until the last iteration when `i` is 7 (binary `111`), representing a combination with all three elements from the array.

So, this loop essentially generates all possible combinations of elements by using a binary representation of `i`, where each bit corresponds to an element from the array. This technique allows the code to systematically explore all possible combinations efficiently.
 */
