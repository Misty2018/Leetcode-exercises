public class RotateMax {

    public static void main(String[] args){
        RotateMax object = new RotateMax();
        int[][] d = new int[][]{
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}};
        object.rotate(d);
        for (int i= 0; i< d.length; i++){
            for (int j=0; j<d[i].length; j++){
                System.out.print(d[i][j] + " ");
            }
        }
    }

    public void rotate(int[][] matrix) {
        /* Clockwise Rotate */
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int first=0, last=rows-1; first<last; first++,last--) {
            int[] tmp = matrix[first];
            matrix[first] = matrix[last];
            matrix[last] = tmp;
        }
        for(int i = 0; i < rows; i++){
            for(int j = i+1; j < cols; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}


/* Counter-clockwise Rotate */
    /*
public void antiRotate(int[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
    int rows = matrix.length;
    int cols = matrix[0].length;
    for(int first=0, last=cols-1; first<last; first++,last--) {
        for(int i=0; i<matrix.length; i++) {
            int tmp = matrix[i][first];
            matrix[i][first] = matrix[i][last];
            matrix[i][last] = tmp;
        }
    }
    for(int i = 0; i < rows; i++){
        for(int j = i+1; j < cols; j++){
            int tmp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = tmp;
        }
    }
}
 */