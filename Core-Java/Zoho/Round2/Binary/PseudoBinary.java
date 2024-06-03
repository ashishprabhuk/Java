package Zoho.Round2.Binary;

public class PseudoBinary{
	public static void pseudoBinary(int n){ // one n only sol.
		while (n != 0){
			int temp = n, m = 0, p = 1;
			while(temp != 0){
				int rem = temp % 10; //32 % 10 => 2; 31 % 10 => 1
				temp = temp / 10; // 32 / 10 => 3; 31 / 10 => 3
				if (rem != 0){
					m += p; // 0 + 1 => 1 ; 1 + 10 => 11 ; 
				}
				p *= 10; // 10 ; 10
			}
			System.out.print(m + " "); // 1 11
			n = n - m; // 32 - 1 => 31 ; 31 - 11 => 20
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
in the number should be either ‘1’ or ‘0’. 

Any number can be written as a sum of binary-decimals. 
Our task is to find the minimum number of binary-decimals to represent a number.
Input :32
Output : 10 11 11

Input : 120
Output : 10 110
 */