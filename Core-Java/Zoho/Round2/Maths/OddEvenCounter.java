package Zoho.Round2.Maths;

public class OddEvenCounter {
    public static void main(String[] args) {
        int number = 1234567;
        countOddEvenDigits(number);
    }

    public static void countOddEvenDigits(int number) {
        int oddCount = 0;
        int evenCount = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("ODD " + oddCount);
        System.out.println("EVEN " + evenCount);
    }
}