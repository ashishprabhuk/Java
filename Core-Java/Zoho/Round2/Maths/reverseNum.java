package Zoho.Round2.Maths;

public class reverseNum {
    static int rev(int n){
        int rev = 0;
        while(n!=0){
            int digit = n%10;  // % gives the last number -> 123%10 = 3 ; 12%10 = 2 ; 1%10 = 1
            rev = rev*10+digit; //0*10+3 = 3 ; 3*10+2=32 ; 32*10+1 = 321
            n = n/10; // 123/12 = 12 ; 12/10 = 1 ; 1/10 = 0
        }
        if (rev > Math.pow(-2,31) || rev < Math.pow(2,31)) return 0; // making the code only works for signed 32-bit integers
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(rev(2403));
        System.out.println(rev(2143));
    }
}
