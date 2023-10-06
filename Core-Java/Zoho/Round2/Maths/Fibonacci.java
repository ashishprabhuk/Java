package Zoho.Round2.Maths;

public class Fibonacci {                    // fib[1] = 0 + 0 = 0 ;
    static void fib(int n){                 // fib[2] = 1 + 0 = 1 ;
        if (n == 0 || n == 1){              // fib[3] = 1 + 1 = 2 ;
            System.out.println(n);          // fib[4] = 2 + 1 = 3 ;
        }else{                              // fib[5] = 3 + 2 = 5 ; 
            int[] fib = new int[n+1];       // fib[6] = 5 + 3 = 8 ; 
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <=n; i++){
                fib[i] = fib[i-1] + fib[i-2];
            }
            for(int i = 0 ; i <= n; i++){
                System.out.print(fib[i] + " ");
            }
            System.out.println();
        }                              
    }

    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    public static void main(String[] args) {
        fib(5);

        for (int i = 0; i <=10; i++) {
            System.out.print(fib1(i) + " ");
        }
    }
}
