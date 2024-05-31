package Zoho.Round2.Maths;

public class IsPerfectSquare {
    static boolean isPerfectSquare1(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
    static boolean isPerfectSquare2(int num) {
        long start = 1, end = num;
        while(start<=end){
            long mid = start + (end-start)/2; //// to avoid overflow incase
            if(mid*mid==num) return true;
            else if(mid*mid<num){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare1(16));
        System.out.println(isPerfectSquare2(16));
    }
}

/*
Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 */
