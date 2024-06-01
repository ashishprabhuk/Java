package Zoho.Round2.Arrays;

import java.util.*;

public class SecondFrequent {
    public static void main(String[] args) {
        int[] series = {1, 2, 3, 1, 2, 4, 1};
        // int result = findSecondFrequentNumber(series);
        int result = findSecondFrequentNumberOP(series);
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
        return -1;
    }
    static int findSecondFrequentNumberOP(int[] series) {
        int freq = Integer.MIN_VALUE;
        int freq2 = Integer.MIN_VALUE;
        int mostCount = 0;
        int mostCount2 = 0;

        for (int i = 0; i < series.length; i++) {
            int count = 1;
            for (int j = i + 1; j < series.length; j++) {
                if (series[i] == series[j]) {
                    count++;
                }
            }
            if (count > mostCount) {
                mostCount2 = mostCount;
                mostCount = count;
                freq2 = freq;
                freq = series[i];
            } else if (count > mostCount2 && count != mostCount) {
                mostCount2 = count;
                freq2 = series[i];  
            }
        }
        System.out.println("Most frequent number: " + freq + " with count: " + mostCount);
        System.out.println("Second most frequent number: " + freq2 + " with count: " + mostCount2);
        return freq2;
    }
}
