public class TwoSum {
    public static void main (String[] args){
        //ways to invoke static and nonstatic methods;
        //static: using class name : TwoSum.twoSum(int 1, int2);
        //non-static: using object name(instance name)
        /*when to use them: when you are considering create a very specific instances, using non-static
           otherwise, if its a widely shared. use static.
           Note: static method can not access non static variable.
         */

        // TwoSum c = new TwoSum();
        //int d = c.twoSum(1,2);
        TwoSum object= new TwoSum();
        int[] a = new int[]{2, 4, 5, 3, 6};
        //object.twoSum(a, 8);
        //int[] d= object.twoSum(a, 8);
        System.out.println("the result is " +  object.twoSum(a, 8));
        /*for (int i=0; i<d.length; i++){
            System.out.println(d[i]);
        }*/

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
