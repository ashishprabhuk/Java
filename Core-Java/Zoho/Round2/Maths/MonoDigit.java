package Zoho.Round2.Maths;
public class MonoDigit {
    public static void main(String[] args) {
        // int number = 72581; 
        int number = 3962; 

        // Call the convertToMonoDigit function to process the number
        String result = convertToMonoDigit(number);

        // Print the result
        System.out.println("Input: " + number + ", Output: " + result);
    }

    public static String convertToMonoDigit(int number) {
        // Convert the input number to a string
        String numStr = Integer.toString(number);

        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Get the first digit of the input number
        char firstDigit = numStr.charAt(0);
        char lastDigit = numStr.charAt(numStr.length() - 1); 

        // Append the first digit to the result
        result.append(firstDigit);
        
        // Loop through the digits of the input number (starting from the second digit)
        for (int i = 1; i < numStr.length() - 1; i += 2) {
            // Get the current digit and the next digit
            int digit1 = Character.getNumericValue(numStr.charAt(i));
            int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
            
            // Perform an addition or subtraction operation based on the condition
            int operationResult = (digit1 + digit2 == Character.getNumericValue(firstDigit))
                    ? digit1 + digit2
                    : digit1 - digit2;

            // Check if the operation result matches the first digit
            if (operationResult != Character.getNumericValue(firstDigit)) {
                return numStr + " cannot create a mono-digit number";
            }

            // Append the current operation (addition or subtraction) to the result
            result.append(" ")
                .append("(")
                .append(digit1)
                .append(digit1 + digit2 == operationResult ? "+" : "-")
                .append(digit2)
                .append(")")
                .append(" ")
                .append(lastDigit);
        }

        // If the input number has an odd length, append the last digit to the result
        if (numStr.length() % 2 != 0) {
            result.append(" ").append(numStr.charAt(numStr.length() - 1));
        }
        // Append the final equation to the result
        return result.toString() + " = " + firstDigit + " " + firstDigit + " " + firstDigit;
    }
}


/*
Write a program to convert a number into a
mono-digit number.
Conditions:
a) You are allowed to add and subtract the
consecutive digits (starting from left).
b) You are allowed to do only one operation on a
digit.
c) You cannot perform any operation on a resultant
digit of the previous operation.
d) Your code should also find if a given number
cannot be converted to a mono digit number.
Input Output
72581 7(2+5)81
77(8-1)
777
3962 cannot create a mono digit number
 */