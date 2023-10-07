package Zoho.Round2.Maths;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SafestPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of processes
        int n = scanner.nextInt();

        // Read the start position
        int startPosition = scanner.nextInt();

        // Read the process to skip
        int skip = scanner.nextInt();

        int safestPosition = findSafestPosition(n, startPosition, skip);
        System.out.println("The safest position is: " + safestPosition);
    }

    static int findSafestPosition(int n, int startPosition, int skip) {
        Queue<Integer> queue = new LinkedList<>();

        // Initialize the circular queue with process numbers
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        // Start from the given position
        while (queue.size() > 1) {
            for (int i = 0; i < skip - 1; i++) {
                int front = queue.poll();
                queue.offer(front);
            }
            queue.poll(); // Skip the process
        }

        // The last remaining process is the safest position
        return queue.peek();
    }
}
