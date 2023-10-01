package DSA.Arrays.OneDArray;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] sortedNumbersWithDuplicates = {10, 10, 20, 30, 30, 40, 50};
        int newSize = removeDuplicate(sortedNumbersWithDuplicates);
        System.out.print("Array with duplicates removed: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(sortedNumbersWithDuplicates[i] + " ");
        }

    }

    public static int removeDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n; // No duplicates to remove
        }
    
        int newSize = 1; // Initialize the new size of the array
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        return newSize;
    }
}

