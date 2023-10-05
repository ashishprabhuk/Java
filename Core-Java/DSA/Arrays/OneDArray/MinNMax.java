package DSA.Arrays.OneDArray;

public class MinNMax {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int min = findMinValue(arr);
        System.out.println("Minimum value: " + min);

        int max = findMaxValue(arr);
        System.out.println("Maximum value: " + max);
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum value
            }
        }

        return min;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update the maximum value
            }
        }

        return max;
    }
}
