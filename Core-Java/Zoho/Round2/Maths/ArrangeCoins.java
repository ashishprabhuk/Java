package Zoho.Round2.Maths;

public class ArrangeCoins {
    static int arrangeCoins1(int n) {
        int i = 1;
        while(n>0){
            i++;
            n = n - i;
        }
        return i-1;
    }

    static int arrangeCoins2(int n){ // most optimal
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            int coinsUsed = mid*(mid+1)/2; //n * (n+1)/2 = N
            if(n == coinsUsed){
                return mid;
            }else if(n<coinsUsed){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins1(n));
        System.out.println(arrangeCoins2(n));
    }
}


/*
 
You have n coins and you want to build a staircase with these coins. 
The staircase consists of k rows where the ith row has exactly i coins. 
The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:

+-----------+
| * |   |   |
+-----------+
| * | * |   |
+-----------+
| * | * | - |
+-----------+

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:

+---------------+
| * |   |   |   |
+---------------+
| * | * |   |   |
+---------------+   
| * | * | * |   |
+---------------+
| * | * | - | - |
+---------------+

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 */