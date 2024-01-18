package Accenture;

public class ReplaceCharacters {
    public static void main(String[] args) {
        String str1 = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        String result1 = replaceCharacter(str1, ch1, ch2);
        System.out.println(result1); // Output: pples

        String str2 = "banana";
        String result2 = replaceCharacter(str2, 'a', 'a');
        System.out.println(result2); // Output: banana
    }

    static String replaceCharacter(String str, char ch1, char ch2) {
        if (str == null) {
            return null;
        }

        if (ch1 == ch2) {
            return str; // No need to replace if both characters are the same
        }

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch1) {
                chars[i] = ch2;
            } else if (chars[i] == ch2) {
                chars[i] = ch1;
            }
        }

        return new String(chars);
    }
}

/*
 * 
You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.
 */