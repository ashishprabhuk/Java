package Zoho.Round2.Arrays;
// import java.util.Arrays;

public class MinWorkersNeeded {
    static int findMinWorkers(int startTimes[], int endTimes[]) {
        int n = startTimes.length;
        int i = 0;
        int j = 0;
        int count = 1;
        int workersNeeded = 0;

        while (i < n && j < n) {
            if (startTimes[i] < endTimes[j]) {
                i++;
                count++;
            } else {
                j++;
                count--; 
            }
            workersNeeded = Math.max(workersNeeded, count);
        }
        return workersNeeded;
    }

    public static void main(String[] args) {
        int startTimes[] = { 1230, 1230, 1600 };
        int endTimes[] = { 0130, 0130, 1900 };
        int minWorkers = findMinWorkers(startTimes, endTimes);
        System.out.println("Minimum number of workers needed: " + minWorkers);
    }
}


/*
With the starting and ending time of work given
find the minimum no of workers needed
Start time : end time
1230       :   0130
1200       :   0100
1600       :   1700
Output: 2
 */