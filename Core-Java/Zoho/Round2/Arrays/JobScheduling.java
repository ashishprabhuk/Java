package Zoho.Round2.Arrays;
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
    public static void printJobSequence(List<Job> jobs) {
        // Sort the jobs based on profit in descending order
        Collections.sort(jobs, Comparator.comparingInt(job -> -job.profit));

        List<Job> jobSequence = new ArrayList<>();
        List<Boolean> slotOccupied = new ArrayList<>(Collections.nCopies(jobs.size(), false));

        // Iterate through all the jobs
        for (Job job : jobs) {
            // Find a free slot for this job (in reverse order)
            for (int i = Math.min(jobs.size(), job.deadline) - 1; i >= 0; i--) {
                if (!slotOccupied.get(i)) {
                    jobSequence.add(job);
                    slotOccupied.set(i, true);
                    break;
                }
            }
        }

        // Print the job sequence
        System.out.print("Following is the maximum profit sequence of jobs: ");
        for (Job job : jobSequence) {
            System.out.print(job.id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Job> jobs1 = new ArrayList<>();
        jobs1.add(new Job('a', 4, 20));
        jobs1.add(new Job('b', 1, 10));
        jobs1.add(new Job('c', 1, 40));
        jobs1.add(new Job('d', 1, 30));

        List<Job> jobs2 = new ArrayList<>();
        jobs2.add(new Job('a', 2, 100));
        jobs2.add(new Job('b', 1, 19));
        jobs2.add(new Job('c', 2, 27));
        jobs2.add(new Job('d', 1, 25));
        jobs2.add(new Job('e', 3, 15));

        printJobSequence(jobs1);
        printJobSequence(jobs2);
    }
}
