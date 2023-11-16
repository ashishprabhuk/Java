package Basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>(); //order is not guaranteed
        // LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); // order is guaranteed
        int[] arr = {8,3,0,0,8,0,3,0,5,5};
        getOrDefault_1(arr, map);
        entries(map);
    }
    //getOrDefault - used to get the value mapped with specified key. 
    //If no value is mapped with the provided key then the default value is returned.
    static void getOrDefault_1(int[] arr, Map<Integer,Integer> map){
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
    }
    static void getOrDefault_2(int[] arr, Map<Integer,Integer> map){
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] ,map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
    }

    static void entries(Map<Integer, Integer> map){
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key = entry.getKey();
        int value = entry.getValue();

        // Now you can do something with the key and value
        System.out.println("Key: " + key + ", Value: " + value);
        //This loop iterates through each entry in the map, and for each entry,
        //it retrieves the key and value using getKey() and getValue() methods of the Map.Entry
    }
    }
    
    
}
