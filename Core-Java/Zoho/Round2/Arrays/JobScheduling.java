package Zoho.Round2.Arrays;
import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int n = jobs.length;
        int[] result = new int[n];
        boolean[] slot = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    result[j] = i;
                    slot[j] = true;
                    break;
                }
            }
        }

        System.out.print("Maximum profit sequence of jobs: ");
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                System.out.print(jobs[result[i]].id + " ");
            }
        }
    }
}
