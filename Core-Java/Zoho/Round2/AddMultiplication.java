package Zoho.Round2;

public class AddMultiplication {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(multiply(a, b));
    }

    public static int multiply(int a, int b) {
        // Determine the sign of the result. If a and b have different signs, the result
        // will be negative.
        // The ^ operator is the bitwise XOR operator. It returns true if exactly one of
        // its operands is true.
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;

        // Convert a and b to positive numbers. The Math.abs method returns the absolute
        // value of a number.
        a = Math.abs(a);
        b = Math.abs(b);

        // Make sure that a is the smaller number. If a is greater than b, swap a and b.
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Initialize the result to 0.
        int result = 0;

        // Add b to the result a times. This is equivalent to multiplying a and b.
        for (int i = 0; i < a; i++) {
            result += b;
        }

        // Return the result with the correct sign. If the sign is -1, this will change
        // the result to negative.
        return sign * result;
    }
}