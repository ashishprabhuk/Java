package Zoho.Round2.Arrays;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] array = {6, 3, 9, 10, 8, 2, 1, 15, 7};
        int[] result = findNextGreaterElements(array);
        
        // Print the result
        for (int i : result) {
            if (i == -1) {
                System.out.print("_ ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    static int[] findNextGreaterElements(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && array[i] > array[stack.peek()]) {
                int index = stack.pop();
                result[index] = array[i];
            }
            stack.push(i);
        }

        return result;
    }
}
