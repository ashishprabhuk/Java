package Zoho.Round2.Maths;

public class ReverseAndAdd {
    public static void main(String[] args) {
        // int num = 39;
        int num = 765;
        int palin = reverseAndAdd(num);
        if(isPalindrome(palin)){
            System.out.println("Its is palindrome: " + palin);
        }else{
            System.out.println("no");
        }
    }

    static void helper(int num){
        System.out.println(reverseAndAdd(num));
    }
    
    public static int reverseAndAdd(int num) {
        int i = 0;
        while (i < 5) {
            int reversedNum = reverse(num);
            if (isPalindrome(num + reversedNum)) {
                return num + reversedNum;
            }
            num += reversedNum;
            i++;
        }
        return num;
    }

    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        return reversedNum;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
}

/*
 * 
 * @Take a 2 or 3 digit input number,
 * reverse it and add it to the original number until
 * the obtained number is a palindrome or 5
 * iterations are completed.
 * Input : n = 32
 * Output : 55
 * 23 + 32 = 55 which is a palindrome.
 * Input : 39
 * Output : 363
 */