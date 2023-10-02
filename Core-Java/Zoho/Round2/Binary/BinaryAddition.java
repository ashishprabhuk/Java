package Zoho.Round2.Binary;

public class BinaryAddition {
    public static void main(String[] args) {
        String a = "1010";
        String b = "11001";

        String result = addBinary(a, b);
        System.out.println("Binary Sum: " + result);
    }

    public static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sum = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int total = bitA + bitB + carry;
            sum.insert(0, total % 2);
            carry = total / 2;
        }

        return sum.toString();
    }
}

