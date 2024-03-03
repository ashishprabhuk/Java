package Basics;


public class OccurrencesCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 1, 3, 4, 1}; 
        int targetNumber = 1; 
        int count = countOccurrences(arr, targetNumber);
        System.out.println("Number of occurrences of " + targetNumber + ": " + count);
    }
    
    public static int countOccurrences(int[] arr, int target) {
        int[] occurrences = new int[1000];
        for (int num : arr) {
            occurrences[num]++;
        }            
        return occurrences[target];
    }
}
