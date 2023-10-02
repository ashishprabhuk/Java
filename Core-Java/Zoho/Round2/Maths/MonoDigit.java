package Zoho.Round2.Maths;
public class MonoDigit {
    public static void main(String[] args) {
        int[] numbers = {72581, 3962};
        for (int number : numbers) {
            String result = convertToMonoDigit(number);
            System.out.println("Input: " + number + ", Output: " + result);
        }
    }

    public static String convertToMonoDigit(int number) {
        String numStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();
        char firstDigit = numStr.charAt(0);
        result.append(firstDigit);

        for (int i = 1; i < numStr.length() - 1; i += 2) {
            int digit1 = Character.getNumericValue(numStr.charAt(i));
            int digit2 = Character.getNumericValue(numStr.charAt(i + 1));
            int operationResult = (digit1 + digit2 == Character.getNumericValue(firstDigit)) ? digit1 + digit2 : digit1 - digit2;

            if (operationResult != Character.getNumericValue(firstDigit)) {
                return numStr + " cannot create a mono digit number";
            }

            result.append(" ").append("(").append(digit1).append(digit1 + digit2 == operationResult ? "+" : "-").append(digit2).append(")");
        }

        if (numStr.length() % 2 != 0) {
            result.append(" ").append(numStr.charAt(numStr.length() - 1));
        }

        return result.toString() + " = " + firstDigit + " " + firstDigit + " " + firstDigit;
    }
}