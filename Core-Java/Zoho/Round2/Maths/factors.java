package Zoho.Round2.Maths;

public class factors {

    static void factor(int n){
        for(int i = 1; i <= n; i++)
			if(n % i == 0)
				System.out.print(i + " ");
			
		System.out.println();
    }

    public static void main(String[] args) {
        factor(36);
    }
}
