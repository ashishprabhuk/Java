package Zoho.Round2.Maths;

public class gcd2Num {
    // Function to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; // If b is 0, the GCD is a
        } else {
            // Otherwise, recursively call the function with (b, a % b)
            // This step effectively replaces a with b and b with a % b
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        // Call the findGCD function to calculate the GCD of num1 and num2
        int gcd = findGCD(num1, num2);

        // Print the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
// greatest common divisor (GCD) of two numbers