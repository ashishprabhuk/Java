package DSA.Recursion;

public class print_N_numbers {
    static int sum=0;
    static void print(int i, int n){
        sum+=i;
        if(i==n){
            System.out.println(sum);
            return;
        }
        print(i+1,10);
    }
    public static void main(String[] args) {
        print(1, 5);
    }
}
