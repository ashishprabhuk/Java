package Zoho.Round2;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 8, 10 };
        int target = 7;
        System.out.println(hasPairWithSum(array, target));
    }

    public static boolean hasPairWithSum(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}