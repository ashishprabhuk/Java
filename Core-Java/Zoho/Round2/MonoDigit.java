package Zoho.Round2;

import java.util.Scanner;

public class MonoDigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        String result = convertToMonoDigitNumber(input);
        if (result != null) {
            System.out.println("Output: " + result);
        } else {
            System.out.println("Cannot create a mono digit number");
        }
    }

    public static String convertToMonoDigitNumber(String input) {
        if (input == null || input.length() < 2) {
            return null;
        }

        StringBuilder result = new StringBuilder(input);

        while (true) {
            int index = 0;
            boolean found = false;

            while (index < result.length() - 1) {
                int currentDigit = Character.getNumericValue(result.charAt(index));
                int nextDigit = Character.getNumericValue(result.charAt(index + 1));

                int sum = currentDigit + nextDigit;
                int diff = currentDigit - nextDigit;

                if (sum % 10 == 0 || diff % 10 == 0) {
                    result.replace(index, index + 2, String.valueOf(sum % 10 == 0 ? sum : diff));
                    found = true;
                    break;
                }
                index++;
            }

            if (!found) {
                break;
            }
        }

        if (result.length() == 1) {
            return result.toString();
        } else {
            return null;
        }
    }
}

