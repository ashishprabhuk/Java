package Zoho.Round2.Arrays;
import java.util.*;

public class LongestContinuousRange {
    public static List<List<Integer>> findContinuousRanges(int[] arr) {
        // most optimal solution.
        Arrays.sort(arr);
        List<List<Integer>> ranges = new ArrayList<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < arr.length) {
            start = end;
            while (end < arr.length - 1 && arr[end + 1] == arr[end] + 1) {
                end++;
            }
            List<Integer> range = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                range.add(arr[i]);
            }
            if(max<range.size()){
                max = Math.max(range.size(),max);
                ranges.clear();
                ranges.add(range);
            }else if(max == range.size()) 
                ranges.add(range);
            end++;
        }
        return ranges;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9,11,12,13};
        List<List<Integer>> ranges = findContinuousRanges(arr);

        for (List<Integer> range : ranges) {
            System.out.println(range);
        }
    }
}

/*
 * 
 * INPUT :
 * Enter array size : 8
 * Enter array elements : 1 3 10 7 9 2 4 6
 * OUTPUT :
 * 1 2 3 4
 * Ex. INPUT :
 * Enter array size : 8
 * Enter array elements : 1 3 9 7 8 2 4 6
 * OUTPUT :
 * 1 2 3 4
 * 6 7 8 9
 */