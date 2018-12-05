package Facebook_Leetcode;

public class NumberOfElements {
    int binarySearch(int[] A,int start,int end,int target)
    {
        if(A[start]>target||A[end]<target) //如果开头大于num，或者num大于end的值，那么num就不可能在这个范围
            return 0;
        else if(A[start]==target&&A[end]==target)//如果开头和结尾的值都等于num可以直接算出有几个num
            return end-start+1;
        else
        {
            int mid=(start+end)/2;     //二分法分别查找左右的个数
            if(A[mid]==target)
                return binarySearch(A,mid+1,end,target)+binarySearch(A,start,mid-1,target)+1;
            else
                return binarySearch(A,mid+1,end,target)+binarySearch(A,start,mid-1,target);
        }
    }


}
