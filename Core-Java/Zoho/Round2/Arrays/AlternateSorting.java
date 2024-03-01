package Zoho.Round2.Arrays;
import java.util.Arrays;

public class AlternateSorting {

    public static int[] alternateSort(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] result = new int[n];
        int start = 0; 
        int end = n - 1; 

        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                result[i] = arr[end];
                end--;
            } else {
                result[i] = arr[start];
                start++;
            }
        }
        return result;
    }

    static void alternate(int[] arr) {
        Arrays.sort(arr);
		int n = arr.length - 1;
		int i = 0;
		int j = n;
		while(i<j) {
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] + " ");
		}
		if(n%2==0) {
			System.out.print(arr[i]);
		}
	}

    public static void main(String[] args) {
        int[] inputArray = {10,20,100,50,70,90,40,30};
        int[] resultArray = alternateSort(inputArray);
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Output Array: " + Arrays.toString(resultArray));

        alternate(inputArray);
    }
}

/*
Alternate sorting: Given an array of integers,
rearrange the array in such a way that the first
element is first maximum and second element is
first minimum.
Eg.) Input : {1, 2, 3, 4, 5, 6, 7}
Output : {7, 1, 6, 2, 5, 3, 4}
 */