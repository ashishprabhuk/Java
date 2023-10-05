package Zoho.Round2.Maths;

public class ThresholdCount {
    public static void main(String[] args) {
        int[] array = {5, 8, 10, 13, 2, 2};
        int threshold = 5;

        int totalCount = calculateThresholdCount(array, threshold);
        System.out.println("Count = " + totalCount);
    }

    public static int calculateThresholdCount(int[] array, int threshold) {
        int totalCount = 0;

        for (int num : array) {
            int count = 0;

            while (num > 0) {
                if (num >= threshold) {
                    count += num / threshold;
                    num = num % threshold;
                } else {
                    count++;
                    num = 0;
                }
            }

            totalCount += count;
        }

        return totalCount;
    }
}

/*  

Given an array and a threshold value find the o/p
eg) i/p {5,8,10,13,6,2} ; threshold = 3;
o/p count = 17
explanation:
    Number   parts  counts
    5       {3,2}     2
    8      {3,3,2}    3
    10    {3,3,3,1}   4
    13   {3,3,3,3,1}  5
    6       {3,3}     2
    2        {2}      1
 */
