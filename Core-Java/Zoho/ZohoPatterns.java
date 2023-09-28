package Zoho;

public class ZohoPatterns {
    static void pattern_1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                int top = row;
                int bottom = col;
                int right = n -col+1;
                int left = n -row+1;
                System.out.print(Math.max(Math.max(right, left),Math.max(top,bottom)) + "");
            }
            System.out.println();
        }
    }
    static void pattern_2(int n){
        for(int row = 0; row < 2*n-1; row++){
            for(int col = 0; col < 2*n-1; col++){
                int top = row;
                int bottom = col;
                int right = (2*n-2)-col;
                int left = (2*n-2)-row;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(right, left)) + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern_2(4);
    }
}
