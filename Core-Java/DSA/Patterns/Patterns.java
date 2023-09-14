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
        System.out.println("Pattern - 4 :-");                 //pattern - 5 :-                  
        for (int row = 0; row < 2 * n; row++) {                 //*
            int totalColsInRow = row > n ? 2 * n - row: row;    //**
            for (int col = 0; col < totalColsInRow; col++) {    //***
                System.out.print("* ");                       //**** 
            }                                                   //*****
            System.out.println();                               //****
        }                                                       //***                            
                                                                //**
    }                                                           //*                 
                                                
                                            


    public static void main(String[] args) {
        // pat1(5);
        // System.out.println();
        // pat2(5);
        // pat3(5);
        // pat4(5);
        pat5(5);
    }
}
