package Zoho.Round2;

public class SinX {
    public static void main(String[] args) {
        double x = Math.toRadians(30); // Convert degrees to radians
        int n = 10;
        System.out.println(calculateSinX(x, n));
    }

    public static double calculateSinX(double x, int n) {
        double sinx = x;
        double term = x;
        int sign = -1;

        for (int i = 3; i <= n * 2; i += 2) {
            term = (term * x * x) / ((i - 1) * i);
            sinx += sign * term;
            sign *= -1;
        }

        return sinx;
    }
}

/*
 * Computing value of sin (x)
 * Input x = 30 n = 10
 * output = 0.5
 * Hint : The equation sin(x) = x – x^3 / 3! + x^5 / 5! –
 * ....
 */