package Facebook_Leetcode;

/*
1) everytime check if targe == nums[mid], if so, we find it.
2) otherwise, we check if the first half is in order (i.e. nums[left]<=nums[mid])
  and if so, go to step 3), otherwise, the second half is in order,   go to step 4)
3) check if target in the range of [left, mid-1] (i.e. nums[left]<=target < nums[mid]),
    if so, do search in the first half, i.e. right = mid-1; otherwise, search in the second half left = mid+1;
4)  check if target in the range of [mid+1, right] (i.e. nums[mid]<target <= nums[right]),
    if so, do search in the second half, i.e. left = mid+1; otherwise search in the first half right = mid-1;
 */



/*
The only difference is that due to the existence of duplicates, we can have nums[left] == nums[mid] and in that case,
the first half could be out of order (i.e. NOT in the ascending order,
e.g. [3 1 2 3 3 3 3]) and we have to deal this case separately.
In that case, it is guaranteed that nums[right] also equals to nums[mid],
so what we can do is to check if nums[mid]== nums[left] == nums[right] before the original logic,
and if so, we can move left and right both towards the middle by 1. and repeat.
 */

public class SearchinRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //If we know for sure right side is sorted or left side is unsorted
            if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                //If we know for sure left side is sorted or right side is unsorted
            } else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                //If we get here, that means nums[start] == nums[mid] == nums[end], then shifting out
                //any of the two sides won't change the result but can help remove duplicate from
                //consideration, here we just use end-- but left++ works too
            } else {
                end--;
            }
        }

        return false;
    }



}
