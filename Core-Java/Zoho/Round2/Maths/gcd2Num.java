package Zoho.Round2.Maths;

public class gcd2Num {
    // Function to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; 
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}