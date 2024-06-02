package Zoho.Round2.Strings;

public class Palindrome { // my solution
    public static boolean isPalindrome_1(String s) {
        //[^a-zA-Z0-9] - it matches special characters, punctuation, spaces, or any character 
        //that falls outside the range of letters and digits. 
        // (remove or replace non-alphanumeric characters in a string)
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
        
    static boolean isPalindrome_2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) { 
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome_1("A! man, a pl#an, a c@anal: Pan*am^%a"));
        System.out.println(isPalindrome_2("racecar"));
    }
}
