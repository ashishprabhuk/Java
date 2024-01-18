package Zoho.Round2.Maths;

public class FactorialWithoutMultiplication {
	// Function to calculate factorial of the number
	// without using multiplication operator
	public static int factorialWithoutMul(int N){
		// variable to store the final factorial
		int ans = N;

		// Outer loop
		for (int i = N - 1; i > 0; i--) {
			int sum = 0;

			// Inner loop
			for (int j = 0; j < i; j++)
				sum += ans;
			ans = sum;
		}
		return ans;
	}
	public static void main(String[] args){
		int N = 5;
		System.out.println(factorialWithoutMul(N));
	}
}
