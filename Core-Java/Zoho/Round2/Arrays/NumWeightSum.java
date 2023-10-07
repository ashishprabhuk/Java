package Zoho.Round2.Arrays;

/*
 * Question
 *  Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

And sort the numbers based on the weight and print it as follows

<10,its_weight>,<36,its weight><89,its weight>

Should display the numbers based on increasing order.
 */
public class NumWeightSum {
    public static void main(String args[]) {
        int[] numArray = {10, 36, 54, 89, 12};

        int[] weights = calculateWeights(numArray);

        for (int i = 0; i < numArray.length; i++) {
            System.out.print("<" + numArray[i] + "," + weights[i] + ">");
            if (i < numArray.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static int[] calculateWeights(int[] numArray) {
        int len = numArray.length;
        int[] weights = new int[len];

        for (int i = 0; i < len; i++) {
            weights[i] = 0;
            int sq = (int) Math.sqrt(numArray[i]);
            if ((sq * sq) == numArray[i]) {
                weights[i] += 5;
            }
            if (numArray[i] % 4 == 0 || numArray[i] % 6 == 0) {
                weights[i] += 4;
            }
            if (numArray[i] % 2 == 0) {
                weights[i] += 3;
            }
        }
        return weights;
    }
}
