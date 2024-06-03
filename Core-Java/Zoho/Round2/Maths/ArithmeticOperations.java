package Zoho.Round2.Maths;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        int addition = add(num1, num2);
        int subtraction = subtract(num1, num2);
        int multiplication = multiply(num1, num2);
        int division = divide(num1, num2);

        System.out.println("Addition " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("Division " + num1 + " / " + num2 + " = " + division);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 + (-num2);
    }

    public static int multiply(int num1, int num2) {
        int multiplication = 0;
        for (int i = 0; i < Math.abs(num2); i++) {
            multiplication += num1;
        }
        return multiplication;
    }

    public static int divide(int num1, int num2) {
        int division = 0;
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);
        // Perform division using repeated subtraction
        while (absNum1 >= absNum2) { // 5 > 4 
            absNum1 -= absNum2;
            division++;
        }
        // Adjust the sign of the division result
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            division = -division;
        }
        return division;
    }
    
}


/*
2. Find the result subtraction, multiplication,
division of two integers using + operator.
Input: 6 and 4
output:
addition 6+4 = 10, subtraction 6+(-4) = 2,
multiplication = 24, division = 1

Input : -8 and -4
Output:
addition -8+(-4) = -12, subtraction (-8)+(-(-4)) = -
4, multiplication = 32, division = 2
 */