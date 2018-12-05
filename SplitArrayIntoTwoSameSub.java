package Facebook_Leetcode;

public class SplitArrayIntoTwoSameSub {

    // solution1: loop twice,
    public static int findSplitPoint(int arr[], int n) {

        int leftSum = 0;

        // traverse array element
        for (int i = 0; i < n; i++) {
            // add current element to left Sum
            leftSum += arr[i];

            // find sum of rest array
            // elements (rightSum)
            int rightSum = 0;

            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];

                // split point index
                if (leftSum == rightSum)
                    return i + 1;
            }



        }
        return leftSum;
    }



        // solution2: An Efficient solution is to first compute the sum of the whole array from left to right.
        // Now we traverse array from right and keep track of right sum, left sum can be computed by subtracting
        // current element from whole sum.

        public static int findSplitPoint_1(int arr[], int n){

            // traverse array element and compute sum
            // of whole array
            int leftSum = 0;

            for (int i = 0 ; i < n ; i++)
                leftSum += arr[i];

            // again traverse array and compute right
            // sum and also check left_sum equal to
            // right sum or not
            int rightSum = 0;

            for (int i = n-1; i >= 0; i--)
            {
                // add current element to right_sum
                rightSum += arr[i];

                // exclude current element to the left_sum
                leftSum -= arr[i] ;

                if (rightSum == leftSum)
                    return i ;
            }

            // if it is not possible to split array
            // into two parts.
            return -1;
        }





}
