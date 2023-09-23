package DSA.Recursion;

public class Fibonacci {
    static int fib(int n) { // F(4) = F(3) + F(2) = 2 + 1 = 3
        if(n==0||n==1){     // F(5) = F(4) + F(3) = 3 + 2 = 5
            return n;       // F(6) = F(5) + F(4) = 5 + 3 = 8
        }                   // F(7) = F(6) + F(5) = 8 + 5 = 13
        int f1=fib(n-1);
        int f2=fib(n-2);
        int nth=f1+f2;
        return nth;
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
