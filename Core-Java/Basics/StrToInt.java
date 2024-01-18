package Basics;

public class StrToInt {
    public static void main(String[] args) {
        // Method 1: Using parseInt
        String str1 = "123";
        int result1 = Integer.parseInt(str1);
        System.out.println("Using parseInt: " + result1);

        // Method 2: Using valueOf
        String str2 = "456";
        int result2 = Integer.valueOf(str2);
        System.out.println("Using valueOf: " + result2);
    }
}
