package Zoho.Round2;

public class NumSystem3n4 {
    // Function to generate the nth number in the number system
    public static String generateNthNumber(int n) {
        if (n <= 0) {
            return ""; // If n is non-positive, return an empty string
        }
        
        StringBuilder sb = new StringBuilder(); // Create a StringBuilder to build the result
        
        while (n > 0) {
            int remainder = (n - 1) % 2; // Calculate the remainder when (n - 1) is divided by 2
            sb.insert(0, (remainder == 0) ? '3' : '4'); // Insert '3' or '4' at the beginning of the result based on the remainder
            n = (n - 1) / 2; // Calculate the next value of n by integer division by 2
        }
        
        return sb.toString(); // Convert the StringBuilder to a string and return the result
    }
    
    public static void main(String[] args) {
        int n = 10; // Change n to the desired nth number
        String nthNumber = generateNthNumber(n); // Call the generateNthNumber function to calculate the nth number
        System.out.println("The " + n + "th number in the number system is: " + nthNumber); // Print the result
    }
}


/*  
Here's a step-by-step explanation of how the code works:

The generateNthNumber function takes an integer n as input, 
representing the position of the number in the sequence.

It checks if n is less than or equal to 0. If n is non-positive, 
it returns an empty string since there is no 0th or negative position in the number system.

It initializes a StringBuilder (sb) to build the result.

In the while loop, it repeatedly calculates the nth number by working backward from n to 1:

It calculates the remainder when (n - 1) is divided by 2. This remainder determines whether to add '3' or '4' to the result.
It inserts the determined digit ('3' for remainder 0 and '4' for remainder 1) at the beginning of the result using sb.insert(0, ...).
It updates n by dividing (n - 1) by 2, effectively moving to the next position in the sequence.
Finally, it converts the StringBuilder to a string using sb.toString() and returns the nth number.

In the main method, you can change the value of n to find the nth number in the number system and print the result.

 */