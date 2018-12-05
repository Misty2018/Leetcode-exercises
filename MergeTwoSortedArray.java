package Facebook_Leetcode;

public class MergeTwoSortedArray {

    // Merge arr1[0..n1-1] and arr2[0..n2-1] into arr3[0..n1+n2-1]
    // O(n1 + n2) Time and O(n1 + n2) Extra Space

    private void mergeTwoSortedArray(int[] a, int[] b){
        int length_a = a.length;
        int length_b = b.length;
        int i=0; int j=0; int k= 0;
        int[] c = new int[length_a + length_b];

        while (i < length_a && j < length_b){
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array

            if (a[i] < b[j]){
                c[k++] = a[i++];
            } else{
                c[k++] = b[j++];
            }

        }
        // Store remaining elements of first array
        while(i < length_a){
            c[k++] = a[i++];
        }

        while(j < length_b){
            c[k++] = b[j++];
        }




    }



    // in place
    private void mergeTwoSortedArray_1(int[] A, int[] B , int m, int n){
        int i = m - 1;
        int j = n - 1;

        int k = m + n - 1;

        while(i >=0 && j>=0)
        {
            if(A[i] > B[j])
                A[k--] = A[i--];
            else
                A[k--] = B[j--];
        }
        while(j>=0)
            A[k--] = B[j--];
    }

}
