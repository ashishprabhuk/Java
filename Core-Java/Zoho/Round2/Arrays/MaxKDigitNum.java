package Zoho.Round2.Arrays;
import java.util.*;
/*
Given an array of numbers and a number k. Print
the maximum possible k digit number which can be formed using given numbers.
INPUT :
Enter the array size : 6
Enter the elements : 1 4 89 73 9 7
Enter number of digits : 5
OUTPUT :
98973
*/
public class MaxKDigitNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        // Create an array to store elements
        int[] arr = new int[size];

        // Input the elements of the array
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number of digits (k)
        System.out.print("Enter number of digits: ");
        int k = scanner.nextInt();

        // Call the findMaxKDigitNumber function to compute the result
        String maxKDigitNumber = findMaxKDigitNumber(arr, k);

        // Output the result
        System.out.println("OUTPUT:");
        System.out.println(maxKDigitNumber);
        scanner.close();
    }

    public static String findMaxKDigitNumber(int[] arr, int k) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Create a StringBuilder to build the result
        StringBuilder maxKDigitNumber = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];

            // Check if the current number is within k digits
            if (num < Math.pow(10, k)) {
                maxKDigitNumber.insert(0, num); // Append the number to the result
                k -= countDigits(num); // Reduce k by the number of digits in the current number
            }

            // If k becomes zero, we have found the maximum k-digit number
            if (k == 0) {
                break;
            }
        }

        // Convert the StringBuilder to a String and return
        return maxKDigitNumber.toString();
    }

    // Helper function to count the number of digits in a number
    public static int countDigits(int num) {
        if (num == 0) {
            return 1; // 0 has one digit
        }

        int count = 0;
        while (num != 0) {
            num /= 10; // Divide by 10 to remove the last digit
            count++;
        }

        return count;
    }
}






/*
Certainly! Let's go through the code step by step:

1. The `MaxKDigitNum` class is defined, which contains the `main` method and the `findMaxKDigitNumber` method.

2. In the `main` method, a `Scanner` object is created to read input from the user.

3. The user is prompted to enter the size of the array.

4. An array `arr` of size `size` is created to store the elements.

5. The user is prompted to enter the elements of the array.

6. The user is prompted to enter the number of digits `k`.

7. The `findMaxKDigitNumber` method is called with the array `arr` and `k` as arguments, and the result is stored in a `String` variable `maxKDigitNumber`.

8. The result is printed as output.

9. The `scanner` object is closed to release system resources.

10. The `findMaxKDigitNumber` method takes the array `arr` and the number of digits `k` as input.

11. The array `arr` is sorted in ascending order using the `Arrays.sort` method.

12. A `StringBuilder` object `maxKDigitNumber` is created to build the result.

13. The method iterates through the sorted array in reverse order.

14. For each element `num` in the array, it checks if `num` is less than `10^k`, which means it has `k` or fewer digits.

15. If the condition is true, the `num` is appended to the beginning of `maxKDigitNumber` using the `insert` method of `StringBuilder`.

16. The value of `k` is reduced by the number of digits in `num` using the `countDigits` helper method.

17. If `k` becomes zero, it means we have found the maximum k-digit number, so the loop is terminated using the `break` statement.

18. Finally, the `maxKDigitNumber` is converted to a `String` using the `toString` method of `StringBuilder` and returned as the result.

19. The `countDigits` method takes an integer `num` as input and counts the number of digits in `num`.

20. If `num` is zero, it returns 1 since zero has one digit.

21. Otherwise, it initializes a variable `count` to 0 and divides `num` by 10 in each iteration to remove the last digit. The `count` is incremented in each iteration.

22. The method continues the loop until `num` becomes zero.

23. Finally, it returns the value of `count`, which represents the number of digits in `num`.

*/



