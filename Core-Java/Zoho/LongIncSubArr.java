package Zoho;

/*  
* Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20

Input: arr[] = {3, 2}
Output:1
Explanation: The longest increasing subsequences are {3} and {2}

Input: arr[] = {50, 3, 10, 7, 40, 80}
Output: 4
Explanation: The longest increasing subsequence is {3, 7, 40, 80}
*/

public class LongIncSubArr {
    
    static int lis(int arr[], int n) {
        int lis[] = new int[n];
    
        // Initialize LIS values to 1 for all elements
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
    
        // Compute LIS values in a bottom-up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
    
        // Find and return the maximum LIS value
        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLIS) {
                maxLIS = lis[i];
            }
        }
    
        return maxLIS;
    }
    
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
    
        // Function call
        System.out.println("Length of LIS is " + lis(arr, n));
    }
}
    