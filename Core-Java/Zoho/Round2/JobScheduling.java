package Zoho.Round2;
import java.util.*;

class Job {
    char id;
    int deadline, profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {
    public static void printJobSequence(Job[] jobs) {
        // Sort the jobs based on profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = Arrays.stream(jobs).mapToInt(job -> job.deadline).max().getAsInt();
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        // Initialize all slots as empty
        Arrays.fill(slot, false);

        // Iterate through all the jobs
        for (Job job : jobs) {
            // Find a free slot for this job (in reverse order)
            for (int i = Math.min(maxDeadline, job.deadline) - 1; i >= 0; i--) {
                if (!slot[i]) {
                    result[i] = job.id;
                    slot[i] = true;
                    break;
                }
            }
        }

        // Print the job sequence
        System.out.print("Following is the maximum profit sequence of jobs: ");
        for (char jobId : result) {
            if (jobId != 0) {
                System.out.print(jobId + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Job[] jobs1 = {
            new Job('a', 4, 20),
            new Job('b', 1, 10),
            new Job('c', 1, 40),
            new Job('d', 1, 30)
        };

        Job[] jobs2 = {
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };

        printJobSequence(jobs1);
        printJobSequence(jobs2);
    }
}

