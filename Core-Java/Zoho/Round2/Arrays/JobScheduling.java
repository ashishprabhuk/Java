// package Zoho.Round2.Arrays;
// import java.util.*;

// class Job {
//     char id;
//     int deadline;
//     int profit;

//     public Job(char id, int deadline, int profit) {
//         this.id = id;
//         this.deadline = deadline;
//         this.profit = profit;
//     }
// }

// public class JobScheduling {
//     public static void main(String[] args) {
//         Job[] jobs = {
//             new Job('a', 2, 100),
//             new Job('b', 1, 19),
//             new Job('c', 2, 27),
//             new Job('d', 1, 25),
//             new Job('e', 3, 15)
//         };

//         Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

//         int n = jobs.length;
//         int[] result = new int[n];
//         boolean[] slot = new boolean[n];

//         for (int i = 0; i < n; i++) {
//             for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
//                 if (!slot[j]) {
//                     result[j] = i;
//                     slot[j] = true;
//                     break;
//                 }
//             }
//         }
//         System.out.print("Maximum profit sequence of jobs: ");
//         for (int i = 0; i < n; i++) {
//             if (slot[i]) {
//                 System.out.print(jobs[result[i]].id + " ");
//             }
//         }
//     }
// }

package Zoho.Round2.Arrays;

import java.util.Arrays;

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

        // Sort jobs based on maximum profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int n = jobs.length;
        int[] result = new int[n];

        // Iterate through each job and find the best slot for it
        for (int i = 0; i < n; i++) {
            int deadline = jobs[i].deadline;
            for (int j = Math.min(n, deadline) - 1; j >= 0; j--) {
                if (result[j] == 0) {
                    result[j] = i + 1; // Store the index of the job + 1 (to avoid confusion with 0 indicating no job)
                    break;
                }
            }
        }

        // Print the jobs scheduled for maximum profit
        System.out.print("Maximum profit sequence of jobs: ");
        for (int i = 0; i < n; i++) {
            if (result[i] != 0) {
                System.out.print(jobs[result[i] - 1].id + " "); // Subtract 1 to get the correct index of the job in the array
            }
        }
    }
}

/*
Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time.

Examples: 

Input: Four Jobs with following deadlines and profits

JobID  Deadline  Profit

  a           4          20   
  b           1          10
  c           1          40  
  d           1          30

Output: Following is maximum profit sequence of jobs: c, a   

Input:  Five Jobs with following deadlines and profits

JobID   Deadline  Profit

  a         2       100
  b         1        19
  c         2        27
  d         1        25
  e         3        15

Output: Following is maximum profit sequence of jobs: c, a, e
 */