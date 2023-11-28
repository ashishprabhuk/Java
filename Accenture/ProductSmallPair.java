package Accenture;
import java.util.*;

public class ProductSmallPair {
    public static void main(String[] args) {
        int sum1 = 9;
        int[] arr1 = {5, 2, 4, 3, 9, 7, 1};

        int sum2 = 4;
        int[] arr2 = {9, 8, 3, -7, 3, 9};

        int result1 = productSmallestPair(sum1, arr1);
        int result2 = ProductSmallestPair(sum2, arr2);

        System.out.println(result1); // Output: 2
        System.out.println(result2); // Output: -21
    }

    static int productSmallestPair(int sum, int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        int smallestPairProduct = Integer.MAX_VALUE;
        for (int i = 0, j = 1; j < arr.length; i++, j++) {
            if (arr[i] + arr[j] <= sum) {
                int product = arr[i] * arr[j];
                smallestPairProduct = Math.min(smallestPairProduct, product);
            } else {
                break; // Since the array is sorted, no need to check further
            }
        }
        return (smallestPairProduct == Integer.MAX_VALUE) ? 0 : smallestPairProduct;
    }

    static int ProductSmallestPair(int sum, int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        if (sortedList.get(0) + sortedList.get(1) <= sum) {
            return sortedList.get(0) * sortedList.get(1);
        }
        return 0;
    }
}


/*
Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4

size of Arr = 6

Arr:9 8 3 -7 3 9

Sample Output

-21

*/