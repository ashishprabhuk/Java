package DSA.Hashing;

import java.util.*;

public class HighLowFreqValue {
    static void HighLowFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of elements in the array
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Integer.MAX_VALUE =  2147483647
        //Integer.MIN_VALUE = -2147483648

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        // we initialize maxFreq to 0 (to find the maximum frequency) and 
        // minFreq to Integer.MAX_VALUE (a large value to find the minimum frequency).

        // Iterate through the frequencies to find max and min frequencies
        for (int frequency : map.values()) {
            maxFreq = Math.max(maxFreq, frequency); //(0, highest value) -> highest frequency
            minFreq = Math.min(minFreq, frequency); //(2147483647, lowest value) -> lowest frequency
        }

        System.out.println("Maximum Frequency: " + maxFreq);
        System.out.println("Minimum Frequency: " + minFreq);
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10}; // Example array
        HighLowFrequency(arr);
    }
}
