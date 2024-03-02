package Zoho.Round2.Arrays;

public class CountOnesSorted {
    public static void main(String[] args) {
        int[] binaryArray = {0,0,0,1,1,1};
        System.out.println("Total number of 1's: " + totalOnes(binaryArray));
    }
    static int totalOnes(int[] arr) {
        int start = 0, end = arr.length - 1;
        int ans = 0, n = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == 0) {
                start = mid + 1;
            }
            else if (arr[mid] == 1) {
                ans = n - mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}