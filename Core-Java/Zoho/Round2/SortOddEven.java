package Zoho.Round2;
import java.util.Arrays;

public class SortOddEven{
    public static void main(String[] args) {
        int[] input1 = {13, 2, 4, 15, 12, 10, 5};
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Output 1: " + Arrays.toString(input1));
        sortOddEven(input1);
        System.out.println("Output 1: " + Arrays.toString(input1));
        
        System.out.println("Output 2: " + Arrays.toString(input2));
        sortOddEven(input2);
        System.out.println("Output 2: " + Arrays.toString(input2));
    }
    
    public static void sortOddEven(int[] arr) {
        int n = arr.length;
        
        // Sort odd positions in descending order
        for (int i = 0; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Sort even positions in ascending order
        for (int i = 1; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
