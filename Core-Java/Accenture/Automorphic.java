package Accenture;

public class Automorphic {

    public static boolean isAutomorphic(int num) {
        // Calculate the square of the number
        int square = num * num;

        // Convert the number and its square to strings
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        // Check if the square ends with the original number
        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {
        // Example usage:
        int number = 37;
        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }
}
