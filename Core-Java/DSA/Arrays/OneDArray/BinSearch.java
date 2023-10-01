package DSA.Arrays.OneDArray;

public class BinSearch {
    public static void main(String[] args) {
        int[] sortedNumbers = {10, 20, 30, 40, 50};
        int target = 40;
        int index = binarySearch(sortedNumbers, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element not found in the sorted array.");
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Element not found
    }
    
}
