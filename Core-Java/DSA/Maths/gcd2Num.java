package DSA.Maths;

public class gcd2Num {
    static int gcd(int a, int b){
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;  // if condition satisfies it(breaks) exits the loop
            }
            result--;
        }
        // Return gcd of a and b
        return result;
    }
    public static void main(String[] args) {
        System.out.println(gcd(98,56));
    }
}
