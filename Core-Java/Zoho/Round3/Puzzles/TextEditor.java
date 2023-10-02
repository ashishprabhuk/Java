package Zoho.Round3.Puzzles;

import java.util.Scanner;

public class TextEditor {
    private static final int MAX_LINE_LENGTH = 40;
    private static StringBuilder text = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Current text:");
            displayText();
            System.out.println("\nOptions:");
            System.out.println("1. Insert text");
            System.out.println("2. Delete text");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    insertText(insertText);
                    break;
                case 2:
                    System.out.print("Enter position to delete from: ");
                    int deletePosition = scanner.nextInt();
                    deleteText(deletePosition);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void insertText(String textToInsert) {
        text.append(textToInsert);
        wrapText();
    }

    private static void deleteText(int position) {
        if (position >= 0 && position < text.length()) {
            text.deleteCharAt(position);
        } else {
            System.out.println("Invalid position.");
        }
    }

    private static void wrapText() {
        int length = text.length();
        int startIndex = 0;

        while (startIndex < length) {
            int endIndex = Math.min(startIndex + MAX_LINE_LENGTH, length);
            System.out.println(text.substring(startIndex, endIndex));
            startIndex = endIndex;
        }
    }

    private static void displayText() {
        System.out.println(text.toString());
    }
}
