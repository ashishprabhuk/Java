package Zoho.Round2.Maths;

public class palindrome {
    static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            int digit = x%10;
            rev = rev*10 + digit;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(2143));
        System.out.println(isPalindrome(010));
        System.out.println(isPalindrome(737));
    }
}
