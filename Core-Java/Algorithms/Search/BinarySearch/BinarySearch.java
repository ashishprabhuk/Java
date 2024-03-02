package Algorithms.Search.BinarySearch;
import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Check if the target is equal to the middle element
            if (arr[mid] == target) {
                return mid; // Return the index where the target element is found
            }
            // If the target is greater, ignore the start half
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // If the target is smaller, ignore the end half
            else {
                end = mid - 1;
            }
        }
        return -1; // Return -1 if the target element is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = { 2,1,4,3};
        Arrays.sort(arr);
        int target = 3;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

/*  
 * This algorithm works by repeatedly dividing the sorted array in half until the 
 * desired element is found or the entire array has been searched.
 * 
 * The binary search algorithm has a time complexity of O(log n), where n is the size of the array. 
 * This is significantly faster than the linear search algorithm, which has a time complexity of O(n).
 */

 /*
  * Binary search is a powerful algorithm that can be used in various scenarios where the data is sorted. Here are some common cases where binary search can be applied:

1. **Searching in Sorted Arrays**: As demonstrated in the provided example, binary search is commonly used to search for a specific element in a sorted array. It works by repeatedly dividing the search interval in half until the target element is found or the search space is exhausted.

2. **Finding an Element in a Sorted List or Array**: Binary search can be used to find the position of a specific element in a sorted list or array. This can be useful in scenarios such as searching for a word in a dictionary or searching for a name in a sorted list of names.

3. **Searching in Trees and Graphs**: In certain tree structures such as binary search trees (BSTs), binary search can be used to efficiently search for a node with a specific key. Similarly, binary search can also be applied to search algorithms in graphs, such as finding the shortest path in a graph with sorted edge weights.

4. **Checking Monotonicity or Property**: Binary search can be used to check whether a certain property holds true in a monotonic function or a sorted sequence. For example, determining the threshold in a sorted sequence where a property changes from false to true.

5. **Finding Peak Element**: Binary search can be used to find a peak element in an array. A peak element is an element that is greater than or equal to its neighbors. By comparing the middle element with its neighbors, binary search can efficiently narrow down the search space to find a peak element.

6. **Finding Rotation Point in Rotated Sorted Array**: In a rotated sorted array (an array that has been rotated at some pivot), binary search can be used to find the rotation point or the pivot element. Once the rotation point is found, the array can be split into two sorted subarrays, allowing for further binary search operations.

7. **Finding Maximum/Minimum Value in a Sorted Array**: Binary search can be used to find the maximum or minimum value in a sorted array by repeatedly comparing elements and adjusting the search interval accordingly.

These are just a few examples of the many cases where binary search can be applied effectively. It is a versatile algorithm that is widely used in various domains including computer science, mathematics, and engineering.
  */