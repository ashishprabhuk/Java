package DSA.Arrays;

public class ReverseArray {
    static void rev(int[] array){
        int arr[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            arr[i] = array[array.length-i-1];
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rev(arr);
    }
}
