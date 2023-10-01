package Zoho.Round2;
public class BinNumPalin {
    public static void main(String[] args) {
        int num = 5; // 101-Palindrome => binary representation of 5 is 101 & it is palindrome.
        // int num = 10; //Binary representation of 10 is 1010 –Not a palindrome
        
        // Convert the number to binary representation
        String binary = Integer.toBinaryString(num);
        
        // Check if the binary representation is a palindrome
        if (isPalindrome(binary)) {
            System.out.println(binary + "-Palindrome");
        } else {
            System.out.println("Binary representation of " + num + " is " + binary + " -Not a palindrome");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
