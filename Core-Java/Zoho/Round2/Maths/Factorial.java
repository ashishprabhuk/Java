package Zoho.Round2.Maths;

public class Factorial {
    public static int calculateFactorial(int n) {
        int factorial = 1;
        if(n==0 || n==1) return 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
