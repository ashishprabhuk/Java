package Zoho.Round2.Arrays;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,3,2,7};
        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
        findExcept(arr1, arr2);

        printUnion(arr1, arr2);
        System.out.println();
        printIntersection(arr1, arr2);
    }
    static void findUnion(int[] arr1, int[] arr2){
        Set<Integer> union = new HashSet<>();
        for (Integer element : arr1) {
            union.add(element);
        }
        for (Integer element : arr2) {
            union.add(element);
        }
        System.out.println("Union of arrays: " + union);
    }
    static void findIntersection(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer element : arr1) {
            set1.add(element);
        }
        for (Integer element : arr2) {
            set2.add(element);
        }
        Set<Integer> intersection = new HashSet<>();
        for (Integer element : set1) {
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }
        System.out.println("Intersection of arrays: " + intersection);
    }
    static void findExcept(int[] arr1, int[] arr2){
        List<Integer> except = new ArrayList<>();
        for (int num : arr1) {
            if (num % 2 != 0) {
                except.add(num);
            }
        }
        for (int num : arr2) {
            if (num % 2 == 0) {
                except.add(num);
            }
        }
        System.out.println("Except: " + except);
    }

    static void printUnion(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        int prev = Integer.MIN_VALUE; // Initialize prev to a value not present in the arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (arr1[i] != prev) {
                    System.out.print(arr1[i] + " ");
                    prev = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (arr2[j] != prev) {
                    System.out.print(arr2[j] + " ");
                    prev = arr2[j];
                }
                j++;
            } else {
                if (arr1[i] != prev) {
                    System.out.print(arr1[i] + " ");
                    prev = arr1[i];
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (arr1[i] != prev) {
                System.out.print(arr1[i] + " ");
                prev = arr1[i];
            }
            i++;
        }
        while (j < m) {
            if (arr2[j] != prev) {
                System.out.print(arr2[j] + " ");
                prev = arr2[j];
            }
            j++;
        }
    }
    static void printIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        int prev = Integer.MIN_VALUE;
        while(i<n && j<m) {
            if(arr1[i]<arr2[j]) {
                i++;
            }else if(arr1[i]>arr2[j]) {
                j++;
            }else {
                if(arr1[i] != prev) {    				
                    System.out.print(arr1[i]);
                }
                prev = arr1[i];
                i++;
                j++;
            }
        }
    }
}



/*
Find the union intersection of two list and also find
except (remove even elements from list1 and odd
elements from list2)

Input
List 1: 1,3,4,5,6,8,9
List 2: 1,5,8,9,2

Output
Union: 1,3,4,5,6,8,9,2
Intersection: 1,5,8,9
Except: 1, 3, 5,9, 8, 2
*/