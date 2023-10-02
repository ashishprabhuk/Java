package Zoho.Round3.Puzzles;

import java.util.Scanner;

public class BrickGame {
    public static void main(String[] args) {
        // Initialize the game board
        char[][] board = {
            {'w', 'w', 'w', 'w', 'w', 'w', 'w'},
            {'w', ' ', ' ', ' ', ' ', ' ', 'w'},
            {'w', ' ', '1', '1', '1', ' ', 'w'},
            {'w', ' ', '1', '1', '1', ' ', 'w'},
            {'w', ' ', ' ', ' ', ' ', ' ', 'w'},
            {'w', ' ', ' ', ' ', ' ', ' ', 'w'},
            {'w', 'g', 'g', 'o', 'g', 'g', 'w'}
        };

        int ballCount = 5; // Initial number of balls
        int[] ballPosition = {6, 3}; // Initial ball position (row, col)

        // Display the initial board and ball count
        printBoard(board, ballPosition);
        System.out.println("Ball count: " + ballCount);

        Scanner scanner = new Scanner(System.in);
        String command;

        // Main game loop
        while (ballCount > 0) {
            System.out.print("Enter a command (st/lt/rt/quit): ");
            command = scanner.nextLine();

            if (command.equals("quit")) {
                break; // Exit the game loop if the user wants to quit
            }

            if (command.equals("st")) {
                // Move straight
                int[] newPosition = moveStraight(board, ballPosition);
                if (newPosition[0] == -1) {
                    ballCount--; // Decrement ball count if hitting a wall
                }
                ballPosition = newPosition; // Update ball position
            } else if (command.equals("lt")) {
                // Move left
                int[] newPosition = moveLeft(board, ballPosition);
                if (newPosition[0] == -1) {
                    ballCount--; // Decrement ball count if hitting a wall
                }
                ballPosition = newPosition; // Update ball position
            } else if (command.equals("rt")) {
                // Move right
                int[] newPosition = moveRight(board, ballPosition);
                if (newPosition[0] == -1) {
                    ballCount--; // Decrement ball count if hitting a wall
                }
                ballPosition = newPosition; // Update ball position
            } else {
                System.out.println("Invalid command. Use st, lt, rt, or quit.");
            }

            // Display the updated board and ball count
            printBoard(board, ballPosition);
            System.out.println("Ball count: " + ballCount);
        }

        scanner.close();
    }

    // Move the ball straight up
    public static int[] moveStraight(char[][] board, int[] currentPosition) {
        int row = currentPosition[0];
        int col = currentPosition[1];

        while (row > 0) {
            row--;
            if (board[row][col] == '1') {
                board[row][col] = ' '; // Remove the '1'
                currentPosition[0] = row; // Update row position
                return currentPosition; // Stop moving
            } else if (board[row][col] == 'w') {
                return new int[]{-1, -1}; // Hit a wall, stop and indicate with -1
            }
        }

        return currentPosition; // No valid movement, stay in the same position
    }

    // Move the ball to the left
    public static int[] moveLeft(char[][] board, int[] currentPosition) {
        int row = currentPosition[0];
        int col = currentPosition[1];

        while (col > 0) {
            col--;
            if (board[row][col] == '1') {
                board[row][col] = ' '; // Remove the '1'
                currentPosition[1] = col; // Update col position
                return currentPosition; // Stop moving
            } else if (board[row][col] == 'w') {
                return new int[]{-1, -1}; // Hit a wall, stop and indicate with -1
            }
        }

        return currentPosition; // No valid movement, stay in the same position
    }

    // Move the ball to the right
    public static int[] moveRight(char[][] board, int[] currentPosition) {
        int row = currentPosition[0];
        int col = currentPosition[1];

        while (col < board[0].length - 1) {
            col++;
            if (board[row][col] == '1') {
                board[row][col] = ' '; // Remove the '1'
                currentPosition[1] = col; // Update col position
                return currentPosition; // Stop moving
            } else if (board[row][col] == 'w') {
                return new int[]{-1, -1}; // Hit a wall, stop and indicate with -1
            }
        }

        return currentPosition; // No valid movement, stay in the same position
    }

    // Display the game board with the ball
    public static void printBoard(char[][] board, int[] ballPosition) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == ballPosition[0] && j == ballPosition[1]) {
                    System.out.print("o "); // Print 'o' for the ball position
                } else {
                    System.out.print(board[i][j] + " "); // Print other characters
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
