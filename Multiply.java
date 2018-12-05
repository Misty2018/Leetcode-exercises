package Facebook_Leetcode;

//就是两个长度一样的向量
//
//        A = [a1, a2, ....., an]
//        B = [b1, b2, ....., bn]
//
//        其中内部绝大部分元素都是 0 来源一亩.三分地论坛.
//
//        算点积 dot product = a1*b1 + a2*b2 + ...... + an*bn

public class Multiply {
    public int[][] multiply(int[][] A, int[][] B) {
        int A_row = A.length;
        int A_col = A[0].length;//B'row
        int B_col = B[0].length;
        int[][] C = new int[A_row][B_col];
        //3 loop, i - Arow, j - Bcol, k - Acol = Brow
        for(int i = 0; i < A_row; i++){
            for(int j = 0; j < A_col; j++){
                if(A[i][j] == 0)continue;//sparse matrix
                for(int k = 0; k < B_col; k++){
                    C[i][k] += A[i][j] * B[j][k];//A'col = B'row
                }
            }
        }
        return C;
    }

}
