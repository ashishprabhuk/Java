package Zoho.Round2.Maths;

public class EquationSolver {
    public static void main(String[] args) {
        int X = 2;
        int Y = 3;
        int Z = 4;

        if (X < 0 || Z < 0) {
            System.out.println("X and Z cannot be negative.");
        } else {
            // Calculate X! and Z!
            long factorialX = factorial(X);
            long factorialZ = factorial(Z);

            // Calculate X^Y
            long XpowerY = (long) Math.pow(X, Y);

            // Calculate the final result
            double result = ((double) XpowerY / factorialZ) + ((double) Z / (factorialX + Z));

            // Print the result
            System.out.println("Output: " + result);
        }
    }

    // Helper method to calculate factorial (always keep factorial values in long)
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}

/*
Solve the equation (XpowerY/Z!) + (Z/(X!+Z)) with
given values of X, Y, Z. X and Z cannot be negative.
Example:
Input: X=2, Y=3, Z=4
Output: 1
 */