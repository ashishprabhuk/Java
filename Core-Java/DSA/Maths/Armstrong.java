package DSA.Maths;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int num = n;
        int len = String.valueOf(n).length(); //returns the length of the string representation of the integer value
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; 
            sum += Math.pow(digit, len); // 0 + 1^3 = 1 ; 1 + 5^3 = 126 ; 126 + 3^3 = 153
            n /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Test with 153
    }
}
