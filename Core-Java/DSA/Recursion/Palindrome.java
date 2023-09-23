package DSA.Recursion;

public class Palindrome {
    static boolean isPalindrome(String str, int start, int end) {
        // Base case: If the string has one or zero characters, it's a palindrome.
        if (start <= end) {
            return true;
        }

        // Check if the characters at 'start' and 'end' positions are the same.
        if (str.charAt(start) == str.charAt(end)) {
            // Recursively check the substring between 'start' and 'end'.
            return isPalindrome(str, start + 1, end - 1);
        }

        // If characters at 'start' and 'end' positions are not the same, it's not a palindrome.
        return false;
    }
    public static void main(String[] args) {
        String str = "AMMA";
        int len = str.length();
        System.out.println(isPalindrome(str , 0 ,len-1));
    }
}
