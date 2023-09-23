package DSA.Recursion;

public class ReverseArray{
   //Function to print array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   //Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        printArray(arr, n);
        // System.out.print("Reversed array is: ");
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
    }
}
