package Strivers.Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int arr[]) {  //optimal
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
            return false;
        }
        return true;
    }
}
