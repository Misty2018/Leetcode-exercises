package Facebook_Leetcode;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        TwoSum object = new TwoSum();
        int[] a = new int[]{2,4,6,7,9};
        int[] b = object.twoSum(a, 9);
        for (int i = 0; i<b.length; i++)
        System.out.print(b[i] +" ");
    }

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[]{0,0}; //{2,5,6,7,9}
        // key in the hm is numbers in int array, value is the corresponding position/index
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        //corner case
        if(nums == null || nums.length<=2){
            return nums;
        }

        for(int i = 0; i< nums.length; i++){
            if (hm.containsKey(target - nums[i])){
                result[1] = i;
                result[0]= hm.get(target-nums[i]);
            }

            hm.put(nums[i], i);

        }

        return result;

    }
}
