package Zoho.Round2.Maths;
import java.util.Scanner;

public class OddNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upper bound:");
        int upperBound = sc.nextInt();
        
        System.out.println("Odd numbers in the range:");
        findOddNumbersInRange(lowerBound, upperBound);
        
        sc.close();
    }
    
    public static void findOddNumbersInRange(int lowerBound, int upperBound) {
        if (lowerBound % 2 == 0) {
            // If the lower bound is even, increment it to make it odd
            lowerBound++;
        }
        
        for (int i = lowerBound; i <= upperBound; i += 2) {
            System.out.print(i);
            if (i < upperBound - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

