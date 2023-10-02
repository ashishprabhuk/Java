package Zoho.Round3.Puzzles;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private int size;

    // Constructor to initialize the game board
    public TicTacToe(int n) {
        size = n;
        board = new char[n][n];
        currentPlayer = 'X'; // Player 'X' starts the game
        initializeBoard();
    }

    // Initialize the game board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current game board
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("-".repeat(4 * size - 1)); // Print horizontal lines
            }
        }
    }

    // Make a move on the board and switch players
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size || board[row][col] != ' ') {
            return false; // Invalid move
        }
        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
        return true;
    }

    // Check for a win on the board
    public boolean checkWin() {
        // Check rows, columns, diagonals, and anti-diagonals for a win
        return checkRows() || checkColumns() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < size; i++) {
            if (board[i][0] != ' ' && allEqual(board[i])) {
                return true; // Row with the same symbols (X or O)
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int j = 0; j < size; j++) {
            char[] column = new char[size];
            for (int i = 0; i < size; i++) {
                column[i] = board[i][j];
            }
            if (column[0] != ' ' && allEqual(column)) {
                return true; // Column with the same symbols
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        char[] diagonal1 = new char[size];
        char[] diagonal2 = new char[size];
        for (int i = 0; i < size; i++) {
            diagonal1[i] = board[i][i];
            diagonal2[i] = board[i][size - 1 - i];
        }
        return (diagonal1[0] != ' ' && allEqual(diagonal1)) || (diagonal2[0] != ' ' && allEqual(diagonal2));
    }

    // Check if all elements in an array are equal
    private boolean allEqual(char[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                return false;
            }
        }
        return true;
    }

    // Check if the board is full
    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') {
                    return false; // There is an empty space on the board
                }
            }
        }
        return true; // The board is full (a draw)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Tic-Tac-Toe board: ");
        int n = scanner.nextInt();
        TicTacToe game = new TicTacToe(n);

        while (true) {
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + ", enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (game.makeMove(row, col)) {
                if (game.checkWin()) {
                    game.printBoard();
                    System.out.println("Player " + game.currentPlayer + " wins!");
                    break;
                } else if (game.isFull()) {
                    game.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }
}
