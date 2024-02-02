package Zoho.Round2.Binary;

public class BinaryPalin {
    // Method to convert decimal to binary and check if it's a palindrome
    public static void main(String[] args) {
		int num = 45;
		System.out.println(isPalindrome(num));
	}
	static boolean isPalindrome(int num){
        String bin = toBinary(num);
        int s=0;
        int e=bin.length()-1; 
        while(s<e){
            if(bin.charAt(s) != bin.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
	}
	
	static String toBinary(int n){
        if(n == 0){
            return "0";
        }
        String s = "";
        while(n > 0){
            int a = n % 2;
            s = a + s;
            n = n / 2;
        }
        return s;
	}
}
