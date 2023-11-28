package Accenture;

public class BinaryOperations {
    public static int OperationsBinaryString(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        int result = Character.getNumericValue(str.charAt(0));

        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);
            char binaryDigit = str.charAt(i + 1);
            switch (operation) {
                case 'A': result &= binaryDigit - '0'; break;
                case 'B': result |= binaryDigit - '0'; break;
                case 'C': result ^= binaryDigit - '0'; break;
                default: return -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input1 = "1C0C1C1A0B1";
        System.out.println(OperationsBinaryString(input1)); // Output: 1

        String input2 = "0C1A1B1C1C1B0A0";
        System.out.println(OperationsBinaryString(input2)); // Output: 0
    }
}
