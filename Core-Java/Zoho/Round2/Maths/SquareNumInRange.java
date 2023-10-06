package Zoho.Round2.Maths;

public class SquareNumInRange {
    public static void main(String[] args) {
        int a = 20;
        int b = 200;

        printSquareNumbersInRange(a, b);
    }

    public static void printSquareNumbersInRange(int a, int b) {
        if(b<=200){
            for (int num = a; num <= b; num++) {
                if (isPerfectSquare(num)) {
                    System.out.print(num + " ");
                }
            }
        }else{
            System.out.println("Limit exceeded");
        }
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}

