package DSA.Hashing;

import java.util.*;

public class countFreqArr {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10 ,5};                           
        Map<Integer, Integer> map = new HashMap<>();                 

        for(int num: arr) {                                          
            map.put(num, map.getOrDefault(num,0 ) + 1); 
        }                                                            
        // (10, 0+1) => (10, 1) -> (10, 2) -> (10, 3) ;
        // (5, 0+1) => (5, 1) -> (5, 2) ; 
        // (15, 0+1) => (15, 1) ;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //getValue() => When iterating through a map, used to retrieve the value associated with the current key-value pair (entry) in the loop.
        //getKey() => When iterating through a map, used to retrieve the key associated with the current entry.
        //entrySet() => it returns a Set of Map.Entry objects. Each Map.Entry object represents a key-value pair in the map.

    }
}
    /*
    * 1.A HashMap named map is created to store the frequency of each element. 
    * The keys in this map will be the unique elements from the array, and the values will be the counts of each element.
    * 
    * 2.In this loop, each element num in the array is processed. 
    * The map.getOrDefault(num, 0) statement retrieves the current count of num from the map. 
    * If num is not already in the map, it defaults to 0. 
    * Then, map.put(num, map.getOrDefault(num, 0) + 1) is used to update the count of num in the map.
    * 
    * 3.This loop iterates through the entries (key-value pairs) in the HashMap. 
    * For each entry, it prints the key (element) and its corresponding value (frequency) to the console.
    */