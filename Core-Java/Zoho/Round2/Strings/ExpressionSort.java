package Zoho.Round2.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of input strings
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read the input strings into an array
        String[] expressions = new String[n];
        for (int i = 0; i < n; i++) {
            expressions[i] = scanner.nextLine();
        }

        // Sort the expressions using a custom comparator
        Arrays.sort(expressions, (s1, s2) -> Double.compare(evaluateExpression(s1), evaluateExpression(s2)));

        // Print the sorted expressions
        for (String expression : expressions) {
            System.out.println(expression);
        }
    }

    // Function to evaluate an expression with '*' and '^' operators
    static double evaluateExpression(String expression) {
        if (expression.contains("*")) {
            return evaluateMultiplication(expression);
        } else if (expression.contains("^")) {
            return evaluatePower(expression);
        } else {
            // If no special operators found, return the length of the expression as a value
            return (double) expression.length();
        }
    }

    // Function to evaluate multiplication operation in an expression
    static double evaluateMultiplication(String expression) {
        String[] parts = expression.split("\\*");
        double result = 1.0;
        for (String part : parts) {
            result *= Double.parseDouble(part);
        }
        return result;
    }

    // Function to evaluate power operation in an expression
    static double evaluatePower(String expression) {
        String[] parts = expression.split("\\^");
        double result = 1.0;
        for (String part : parts) {
            result = Math.pow(result, Double.parseDouble(part));
        }
        return result;
    }
}
