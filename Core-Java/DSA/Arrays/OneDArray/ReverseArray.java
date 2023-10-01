package DSA.Arrays.OneDArray;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Normal array:   ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();
        
        reverseArray(numbers);
        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
