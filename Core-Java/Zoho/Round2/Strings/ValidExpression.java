package Zoho.Round2.Strings;
import java.util.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        String input1 = "(a+b)(a*b)";
        String input2 = "(ab)(ab+)";
        String input3 = "((a+b)";
        
        if (isValidExpression(input1)) {
            System.out.println("Input 1: Valid");
        } else {
            System.out.println("Input 1: Invalid");
        }
        
        if (isValidExpression(input2)) {
            System.out.println("Input 2: Valid");
        } else {
            System.out.println("Input 2: Invalid");
        }
        
        if (isValidExpression(input3)) {
            System.out.println("Input 2: Valid");
        } else {
            System.out.println("Input 2: Invalid");
        }
    }
    
    // Function to check if the given mathematical expression is valid
    public static boolean isValidExpression(String input) {
        Stack<Character> stack = new Stack<>();  // Stack to keep track of opening parentheses
        
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch); // Push opening parentheses onto the stack
            } else if (ch == ')') {
                // If a closing parenthesis is encountered, check if there is a matching opening parenthesis on the stack
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;  // Mismatched closing parenthesis
                }
            } else if (isOperator(ch)) {
                int currentIndex = input.indexOf(ch); // Get the current operator's index
                // Check if the operator is at the beginning, end, or has valid placement
                if (currentIndex == 0 || currentIndex == input.length() - 1 || !isValidOperatorPlacement(input, currentIndex)) {
                    return false;  // Invalid operator placement
                }
            }
        }
        
        // If the stack is empty at the end, it means all parentheses matched
        return stack.isEmpty();
    }
    
    // Function to check if a character is an operator
    public static boolean isOperator(char ch) {
        return ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }
    
    // Function to check if an operator has valid placement
    public static boolean isValidOperatorPlacement(String input, int currentIndex) {
        char prevChar = input.charAt(currentIndex - 1);
        char nextChar = input.charAt(currentIndex + 1);
        
        // Check if the characters surrounding the operator are lowercase letters
        return Character.isLetter(prevChar) && Character.isLetter(nextChar);
    }
}
