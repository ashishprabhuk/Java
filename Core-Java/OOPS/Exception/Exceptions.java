package Exception;
// Custom exception class
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Exceptions {

    public static double calculateAverage(int[] numbers) throws InvalidInputException {
        if (numbers == null || numbers.length == 0) {
            throw new InvalidInputException("Input array is empty or null");
        }

        int sum = 0;
        
        for(int i = 0 ; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
        // return (double) (sum / 0); // ArithmeticException Error
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 }; //Valid input
        // int[] numbers = { };  //for InputInvalidException Exceptions
        // int[] numbers = null;  //for InputInvalidException Exceptions

        try {
            double average = calculateAverage(numbers);
            System.out.println("Average: " + average);
        } catch (InvalidInputException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Division by zero: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
