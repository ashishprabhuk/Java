public class MathFunctionExample {
    public static void main(String[] args) {
        // Absolute value
        int absoluteValueInt = Math.abs(-10);
        double absoluteValueDouble = Math.abs(-15.5);

        System.out.println("Absolute value of -10: " + absoluteValueInt);
        System.out.println("Absolute value of -15.5: " + absoluteValueDouble);

        // Ceiling and floor
        double ceilValue = Math.ceil(7.3);
        double floorValue = Math.floor(7.8);

        System.out.println("Ceiling of 7.3: " + ceilValue);
        System.out.println("Floor of 7.8: " + floorValue);

        // Rounding
        long roundedLong = Math.round(5.7);
        int roundedInt = Math.round(6.2f);

        System.out.println("Rounded value of 5.7: " + roundedLong);
        System.out.println("Rounded value of 6.2: " + roundedInt);

        // Exponentiation
        double exponentiationResult = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3: " + exponentiationResult);

        // Square root
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25: " + squareRoot);

        // Trigonometric functions (using radians)
        double angleInRadians = Math.toRadians(45);
        double sineValue = Math.sin(angleInRadians);
        double cosineValue = Math.cos(angleInRadians);
        double tangentValue = Math.tan(angleInRadians);

        System.out.println("Sine of 45 degrees: " + sineValue);
        System.out.println("Cosine of 45 degrees: " + cosineValue);
        System.out.println("Tangent of 45 degrees: " + tangentValue);

        // Random number generation
        double randomValue = Math.random();
        System.out.println("Random value between 0 and 1: " + randomValue);

        // Constants
        double piValue = Math.PI;
        double eValue = Math.E;

        System.out.println("Value of pi: " + piValue);
        System.out.println("Value of e: " + eValue);
    }
}

