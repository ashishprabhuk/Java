package DSA.Strings;

public class IsLetterOrDigit {
	public static void main(String[] args)
	{

		// assign character
		char c1 = 'D', c2 = '/';

		// Function to check if the character is letter or digit
		boolean bool1 = Character.isLetterOrDigit(c1);
		System.out.println(c1 + " is a letter/digit ? " + bool1);

		// Function to check if the character is letter or digit
		boolean bool2 = Character.isLetterOrDigit(c2);
		System.out.println(c2 + " is a letter/digit ? " + bool2);
	}
}
/*
 * Character.isLetterOrDigit(char ch) is an inbuilt method in java which 
 * determines if the specified character is a letter or digit.
*/
