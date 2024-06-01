package Zoho.Round2.Strings;

class StrPatternMatch {
    public static void main(String[] args) {
        String text = "baaabab";
        String pattern1 = "baaa?ab";
        String pattern2 = "b*ab";
        String pattern3 = "*ab";
        String pattern4 = "ba?ab";

        System.out.println(isMatch(text, pattern1)); // Should print True
        System.out.println(isMatch(text, pattern2)); // Should print True
        System.out.println(isMatch(text, pattern3)); // Should print True
        System.out.println(isMatch(text, pattern4)); // Should print False
    }

    public static boolean isMatch(String text, String pattern) {
        int i = 0, j = 0, starIndex = -1, textMatch = 0;

        while (i < text.length()) {
            if (j < pattern.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == text.charAt(i))) {
                i++;
                j++;
            } else if (j < pattern.length() && pattern.charAt(j) == '*') {
                starIndex = j;
                textMatch = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                textMatch++;
                i = textMatch;
            } else {
                return false;
            }
        }
        while (j < pattern.length() && pattern.charAt(j) == '*') {
            j++;
        }
        return j == pattern.length();
    }
    
    /*
    i = 0, j = 0, starIndex = -1, textMatch = 0
    text = "baaabab"
    pattern = "baaa?ab"
    i = 0, j = 0, pattern.charAt(j) = 'b', text.charAt(i) = 'b'
    i = 1, j = 1, pattern.charAt(j) = 'a', text.charAt(i) = 'a'
    i = 2, j = 2, pattern.charAt(j) = 'a', text.charAt(i) = 'a'
    i = 3, j = 3, pattern.charAt(j) = 'a', text.charAt(i) = 'a'
    i = 4, j = 4, pattern.charAt(j) = '?', text.charAt(i) = 'a'
    i = 5, j = 5, pattern.charAt(j) = 'a', text.charAt(i) = 'a'
    i = 6, j = 6, pattern.charAt(j) = 'b', text.charAt(i) = 'b'
    i = 7, j = 7, pattern.charAt(j) = '\0'

    i = 0, j = 0, starIndex = -1, textMatch = 0
    text = "baaabab"
    pattern = "b*ab" 
    i = 0, j = 0, pattern.charAt(j) = 'b', text.charAt(i) = 'b'
    i = 1, j = 1, pattern.charAt(j) = '*', text.charAt(i) = 'a'
    starIndex = 1, textMatch = 1
    i = 1, j = 2, pattern.charAt(j) = 'a', text.charAt(i) = 'a'
    i = 2, j = 3, pattern.charAt(j) = 'b', text.charAt(i) = 'a'
    i = 3, j = 4, pattern.charAt(j) = '\0'
     */
}
    

/*
Given the Text and we have to find the Pattern
/
? ->means one characters are missing
* -> means multiple characters are missing
Example:Text Pattern

Output

baaabab baaa?ab
TRUE

baaabab b*ab
TRUE

baaabab *ab
TRUE

baaabab ba?ab
FALSE
 */