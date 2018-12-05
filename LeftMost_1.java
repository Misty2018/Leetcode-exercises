package Facebook_Leetcode;

public class LeftMost_1 {
    public int getColumn(int[][] arr) {
        // Write your code here
        int n =  arr.length;
        int m = arr[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (arr[0][i] == 1) {
                ans = i;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i][ans] == 0) {
                continue;
            }
            while (ans > 0 && arr[i][ans - 1] == 1) {
                ans--;
            }
        }
        return ans;
    }
}
