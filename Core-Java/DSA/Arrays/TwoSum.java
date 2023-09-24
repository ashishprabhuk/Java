package DSA.Arrays;
import java.util.*;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length-1;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    static int[] twoSum_hash(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {15,9,4,12,6}; // 15(0) + 6(4) = 21;
        // int[] ans = twoSum(arr,21);
        int[] ans = twoSum_hash(arr,21); //15(0) + 6(4) = 21 ; 9(1) + 12(3) = 21;
        if (ans.length == 2) {
            System.out.println("Indices of the two numbers whose sum is 21: " + ans[0] + ", " + ans[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
