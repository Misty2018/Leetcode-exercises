package Facebook_Leetcode;


//  O(row log(col))

//public class LeftMostOne {
//
//    private int[] leftMostOne(int[][] nums){
//        int row = nums.length;// numbers of rows
//        int col = nums[0].length; //numbers of columns;
//        int[] result = new int[2];
//
//        if (row==0){
//            return result;
//        }
//
//        for (int i = 0; i < row; i++){
//            int j = helper(nums[i]); // column of index
//            if (j <= col){
//                result[0] = i;
//                result[1] = j; // result = {i, j};
//                col = j;
//            }
//        }
//        return result;
//
//
//
//    }
//
//    private int helper(int[] nums){
//        int start = 0; int end = nums.length; int mid;
//        while (start + 1 < end){
//            mid = start + (end - start)/2;
//            if (nums[mid] == 0){
//                start = mid;
//            } else if (nums[mid] == 1){
//                end = mid;
//            }
//
//        }
//
//        if (nums[start] == 1)
//            return start;
//
//
//        if (nums[end] == 1)
//            return end;
//
//
//    }
//}
