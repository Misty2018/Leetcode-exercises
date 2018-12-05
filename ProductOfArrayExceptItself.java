package Facebook_Leetcode;

public class ProductOfArrayExceptItself {

    public static void main(String[] args){
        ProductOfArrayExceptItself o = new ProductOfArrayExceptItself();
        int[] a = o.arrayProduct(new int[]{2, 3,4,4});

    }
    // o(n) o(1)
    private static int[] arrayProduct(int[] nums){
        if (nums.length == 0 || nums == null) return null;

        int[] result = new int[nums.length];
        result[0]= 1;
        for (int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }

        return result;

    }
}
