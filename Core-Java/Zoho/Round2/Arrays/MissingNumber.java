package Zoho.Round2.Arrays;

class MissingNumber {
	static int missingNumber_OP1(int[] arr){
		int n = arr.length-1;
		int sum1 = (arr[n]*(arr[n]+1))/2; //Summation of first n numbers:
		int sum2=0;
		for(int i = 0; i < arr.length; i++){ //Summation of all array elements:
            sum2 += arr[i];
		}
        return sum1-sum2; 
	}
    static int missingNumUnSort(int[] arr){ // for unsorted array
        int n = arr.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[i]; 
        }
        return totalSum - sum;
    }
    public static int missingNumber_OP2(int []arr) { 
        int n = arr.length;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...n-1]
        }
        xor1 = xor1 ^ n; //XOR up to [1...n]
        return (xor1 ^ xor2);
    }
    
	public static void main(String[] args){
		int arr[] = {1,2,3,4,6,7,8,9};
		System.out.println("Missing num: " + missingNumber_OP1(arr));
		System.out.println("Missing num: " + missingNumber_OP2(arr));

        int[] arr1 = {9,6,4,2,3,5,7,0,1};
        // int[] arr1 = {0,1};
        // int[] arr1 = {3,0,1};
        System.out.println("Missing num: " + missingNumUnSort(arr1));
	}
}