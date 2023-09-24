package DSA.Hashing;

import java.util.*;

public class arrCount {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10 ,5};                           
        Map<Integer, Integer> map = new HashMap<>();                 

        for(int num: arr) {                                          
            map.put(num, map.getOrDefault(num,0 ) + 1); // (10, 0+1) => (10, 1) -> (10, 2) -> (10, 3) ;
        }                                                            // (5, 0+1) => (5, 1) -> (5, 2) ; 
                                                                     // (15, 0+1) => (15, 1) ;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
