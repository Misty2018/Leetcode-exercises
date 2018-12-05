public class RemoveDuplicatesfromSortedArrayII {
    /*
    Given a sorted array nums, remove the duplicates in-place such that duplicates appeared
    at most twice and return the new length
     */

    public static void main(String[] args){
        RemoveDuplicatesfromSortedArrayII c = new RemoveDuplicatesfromSortedArrayII();
        int[] b = new int[]{4,4,6,6,6,7,8,9,9,9};
        int d= c.removeDuplicates(b);
        //for(int i=0; i<d.length; i++)
            //System.out. println("After removing, the result is " + d[i]);
        System.out. println("After removing, the result is " + d);


    }
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 2)  return nums.length;
        int i = 2;
        for (int j=2; j<nums.length; j++){
            if(nums[j] != nums[i - 2]){

                nums[i]= nums[j];
                i++;

            }
        }
        return i;

    }
}
