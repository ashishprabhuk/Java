package Zoho.Round2.Strings;

import java.util.*;

public class Union {
    public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,10};
		int[] arr2 = {2,3,4,5,6,7,8,9,21};
		
        findUnion_Set(arr1,arr2);

        System.out.println();
        
        findUnion_Map(arr1, arr2);

        System.out.println();
        
        ArrayList<Integer> union = findUnion_OP(arr1, arr2);
        for (int val : union) {
            System.out.print(val + " ");
        }
	}

	static void findUnion_Set(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        Set<Integer> arr = new HashSet<>();
        for(int i = 0; i<n; i++)
            arr.add(arr1[i]);
        for(int i = 0; i<m; i++)
            arr.add(arr2[i]);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // System.out.print(arr);
	}

    static void findUnion_Map(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
			map.put(arr1[i], i);
		for (int i = 0; i < m; i++) 
			map.put(arr2[i], i);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // mp will contain only distinct elements from arr1 & arr2
			System.out.print(entry.getKey() + " ");
		}
	}

    static ArrayList<Integer> findUnion_OP(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0; // two pointers
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) { // Add the smaller element to the union list.
                addUnique(union, arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) { // Add the smaller element to the union list.
                addUnique(union, arr2[j]);
                j++;
            } else { // Both elements are equal, add one to the union list.
                addUnique(union, arr1[i]);
                i++;
                j++;
            }
        }
        while (i < n) { // one of the arrays may still have remaining elements.
            addUnique(union, arr1[i]); // Add any remaining elements from arr1 to the union.
            i++;
        }
        while (j < m) { // one of the arrays may still have remaining elements.
            addUnique(union, arr2[j]); // Add any remaining elements from arr2 to the union.
            j++;
        }
        return union;
    }
    static void addUnique(ArrayList<Integer> union, int value) {
        if (union.isEmpty() || union.get(union.size() - 1) != value) {
            union.add(value);
        }
    }
}
