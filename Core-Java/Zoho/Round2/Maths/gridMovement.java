package Zoho.Round2.Maths;

import java.util.Scanner;

public class gridMovement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read initial position
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Read the number of movements
        int n = scanner.nextInt();

        // Process movements and update the position
        for (int i = 0; i < n; i++) {
            char move = scanner.next().charAt(0);

            // Update position based on the movement
            switch (move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    System.out.println("Invalid movement.");
                    return;
            }
        }

        // Print the current position
        System.out.println(x + " " + y);
    }
}
