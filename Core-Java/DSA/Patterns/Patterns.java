package DSA.Patterns;

// import java.util.Scanner;

public class Patterns {

    static void pat1(int n){
        System.out.println("Pattern - 1 :-");
        for(int row = 1; row <= n; row++) {             // Pattern - 1 :-  
            for(int col = 1; col <= n ; col++){         // * * * * *
                System.out.print("* ");               // * * * * *
            }                                           // * * * * *
            System.out.println();                       // * * * * *
        }                                               // * * * * *
    }

    
    static void pat2(int n){
        System.out.println("Pattern - 2 :-");
        for(int row = 1; row <= n; row++) {             // Pattern - 2 :-  
            for(int col = 1; col <= row ; col++){       // * 
                System.out.print("* ");               // * *
            }                                           // * * *
            System.out.println();                       // * * * *
        }                                               // * * * * *
    }


    static void pat3(int n){
        System.out.println("Pattern - 3 :-");         // Pattern - 3 :- 
        for(int row = 1; row <= n; row++) {             // * * * * *    (5 - 1 + 1) = 5
            for(int col = 1; col <= n-row+1; col++){    // * * * *      (5 - 2 + 1) = 4
                System.out.print("* ");               // * * *        (5 - 3 + 1) = 3
            }                                           // * *          (5 - 4 + 1) = 2
            System.out.println();                       // *            (5 - 5 + 1) = 1
        }                                              
    }


    static void pat4(int n){ //column no. is printed in each column
        System.out.println("Pattern - 4 :-");                                    
        for(int row = 1; row <= n; row++) {                 // Pattern - 4 :-  
            for(int col = 1; col <= row ; col++){           // 1                                         
                System.out.print(col + " ");                // 1 2          
            }                                               // 1 2 3      
            System.out.println();                           // 1 2 3 4    
        }                                                   // 1 2 3 4 5     
    }


    static void pat5(int n){ //column no. is printed in each column 
        System.out.println("Pattern - 5 :-");                 //pattern - 5 :-                  
        for (int row = 0; row < 2 * n; row++) {                 //*
            int totalColsInRow = row > n ? 2 * n - row: row;    //**
            for (int col = 0; col < totalColsInRow; col++) {    //***
                System.out.print("* ");                       //**** 
            }                                                   //*****
            System.out.println();                               //****
        }                                                       //***                            
                                                                //**
    }                                                           //*                 
    
    
    static void pat6(int n){ //column no. is printed in each column 
        System.out.println("Pattern - 6 :-");                 //pattern - 5 :-                  
        for (int row = 1; row <= n; row++) {                    //    *
            int col1;                                           //   **
            for (col1 = 1; col1 <= n-row ; col1++) {            //  ***
                System.out.print(" ");                        // ****
            }                                                   //*****
            for(int col2 = 1; col2 <= n-col1+1 ; col2++){
                    System.out.print("*");
            }                                                
        System.out.println();                              
        }                                                                                                                                         
    } 
    

    static void pat7(int n){ //column no. is printed in each column 
        System.out.println("Pattern - 8 :-");                 //pattern - 7 :-                  
        for (int row = 1; row <= n; row++) {                    //1
            for(int col = 1; col <= row ; col++){               //22
                System.out.print((row + 1)-1);                  //333
            }                                                   //4444
        System.out.println();                                   //55555                          
        }                                                                                                                                         
    } 


    static void pat8(int n){ //column no. is printed in each column 
        System.out.println("Pattern - 7 :-");                 //pattern - 8 :-                  
        for (int row = 1; row <= n; row++) {                    //12345
            for(int col = 1; col <= (n+1)-row ; col++){         //1234
                System.out.print((col + 1)-1);                  //123
            }                                                   //12
            System.out.println();                               //1                             
        }                                                                                                                                         
    } 


    static void pat9(int n){ //column no. is printed in each column 
        System.out.println("Pattern - 7 :-");                 
        for (int row = 1; row <= n; row++) { 
            int col1;
            for(col1 = 1; col1 < n - row +1; col1++){
                System.out.print(" ");                        //Pattern - 9:-
            }                                                   //    *
            for(int col2 = 1; col2 <= 2*row-1 ; col2++){        //   ***
                System.out.print("*");                        //  *****
            }                                                   // *******
            System.out.println();                               //*********                          
        }                                                                                                                                         
    }


    static void pat10(int n){                                   //patter -10 :-
        System.out.println("Pattern - 10:-");                 //*********
        for(int row = 1; row<=n; row++){                        // *******
            int size = row-1;                                   //  *****
            for(int col1 = 1; col1<=size;col1++){               //   ***
                System.out.print(" ");                        //    *
            }
            for(int col2 = 1;col2<=2*n-(2*row-1);col2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pat11(int n){   
        n -= 1;                                                  //patter -11 :-
        System.out.println("Pattern - 11:-");                  //     *
        for(int row = 1; row<=2*n; row++){                       //    ***     
            int cols1 = (row > n)? row-n-1 : n-row;              //   *****
            for(int col1 = 1; col1<=cols1;col1++){               //  *******
                System.out.print(" ");                         // *********
            }                                                    // *********  
            int col2 =1;                                         //  *******
            int cols2 = (row >n)?(2*n-(2*row-n)+1)+n:2*row-1;    //   ***** 
            for(col2 = 1;col2<=cols2;col2++){                    //    ***
                System.out.print("*");                         //     *
            }                                                   
            System.out.println();                               
        }
    }


    static void pat12(int n){                                    //patter -12 :-
        System.out.println("Pattern - 12:-");                  //         1
        for(int row = 1; row<=n; row++){                         //       2 1 2 
            int col1;                                            //     3 2 1 2 3      
            for(col1=1;col1<=n-row;col1++){                      //   4 3 2 1 2 3 4
                System.out.print("  ");                        // 5 4 3 2 1 2 3 4 5
            }
            int col2;
            for(col2 =1;col2<=n-col1+1;col2++){
                int item = row-col2+1;
                System.out.print(item+" ");
            }
            for(int col3=2;col3<=row;col3++){
                System.out.print(col3+" ");
            }
            System.out.println();
        }
    }


    static void pat13(int n){        //n=4                             //patter -12 :-
        System.out.println("Pattern - 13:-");                  //         1
        for(int row = 1; row<=2*n-1; row++){                         //       2 1 2 
            for(int col=1;col<=2*n-1;col++){
                int i = (row>1 && col>1 && row<2*n-1 && col<2*n-1)?(row>2 && row<2*n-2 && col>2 && col<2*n-2)?(row>3 && row<2*n-3 && col>3 && col<2*n-3)?n-3:n-2:n-1:n;                      //   4 3 2 1 2 3 4
                System.out.print(i+" ");                        // 5 4 3 2 1 2 3 4 5
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter N:");
        // int n = sc.nextInt();
        // pat1(n);
        // pat2(n);
        // pat3(n);
        // pat4(n);
        // pat5(n);
        // pat6(n);
        // pat7(n);
        // pat8(n);
        // pat9(n);
        // pat10(n);
        // pat11(n);
        // pat12(5);
        // pat12(4);
        pat13(4);
    }
}
