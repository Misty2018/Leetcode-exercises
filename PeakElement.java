package Facebook_Leetcode;

public class PeakElement {

    public int findPeakElement(int[] nums) {
        int start = 0; int end = nums.length-1;
        int middle=0;
        while(start + 1 < end){
            middle = start + (end-start)/2;
            if((middle == 0 || nums[middle]>= nums[middle+1]) && (middle == end || nums[middle]>= nums[middle-1])){
                return middle;
            } else if(middle >0 && nums[middle-1] > nums[middle]){
                end = middle -1;
            } else{
                start = middle +1;
            }
        }
        return middle;

    }
}
