package Zoho.Round2;

public class BaseNAddition {
    public static void main(String[] args) {
        String a = "123";
        String b = "13";
        int n = 4;

        String result = addBaseN(a, b, n);
        System.out.println("Base " + n + " Sum: " + result);
    }

    public static String addBaseN(String a, String b, int n) {
        int carry = 0;
        StringBuilder sum = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;

            int total = digitA + digitB + carry;
            sum.insert(0, total % n);
            carry = total / n;
        }

        return sum.toString();
    }
}
