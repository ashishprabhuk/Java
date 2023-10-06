package Zoho.Round2.Maths;

public class prime {

    static boolean primes(int n){
        int num = n;
        if (num <= 1) {
            return false;
        }
        for(int i = 2; i*i < num; i++){
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primes(17));
        System.out.println(primes(19));
        System.out.println(primes(21));
    }
}
