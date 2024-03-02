package Zoho.Round2.Arrays;

public class CountOnes {
    static int totalOnes(int arr[]) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int lastOneIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == 1) {
                lastOneIndex = mid;
                start = mid + 1; // Continue searching on the right side
            } else {
                end = mid - 1; // Search on the left side
            }
        }
        // If lastOneIndex is still -1, it means there's no 1 in the array
        // Otherwise, the last occurrence of 1 is lastOneIndex
        return lastOneIndex != -1 ? lastOneIndex + 1 : 0;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 0, 0, 0};
        System.out.println("Count of 1's in given array is " + totalOnes(arr));
    }
}


	
