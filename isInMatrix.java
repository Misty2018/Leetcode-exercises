

/*
class Point {
    int x;
    int y;
}
public class isInMatrix{
    Point isInMatrix(int[][] matrix, int target){
        int row = matrix.length;
        int column = matrix[0].length;
        int r = 0;
        int c = column - 1;
        while (r < row && c >= 0){
            if (matrix[r][c] == target){
                return new Point(r,c);
            }
            if (matrix[r][c] > target){
                c--;
            } else {
                r++;
            }
        }
        return new Point(-1,-1);
    }
}*/


public class isInMatrix{

    public static void main(String[] args){
        isInMatrix a = new isInMatrix();
        int[][] b = new int[][]{
                {2,4},
                {5,6},
                {7,8}
        };
        boolean c = a.searchMatrix(b, 5);
        System.out.println(c);
    }
    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;

        while(col >= 0 && row<= matrix.length - 1){
            if (target == matrix[row][col]){
                return true;
            } else if (target < matrix[row][col]){
                col --;
            } else if (target > matrix[row][col]){
                row ++;
            }

        }
        return false;
    }
}