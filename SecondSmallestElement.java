package Facebook_Leetcode;

public class SecondSmallestElement {
    public int secondSmallest(int nums[]){

        if (nums.length < 2){
            return 0;
        }

        int first = Integer.MAX_VALUE; int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < first){
                second = first;
                first = nums[i];
            } else if(nums[i] < second && nums[i] > first){
                second = nums[i];
            }
        }

        return second;
    }

    public static void main(String[] args){
        SecondSmallestElement object = new SecondSmallestElement();
        int[] nums = new int[]{9, 14, 8, 45, 100};
        System.out.println(object.secondSmallest(nums));
    }
}
