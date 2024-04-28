package Basics;
import java.util.*;

public class OccurrencesCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 1, 3, 2, 1}; 
        int targetNumber = 2; 
        int count = countOccurrences(arr, targetNumber);
        int count2 = countOccurrences2(arr, targetNumber);
        int count3 = countOccurrences3(arr, targetNumber);
        System.out.println("Number of occurrences of " + targetNumber + ": " + count);
        System.out.println("Number of occurrences of " + targetNumber + ": " + count2);
        System.out.println("Number of occurrences of " + targetNumber + ": " + count3);
    }
    
    public static int countOccurrences(int[] arr, int target) {
        int[] occurrences = new int[1000];
        for (int num : arr) {
            occurrences[num]++;
        }            
        return occurrences[target];
    }

    public static int countOccurrences2(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return map.get(target);
    }

    public static int countOccurrences3(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

}
