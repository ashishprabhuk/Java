package Zoho.Round2.Strings;
// Java implementation to convert a
// sentence into its equivalent
// mobile numeric keypad sequence

public class MobileKeypad {

	// Function which computes the sequence
	static String printSequence(String arr[], String input)
	{
		String output = "";

		// length of input string
		int n = input.length();
		for (int i = 0; i < n; i++) {
			// Checking for space
			if (input.charAt(i) == ' ')
				output = output + "0";

			else {
				// Calculating index for each character
				int position = input.charAt(i) - 'A';
				output = output + arr[position];
			}
		}

		// Output sequence
		return output;
	}

	// Driver Code
	public static void main(String[] args)
	{
		// storing the sequence in array
		String str[]
			= { "2", "22", "222", "3", "33", "333",
				"4", "44", "444", "5", "55", "555",
				"6", "66", "666", "7", "77", "777",
				"7777", "8", "88", "888", "9", "99",
				"999", "9999" };

		String input = "GEEKSFORGEEKS";
		System.out.println(printSequence(str, input));
	}
}

/*
Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 
Input: GEEKSFORGEEKS
Output: 4333355777733366677743333557777
Explanation: For obtaining a number, we need to press a number corresponding to that character for a number of times equal to the position of the character. For example, for character E, press number 3 two times and accordingly.

Input : HELLO WORLD
Output : 4433555555666096667775553
 */