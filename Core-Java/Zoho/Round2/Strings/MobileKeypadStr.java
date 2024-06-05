package Zoho.Round2.Strings;

public class MobileKeypadStr {
	public static void main(String[] args){
		String strs[]
			= { "2", "22", "222", "3", "33", "333",
				"4", "44", "444", "5", "55", "555",
				"6", "66", "666", "7", "77", "777",
				"7777", "8", "88", "888", "9", "99",
				"999", "9999" };

		String input = "zoho corporation";
		System.out.println(mobileKeys(strs, input));

		String[] KEYPAD = {
			".",    // 0
			" ",    // 1 
			"abc",  // 2
			"def",  // 3
			"ghi",  // 4
			"jkl",  // 5
			"mno",  // 6
			"pqrs", // 7
			"tuv",  // 8
			"wxyz"  // 9
		};

		String str = "zoho corporation.";
        String output = encodeMessage(str, KEYPAD);
        System.out.println(output); // output : 999966644666_222666777766677728444666660
	}

	static String mobileKeys(String arr[], String input){
		input = input.toUpperCase();
		String output = "";
		int n = input.length();
		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == ' '){
				output = output + "0";
			}else {
				int position = input.charAt(i) - 'A';
				output = output + arr[position];
			}
		}
		return output;
	}

    public static String encodeMessage(String str, String[] KEYPAD) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(getNumericSequence(c, KEYPAD));
        }
        return result.toString();
    }

    public static String getNumericSequence(char c, String[] KEYPAD) {
        if (c == ' ') {
            return "_";
        } else if (c == '.') {
            return "0";
        }
        for (int i = 0; i < KEYPAD.length; i++) {
            String letters = KEYPAD[i];
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j) == c) {
					System.out.println(String.valueOf(i).repeat(j + 1));
                    return String.valueOf(i).repeat(j + 1);
                }
            }
        }
        return "";
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