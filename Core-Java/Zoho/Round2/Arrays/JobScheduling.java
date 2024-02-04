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
    public static void main(String[] args) {
        List<Job> jobs1 = Arrays.asList(
                new Job('a', 4, 20),
                new Job('b', 1, 10),
                new Job('c', 1, 40),
                new Job('d', 1, 30)
        );
        List<Job> jobs2 = Arrays.asList(
                new Job('a', 2, 100),
                new Job('b', 1, 19),
                new Job('c', 2, 27),
                new Job('d', 1, 25),
                new Job('e', 3, 15)
        );

        System.out.println("Max profit sequence of jobs: " + getMaxProfitSequence(jobs1));
        System.out.println("Max profit sequence of jobs: " + getMaxProfitSequence(jobs2));
    }

    private static List<Character> getMaxProfitSequence(List<Job> jobs) {
        jobs.sort((job1, job2) -> Integer.compare(job2.profit, job1.profit));

        boolean[] slot = new boolean[jobs.size()];
        List<Character> result = new ArrayList<>();

        for (Job job : jobs) {
            for (int i = Math.min(jobs.size(), job.deadline) - 1; i >= 0; i--) {
                if (!slot[i]) {
                    slot[i] = true;
                    result.add(job.id);
                    break;
                }
            }
        }
        return result;
    }
}
