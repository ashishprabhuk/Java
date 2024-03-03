package Zoho.Round2.Strings;
import java.util.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        String input1 = "(a+b)+(a*b)";
        String input2 = "(ab)(ab+)";
        String input3 = "((a+b))";
        
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
    
    public static boolean isValidExpression(String input) {
        Stack<Character> stack = new Stack<>(); 
        
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch); 
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;  
                }
            } else if (isOperator(ch)) {
                int currentIndex = input.indexOf(ch); 
                if (currentIndex == 0 || currentIndex == input.length() - 1 || !isValidOperatorPlacement(input, currentIndex)) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static boolean isOperator(char ch) {
        return ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }
    
    public static boolean isValidOperatorPlacement(String input, int currentIndex) {
        char prevChar = input.charAt(currentIndex - 1);
        char nextChar = input.charAt(currentIndex + 1);
        
        return Character.isLetter(prevChar) && Character.isLetter(nextChar);
    }
}

/*
Check whether a given mathematical expression
is valid.
Eg.) Input : (a+b)(a*b)
Output : Valid
Input : (ab)(ab+)
Output : Invalid
Input : ((a+b)
Output : Invalid
 */