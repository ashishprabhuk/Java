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
    
    public static void main(String[] args) {
        pattern_1(6);
    }
}
