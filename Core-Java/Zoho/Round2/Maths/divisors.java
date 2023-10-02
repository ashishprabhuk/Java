package Zoho.Round2.Maths;

public class divisors {

    static void div_1(int n){
        int num = n;
        // int div = 0;
        while(num!=0){
            if(n%num==0){
                System.out.print(num + " ");
            }
            num--;
        }
    }
    static void div_2(int n){
        for(int i = 1; i <= n; i++)
			if(n % i == 0)
				System.out.print(i + " ");
			
		System.out.println();
    }

    public static void main(String[] args) {
        // div(36);
        // div_1(36);
        div_2(36);
    }
}
