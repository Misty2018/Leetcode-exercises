package Facebook_Leetcode;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length==0 || nums==null){
            return -1;
        }
        int start = 0;
        int end = nums.length-1;

        while(start + 1 < end){
            int middle = (end-start)/2 + start;
            if(nums[middle] == target){
                return middle;
            }
            // the array from beginning, up to middle, is sorted.
            if(nums[start]< nums[middle]) {    // 4 5 6 7 0 1 2   3 4 5 6 7 1 2 ／／ first till middle is sorted

                if(target >= nums[start] && target<= nums[middle]){ // target is in the array starting from start end in middle
                    end = middle;
                } else // target is in the second part of array{
                    start = middle;
            } else{ // 4 5 6 0 1 2 3  // middle till end is sorted : middle < start
                if (target >= nums[middle]  && target <= nums[end]){ // target is in the array starting from middle
                    start = middle;
                } else end = middle;
            }


        }

        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;

    }

}
