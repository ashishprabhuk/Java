package Zoho.Round2.Arrays;

public class ThresholdCount {
    public static void main(String[] args) {
        int[] array = {5, 8, 10, 13, 6, 2};
        int threshold = 3;

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
@explanation:
    Number   parts  counts
    5       {3,2}     2
    8      {3,3,2}    3
    10    {3,3,3,1}   4
    13   {3,3,3,3,1}  5
    6       {3,3}     2
    2        {2}      1
 */
