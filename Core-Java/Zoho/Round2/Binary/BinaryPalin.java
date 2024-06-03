package Zoho.Round2.Binary;

public class BinaryPalin {
    // Method to convert decimal to binary and check if it's a palindrome
    public static void main(String[] args) {
		int num = 45;
		System.out.println(isPalindrome(num));
	}
	static boolean isPalindrome(int num){
        String bin = toBinary2(num);
        // String binaryString = Integer.toBinaryString(number);
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
	
	static String toBinary1(int n){
        if(n == 0){
            return "0";
        }
        String s = "";
        while(n > 0){
            int a = n % 2; // 45 => 45%2 = 1 => 22%2 = 0 => 11%2 = 1 => 5%2 = 1 => 2%2 = 0 => 1%2 = 1
            s = a + s; // 1 => 01 => 101 => 1101 => 01101 => 101101
            n = n / 2; // 45 => 45/2 = 22 => 22/2 = 11 => 11/2 = 5 => 5/2 = 2 => 2/2 = 1 => 1/2 = 0
        }
        System.out.println(s);
        return s;
	}

    public static String toBinary2(int number) {
        if (number == 0) {
            return "0";
        } else if (number == 1) {
            return "1";
        } else {
            return toBinary2(number / 2) + (number % 2);
        }
    }
}
