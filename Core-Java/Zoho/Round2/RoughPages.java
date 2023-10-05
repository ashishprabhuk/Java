package Zoho.Round2;
import java.util.*;
public class RoughPages{
    static int[] merge(int[] arr1, int[] arr2 ){
        int[] comb = new int[arr1.length + arr2.length];
        int i = 0, j = 0, index = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                comb[index] = arr1[i];
                index++;
                i++;
            }else{
                comb[index] = arr2[j];
                index++;
                j++;
            }
        }
        while(i<arr1.length){
            comb[index] = arr1[i];
            index++;
            i++;
        }
        while(j<arr2.length){
            comb[index] = arr2[j];
            index++;
            j++;
        }
        return comb;
    }
    
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    
    static void bubble(int[] arr){
        for(int i = arr.length-1;i>0;i--){
            for(int j = 0; j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
    
	public static void main(String[] args) {
		int[] arr = {1,4,2,6,0,5,3};
		bubble(arr);
// 		int[] sort = mergesort(arr);
		// System.out.println(Arrays.toString(sort));
		System.out.println(Arrays.toString(arr));
		
}

}

