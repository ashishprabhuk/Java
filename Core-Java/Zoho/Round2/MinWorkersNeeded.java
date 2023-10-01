package Zoho.Round2;
// import java.util.Arrays;

public class MinWorkersNeeded {
    // Function to find the minimum number of workers needed
    static int findMinWorkers(int startTimes[], int endTimes[], int n) {
        int i = 0;
        int j = 0;
        int count = 1; // Initialize with 0 workers
        int workersNeeded = 0; // Store the minimum number of workers needed

        while (i < n && j < n) {
            if (startTimes[i] < endTimes[j]) {
                i++;
                count++; // Increase the count as a new worker is needed
            } else {
                j++;
                count--; // Decrease the count as a worker is available
            }

            // Update workersNeeded only when count exceeds the current workersNeeded
            workersNeeded = Math.max(workersNeeded, count);
        }

        return workersNeeded;
    }

    public static void main(String[] args) {
        int startTimes[] = { 1230, 1230, 1600 };
        int endTimes[] = { 0130, 0130, 1900 }; // Corrected format: 130 instead of 0130, 100 instead of 0100
        int n = startTimes.length;

        int minWorkers = findMinWorkers(startTimes, endTimes, n);
        System.out.println("Minimum number of workers needed: " + minWorkers);
    }
}
