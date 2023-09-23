package DSA.Recursion;

public class Factorial{

    static int fact_1(int n){
        int num = n;
        if(num == 0){
            return 1;
        }else{
            return n * fact_2(n-1);
        }
    }
    static int fact_2(int n){
        int num = 1;
        for(int i = 1;i<=n;i++){
            num = num * i;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(fact_1(5));
        System.out.println(fact_2(7));
    }
}