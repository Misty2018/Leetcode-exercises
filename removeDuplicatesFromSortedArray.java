public class removeDuplicatesFromSortedArray {

    /*
    Given a sorted array nums, remove the duplicates in-place such that
    each element appear only once and return the new length.
    */


    public static void main(String[] args){
        removeDuplicatesFromSortedArray c = new removeDuplicatesFromSortedArray();
        int[] b = new int[]{4,4,6,6,7,8,9};
        int d= c.remove(b);
        //for(int i=0; i<d.length; i++)
        //System.out. println("After removing, the result is " + d[i]);
        System.out. println("After removing, the result is " + d);


    }
    public int remove(int[] newnum){
        if (newnum.length==0  || newnum== null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i< newnum.length; i++){
            if (newnum[i] != newnum[count]){
                count++;
                newnum[count]= newnum[i];
            }
        }
        //return nums;
        return count + 1;
    }
}
