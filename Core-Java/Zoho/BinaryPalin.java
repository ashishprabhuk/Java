package Zoho;

public class BinaryPalin {
    // Method to convert decimal to binary and check if it's a palindrome
    static int[] decToBin(int n) {
        int i = 0;
        int[] bin = new int[1000];
    
        // Convert decimal to binary
        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }

        // Print the binary representation
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j] + " ");
        }
        System.out.println();

        // Check if it's a palindrome
        // System.out.println(isPalin(bin, i));
        return bin;
    }

    // Method to check if an array is a palindrome
    static boolean isPalin(int[] arr, int len) {
        for (int i = 0; i < len / 2; i++) {
            // Compare the first and last elements, then the second and second-to-last, and so on.
            if (arr[i] != arr[len - i - 1]) {
                return false; // If any pair is not equal, it's not a palindrome
            }
        }
        return true; // If all pairs are equal, it's a palindrome
    }

    public static void main(String[] args) {
        decToBin(17); // Test with the decimal number 4
    }
}
