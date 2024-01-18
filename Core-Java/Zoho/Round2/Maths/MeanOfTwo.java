package Zoho.Round2.Maths;

public class MeanOfTwo {
    public static void main(String[] args) {
        // Example array with elements
        int[] array = {5, 10};

        // Calculate mean of two elements
        double mean = calculateMean(array[0], array[1]);

        // Print the mean
        System.out.println("Mean of two elements: " + mean);
    }

    // Function to calculate mean of two elements
    public static double calculateMean(int element1, int element2) {
        return (element1 + element2) / 2.0;
    }
}
