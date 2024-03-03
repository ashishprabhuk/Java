package Zoho.Round2.Strings;
import java.util.Stack;

public class RemoveUnbalancedParentheses {
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

    public static String removeUnbalancedParentheses(String str) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

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
        while (!stack.isEmpty()) {
            result.deleteCharAt(stack.pop());
        }
        return result.toString();
    }
}


