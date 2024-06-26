package Zoho.Round2.Arrays;
import java.util.*;

class AppearOnce {
    static int findSingleOccurrence_BF(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(num == arr[j]){
                    count++;
                }
            }
            if(count==1) return arr[i];
        }
        return -1;
    } 

	static int findSingleOccurrence_BA(int[] arr){ //BA-better Approach
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : arr){
            map.put(i, map.getOrDefault(i,0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1)
                return entry.getKey();
		}
		return -1;
	}

    public static int findSingleOccurrence_OP(int []arr) {
        int xor = 0; // XOR all the elements:
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
	public static void main(String[] args){
		int arr[] = {3,1,2,1,2}; // => 3
		System.out.println("Only One Occurrence: " + findSingleOccurrence_BF(arr));
		System.out.println("Only One Occurrence: " + findSingleOccurrence_BA(arr));
		System.out.println("Only One Occurrence: " + findSingleOccurrence_OP(arr));
	}
}

 0 0 = 0 
 1 1 = 0
 0 1 = 1
 1 0 = 1