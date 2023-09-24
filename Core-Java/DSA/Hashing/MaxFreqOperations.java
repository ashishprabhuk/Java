package DSA.Hashing;

import java.util.*;

public class MaxFreqOperations {
    public int maxFrequency(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        int operations = 0;
        int left = Integer.MAX_VALUE; // Initialize left boundary
        
        for (int num : nums) {
            int frequency = frequencyMap.get(num);
            
            // Calculate the number of operations needed to make all elements equal to 'num'
            int opsNeeded = (num * frequency) - operations;
            
            // Check if we can perform the operations
            if (opsNeeded <= k) {
                operations += opsNeeded;
                maxFrequency = Math.max(maxFrequency, frequency);
            } else {
                // Need to move the left boundary to reduce the frequency of 'num'
                while (opsNeeded > k) {
                    int leftNum = nums[left++];
                    int leftFrequency = frequencyMap.get(leftNum);
                    operations -= leftNum * leftFrequency;
                    opsNeeded = (num * frequency) - operations;
                    frequencyMap.put(leftNum, leftFrequency - 1);
                }
                operations += opsNeeded;
                maxFrequency = Math.max(maxFrequency, frequency);
            }
        }
        
        return maxFrequency;
    }
}

