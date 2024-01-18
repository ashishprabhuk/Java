package Accenture;
import java.util.*;

public class LargeSmallSum {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        int[] arr2 = {1, 8, 0, 2, 3, 5, 6};

        int result1 = LargeSmall(arr1);
        int result2 = largeSmallSum(arr2); // 

        System.out.println(result1); // Output: 7
        System.out.println(result2); // Output: 8
    }

    static int LargeSmall(int[] arr) {
        if (arr == null || arr.length <= 3) {
            return 0;
        }
        Arrays.sort(arr);
        int evenSum = arr[arr.length - 2];
        int oddSum = arr[1];
        return evenSum + oddSum;
    }

    public static int largeSmallSum (int[] arr){
        int n = arr.length;
        if (n <= 3)
            return 0;
        ArrayList < Integer > even = new ArrayList <> ();
        ArrayList < Integer > odd = new ArrayList <> ();
        even.add (arr[0]);

        for (int i = 1; i < arr.length; i++){
            if (i % 2 == 0)
                even.add (arr[i]);
            else
                odd.add (arr[i]);
        }
        Collections.sort (even);
        Collections.sort (odd);
        return even.get (even.size () - 2) + odd.get (odd.size () - 2);
    }
}
