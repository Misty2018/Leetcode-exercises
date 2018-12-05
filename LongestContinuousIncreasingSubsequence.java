package Facebook_Leetcode;

public class LongestContinuousIncreasingSubsequence {

    public int findLongestCIS(int[] nums){
        int result = 0;
        int current = 0;
        for (int i = 0; i<nums.length; i++){
            if (i == 0 || nums[i - 1] < nums[i]){
                result = Math.max(result, ++ current);
            } else{
                current = 1;
            }
        }

        return result;
    }
}
