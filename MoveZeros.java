package Facebook_Leetcode;
/*
Given an array nums, write a function to move all 0's to the end of it
while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

 */

public class MoveZeros {

    public static void main(String[] args){
        MoveZeros a  = new MoveZeros();
        int[] b = new int[]{0,1,0,3,12};
        int[] c = a.moveZeros(b);

        for (int i = 0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
    public int[] moveZeros(int[] array){
        int left = 0, right = 0;
        while(right < array.length){

            if (array[right] != 0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
            }

            right++;
        }

        return array;
    }


    //第二种方法是双指着压缩法：实际上就是将所有的非0数向前尽可能的压缩，最后把没压缩的那部分全置0就行了。比如103040，先压缩成134，剩余的3为全置为0。
    // 过程中需要一个指针记录压缩到的位置。
    //从前往后遍历数组，遇到一个非0数组，就往pos那个位置给填上，填完后pos就自增。然后外层循环的index也要自增。最后把pos之后的所有非0元素置为0：
    public void moveZeroes(int[] nums) {
        int pos = 0, index = 0;

        while (index < nums.length) {
            if (nums[index] != 0) {
                nums[pos++] = nums[index];
            }
            index++;
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }

}
