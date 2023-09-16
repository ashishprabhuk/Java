package DSA.Patterns;

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

    public static void main(String[] args) {
        // pat1(5);
        // pat2(5);
        // pat3(5);
        // pat4(5);
        // pat5(5);
        // pat6(5);
        // pat7(5);
        // pat8(5);
        // pat9(5);
        pat10(5);
    }
}