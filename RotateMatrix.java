public class RotateMatrix {
    public static void main(String[] args) {
        //RotateMatrix object = new RotateMatrix();
        int[][] d = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int [][] a = RotateMatrix.rotate(d, 0);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }

    private static int[][] rotate(int[][] matrix, int flag) {
        // TODO Auto-generated method stub
        if(matrix==null)
            return matrix;
        if(matrix.length < 2 && matrix[0].length < 2 )
            return matrix;

        int width = matrix[0].length;
        int height = matrix.length;
        int[][] newM = new int[width][height];
        if(flag == 1)
        {

            newM = clockwise(matrix);
        }else
        {
            newM = counterclockwise(matrix);
        }


        return newM;
    }

    private static int[][] counterclockwise(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;
        int[][] newM = new int[width][height];

        int h = 0;
        int w = width-1;
        for(int i=0; i < height; i++)
        {
            for(int j=0; j < width; j++)
            {
                newM[j][i] = matrix[h][w];
                w --;
            }

            if(w < 0)
                w = width-1;
            h ++;
            if(h > height)
                h = 0;
        }
        return newM;
    }

    private static int[][] clockwise(int[][] matrix) {
        // TODO Auto-generated method stub
        int width = matrix[0].length;
        int height = matrix.length;
        int[][] newM = new int[width][height];

        int h = height;
        int w = 0;
        for(int i=0; i < height; i++)
        {
            for(int j=0; j < width; j++)
            {
                newM[j][i] = matrix[h-1][w];
                w += 1;
            }

            if(w >= width)
                w = 0;
            h --;
            if(h < 0)
                h = height-1;
        }
        return newM;
    }

}
