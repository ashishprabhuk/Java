package Zoho.Round2.Arrays;
import java.util.*;

class RadixSort {
    static int getMax(int arr[]) {
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void countSort(int arr[], int exp) {
        int n = arr.length;
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        int output[] = new int[n];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void radixSort(int arr[]) {
        int m = getMax(arr);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        radixSort(arr);
        print(arr);
    }
}



/*
to sort numbers based on
digits starting from most significant numbers. Eg:
input-100 1 11 21 2 3. Output-1 100 11 2 21 3
 */