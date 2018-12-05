public class MergeSortedArray {
    /*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

    Note:

    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
    additional elements from nums2.
     */
    public static void main(String[] args){
        MergeSortedArray a = new MergeSortedArray();
        int[] nums_1= new int[]{1,2,3,4,5,6}; int m=3;
        int[] nums_2= new int[]{2,5,6}; int n=3;
        int[] result= a.merge(nums_1, nums_2, m, n);
        for(int i=0; i<result.length; i++){
        System.out.print(result[i]);}

    }
    public int[] merge(int[] a, int[] b, int m, int n){
        int i = m-1;
        int j= n-1;
        int k= m+n-1;
        while(i>=0 && j>=0){
            a[k--] = a[i] >= b[j] ? a[i--] : b[j--];
        }
        if (j>=0){
            a[k--] = b[j--];
        }
        return a;

    }
}
