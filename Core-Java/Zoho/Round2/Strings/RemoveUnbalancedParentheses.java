package Zoho.Round2.Strings;

import java.util.Stack;

public class RemoveUnbalancedParentheses {

    public static String removeUnbalancedParentheses(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // Remove unbalanced closing parenthesis by not appending it to the result
                    continue;
                }
            }
            result.append(ch);
        }

        // Remove any unbalanced open parentheses by not appending them to the result
        while (!stack.isEmpty()) {
            result.deleteCharAt(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "((abc)((de))";
        String input2 = "(((ab)";

        String output1 = removeUnbalancedParentheses(input1);
        String output2 = removeUnbalancedParentheses(input2);

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);
    }
}


