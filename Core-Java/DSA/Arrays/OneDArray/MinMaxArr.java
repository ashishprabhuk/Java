package DSA.Arrays.OneDArray;

public class MinMaxArr {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
}
