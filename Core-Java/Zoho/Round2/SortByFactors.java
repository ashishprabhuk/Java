package Zoho.Round2;
import java.util.*;

public class SortByFactors {
    public static void main(String[] args) {
        Integer[] arr1 = { 8, 2, 3, 12, 16 };
        Integer[] arr2 = {5, 11, 10, 20, 9, 16, 23};
        
        // Sort the array using a custom comparator
        Arrays.sort(arr1, new FactorComparator());
        Arrays.sort(arr2, new FactorComparator());
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    
    // Custom Comparator to compare numbers based on factors
    static class FactorComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int factorCount1 = countFactors(num1);
            int factorCount2 = countFactors(num2);
            
            // First, compare by factor count
            if (factorCount1 != factorCount2) {
                return factorCount2 - factorCount1; // Sort by descending factor count
            }
            
            // If factor counts are equal, compare the numbers themselves
            return num2 - num1; // Sort in descending order
        }
        
        // Function to count the number of factors of a given number
        private int countFactors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}