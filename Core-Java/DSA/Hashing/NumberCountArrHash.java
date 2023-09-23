package DSA.Hashing;

import java.util.*;

class NumberCountArrHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = precomputeHash(arr);

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(fetchCount(hash, number));
        }
    }

    // Function to precompute the hash array
    static int[] precomputeHash(int[] arr) {
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        return hash;
    }

    // Function to fetch the count from the hash array
    static int fetchCount(int[] hash, int number) {
        return hash[number];
    }
}

