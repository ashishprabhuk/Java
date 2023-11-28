package Accenture;

public class DecToNBase {
    public static void main(String[] args) {
        int n1 = 12;
        int num1 = 718;

        int n2 = 21;
        int num2 = 5678;

        String result1 = DectoNBase(n1, num1);
        String result2 = DectoNBase(n2, num2);

        System.out.println(result1); // Output: 4BA
        System.out.println(result2); // Output: CI8
    }

    static String DectoNBase(int n, int num) {
        if (n <= 1 || n > 36) {
            return "Invalid base";
        }

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % n;
            char digit = (char) (remainder + (remainder < 10 ? '0' : 'A' - 10));
            result.insert(0, digit);
            num /= n;
        }

        return result.toString();
    }
}
