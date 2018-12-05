package Facebook_Leetcode;
import java.util.*;
/*
time O(n^3), space O(n^2)
 */

public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] A, int[][] B) {
        // check edge case
        if (A == null || B == null) {
            return new int[0][0];
        }
        // preprocess
        int aRow = A.length;
        int aCol = A[0].length;
        int bRow = B.length;
        int bCol = B[0].length;
        int[][] result = new int[aRow][bCol];

        HashMap<Integer, HashSet<Integer>> mapB = new HashMap<Integer, HashSet<Integer>>();
        for (int k = 0; k < bRow; k++) {
            HashSet<Integer> curSet = new HashSet<Integer>();
            for (int j = 0; j < bCol; j++) {
                if (B[k][j] != 0) {
                    curSet.add(j);
                }
            }
            mapB.put(k, curSet);
        }

        HashMap<Integer, HashSet<Integer>> mapA = new HashMap<Integer, HashSet<Integer>>();
        for (int i = 0; i < aRow; i++) {
            HashSet<Integer> curSet = new HashSet<Integer>();
            for (int k = 0; k < aCol; k++) {
                if (A[i][k] != 0) {
                    curSet.add(k);
                }
            }
            mapA.put(i, curSet);
        }
        // main loop
        for (int i = 0; i < aRow; i++) {
            for (int k : mapA.get(i)) {
                for (int j : mapB.get(k)) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}





//public class Solution {
//    /**
//     * @param A a sparse matrix
//     * @param B a sparse matrix
//     * @return the result of A * B
//     */
//    public int[][] multiply(int[][] A, int[][] B) {
//        // Write your code here
//        int n = A.length;
//        int m = A[0].length;
//        int k = B[0].length;
//
//        int[][] C = new int[n][k];
//
//        for (int i = 0; i < n; ++i)
//            for (int j = 0; j < m; ++j)
//                if (A[i][j] != 0)
//                    for (int l = 0; l < k; ++l)
//                        C[i][l] += A[i][j] * B[j][l];
//        return C;
//    }
//}
//
//// version: 高频题班
////常规做法
//public class Solution {
//    /**
//     * @param A a sparse matrix
//     * @param B a sparse matrix
//     * @return the result of A * B
//     */
//    public int[][] multiply(int[][] A, int[][] B) {
//        // Write your code here
//        int n = A.length;
//        int m = B[0].length;
//        int t = A[0].length;
//        int[][] C = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                for (int k = 0; k < t; k++) {
//                    C[i][j] += A[i][k] * B[k][j];
//                }
//            }
//        }
//        return C;
//    }
//}
//


////改进做法
//public class Solution {
//    /**
//     * @param A a sparse matrix
//     * @param B a sparse matrix
//     * @return the result of A * B
//     */
//    public int[][] multiply(int[][] A, int[][] B) {
//        // Write your code here
//        int n = A.length;
//        int m = B[0].length;
//        int t = A[0].length;
//        int[][] C = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int k = 0; k < t; k++) {
//                if (A[i][k] == 0) {
//                    continue;
//                }
//                for (int j = 0; j < m; j++) {
//                    C[i][j] += A[i][k] * B[k][j];
//                }
//            }
//        }
//        return C;
//    }
//}
//
//
////进一步改进
//public class Solution {
//    /**
//     * @param A a sparse matrix
//     * @param B a sparse matrix
//     * @return the result of A * B
//     */
//    public int[][] multiply(int[][] A, int[][] B) {
//        // Write your code here
//        int n = A.length;
//        int m = B[0].length;
//        int t = A[0].length;
//        int[][] C = new int[n][m];
//
//        List<List<Integer>> col = new ArrayList<>();
//        for (int i = 0; i < t; i++) {
//            col.add(new ArrayList<>());
//            for (int j = 0; j < m; j++) {
//                if (B[i][j] != 0) {
//                    col.get(i).add(j);
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int k = 0; k < t; k++) {
//                if (A[i][k] == 0) {
//                    continue;
//                }
//                for (int j: col.get(k)) {
//                    C[i][j] += A[i][k] * B[k][j];
//                }
//            }
//        }
//        return C;
//    }
//}
