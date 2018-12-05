public class RemoveElement {

    /*
    Given an array nums and a value val, remove all instances of that value in-place and return the new length.
    */


    public int removeElement(int[] nums, int val) {
        if(nums== null || nums.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;

            }
        }
        return i;
    }
}
