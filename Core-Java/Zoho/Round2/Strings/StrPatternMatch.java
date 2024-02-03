package Zoho.Round2.Strings;

class StrPatternMatch {
    public static boolean isMatch(String text, String pattern) {
        int textIndex = 0, patternIndex = 0, starIndex = -1, textMatch = 0;

        while (textIndex < text.length()) {
            if (patternIndex < pattern.length() && (pattern.charAt(patternIndex) == '?' || pattern.charAt(patternIndex) == text.charAt(textIndex))) {
                textIndex++;
                patternIndex++;
            } else if (patternIndex < pattern.length() && pattern.charAt(patternIndex) == '*') {
                starIndex = patternIndex;
                textMatch = textIndex;
                patternIndex++;
            } else if (starIndex != -1) {
                patternIndex = starIndex + 1;
                textMatch++;
                textIndex = textMatch;
            } else {
                return false;
            }
        }

        while (patternIndex < pattern.length() && pattern.charAt(patternIndex) == '*') {
            patternIndex++;
        }
        return patternIndex == pattern.length();
    }
    
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
}
    

/*
Given the Text and we have to find the Pattern
/? ->means one characters are missing
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