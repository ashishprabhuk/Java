package Zoho.Round2.Arrays;

import java.util.*;

public class SecondFrequent {
    public static void main(String[] args) {
        int[] series = {1, 1, 2, 3, 1, 2, 4};
        int result = findSecondFrequentNumber(series);
        System.out.println("Second most frequently occurring number: " + result);
    }

    static int findSecondFrequentNumber(int[] series) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each number
        for (int num : series) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = -1;
        int secondMostFrequent = -1;

        // Find the most frequent and second most frequent numbers
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int number = entry.getKey();

            if (frequency > mostFrequent) {
                secondMostFrequent = mostFrequent;
                mostFrequent = frequency;
            } else if (frequency > secondMostFrequent && frequency != mostFrequent) {
                secondMostFrequent = frequency;
            }
        }

        // Find the number corresponding to the second most frequent count
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == secondMostFrequent) {
                return entry.getKey();
            }
        }

        return -1; // If there is no second most frequent number
    }
}
