package Zoho.Round2;

class StrPatternMatch {
    public static boolean isMatch(String text, String pattern) {
        int n = text.length();    // Length of the text
        int m = pattern.length(); // Length of the pattern
        int i = 0, j = 0, startIndex = -1, match = 0;

        while (i < n) {
            // If the current characters match or the pattern has a '?', move to the next
            // characters in both pattern and text.
            if (j < m && (pattern.charAt(j) == '?' || pattern.charAt(j) == text.charAt(i))) {
                i++;
                j++;
            }
            // If the pattern has a '*' character, mark the current position in the pattern
            // and the text as a proper match.
            else if (j < m && pattern.charAt(j) == '*') {
                startIndex = j; // Remember the position of '*'
                match = i;      // Remember the position in the text where '*' started matching
                j++;
            }
            // If we have not found any match and no '*' character, backtrack to the last '*'
            // character position and try for a different match.
            else if (startIndex != -1) {
                j = startIndex + 1; // Move pattern back to the position after '*'
                match++;           // Move text to the next character
                i = match;         // Reset i to the position where '*' started matching
            }
            // If none of the above cases comply, the pattern does not match.
            else {
                return false;
            }
        }

        // Consume any remaining '*' characters in the given pattern.
        while (j < m && pattern.charAt(j) == '*') {
            j++;
        }

        // If we have reached the end of both the pattern and the text, the pattern matches the text.
        return j == m;
    }

    public static void main(String[] args) {
        String str = "baaabab";
        String pattern = "*****ba*****ab";

        if (isMatch(str, pattern))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
