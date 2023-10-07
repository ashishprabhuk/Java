package Zoho.Round2.Binary;

// Java program to represent a given number as sum of minimum possible
// pseudobinary numbers


public class PseudoBinary{
	public static void pseudoBinary(int n)
	{
		while (n != 0){
			// calculate m (A number that has same
			// number of digits as n, but has 1 in
			// place of non-zero digits 0 in place
			// of 0 digits)
			int temp = n, m = 0, p = 1;
			while(temp != 0){
				int rem = temp % 10;
				temp = temp / 10;

				if (rem != 0){
					m += p;
				}
				p *= 10;
			}
			System.out.print(m + " ");
			n = n - m; // subtract m from n
		}
		System.out.println(" ");
	}

    public static void main(String[] args){
		int n = 32;
		pseudoBinary(n);
	}
}


/*
A number is called as binary-decimal if all the digits
in the number should be either ‘1’ or ‘0’. Any

number can be written as a sum of binary-
decimals. Our task is to find the minimum number

of binary-decimals to represent a number.Input :
32Output : 10 11 11

Input : 120
Output : 10 110
 */