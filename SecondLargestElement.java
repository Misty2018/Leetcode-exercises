package Facebook_Leetcode;

public class SecondLargestElement {
    public int secondLargest (int nums[]){

        if (nums.length < 2){
            return 0;
        }

        int first = Integer.MIN_VALUE; int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= first){
                second = first;
                first = nums[i];
            } else if(nums[i] > second && nums[i] < first){
                second = nums[i];
            }
        }

        return second;
    }

    public static void main(String[] args){
        SecondLargestElement object = new SecondLargestElement();
        int[] nums = new int[]{9, 14, 8, 45, 100};
        System.out.println(object.secondLargest(nums));
    }
}
