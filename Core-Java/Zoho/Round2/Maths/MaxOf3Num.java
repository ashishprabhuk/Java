package Zoho.Round2.Maths;

public class MaxOf3Num {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Maximum number: " + max);
    }
}