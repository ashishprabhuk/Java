package Zoho.Round2.Maths;

public class Sqrt {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(mySqrt_BF(n));
        System.out.println(mySqrt_OP(n));
    }
    static int mySqrt_BF(int x) {
        return (int) Math.sqrt(x);

    }
    public static int mySqrt_OP(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return (int) end;
    }
}
