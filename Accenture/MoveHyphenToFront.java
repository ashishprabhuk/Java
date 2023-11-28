package Accenture;

public class MoveHyphenToFront{
    public static void main(String[] args) {
        String str1 = "Move-Hyphens-to-Front";
        String result1 = MoveHyphen(str1);
        System.out.println(result1); // Output: ---MoveHyphenstoFront

        String str2 = "String-Compare";
        String result2 = MoveHyphen(str2);
        System.out.println(result2); // Output: -StringCompare
    }

    static String MoveHyphen(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        int hyphenCount = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                hyphenCount++;
            } else {
                result.append(ch);
            }
        }

        // Append hyphens to the front of the result
        for (int i = 0; i < hyphenCount; i++) {
            result.insert(0, '-');
        }

        return result.toString();
    }
}


/*
 * char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront

Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
 */